package list;

public class Tester {

	public static void main(String[] args) {

		Product fp1 = new FoodProduct(520051, "banana", 2.5, "tree", true);
		Product ep1 = new ElectricProduct(215138, "Television", 550.25, "samsung", 220);
		Product ep2 = new ElectricProduct(3594115, "Oven", 1250.75, "Generic Brand", 220);
		Product fp2 = new FoodProduct(559884, "edible gold", 1000.99, "Decadence", false);

		ProductList list = new ProductListImpl();
		list.addProduct(fp1);
		list.addProduct(ep1);
		list.addProduct(ep2);
		
		System.out.println("The list has " + list.size() + " items.\n");
		System.out.println("The list contains the following items: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.getNodeByIndex(i).getProduct());
		}
		System.out.println("Total price for the current list is " + list.getTotalPrice());
		System.out.println("Index 1 has " + list.getNodeByIndex(1).getProduct());
		
		System.out.println("\nRemoving item at index 1.");
		list.deleteNodeByIndex(1);
		System.out.println("The list now has " + list.size() + " items. \n");
		System.out.println("The list conntains the following items: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.getNodeByIndex(i).getProduct());
		}
		System.out.println("Total price for the current list is " + list.getTotalPrice());
		System.out.println("Index 1 has " + list.getNodeByIndex(1).getProduct());
		
		
		
		System.out.println("\nRemoving item at index 0.");
		list.deleteNodeByIndex(0);
		System.out.println("The list now has " + list.size() + " items. \n");
		System.out.println("The list conntains the following items: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.getNodeByIndex(i).getProduct());
		}
		System.out.println("Total price for the current list is " + list.getTotalPrice());
		
		System.out.println("\nAdding an item to the list.");
		list.addProduct(fp2);
		System.out.println("The list now has " + list.size() + " items. \n");
		System.out.println("The list conntains the following items: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.getNodeByIndex(i).getProduct());
		}
		System.out.println("Total price for the current list is " + list.getTotalPrice());
		System.out.println("Index 1 has " + list.getNodeByIndex(1).getProduct());
		
		
		System.out.println("\nRemoving item at index 0.");
		list.deleteNodeByIndex(0);
		System.out.println("The list now has " + list.size() + " items. \n");
		System.out.println("The list conntains the following items: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.getNodeByIndex(i).getProduct());
		}
		System.out.println("Total price for the current list is " + list.getTotalPrice());
		
		
		System.out.println("\nRemoving item at index 0.");
		list.deleteNodeByIndex(0);
		System.out.println("The list now has " + list.size() + " items. \n");
		System.out.println("The list conntains the following items: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.getNodeByIndex(i).getProduct());
		}
		System.out.println("Total price for the current list is " + list.getTotalPrice());
		
		System.out.println("test");
		System.out.println(list.getFirstNode());
		System.out.println(list.getNodeByIndex(0));
		System.out.println(list.getTotalPrice());
	}

}
