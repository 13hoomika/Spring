package com.xworkz.ecomapp.service;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.xworkz.ecomapp.dto.ProductDto;

public interface ProductService {
    void ValidateAndSAve(ProductDto dto);
}
