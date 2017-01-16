import java.util.ArrayList;

public class Shop {

    private ArrayList<Item> items;

    // Constructor
    public Shop() {
	items = new ArrayList<Item>();
	addItems();
    }

    // Add items to list
    public void addItems() {
	Item Poop = new Item("Poop", 100, "Gives you special powers", 25, 5, 10);
	Item BookOfFire = new Item("Book of fire", 100, "Gives you special powers", 5, 0, 30);
	Item Friend = new Item("A friend", 100, "Gives you special powers", 30, 20, 0);
	items.add(Poop);
	items.add(BookOfFire);
	items.add(Friend);
    }

    // Add record deal
    public void addRecordDeal() {
	Item RecordDeal = new Item("Record Deal", 1000, "A wise choice", 0, 0, 0);
	items.add(RecordDeal);
    }

    // Use linear search to check for record deal
    public boolean hasRecordDeal() {
	for (Item item: items) {
	    if (item.getItemName() == "Record Deal") {
		return true;
	    }
	}
	return false;
    }
    
    // List Items
    public String listItems() {
	String itemList = "";
	if (items.size() != 0) {
	    for (int i = 0; i < items.size(); i++) {
		int itemNum = i;
		Item item = items.get(i);
		ArrayList<Integer> upgrades = item.getUpgrades();
		itemList += (itemNum + 1) + ". " + item.getItemName() + " $" + item.getPrice() + " -- " + item.getDesc() + "\n";
		itemList += "\tHP: " + "+" + upgrades.get(0);
		itemList += "\t  Defense: " + "+" + upgrades.get(1);
		itemList += "\t Attack: " + "+" + upgrades.get(2) + "\n\n";
	    }
	} else {
	    itemList = "NO ITEMS AVAILABLE";
	}
	return itemList;
    }

    // User inputs index of item
    public void buyItem(Player user, int index) {
	// System.out.println("Index: " + index);
	// System.out.println("Size: " + items.size());
	if (index >= items.size()) {
	    System.out.println("Invalid item selection!");
	} else {
	    Item item = items.get(index);
	    ArrayList<Integer> upgrades = item.getUpgrades();
	    if (user.getMoney() >= item.getPrice()) {
		// Remove item from arraylist
		items.remove(index);
		// Decrease money and add stats
		user.loseMoney(item.getPrice());
		user.addHP(upgrades.get(0));
		user.addDefense(upgrades.get(1));
		user.addAttack(upgrades.get(2));
		user.addUpgrade(item);
		System.out.println("You bought '" + item.getItemName() + "' for $" + item.getPrice() + ".");
	    } else {
		System.out.println("You cannot afford this item!");
	    }
	}
    }
    
}
