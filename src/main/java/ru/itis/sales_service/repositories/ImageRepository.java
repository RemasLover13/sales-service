package ru.itis.sales_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itis.sales_service.models.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
}
