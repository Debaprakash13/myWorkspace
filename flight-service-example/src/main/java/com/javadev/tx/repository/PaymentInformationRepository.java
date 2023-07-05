package com.javadev.tx.repository;

import com.javadev.tx.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentInformationRepository extends JpaRepository<PaymentInfo, String> {
}
