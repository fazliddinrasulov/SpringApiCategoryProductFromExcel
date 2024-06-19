package uz.pdp.readingcategoryandproductfromexcel.service;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import uz.pdp.readingcategoryandproductfromexcel.entity.Category;
import uz.pdp.readingcategoryandproductfromexcel.entity.Product;
import uz.pdp.readingcategoryandproductfromexcel.repo.CategoryRepository;
import uz.pdp.readingcategoryandproductfromexcel.repo.ProductRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FileServiceImpl implements FileService {
    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;
    @Override
    @SneakyThrows
    public void readCategoryFromExcel() {
        Workbook workbook = new XSSFWorkbook((System.getProperty("user.dir")+"/category_products.xlsx"));
        Sheet sheet = workbook.getSheetAt(0);
        Category currentCategory = null;
        List<String> techs = new ArrayList<>();
        for (Row row : sheet) {
            if(row.getCell(0)!=null && row.getCell(0).getStringCellValue().equals("Categories")){ // skipping header
                continue;
            }
            if (row.getCell(0) != null) {
                 currentCategory = categoryRepository.save(
                        Category.builder()
                                .name(row.getCell(0).getStringCellValue())
                                .build()
                );
            }else{
                productRepository.save(
                        Product.builder()
                                .name(row.getCell(1).getStringCellValue())
                                .category(currentCategory)
                                .build()
                );
            }

        }
        workbook.close();
    }

    @Override
    public void readProductsFromExcel() {
    }
}
