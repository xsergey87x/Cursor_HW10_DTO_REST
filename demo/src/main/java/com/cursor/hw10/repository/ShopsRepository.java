package com.cursor.hw10.repository;

import com.cursor.hw10.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ShopsRepository extends JpaRepository<Shop, Long> {
}
