/*
Group 57
Akhilesh Ramesh (i6291958), Kai Kitagawa-Jones (i6275822)
*/

package com.group57.order;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OrderingAPI extends HttpServlet {
	private OrderManger orderManger;

	public OrderingAPI(OrderManger orderManger) {
		this.orderManger = orderManger;
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
	}
}