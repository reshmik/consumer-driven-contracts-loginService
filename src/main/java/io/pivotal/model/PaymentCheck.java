package io.pivotal.model;


public class PaymentCheck {
	
	private String username;

	private String paymentSummary;
	
	private String paymentDetails;


	public PaymentCheck() {
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public String getPaymentSummary() {
		return paymentSummary;
	}

	public void setPaymentSummary(String paymentSummary) {
		this.paymentSummary = paymentSummary;
	}
	
	public String getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
}
