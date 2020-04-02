package com.expense.controller.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.expense.controller.ExpenseController;
import com.expense.dto.ExpenseRequestDto;
import com.expense.dto.ExpenseResponseDto;
import com.expense.entity.Expense;
import com.expense.entity.Friend;
import com.expense.service.ExpenseService;

@RunWith(MockitoJUnitRunner.Silent.class)

public class ExpenseControllerTest {
	@Mock
	ExpenseService expenseService;
	@InjectMocks
	ExpenseController controller;

	@Before
	public void before() {
		Expense expense = new Expense();
		List<Expense> expenses = new ArrayList<>();
		ExpenseRequestDto expenseRequestDto = new ExpenseRequestDto();
		List<ExpenseRequestDto> dtos = new ArrayList<>();
		ExpenseResponseDto expenseResponseDto=new ExpenseResponseDto();
		Friend friend=new Friend();
	}

}
