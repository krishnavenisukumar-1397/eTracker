package com.expense.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity

public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long paymentId;
	private Double payeeAmount;
	@OneToOne
	@JoinColumn(name = "friendId")
	private Friend friend;

	public Payment() {
		super();
	}

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public Double getPayeeAmount() {
		return payeeAmount;
	}

	public void setPayeeAmount(Double payeeAmount) {
		this.payeeAmount = payeeAmount;
	}

	public Friend getFriend() {
		return friend;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}

	public Payment(Double payeeAmount, Friend friend) {
		super();
		this.payeeAmount = payeeAmount;
		this.friend = friend;
	}

}
