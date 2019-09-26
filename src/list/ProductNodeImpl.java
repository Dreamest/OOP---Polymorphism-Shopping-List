package list;

public class ProductNodeImpl implements ProductNode {
	private Product current;
	private ProductNode next;
	
	public ProductNodeImpl() {
		//empty constructor.
	}

	@Override
	public Product getProduct() {
		return current;
	}

	@Override
	public void setProduct(Product product) {
		if(product != null){
			this.current = product;
		}
	}

	@Override
	public ProductNode getNextNode() {
		return next;
	}

	@Override
	public void setNextNode(ProductNode node) {
		this.next = node;
	}

}
