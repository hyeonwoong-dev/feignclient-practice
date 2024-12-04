package com.nbcamp.course.feign.order.client;

import com.nbcamp.course.feign.order.model.ProductResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product")
public interface ProductClient {

    @GetMapping("/products/{id}")
    ProductResponseDto getProduct(@PathVariable("id") Long id);
}