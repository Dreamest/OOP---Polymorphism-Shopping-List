package list;

public interface ProductNode {
	public Product getProduct();
	public void setProduct(Product product);
	public ProductNode getNextNode();
	public void setNextNode(ProductNode node);
}
