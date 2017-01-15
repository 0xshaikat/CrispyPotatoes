public class Player extends Character {

    private int money = 0;

    // Constructor
    public Player(String setName, String setHometown) {
	super(100, 50, 50); // Scale this later (HP, Def, Atk)
	name = setName;
	hometown = setHometown;
	money = 100;
    }

    // Get Money
    public int getMoney() {
	if (money < 0) {
	    money = 0;
	}
	return money;
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
    
}
