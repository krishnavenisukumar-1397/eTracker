package com.expense.service.impl;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expense.constant.Constant;
import com.expense.dto.ExpenseRequestDto;
import com.expense.dto.ExpenseResponseDto;
import com.expense.entity.Expense;
import com.expense.entity.Friend;
import com.expense.exception.FriendNotFoundException;
import com.expense.repository.ExpenseRepository;
import com.expense.repository.FriendRepository;
import com.expense.service.ExpenseService;

@Service
public class ExpenseServiceimpl implements ExpenseService {

	@Autowired
	ExpenseRepository expenseRepository;
	@Autowired
	FriendRepository friendRepository;

	@Override
	public ExpenseResponseDto createAnExpense(ExpenseRequestDto expenseRequestDto) throws FriendNotFoundException {
		Expense expense = new Expense();
		ExpenseResponseDto expenseResponseDto = new ExpenseResponseDto();
		Optional<Friend> friend = friendRepository.findById(expenseRequestDto.getGroupId());
		if (friend.isPresent()) {
			expense.setDate(LocalDate.now());
			expense.setType(expenseRequestDto.getFriendName());
			expense.setTotalAmount(expenseRequestDto.getTotalAmount());
			expense.setParticipant(expenseRequestDto.getParticipant());
			expense.setExpenseId(expenseRequestDto.getGroupId());
			expenseRepository.save(expense);
			expenseResponseDto.setDisplayMessage("expense added successfully");
			expenseResponseDto.setDisplayMessage(Constant.SuccessApply);

		} else {
			throw new FriendNotFoundException("friend does not exist");
		}
		return expenseResponseDto;
	}

}
