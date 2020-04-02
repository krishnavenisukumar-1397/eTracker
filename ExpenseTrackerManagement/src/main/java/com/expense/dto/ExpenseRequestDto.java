package com.expense.dto;

import java.time.LocalDate;

public class ExpenseRequestDto {

	private String friendName;
	private String type;
	private Long groupId;
	private LocalDate date;
	private Double totalAmount;
	private Long participant;

	public String getFriendName() {
		return friendName;
	}

	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
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

}
