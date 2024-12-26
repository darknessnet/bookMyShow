package com.yash.bookMyShow.controller;

import com.yash.bookMyShow.util.TicketUtil;

public class ProductController {
	
	public static TicketUtil ticketUtil;
	
	public static void main(String[] args) {
		
		try {
			System.out.println(ticketUtil);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("hello");
	}
}