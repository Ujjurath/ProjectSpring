package com.tutofox.ProjectSpring;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class ProductService {
	
	@Autowired
	ProductDB db;
//	
	public List<Product> getAllProducts() {
		return db.findAll();
	}
	public List<Product> getProductsByName(String name) {
		return db.findByName(name);
	}
	
	public void addProduct(Product p) {
		db.save(p);
	}
	
//	List<Product> products = new ArrayList<Product>();
//	ProductDB db = new ProductDB();

//	     
//	public Product getProducts(String name) {
//		for(Product p : products) {
//			if(p.getName().equals(name))
//				return p;
//		}
//		return null;
//	}
//	
//	public Product getProductByPlace(String place) {
//		for(Product p : products) {
//			if(p.getPlace().equals(place))
//				return p;
//		}
//		
//		return null;
//	}
//
//	public List<Product> getProductInWarranty(int warranty) {
//		List<Product> warrantyProducts = new ArrayList<Product>();
//		for(Product p : products) {
//			if(p.getWarranty()>warranty)
//				warrantyProducts.add(p);
//		}
//		return warrantyProducts;
//	}
//
//	public List<Product> getProductWithText(String text) {
//		String str = text.toLowerCase();
//		List<Product> prods = new ArrayList<>();
//		for(Product p : products) {
//			String name = p.getName().toLowerCase();
//			String type = p.getType().toLowerCase();
//			String place = p.getPlace().toLowerCase();
//			if(name.contains(str) ||
//					place.contains(str) || 
//					type.contains(str)) {
//				prods.add(p);
//			}
//		}
//		return prods;
//	}
//	public void show() {
//		System.out.println("p");
//		
//	}

	

}
