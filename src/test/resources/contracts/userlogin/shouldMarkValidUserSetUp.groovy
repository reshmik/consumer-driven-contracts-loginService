package contracts

org.springframework.cloud.contract.spec.Contract.make {
	request {
		method 'PUT'
		url '/payment'
		body([
			   username: 'reshmi',
			   paymentSummary: '123'
		])
		headers {
			contentType('application/json')
		}
	}
	response {
		status 200
		body([
			   paymentCheckStatus : 'OK',
			   rejectionReason: 'NO_REASON'
		])
		headers {
			contentType('application/json')
		}
	}
}
