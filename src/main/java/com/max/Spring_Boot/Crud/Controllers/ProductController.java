package com.max.Spring_Boot.Crud.Controllers;

import com.max.Spring_Boot.Crud.Services.ProductRepository;
import com.max.Spring_Boot.Crud.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
