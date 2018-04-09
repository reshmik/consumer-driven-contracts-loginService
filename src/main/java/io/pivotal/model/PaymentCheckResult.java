package io.pivotal.model;

public class PaymentCheckResult {

	private PaymentCheckStatus paymentCheckStatus;
	//private String userLoginCheckStatus;

	private String rejectionReason;

	public PaymentCheckResult() {
	}

	public PaymentCheckResult(PaymentCheckStatus paymentCheckStatus, String rejectionReason) {
		this.paymentCheckStatus = paymentCheckStatus;
		this.rejectionReason = rejectionReason;
	}

	public PaymentCheckStatus getPaymentCheckStatus() {
		return paymentCheckStatus;
	}

	public void setUserLoginCheckStatus(PaymentCheckStatus paymentCheckStatus) {
		this.paymentCheckStatus = paymentCheckStatus;
	}

	public String getRejectionReason() {
		return rejectionReason;
	}

	public void setRejectionReason(String rejectionReason) {
		this.rejectionReason = rejectionReason;
	}
}
