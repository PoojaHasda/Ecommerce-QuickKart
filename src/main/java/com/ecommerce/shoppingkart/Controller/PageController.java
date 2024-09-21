package com.ecommerce.shoppingkart.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @GetMapping("/register")
    public String registerPage(){
        return "register";
    }

    @GetMapping("/products")
    public String productPage(){
        return "products";
    }

    @GetMapping("/product")
    public String product(){
        return "view_product";
    }

    



}
