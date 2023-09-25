package com.urvashi.productserviceAPI.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class FakestoreCategoryServiceImpl implements CategoryService{
    @Override
    public String getAllCategory() {
        return null;
    }

    @Override
    public String getProductsInCategory(Long categoryId) {
        return null;
    }
}
