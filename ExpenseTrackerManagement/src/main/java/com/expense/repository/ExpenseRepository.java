package com.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expense.entity.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
