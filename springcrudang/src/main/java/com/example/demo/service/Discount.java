package com.example.demo.service;

public interface Discount {
  public static double stdis(double price) {
	double temp=   price/100 * 2;
	return temp;
  }
}
