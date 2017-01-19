public class Enemy extends Character {

    // Constructor
    public Enemy(String setName, String setHometown) {
	super(100, 50, 50); // Scale this later
	name = setName;
	hometown = setHometown;
    }

    // Takes string from lyric array and calculates damage
    public int attack(Character opponent) {
	String[] weakLyrics = RapLyrics.getWeakLyrics();
	int rnd = (int)(Math.random() *  weakLyrics.length);
	// System.out.println("RANDOM: " + rnd);
	// System.out.println(weakLyrics[rnd]);
	String bar = weakLyrics[rnd];
	int damage = (int)(RapAnalyzer.getFireIndex(bar, bar));
	opponent.lowerHP(damage);
	return damage; // Return damage dealt
    }
    
}
