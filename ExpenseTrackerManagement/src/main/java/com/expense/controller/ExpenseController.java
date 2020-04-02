package com.expense.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.expense.dto.ExpenseRequestDto;
import com.expense.dto.ExpenseResponseDto;
import com.expense.exception.FriendNotFoundException;
import com.expense.service.ExpenseService;

@RestController
public class ExpenseController {

	@Autowired
	ExpenseService expenseService;

	@PostMapping("/expense")
	public ExpenseResponseDto createAnExpense(@RequestBody ExpenseRequestDto expenseRequestDto)
			throws FriendNotFoundException {
		return expenseService.createAnExpense(expenseRequestDto);
	}
}
