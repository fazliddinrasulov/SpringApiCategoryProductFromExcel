package uz.pdp.readingcategoryandproductfromexcel.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.pdp.readingcategoryandproductfromexcel.entity.Category;
import uz.pdp.readingcategoryandproductfromexcel.repo.CategoryRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    @Override
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }
}
