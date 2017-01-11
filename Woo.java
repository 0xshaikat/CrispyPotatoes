//main driver file

import cs1.Keyboard;


public class Woo{

    private Character user;
    private Character enemy;
    private boolean gameOver;
    private int wins;
    private int losses;
    
    public Woo() {
	gameOver = false;
	wins = 0;
	losses = 0;
	startGame();
    }
    
    public void startGame() {
	int choice;
	System.out.println("Type 1 to battle. Type 2 to shop. Press enter.");
        choice = Keyboard.readInt();
	if (choice != 1 && choice != 2){
	    System.out.println("Wrong choice. Please try again.");
	    System.exit(0);// just for now, need a way to go back to menu
	} else if (choice == 1) {
	    System.out.println("battle");
	    // battle();
	} else {
	    System.out.println("shop");
	    // shop();
	}
    }

    public void battle(){
	System.out.println("Battle");
    }

    public void shop(){
	System.out.println("Shop.");
    }


    public static void main (String[] args){
	Woo game = new Woo();
    }
}


	

