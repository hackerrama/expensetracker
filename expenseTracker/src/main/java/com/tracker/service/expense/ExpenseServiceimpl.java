package com.tracker.service.expense;

import org.springframework.stereotype.Service;

import com.tracker.DTO.expenseDto;
import com.tracker.Entity.Expense;
import com.tracker.repository.expenseRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ExpenseServiceimpl implements expenseService {
	
	private final expenseRepository expenserepository = null;
	
	
	public Expense postExpense(expenseDto expensedto) {
		return saveOrUpdateExpense(new Expense() ,expensedto);
	}
	
	
	private Expense saveOrUpdateExpense(Expense expense, expenseDto expensedto) {
		expense.setTitle(expensedto.getTitle());
		expense.setDate(expensedto.getDate());
		expense.setAmount(expensedto.getAmount());
		expense.setCategory(expensedto.getCategoury());
		expense.setDescription(expensedto.getDescription());
		
		return expenserepository.save(expense);
	}

}










