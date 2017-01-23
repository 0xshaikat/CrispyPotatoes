import java.util.ArrayList;
import cs1.Keyboard;

public class Player extends Character {

    private int money = 0;
    private ArrayList<Item> upgrades;
    
    // Constructor
    public Player(String setName, String setHometown) {
	super(100, 20, 10); // Scale this later (HP, Def, Atk)
	name = setName;
	hometown = setHometown;
	money = 100;
	upgrades = new ArrayList<Item>();
    }

    // Get Money
    public int getMoney() {
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
    
    // Takes user input and uses RapAnalyzer to calculate damage
    public int attack(Character opponent) {
	System.out.println("Spit a bar (one sentence)...");
	String bar = Keyboard.readString();
	// System.out.println("\n" + bar + "\n");
	int damage = (int)(RapAnalyzer.getFireIndex(bar)) + attack;
	//System.out.println(attack);
	damage -= opponent.defense / 3;
	opponent.lowerHP(damage); // Decrease based on rap lyric percentage
	return damage; // Return damage dealt
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
