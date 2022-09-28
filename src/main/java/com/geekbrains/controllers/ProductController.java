package com.geekbrains.controllers;


import com.geekbrains.entites.Product;
import com.geekbrains.service.ProductsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//првязка к адресу "/product"
@RequestMapping("/product")
public class ProductController {
    private ProductsService productsService;
// эта аннатция для внедрения зависимости
    @Autowired
    public void setProductsService(ProductsService productsService) {
        this.productsService = productsService;
    }


//    поиск по id
   //http://localhost:8489/product/showProductById?id=2

    @RequestMapping(path = "/showProductById", method = RequestMethod.GET)
    //  @ResponseBody - используется для вывода обекта а не строки или пердставления в json формате
    @ResponseBody
    public Product showStudentById(Model uiModel, @RequestParam int id) {
        productsService.getByIDProduct(id);
        return productsService.getByIDProduct(id);
    }
// форма для заполнения при заполнении формы создается новый продукт
//http://localhost:8489/product/showFormProduct
    @RequestMapping("/showFormProduct")
    public String showSimpleFormProduct(Model uiModel) {
        Product product = new Product();
        uiModel.addAttribute("product", product);
        return "product-form";
    }
//
//
    @RequestMapping("/processForm")
    @ResponseBody  // для вывода обекта
    public List<Product> processForm(@ModelAttribute("product") Product product) {
        // после заполнения формы и нажатия кнопки созданный обект добавляется в лист продуктов
        productsService.addNewProduct(product);
        // выводим список продуктов
        return productsService.getAllListProduct();

    }
//

}
