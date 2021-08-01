package com.smartcontact.manager.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.smartcontact.manager.entity.Payment;
import com.smartcontact.manager.entity.ReportEntity;

public interface PaymentRepository extends  CrudRepository<Payment,String> {

	@Query("select t from Payment t where t.Payment_Id=:paymentId")
	public Payment getPaymentByPaymentId(@Param("paymentId") String paymentId);

	
	
}
