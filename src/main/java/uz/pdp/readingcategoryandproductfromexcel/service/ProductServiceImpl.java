package uz.pdp.readingcategoryandproductfromexcel.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.pdp.readingcategoryandproductfromexcel.entity.Product;
import uz.pdp.readingcategoryandproductfromexcel.repo.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProductsByCategoryId(Integer categoryId) {
        return productRepository.findAllByCategoryId(categoryId);
    }
}
