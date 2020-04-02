package com.expense.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Expense {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long expenseId;
	private String type;
	private LocalDate date;
	private String status;
	private Double totalAmount;
	private Long participant;
	@OneToOne
	@JoinColumn(name = "paymentId")
	private Payment payment;

	public Expense() {
		super();
	}

	public Long getExpenseId() {
		return expenseId;
	}

	public void setExpenseId(Long expenseId) {
		this.expenseId = expenseId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Long getParticipant() {
		return participant;
	}

	public void setParticipant(Long participant) {
		this.participant = participant;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Expense(String type, LocalDate date, String status, Double totalAmount, Long participant, Payment payment) {
		super();
		this.type = type;
		this.date = LocalDate.now();
		this.status = status;
		this.totalAmount = totalAmount;
		this.participant = participant;
		this.payment = payment;
	}

}
