package com.tracker.DTO;

import java.time.LocalDate;

import lombok.Data;

@Data
public class expenseDto {
	
	
	private String title;
	private String description;
	private String categoury;
	private LocalDate date;
	private Integer amount;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategoury() {
		return categoury;
	}
	public void setCategoury(String categoury) {
		this.categoury = categoury;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	

}
