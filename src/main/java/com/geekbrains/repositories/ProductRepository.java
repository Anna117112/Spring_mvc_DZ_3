package com.geekbrains.repositories;

import com.geekbrains.entites.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Component //для создания бина (обекта класса)
public class ProductRepository {

    public List<Product> listproduct = new ArrayList<>();

    public List<Product> getListproduct() {
        return listproduct;
    }



    // добавляем продукт
public void addProduct(Product prod){
        listproduct.add(prod);
}


// поиск по id
    public Product forIdListProduct(int id){

        for (Product list : listproduct) {
           if (list.getId() ==id) {
                System.out.println(String.valueOf(list));
                return list;
            }
        }

return new Product();
    }


}
