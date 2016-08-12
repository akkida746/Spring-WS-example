package com.mkyong.ws;

import java.sql.SQLException;

import javax.jws.WebMethod;
import javax.jws.WebService;
import com.mkyong.bo.HelloWorldBo;
import com.mkyong.bo.impl.Item;
import com.mkyong.bo.impl.Order;
import com.mkyong.bo.impl.OrderDao;

@WebService
public class OrderServiceWS {

	// DI via Spring
	HelloWorldBo helloWorldBo;

	@WebMethod(exclude = true)
	public void setHelloWorldBo(HelloWorldBo helloWorldBo) {
		this.helloWorldBo = helloWorldBo;
	}

	@WebMethod(operationName = "getHelloWorld")
	public String getHelloWorld() {

		return helloWorldBo.getHelloWorld();

	}

	@WebMethod(operationName = "getOrder")
	public Order getOrderDetails(String orderId) {

		Order order = new Order();
		order.setOrderid(orderId);

		return order;
	}

}