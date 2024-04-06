package com.tnisf.orderservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class Orderservice
{
	@Autowired
	private  OrderRepository repo;
	
	//Get all the records from the table
	public List< Order> listAll()
	{
		return repo.findAll();
	}
	//save the record
	public void save( Order  Orderserv)
	{
		repo.save( Orderserv);
	}
	//retrieving the particular record with Oid
		public Order get(Integer Oid)
		{
			return repo.findById(Oid).get();
		}
		//deleting the particular record with Oid
		public void delete(Integer Oid)
		{
			repo.deleteById(Oid);
		}
		//Update the record
		public void update( Order  Orderserv)
		{
			repo.save( Orderserv);
		}



}
