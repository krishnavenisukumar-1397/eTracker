package com.expense.service;

import com.expense.dto.ExpenseRequestDto;
import com.expense.dto.ExpenseResponseDto;
import com.expense.exception.FriendNotFoundException;

public interface ExpenseService {

	ExpenseResponseDto createAnExpense(ExpenseRequestDto expenseRequestDto) throws FriendNotFoundException;

}
