package com.tracker.service.expense;

import com.tracker.DTO.expenseDto;
import com.tracker.Entity.Expense;

public interface expenseService {
	public Expense postExpense(expenseDto expensedto);
}
