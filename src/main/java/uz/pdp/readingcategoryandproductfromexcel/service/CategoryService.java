package uz.pdp.readingcategoryandproductfromexcel.service;

import org.springframework.stereotype.Service;
import uz.pdp.readingcategoryandproductfromexcel.entity.Category;

import java.util.List;

@Service
public interface CategoryService {
    List<Category> getCategories();
}
