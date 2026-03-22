package com.system;

public class InventoryItem {
	static int totalItems;
	String itemName;
	int quantity;

	InventoryItem(String itemName, int quantity) {
		this.itemName = itemName;
		this.quantity = quantity;
		InventoryItem.totalItems++;
	}

	static int getTotalItems() {
		return totalItems;
	}

	void addItemInventory(int addQty, int removeQty) {
		if (quantity <= 1000) {
			System.out.println("**********");
			System.out.println("Adds to inventory " + addQty);
			this.quantity = quantity + addQty;
			System.out.println("*******");
		} else {
			System.out.println("*********");
			System.out.println("Remove Items to Inventory " + removeQty);
			this.quantity = quantity - removeQty;
			System.out.println("********");
		}
	}

	void displayItemInfo() {
		System.out.println(this.itemName + " " + this.quantity);
	}

	public static void main(String[] args) {
		InventoryItem i = new InventoryItem("Brush", 1000);
		InventoryItem i1 = new InventoryItem("Pensil", 2000);
		InventoryItem i2 = new InventoryItem("TCS", 780);
		

		i.displayItemInfo();
		i.addItemInventory(150, 100);
		i.displayItemInfo();
		i.addItemInventory(500, 500);
		System.out.println("********");
		i1.displayItemInfo();
		i1.addItemInventory(200, 300);
		i1.displayItemInfo();
		System.out.println("*********");
		i2.displayItemInfo();
		

		System.out.println("Total Available Quantity = " + InventoryItem.getTotalItems());
	}
}
