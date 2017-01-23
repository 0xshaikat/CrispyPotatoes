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
	Item Hoodie = new Item("Hoodie", 200, "Very comfortable", 0, 15, 0);
	Item Dictionary = new Item("Dictionary", 250, "More words, more fire", 10, 0, 10);
	Item Friend = new Item("A friend", 150, "He's got your back", 20, 5, 0);
	Item Crowd = new Item("Crowd", 400, "They follow you around", 0, 0, 20);
	Item Epic = new Item("Epic", 999, "Rap God", 100, 100, 100);
	items.add(Friend);
	items.add(Hoodie);
	items.add(Dictionary);
	items.add(Crowd);
	items.add(Epic);
    }

    // Add record deal
    public void addRecordDeal() {
	Item RecordDeal = new Item("Record Deal", 700, "A wise choice", 0, 0, 0);
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
