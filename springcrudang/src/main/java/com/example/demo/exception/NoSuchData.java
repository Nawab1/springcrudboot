package com.example.demo.exception;

public class NoSuchData extends RuntimeException {
  public NoSuchData() {
	  
  }
  public NoSuchData(String msg) {
	  super(msg);
  }
}
