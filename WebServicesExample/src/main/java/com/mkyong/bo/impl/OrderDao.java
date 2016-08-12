package com.mkyong.bo.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OrderDao {
	
	public static void main(String... args){
		
		/*try {
			
			Order order = getOrderDetails("1002");
			
			for(Item item: order.getItems())
				System.out.println(item.getItemId());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}
	
	public static Order getOrderDetails(String orderId) throws ClassNotFoundException, SQLException{
				
		Order order = new Order();
		List<Item> items = new ArrayList<Item>();
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDataSource");	
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://SNSLN-077:1433;user=test;password=test;databaseName=wstest");
		System.out.println("Connected....");
		String sql = "select orderid, itemid, status from locMim where orderid = ?";
		
		/*Statement sta = conn.createStatement();
		ResultSet rs = sta.executeQuery(Sql);*/
		
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setInt(1, Integer.valueOf(orderId));

		// execute select SQL stetement
		ResultSet rs = preparedStatement.executeQuery();
		
		while (rs.next()) {
			Item item = new Item();
			item.setItemId(rs.getString("itemid"));
			item.setStatus(rs.getString("status"));
			items.add(item);
		}
		
		order.setItems(items);
		return order;
		
	}

}
 