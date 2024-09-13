package com.tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tracker.Entity.Expense;

@Repository
public interface expenseRepository extends JpaRepository <Expense, Long> {

	
}
