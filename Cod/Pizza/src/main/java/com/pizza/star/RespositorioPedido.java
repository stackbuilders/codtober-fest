package com.pizza.star;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RespositorioPedido extends CrudRepository<Pedido, Integer> {
	
}
