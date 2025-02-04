package com.max.Spring_Boot.Crud.Controllers;

import com.max.Spring_Boot.Crud.Services.ProductRepository;
import com.max.Spring_Boot.Crud.models.Product;
import com.max.Spring_Boot.Crud.models.ProductDto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository repo;


    @GetMapping( {"", "/"})
    public String showProductList(Model model) {
        List<Product> products = repo.findAll(Sort.by(Sort.Direction.DESC, "id"));
        model.addAttribute("products", products);
        return "products/index";
    }

    @GetMapping("/create")
    public String showCreatePage(Model model) {
        ProductDto productDto = new ProductDto();
        model.addAttribute("productDto", productDto);
        return "products/createProduct";
    }

    @PostMapping("/create")
    public String createProduct(@Valid @ModelAttribute ProductDto productDto, BindingResult result) throws IOException {
        if(productDto.getImageFile().isEmpty()) {
            result.addError(new FieldError("productDto", "imageFile", "Image file is required"));
        }

        if(result.hasErrors()) {
            return "products/createProduct";
        }

        return "redirect:/products";
    }


}
