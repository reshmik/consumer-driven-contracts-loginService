package io.pivotal;

import static org.springframework.web.bind.annotation.RequestMethod.PUT;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.pivotal.model.PaymentCheck;
import io.pivotal.model.PaymentCheckResult;
import io.pivotal.model.PaymentCheckStatus;
import io.pivotal.model.UserLoginCheckV1;

@RestController
public class PaymentController {
	
	private static final String PAYMENT_JSON = "application/json";

	@RequestMapping(
			value = "/payment",
			method = PUT,
			consumes = PAYMENT_JSON,
			produces = PAYMENT_JSON)
	public PaymentCheckResult paymentCheck(@RequestBody PaymentCheck paymentCheck) {

		if (passwordContainsSpecialCharacters(paymentCheck)) {
			return new PaymentCheckResult(PaymentCheckStatus.OK, "NO_REASON");
		}
		
		return new PaymentCheckResult(PaymentCheckStatus.NOT_OKAY, "CONTAINS_SPECIAL_CHARACTER");
	
	}

	//If it matches regex [a-zA-Z0-9 ]* then there is no special characters in it.
	private boolean passwordContainsSpecialCharacters(PaymentCheck paymentCheck) {
		//return userLoginCheck.getPassword().matches("[a-zA-Z0-9 ]*");
		return paymentCheck.getUserName().matches("123");
	}

//	@RequestMapping(
//			value = "/userlogin/v1",
//			method = PUT,
//			consumes = PAYMENT_JSON,
//			produces = PAYMENT_JSON)
//	public UserLoginCheckResult userLoginCheckV1(@RequestBody UserLoginCheckV1 userLoginCheckV1) {
//
//		if (passwordContainsSpecialCharacters(userLoginCheckV1)) {
//			return new UserLoginCheckResult(PaymentCheckStatus.OK, "NO_REASON");
//		}
//		
//		return new UserLoginCheckResult(PaymentCheckStatus.NOT_OKAY, "CONTAINS_SPECIAL_CHARACTER");
//	
//	}
//
//	//If it matches regex [a-zA-Z0-9 ]* then there is no special characters in it.
//	private boolean passwordContainsSpecialCharacters(UserLoginCheckV1 userLoginCheckV1) {
//		//return userLoginCheck.getPassword().matches("[a-zA-Z0-9 ]*");
//		return userLoginCheckV1.getPassword().matches("123");
//	}


}
