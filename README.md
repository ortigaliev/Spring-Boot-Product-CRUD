# Spring-Boot-Product-CRUD
CRUD Operations using Spring Boot, Thymeleaf, MySQL Database and Spring Data JPA

1-qism
https://start.spring.io/ orqali Loyihamizni boshlsh uchun sozlab olamiz. Quyidagi dependencies larni tanlab olamiz.
- Spring Web
- Spring Bot Dev Tools
- MySql Driver
- Spring Data JPA
- Validation
- Thymeleaf
![image](https://github.com/user-attachments/assets/f30c6cb8-3c16-4a71-a1a7-bfa82b969c1d)
Generateni bosish orqali folderimizni ochilib olamiz.

 2-qism

 Database bilan bog;lash uchun loyihamizning application.properties qismini sozlab olamiz.
 spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/maxstore
spring.datasource.username=max
spring.datasource.password=max

spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
 
Bu loyihada men mysql dan foydalandim va XAMPP Control panel dan foydalanib yani maxstore nomil database ni yaratib oldim

![image](https://github.com/user-attachments/assets/d6324de2-62b0-4e47-a9de-9c9025fcc5c5)
Loyihamiz localhost:8080 da run bo'ldi kirib ko'rsak error chiqadi sababi biz hali hech anday controllerlar va statik resourselarni yaratmadik.


3-qism Static folderda html fileni yaratib olamiz.
Server side rendering uchun index.html yaratib unga shunchaki text yozib localhost8080 ishlayotganini tekshirib olamiz.
![image](https://github.com/user-attachments/assets/80cc5ccf-980f-4a92-ba8a-4825febeea1b)
Loyiha ishlayabdi.

4-qism Bootstrap kutubxonasini qo'shib olamiz.
https://getbootstrap.com/docs/5.3/getting-started/introduction/ link orqali kirib kerakli stillarni olamiz
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  </head>
  <body>
    <h1>Hello, world!</h1>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </body>
</html>

Shu codni boya yozgan index.html file dagi text bn almashtiramiz.
va quyidagi page hosil bo'ladi
![image](https://github.com/user-attachments/assets/9e0570dd-0cbb-4339-94ab-a349b301ec95)

5-qism 
Product nomli classni modules packageni ichida yaratib olamiz. BU product nomli table yaraatad va ichida id, name va hkz.
Productlarimizni rasmlarini ham public folder ochib joylab olamiz

6-qism 
Services yoki Repository deb ham ataluvchi package yaratib olamiz va uning ichida ProductRepository nomli interface yaratib olamiz. 

7-qism
ProductController classini Controller pakageini ichida yaratib olamiz.
Barcha productlarni ko'rish uchun controller yozamiz va templates folder ichidan yangi products folder ochib uni ichida index.html ochib olamiz. Bootstrap orqali kerakli table ni shakillantiri olamiz. Product listimiz ko'rindi lekin birinchi yaratilganlarni birinchi ko'rsatyabdi bizga esa oxirgi yaratilganlari kerak shuning uchun Sort dan foydalanamiz.

8-qism 
Productlarni details ni submit qilishimiz uchun models package ni ichida yangi ProductDto (DataTransferObject model) deb nomlanga modul ochib olamiz. Unda id dan tashqari boshqa o'zgaruvchilarni elon qilamiz.

9-qism
USerlar yangi product yaratishi uchun Create controller logic ni yozamiz va templates/products ni ichida yangi createProduct.html file yaratamiz va bootstrapdan kerakli style ni olib kelamiz.
create product buttonni bosganimizda quyidagi form ochiladi
![image](https://github.com/user-attachments/assets/bdac5e59-4558-451c-8345-fae8bdabd3c4)

Create form ni user bo'sh jo'natib yubormasligi uchun validation qo'yamiz
![image](https://github.com/user-attachments/assets/4a1a1494-32a3-4e55-a9bf-c9b86cdb5f45)

Yangi productni database ga yozish uchun logic yozamiz. BUning uchun bizda xech qanday error bo'lmasa img ni databasega yozishdan boshlaymiz va reponi save qilamiz.

