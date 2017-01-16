//main driver file

import cs1.Keyboard;


public class Woo{

    private Character user;
    private Character enemy;
    private Shop shop;
    private boolean gameOver;
    private int wins;
    private int losses;
    
    // Constructor
    public Woo() {
	gameOver = false;
	wins = 0;
	losses = 0;
	startGame();
    }

    // Create player by asking for name and hometown params
    // Menu - 1. Battle, 2. Shop
    public void startGame() {
	// Create player
	String name, hometown;
	System.out.println("Welcome to Rap Battle RPG!\n\nWhat is your name?");
	name = Keyboard.readString();
	System.out.println("");
	System.out.println("Where are you from?");
	hometown = Keyboard.readString();
	System.out.println("");
	user = new Player(name, hometown);
	shop = new Shop();


	while (!gameOver) {
	    // Add record deal at 5 wins and shop does not have a record deal
	    if (wins == 5 && !shop.hasRecordDeal()) {
		shop.addRecordDeal();
	    }

	    // Does the user own 'Record Deal'?
	    if (!((Player)user).hasRecordDeal()) {

		// Set user to full HP (might have to make a maxHP var in Character)
		user.setHP(user.maxHP);
		// Menu
		System.out.println("========== MENU ==========");
		int choice;
		System.out.println("You are " + user.getName() + " from " + user.getHometown() + ".\nYou have $" + ((Player)user).getMoney() + ".\nRecord: " + wins + " wins - " + losses + " losses\n");
		System.out.println("Stats:\nHP: " + user.getHP() + "\nDefense: " + user.getDefense() + "\nAttack: " + user.getAttack() + "\n");
		System.out.println("Type '1' to battle.\nType '2' to shop.\nType '0' to stop playing.");
		choice = Keyboard.readInt();
		if (choice != 1 && choice != 2 && choice != 0){
		    System.out.println("Please enter a valid option.");
		} else if (choice == 1) {
		    battle();
		} else if (choice == 2){
		    shop();
		} else {
		    break;
		}
	    } else {
		gameOver = true;
		System.out.println("\n\n========== YOU WIN ==========\nYou beat Rap Battle RPG!\nWins: " + wins + "\nLosses: " + losses);
	    }	
	}
    }

    public void battle() {
	System.out.println("\n========== RAP BATTLE ==========");
	// Create enemy
	enemy = new Enemy("Rapper", "Compton");
	System.out.println(user.getName() + " from " + user.getHometown() + " VS " + enemy.getName() + " from " + enemy.getHometown() + "\n");

	// Implement random player goes first (random num from 0,1 inclusive)
	// 0 - User's turn, 1 - Opponent's turn
	int turn = 0;
	
	// Keep battling if both rappers are alive
	while (user.isAlive() && enemy.isAlive()) {
	    int damage;

	    System.out.println("You have " + user.getHP() + "HP. " + enemy.getName() + " has " + enemy.getHP() + "HP.\n");
	    
	    if (turn == 0) {
		System.out.println(user.getName() + "'s turn");
		damage = user.attack(enemy);
		System.out.println("You dealt " + damage + " damage!\n");
		// Change turn
		turn = 1;
		if (!enemy.isAlive()) {
		    System.out.println("You won the rap battle!");
		    // Make a random reward var
		    System.out.println("You gained $50!\n");
		    ((Player)user).gainMoney(50);
		    // Add one to wins
		    wins++;
		}
	    } else if (turn == 1) {
		System.out.println(enemy.getName() + "'s turn");
		damage = enemy.attack(user);
		System.out.println(enemy.getName() + " dealt " + damage + " damage!\n");
		// Change turn
		turn = 0;
		if (!user.isAlive()) {
		    // Make a random loss var
		    System.out.println("You lost the rap battle!");
		    System.out.println("You lost $30!\n");
		    ((Player)user).loseMoney(30);
		    // Add one to losses
		    losses++;
		}
	    }
	}
       
    }

    public void shop() {
	while (true) {
	    
	    // Shop menu
	    System.out.println("\n========== SHOP ==========");
	    System.out.println("Type the # of the item you want to buy.\nType '0' to leave the shop.\n");
	    System.out.println("You have $" + ((Player)user).getMoney() + ".\n");
	    System.out.println("===== ITEMS =====");

	    // List Items
	    System.out.println(shop.listItems());
	    
	    // User input
	    int item = Keyboard.readInt();
	    if (item == 0) {
		break;
	    } else {
		int itemPos = item--;
		shop.buyItem(((Player)user), item);
	    }
	    
	}    
    }


    public static void main (String[] args){
	Woo game = new Woo();
    }
    
}


	

