package com.ecommerce.project.repositories;

import com.ecommerce.project.model.Category;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.jpa.repository.JpaRepository;

//here in parameter we have to tell jpa repository that the Category is the my entity and also define the type of primary key that is Long
//here we created the repository and extended jpa repository
public interface CategoryRepository extends JpaRepository<Category,Long> {


    Category findByCategoryName(@NotBlank @Size(min = 5, message = "Category name must contains atleast 5 characters") String categoryName);
}
