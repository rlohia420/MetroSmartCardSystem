package com.mscs.exception;

public class InsufficientCardBalance extends Exception {
	private static final long serialVersionUID = 1L;

	public InsufficientCardBalance(String s) {
		super(s);
	}
}
