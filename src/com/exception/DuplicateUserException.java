package com.exception;

//exception for duplicate user registration
public class DuplicateUserException extends Exception{
	String msg;
	public DuplicateUserException(String msg) {
		this.msg = msg;
	}
	public String toString() {
		return this.msg;
	}
}
