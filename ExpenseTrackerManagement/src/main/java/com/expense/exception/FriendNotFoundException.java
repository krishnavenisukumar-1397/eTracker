package com.expense.exception;

public class FriendNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public FriendNotFoundException(String string) {
		super("Expense with expenseId is not found");

	}

	private static final Integer statuscode = 602;

	public static Integer getStatuscode() {
		return statuscode;
	}

}
