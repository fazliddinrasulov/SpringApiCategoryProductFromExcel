package uz.pdp.readingcategoryandproductfromexcel.component;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import uz.pdp.readingcategoryandproductfromexcel.entity.Category;
import uz.pdp.readingcategoryandproductfromexcel.entity.Product;
import uz.pdp.readingcategoryandproductfromexcel.service.FileService;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {
    private final FileService fileService;
    @Override
    public void run(String... args)  {
        fileService.readCategoryFromExcel();
//        fileService.readProductsFromExcel();
    }
}
