package com.urvashi.productserviceAPI.demo.Service;

import com.urvashi.productserviceAPI.demo.DTO.ProductDTO;
import org.springframework.stereotype.Service;

@Service
public class FakestoreProductServiceImpl implements ProductService{
    @Override
    public String getAllProducts() {
        return null;
    }

    @Override
    public String getSingleProducts(Long productid) {
        return null;
    }

    @Override
    public String addNewProduct(ProductDTO productDTO) {
        return null;
    }

    @Override
    public String updateProduct(Long productid) {
        return null;
    }

    @Override
    public String deleteProduct(Long productid) {
        return null;
    }
}
