package uz.pdp.readingcategoryandproductfromexcel.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.readingcategoryandproductfromexcel.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}