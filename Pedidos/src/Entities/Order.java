package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entities.enums.OrderStatus;

public class Order {
    

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
	public Date moment;
	public OrderStatus status;
	public Client cliente;
	
	private List<OrderItem> item = new ArrayList<>();

	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client cliente) {
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
	}

	public Client getCliente() {
		return cliente;
	}

	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}

	public List<OrderItem> getItem() {
		return item;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public void Additem (OrderItem oder) {
		
		item.add(oder);
	
	 }
	
	public void Removitem(OrderItem oder) {
		
		item.remove(oder);
	}
	
	
	public double TotalValue() {
		double total = 0.0;
	   for (OrderItem o : item) {
		    total += o.subTotal();
	}
	
	   return total;
	
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + cliente.getName());
		sb.append( "(" + cliente.getBirthDate() + ") - ");
		sb.append(cliente.getEmail() + "\n");
		sb.append("Order items: \n");
		for(OrderItem o : item) {
			sb.append(o.toString() + "\n");
		}
		
		sb.append("Total price: " + String.format("%.2f",TotalValue()));
		return sb.toString();
	}
	
	

}