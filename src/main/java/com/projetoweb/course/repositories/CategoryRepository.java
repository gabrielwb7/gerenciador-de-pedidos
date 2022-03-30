package com.projetoweb.course.repositories;

import com.projetoweb.course.entities.Category;
import com.projetoweb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
