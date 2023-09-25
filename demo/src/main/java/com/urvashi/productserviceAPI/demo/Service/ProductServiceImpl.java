package com.urvashi.productserviceAPI.demo.Service;

import com.urvashi.productserviceAPI.demo.DTO.ProductDTO;
import org.springframework.web.bind.annotation.*;

public class ProductServiceImpl implements ProductService {
    @GetMapping("/products")
    public String getAllProducts() {
        return "Getting All Products";
    }

    @GetMapping("/products/{productid}")
    public String getSingleProducts(@PathVariable("productid") Long productid) {
        return "returning single products with product id" + productid;
    }

    @PostMapping("/products")
    public String addNewProduct(@RequestBody ProductDTO productDTO) {
        return "new Product added " + productDTO;
    }

    @PutMapping("/products/{productid}")
    public String updateProduct(@PathVariable("productid") Long productid) {
        return "product updated";
    }


    @DeleteMapping("/products/{productid}")
    public String deleteProduct(@PathVariable("productid") Long productid){
        return "product Deleted";

    }

}
