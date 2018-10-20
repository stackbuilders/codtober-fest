package com.pizza.star;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PizzaControler {
	@Autowired
	private RespositorioPedido repoPedido;
	
	@RequestMapping(value="/pizza",method=RequestMethod.POST)
	public ResponseEntity<Pedido> Test (@RequestBody Pedido pedido) {
	//	System.out.println(dataSource);
		String ingredient = String.join(",", pedido.getIngredients());
		pedido.setIngredient(ingredient);
		repoPedido.save(pedido);
		return new ResponseEntity<Pedido>(pedido, HttpStatus.OK);
	
	}
}
