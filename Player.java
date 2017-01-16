import java.util.ArrayList;

public class Player extends Character {

    private int money = 0;
    private ArrayList<Item> upgrades;
	
    // Constructor
    public Player(String setName, String setHometown) {
	super(100, 50, 50); // Scale this later (HP, Def, Atk)
	name = setName;
	hometown = setHometown;
	money = 100;
	upgrades = new ArrayList<Item>();
    }

    // Get Money
    public int getMoney() {
	if (money < 0) {
	    money = 0;
	}
	return money;
    }

    // Add item to upgrades
    public void addUpgrade(Item item) {
	upgrades.add(item);
    }
    
    // Gain Money
    public void gainMoney(int profit) {
	money += profit;
    }

    // Lose Money
    public void loseMoney(int loss) {
	money -= loss;
    }
    
    // TODO: Take user input
    public int attack(Character opponent) {
	opponent.lowerHP(20); // Decrease based on rap lyric percentage
	return 20; // Return damage dealt
    }

    // Use linear search to check for record deal
    public boolean hasRecordDeal() {
	for (Item item: upgrades) {
	    if (item.getItemName() == "Record Deal") {
		return true;
	    }
	}
	return false;
    }
    
}
