package com.filipescaglia.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filipescaglia.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
