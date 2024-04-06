package com.tnisf.orderservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.NoResultException;

@RestController


public class Ordercontroller {
	@Autowired
	private Orderservice Orderserv;
	private Orderservice repo;
	@GetMapping("/Orderservice")
	public List<Order> list()
	{
		return Orderserv.listAll();
	}
	@PostMapping("/Orderservice")
	public void add(@RequestBody Order Orderserv1)
	{
		repo.save(Orderserv1);
	}
	@GetMapping("/Orderservice/{id}")
	public ResponseEntity<Order> get(@PathVariable Integer id)
	{
		try
		{
		Order u=Orderserv.get(id);
		return new ResponseEntity<Order>(u,HttpStatus.OK);
	}
	catch(NoResultException e)
	{
		return new ResponseEntity<Order>(HttpStatus.NOT_FOUND);
	}
  }
	@DeleteMapping("/Orderservice/{id}")
	public void delete (@PathVariable Integer id)
	{
		Orderserv.delete(id);
	}
	@PutMapping("/Orderservice/{id}")
	public ResponseEntity<Order> update(@PathVariable Integer id,@RequestBody Order update_u)
	{
		try
		{
		Order exist_u=Orderserv.get(id);
		exist_u.setOrdername(update_u.getOrderaddress());
		exist_u.setOrderaddress(update_u.getOrderaddress());
		exist_u.setOrdercontactnum(update_u.getOrdercontactnum());
		exist_u.setOrderEmail(update_u.getOrderEmail());
		exist_u.setOrderid(update_u.getOrderid());
		Orderserv.update(exist_u);
		return new ResponseEntity<Order>(exist_u,HttpStatus.OK);
	    }
	catch(NoResultException e)
	{
		return new ResponseEntity<Order>(HttpStatus.NOT_FOUND);
	}
  }

}


