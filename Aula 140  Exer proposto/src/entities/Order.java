package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date date;
	private OrderStatus status;
	
	private Client client;
	
	private List<OrderItem> items = new ArrayList<OrderItem>();
	
	public Order() {
	}

	public Order(Date date, OrderStatus status,Client client) {
		this.date = date;
		this.status = status;
		this.client = client;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	///metados
	
	public List<OrderItem> getItems(){
		return items;
	}
	
	public void additem(OrderItem item) {
		item.add(item);
	}
	public void removeItem(OrderItem item) {
		item.remove(item);
	}
	
	public Double total() {
		double sum =0.0;
		for(OrderItem item : items) {
			sum+=item.subTotal();
		}
		return sum;
		
	}
	
}
