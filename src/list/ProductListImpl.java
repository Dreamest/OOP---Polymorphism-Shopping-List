package list;

public class ProductListImpl implements ProductList {
	private ProductNode start;

	public ProductListImpl() {
		// empty constructor.
	}

	@Override
	public void addProduct(Product product) {
		if (product == null) {
			return;
		}
		if (start == null) {
			start = new ProductNodeImpl();
			start.setProduct(product);
			start.setNextNode(null);
			return;
		}
		ProductNode i = start;
		while (i.getNextNode() != null) {
			i = i.getNextNode();
		}
		ProductNode temp = i;
		i = new ProductNodeImpl();
		temp.setNextNode(i);
		i.setProduct(product);
		i.setNextNode(null);
	}

	@Override
	public ProductNode getFirstNode() {
		return start;
	}

	@Override
	public ProductNode getNodeByIndex(int index) {
		if (index < 0 || index > size()) {
			return null;
		}
		ProductNode i = start;
		for (int j = 0; j < index; j++) {
			i = i.getNextNode();
		}
		return i;
	}

	@Override
	public int size() {
		int length = 0;
		if (start == null) {
			return length;
		}
		ProductNode i = start;
		length++;
		while (i.getNextNode() != null) {
			length++;
			i = i.getNextNode();
		}
		return length;
	}

	@Override
	public double getTotalPrice() {
		double totalCost = 0.0;
		ProductNode i = start;
		while (i != null) {
			totalCost += i.getProduct().getPrice();
			i = i.getNextNode();
		}
		return totalCost;
	}

	@Override
	public void deleteNodeByIndex(int index) {
			if (index < 0 || index > size() || start==null) {
				return;
			}
			if (index == 0) {
				start = start.getNextNode();
				return;
			}
			ProductNode i = start;
			for (int j = 0; j < index - 1; j++) {
				i = i.getNextNode();
			}
			i.setNextNode(i.getNextNode().getNextNode());
		}
}
