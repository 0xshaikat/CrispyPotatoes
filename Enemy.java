public class Enemy extends Character {

    // Constructor
    public Enemy(String setName, String setHometown) {
	super(100, 5, 15);
	name = setName;
	hometown = setHometown;
    }

    // Takes string from lyric array and calculates damage
    public int attack(Character opponent) {
	String[] lyrics = RapLyrics.getLyrics();
	int rnd = (int)(Math.random() *  lyrics.length);
	// System.out.println("RANDOM: " + rnd);
	System.out.println("'" + lyrics[rnd] + "'");
	String bar = lyrics[rnd];
	int damage = (int)(RapAnalyzer.getFireIndex(bar)) + attack;
	damage -= opponent.defense / 3;
	opponent.lowerHP(damage);
	return damage; // Return damage dealt
    }
    
}
