package com.urvashi.productserviceAPI.demo.Service;

import com.urvashi.productserviceAPI.demo.DTO.ProductDTO;
import org.springframework.web.bind.annotation.*;

public interface ProductService {

     String getAllProducts();


     String getSingleProducts( Long productid);


    String addNewProduct( ProductDTO productDTO);



    String updateProduct(Long productid);



    String deleteProduct( Long productid);
}
