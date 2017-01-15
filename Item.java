import java.util.ArrayList;

public class Item {

    private String itemName;
    private int price;
    private String desc;
    private ArrayList<Integer> upgrades = new ArrayList<Integer>(3); // [HP, Defense, Attack]

    // Constructor
    public Item() {
	itemName = "Item";
	price = 100;
	desc = "A very cool item.";
	upgrades.add(20);
	upgrades.add(20);
	upgrades.add(20);
    }

    // Overloaded constructor
    public Item(String setItemName, int setPrice, String setDesc, int setItemHP, int setItemDefense, int setItemAttack) {
	itemName = setItemName;
	price = setPrice;
	desc = setDesc;
	upgrades.add(setItemHP);
	upgrades.add(setItemDefense);
	upgrades.add(setItemAttack);
    }

    // Get name
    public String getItemName() {
	return itemName;
    }

    // Get price
    public int getPrice() {
	return price;
    }

    // Get description
    public String getDesc() {
	return desc;
    }

    // Get upgrades [HP, Defense, Attack]
    public ArrayList<Integer> getUpgrades() {
	return upgrades;
    }
    
}
