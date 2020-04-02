package com.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expense.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
