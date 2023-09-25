package com.urvashi.productserviceAPI.demo.Service;

import org.springframework.web.bind.annotation.GetMapping;

public interface CategoryService {

     String getAllCategory();
    String getProductsInCategory(Long categoryId);
}

