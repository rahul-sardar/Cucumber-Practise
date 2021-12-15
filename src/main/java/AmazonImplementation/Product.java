package AmazonImplementation;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	private String productName;
	private int price;
	
	
	public Product(String productName, int price) {
		super();
		this.productName = productName;
		this.price = price;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public List<String> getProductList(){
		List<String> list = new ArrayList<String>();
		list.add("Apple Macbook Air");
		list.add("Ipad Pro Max");
		list.add("Iphone Pro Max");
		list.add("Apple Macbook Pro");
		list.add("Iphone");
		
		return list;
		
	}

	

}
