package uz.pdp.readingcategoryandproductfromexcel.service;

import org.springframework.stereotype.Service;
import uz.pdp.readingcategoryandproductfromexcel.entity.Product;

import java.util.List;

@Service
public interface ProductService {
    List<Product> getProducts();

    List<Product> getProductsByCategoryId(Integer categoryId);
}
