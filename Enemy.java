public class Enemy extends Character {

    // Constructor
    public Enemy(String setName, String setHometown) {
	super(100, 50, 50); // Scale this later
	name = setName;
	hometown = setHometown;
    }

    // TODO: Take string from lyric array
    public int attack(Character opponent) {
	String[] weakLyrics = RapLyrics.getWeakLyrics();
	int rnd = (int)(Math.random() *  weakLyrics.length);
	// System.out.println("RANDOM: " + rnd);
	// System.out.println(weakLyrics[rnd]);
	String bar = weakLyrics[rnd];
	int damage = (int)(RapAnalyzer.getFireIndex(bar, bar));
	System.out.println(damage);
	opponent.lowerHP(damage); // Decrease based on rap lyric percentage
	return 20; // Return damage dealt
    }
    
}
