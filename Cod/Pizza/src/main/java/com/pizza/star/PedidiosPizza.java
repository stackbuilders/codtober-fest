package com.pizza.star;

public class PedidiosPizza {
	  
	private static int totalPedidas = 0;
	private static int totalEntregada = 0;
	private String ingresdientes;
	private String tamano;
	private Double precio=0.0;
	private String estado;
	
	  
	public PedidiosPizza(String ingredientes, String tamano, Double precio) {
		    this.ingresdientes = ingredientes;
		    this.tamano = tamano;
		    this.estado = "pedida";
		    this.precio= precio;
		    PedidiosPizza.totalPedidas++;
	}
	
	public static int getTotalEntregada() {
		return totalEntregada;
	}

	public static void setTotalEntregada(int totalEntregada) {
		PedidiosPizza.totalEntregada = totalEntregada;
	}

	public String getIngresdientes() {
		return ingresdientes;
	}

	public void setIngresdientes(String ingresdientes) {
		this.ingresdientes = ingresdientes;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}	

	public static void setTotalPedidas(int totalPedidas) {
		PedidiosPizza.totalPedidas = totalPedidas;
	}

	public String toString() {
	    return "pizza " + this.ingresdientes + "\n " + this.tamano + "\n " + this.estado+"\n"+this.precio;
	}
		  
	public static int getTotalPedidas() {
	    return PedidiosPizza.totalPedidas;
	}  
	public static int getTotalServidas() {
	    return PedidiosPizza.totalEntregada;
	}
	
	public void sirve() {
	    if (this.estado.equals("pedida")) {
	      this.estado = "entregada";
	      PedidiosPizza.totalEntregada++;
	    } else {
	      System.out.println("esa pizza ya se ha entregado");
	    }
	} 
}
