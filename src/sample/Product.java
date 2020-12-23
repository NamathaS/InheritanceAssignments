package sample;

public class Product {
	
	public int productId;
	public String productName;
	
	public String productCategory;
	public double productUnitPrice;
	
	public Product() {}
	
	public Product(int id, String name, String category, double price) {
		productId=id;
		productName=name;
		productCategory=category;
		productUnitPrice=price;
	}
	
	public void displayProductDetails() {
		System.out.println(" Product Id is : "+ productId);
		System.out.println(" Product Name is : "+ productName);
		System.out.println(" Product Category is : "+ productCategory);
		System.out.println(" Product Price is : "+ productUnitPrice);
	}
	

}
