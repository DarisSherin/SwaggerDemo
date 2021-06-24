package com.sherin.swagger.SwaggerDemo.model;

import java.io.Serializable;

import javax.persistence.*;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Entity
@Table
public class Book implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2491849397769076259L;
	@Id
	@GeneratedValue
	@ApiModelProperty(value="Auto Generated")
	private int bookId;
	@ApiModelProperty(value="Book Name")
	private String bookName;
	@ApiModelProperty(value="Price")
	private double price;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	public Book(int bookId, String bookName, double price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + "]";
	}
	

}
