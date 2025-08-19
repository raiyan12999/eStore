package com.webApp.eStore.repository;

import com.webApp.eStore.model.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDetailsRepo extends JpaRepository<ProductDetails, Integer> {
}
