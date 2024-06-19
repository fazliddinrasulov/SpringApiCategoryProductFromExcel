package uz.pdp.readingcategoryandproductfromexcel.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.readingcategoryandproductfromexcel.entity.Category;
import uz.pdp.readingcategoryandproductfromexcel.service.CategoryService;

import java.util.List;

@RestController
@RequestMapping("api/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;
    @GetMapping
    public HttpEntity<?> getCategory() {
        List<Category> categories = categoryService.getCategories();
        return ResponseEntity.ok(categories);
    }
}
