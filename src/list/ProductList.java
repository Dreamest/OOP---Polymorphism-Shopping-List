package list;

public interface ProductList {
	public ProductNode getFirstNode();
	public ProductNode getNodeByIndex(int index);
	public void deleteNodeByIndex(int index);	
	public int size();
	public void addProduct(Product product);
	public double getTotalPrice();
}
