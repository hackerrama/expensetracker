package com.tracker.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tracker.DTO.expenseDto;
import com.tracker.Entity.Expense;
import com.tracker.Entity.Expense;
import com.tracker.service.expense.expenseService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/api/expense")
@RequiredArgsConstructor 
@CrossOrigin("*")
public class expenseController {
	
	private   expenseService expenseservice;
	
	
	@PostMapping("/add")
	public ResponseEntity<Expense> postExpense(@RequestBody expenseDto dto){
		Expense createdExpense = expenseservice.postExpense(dto);
		
		if(createdExpense != null) {
			return ResponseEntity.status(HttpStatus.CREATED).body(createdExpense);
		}else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
	}
	

}








































