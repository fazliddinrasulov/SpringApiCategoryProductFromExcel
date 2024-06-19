package uz.pdp.readingcategoryandproductfromexcel.service;

import org.springframework.stereotype.Service;
import uz.pdp.readingcategoryandproductfromexcel.entity.Category;
import uz.pdp.readingcategoryandproductfromexcel.entity.Product;

import java.util.List;

@Service
public interface FileService {

    void readCategoryFromExcel();

    void readProductsFromExcel();
}
