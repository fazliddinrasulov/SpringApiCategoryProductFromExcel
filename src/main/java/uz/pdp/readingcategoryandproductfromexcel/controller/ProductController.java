package uz.pdp.readingcategoryandproductfromexcel.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.readingcategoryandproductfromexcel.entity.Product;
import uz.pdp.readingcategoryandproductfromexcel.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("api/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @GetMapping
    public HttpEntity<?> getCategory() {
        List<Product> products = productService.getProducts();
        return ResponseEntity.ok(products);
    }
    @GetMapping("{categoryId}")
    public HttpEntity<?> getCategory(@PathVariable String categoryId) {
        List<Product> products = productService.getProductsByCategoryId(Integer.parseInt(categoryId));
        return ResponseEntity.ok(products);
    }
}
