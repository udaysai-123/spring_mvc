package org.dxc.shopping.service;

import java.util.ArrayList;
import java.util.List;

import org.dxc.shopping.model.Product;
import org.springframework.stereotype.Service;
@Service
public class ProductService {
	private List<Product> listOfProduct;
	
	public  List<Product> getProduct(){
		Product p=new Product(1,"RealmeBuds",1,2000.0);
		Product p1=new Product(2,"RedmeBuds",1,3000.0);
		Product p2=new Product(3,"RealmexBuds",1,4000.0);
		listOfProduct=new ArrayList<Product>();
		listOfProduct.add(p);
		listOfProduct.add(p1);
		listOfProduct.add(p2);
		return listOfProduct;
	}

}
