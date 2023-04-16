package com.algorithms.library;

import java.util.Objects;

public class Book {
	
	private String bookName;
	private String bookId;
	private String caregory;
	private String price;
	private String printedYear;
	private String author;

	public Book(String bookName, String bookId, String caregory, String price, String printedYear, String author) {
		super();
		this.bookName = bookName;
		this.bookId = bookId;
		this.caregory = caregory;
		this.price = price;
		this.printedYear = printedYear;
		this.author = author;
	}



	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getCaregory() {
		return caregory;
	}

	public void setCaregory(String caregory) {
		this.caregory = caregory;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPrintedYear() {
		return printedYear;
	}

	public void setPrintedYear(String printedYear) {
		this.printedYear = printedYear;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}



	@Override
	public int hashCode() {
		return Objects.hash(author, bookId, bookName, caregory, price, printedYear);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(bookId, other.bookId)
				&& Objects.equals(bookName, other.bookName) && Objects.equals(caregory, other.caregory)
				&& Objects.equals(price, other.price) && Objects.equals(printedYear, other.printedYear);
	}
	

}
