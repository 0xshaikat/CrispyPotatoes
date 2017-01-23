package color;

import java.io.*;
import java.util.*;

//*********************************************************
//  text.Java     Author: Shaikat Islam
//
// Facilitates UI modification in terminal; good for games and the such.
// Makes use of ANSI codes.
// Also filters bad words
//*********************************************************

public class Text{


	    
	
	
	

    //returns a bold String
    public static String bold(String input){
	String FOREGROUND = Integer.toString(0) + ";" ; //default
	String BACKGROUND = Integer.toString(0) + ";"; //default
	String ANSICODE = "\033["  + FOREGROUND + BACKGROUND + "1m";
	String output = ANSICODE + input;
	return output;
    }
    
    //returns a dimmer String
    public static String dim(String input){
	String FOREGROUND = Integer.toString(0) + ";" ; //default
	String BACKGROUND = Integer.toString(0) + ";"; //default
	String ANSICODE = "\033["  + FOREGROUND + BACKGROUND + "2m";
	String output = ANSICODE + input;
	return output;
    }
    

    //returns an underlined String
    public static String underline(String input){
	String FOREGROUND = Integer.toString(0) + ";" ; //default
	String BACKGROUND = Integer.toString(0) + ";"; //default
	String ANSICODE = "\033["  + FOREGROUND + BACKGROUND + "4m";
	String output = ANSICODE + input;
	return output;
    }

    //returns a flashing String
    public static String flash(String input){
	String FOREGROUND = Integer.toString(0) + ";" ; //default
	String BACKGROUND = Integer.toString(0) + ";"; //default
	String ANSICODE = "\033["  + FOREGROUND + BACKGROUND + "5m";
	String output = ANSICODE + input;
	return output;
    }

    //returns a reversevideo? String
    public static String reverse(String input){
	String FOREGROUND = Integer.toString(0) + ";" ; //default
	String BACKGROUND = Integer.toString(0) + ";"; //default
	String ANSICODE = "\033["  + FOREGROUND + BACKGROUND + "7m";
	String output = ANSICODE + input;
	return output;
    }
    
    //returns a String, that when printed, is default bold, and a random color
    public static String Rcolorbold(String input){
	String FOREGROUND = Integer.toString((30 + (int)(Math.random() * ((37 - 30) + 1)))) + ";";
	String BACKGROUND = Integer.toString(0) + ";"; //default
	String ANSICODE = "\033[" + BACKGROUND + FOREGROUND +    "1m";
	String output = ANSICODE + input;
	return output;
    }
    
    //returns a String, that when printed, is default dimmed, and a random color
    public static String Rcolordim(String input){
	String FOREGROUND = Integer.toString((30 + (int)(Math.random() * ((37 - 30) + 1)))) + ";";
	String BACKGROUND = Integer.toString(0) + ";"; //default
	String ANSICODE = "\033[" + BACKGROUND + FOREGROUND +  "2m";
	String output = ANSICODE + input;
	return output;
    }

    //returns a String, that when printed, is default underlined, and a random color
    public static String Rcolorunder(String input){
	String FOREGROUND = Integer.toString((30 + (int)(Math.random() * ((37 - 30) + 1)))) + ";";
	String BACKGROUND = Integer.toString(0) + ";"; //default
	String ANSICODE = "\033[" + BACKGROUND + FOREGROUND +  "4m";
	String output = ANSICODE + input;
	return output;
    }
    
    //returns a String, that when printed, is default flash, and a random color
    public static String Rcolorflash(String input){
	String FOREGROUND = Integer.toString((30 + (int)(Math.random() * ((37 - 30) + 1)))) + ";";
	String BACKGROUND = Integer.toString(0) + ";"; //default
	String ANSICODE = "\033[" + BACKGROUND + FOREGROUND +  "5m";
	String output = ANSICODE + input;
	return output;
    }

    //returns a String, that when printed, is default reversed in background, and a random color
    public static String Rcolorreverse(String input){
	String FOREGROUND = Integer.toString((30 + (int)(Math.random() * ((37 - 30) + 1)))) + ";";
	String BACKGROUND = Integer.toString(0) + ";"; //default
	String ANSICODE = "\033[" + BACKGROUND + FOREGROUND +  "7m";
	String output = ANSICODE + input;
	return output;
    }

    //returns a random colored String
    public static String Rcolor(String input){
	String FOREGROUND = Integer.toString((30 + (int)(Math.random() * ((37 - 30) + 1)))) + ";";
	String BACKGROUND = Integer.toString(0) + ";"; //default
	String ANSICODE = "\033[" + BACKGROUND + FOREGROUND +  "5m";
	String output = ANSICODE + input;
	return output;
    }

    //RAINBOW STRING - makes use of iteration to rainbow-ify a string -- default
    public static String rString(String input){
	String s = "";
	for (int i = 0; i < input.length(); i++){
	    String FOREGROUND = Integer.toString((30 + (int)(Math.random() * ((37 - 30) + 1)))) + ";";
	    String BACKGROUND = Integer.toString(0) + ";"; //default
	    String ANSICODE = "\033[" + BACKGROUND + FOREGROUND +  "5m";
	    String temp = ANSICODE + input.charAt(i);	    
	    s+= temp;
	}	    	
	String output = s;
	return output;
    }

    //RAINBOW STRING - makes use of iteration to rainbow-ify a string -- bold
    public static String rStringB(String input){
	String s = "";
	for (int i = 0; i < input.length(); i++){
	    String FOREGROUND = Integer.toString((30 + (int)(Math.random() * ((37 - 30) + 1)))) + ";";
	    String BACKGROUND = Integer.toString(0) + ";"; //default
	    String ANSICODE = "\033[" + BACKGROUND + FOREGROUND +  "1m";
	    String temp = ANSICODE + input.charAt(i);	    
	    s+= temp;
	}	    	
	String output = s;
	return output;
    }
    
    //RAINBOW STRING - makes use of iteration to rainbow-ify a string -- underlined
    public static String rStringU(String input){
	String s = "";
	for (int i = 0; i < input.length(); i++){
	    String FOREGROUND = Integer.toString((30 + (int)(Math.random() * ((37 - 30) + 1)))) + ";";
	    String BACKGROUND = Integer.toString(0) + ";"; //default
	    String ANSICODE = "\033[" + BACKGROUND + FOREGROUND +  "4m";
	    String temp = ANSICODE + input.charAt(i);	    
	    s+= temp;
	}	    	
	String output = s;
	return output;
    }
    


    //RAINBOW SENTENCE -- default
    public static String rSentence(String input){
	String s = "";
	Scanner sc = new Scanner(input);
	while(sc.hasNext()){
	    String FOREGROUND = Integer.toString((30 + (int)(Math.random() * ((37 - 30) + 1)))) + ";";
	    String BACKGROUND = Integer.toString(0) + ";"; //default
	    String ANSICODE = "\033[" + BACKGROUND + FOREGROUND +  "5m";
	    String temp = ANSICODE + sc.next() + " ";
	    s+=temp;
	}
	String output = s;
	return output;
    }

    //RAINBOW SENTENCE -- bold
    public static String rSentenceB(String input){
	String s = "";
	Scanner sc = new Scanner(input);
	while(sc.hasNext()){
	    String FOREGROUND = Integer.toString((30 + (int)(Math.random() * ((37 - 30) + 1)))) + ";";
	    String BACKGROUND = Integer.toString(0) + ";"; //default
	    String ANSICODE = "\033[" + BACKGROUND + FOREGROUND +  "1m";
	    String temp = ANSICODE + sc.next() + " ";
	    s+=temp;
	}
	String output = s;
	return output;
    }

    //RAINBOW SENTENCE -- underlined
    public static String rSentenceU(String input){
	String s = "";
	Scanner sc = new Scanner(input);
	while(sc.hasNext()){
	    String FOREGROUND = Integer.toString((30 + (int)(Math.random() * ((37 - 30) + 1)))) + ";";
	    String BACKGROUND = Integer.toString(0) + ";"; //default
	    String ANSICODE = "\033[" + BACKGROUND + FOREGROUND +  "4m";
	    String temp = ANSICODE + sc.next() + " ";
	    s+=temp;
	}
	String output = s;
	return output;
    }




    //ULTIMATE MODIFIER; FOR USE IN COLORING/FORMATTING [STRINGS] BASED ON USER INPUT
    //MAKES USE OF HASHMAPS
    public static String stringSUPER (String input, String background, String foreground, String code){
	String output = "";
	String fg = foreground.toLowerCase();
	String bg = background.toLowerCase();
	String cd = code.toLowerCase(); 
	Map <String, String> colorfg = new LinkedHashMap<String, String>();
	colorfg.put("default", "0;");
	colorfg.put("black", "30;");
        colorfg.put("red", "31;");
	colorfg.put("green", "32;");
	colorfg.put("yellow", "33;");
	colorfg.put("blue", "34;");
	colorfg.put("purple", "35;");
	colorfg.put("cyan", "36;");
	colorfg.put("white", "37;");
       	Map <String, String> colorbg = new LinkedHashMap<String, String>();
	colorbg.put("default", "0;");
	colorbg.put("black", "40;");
        colorbg.put("red", "41;");
	colorbg.put("green", "42;");
	colorbg.put("yellow", "43;");
	colorbg.put("blue", "44;");
	colorbg.put("purple", "45;");
	colorbg.put("cyan", "46;");
	colorbg.put("white", "47;");
	Map <String, String> codelist = new LinkedHashMap<String, String>();
	codelist.put("default", "0m");
	codelist.put("bold", "1m");
	codelist.put("dim", "2m");
	codelist.put("underline", "4m");
	codelist.put("flash", "5m");
	codelist.put("reverse", "7m");

	if (colorfg.containsKey(fg) && colorbg.containsKey(bg) && codelist.containsKey(cd)){
	    String ANSICODE = "\033["  + colorbg.get(bg) + colorfg.get(fg) + codelist.get(cd);
	    output = ANSICODE + input;
	}
	else{
	    System.out.println("One or more parameters is corrupt.");
	    //diag
	    System.out.println("Foreground color found: " + colorfg.containsKey(fg));
  	    System.out.println("Background color found: " + colorbg.containsKey(bg));
	    System.out.println("Code found: " + codelist.containsKey(cd));
	    System.out.println("To developer: to find the accepted list of codes, look at source of method stringSuper in text.java");
	    System.out.println("HERE ARE THE DICTIONARIES, for your convenience.");
	    System.out.println("codelist:\n" + codelist);
	    System.out.println("foregroundcolors:\n" + colorfg);
	    System.out.println("backgroundcolors:\n" + colorbg);
	}
	//diag
	// System.out.println("Foreground color found: " + colorfg.get(fg));
        //System.out.println("Background color found: " + colorbg.get(bg));
        //System.out.println("Code found: " + codelist.get(cd));	
	return output;	
    }
    //a method that prints chars 1 letter at a time, y milliseconds at a time
    public static void delayedString(String s, long y){
	for (int i = 0; i < s.length(); i++){
	    System.out.print(s.charAt(i));
	    try{
		Thread.sleep(y);
	    }
	    catch(InterruptedException e){
	    }
	}
	System.out.println();
    }
        //filters out bad words
    public static String filtered(String input){
	
	String[]  bad = {"4r5e", "5h1t", "5hit", "a55", "anal", "anus", "ar5e", "arrse", "arse", "ass", "ass-fucker", "asses", "assfucker", "assfukka", "asshole", "assholes", "asswhole", "a_s_s", "b!tch", "b00bs", "b17ch", "b1tch", "ballbag", "balls", "ballsack", "bastard", "beastial", "beastiality", "bellend", "bestial", "bestiality", "bi+ch", "biatch", "bitch", "bitcher", "bitchers", "bitches", "bitchin", "bitching", "bloody", "blow job", "blowjob", "blowjobs", "boiolas", "bollock", "bollok", "boner", "boob", "boobs", "booobs", "boooobs", "booooobs", "booooooobs", "breasts", "buceta", "bugger", "bum", "bunny fucker", "butt", "butthole", "buttmuch", "buttplug", "c0ck", "c0cksucker", "carpet muncher", "cawk", "chink", "cipa", "cl1t", "clit", "clitoris", "clits", "cnut", "cock", "cock-sucker", "cockface", "cockhead", "cockmunch", "cockmuncher", "cocks", "cocksuck", "cocksucked", "cocksucker", "cocksucking", "cocksucks", "cocksuka", "cocksukka", "cok", "cokmuncher", "coksucka", "coon", "cox", "crap", "cum", "cummer", "cumming", "cums", "cumshot", "cunilingus", "cunillingus", "cunnilingus", "cunt", "cuntlick", "cuntlicker", "cuntlicking", "cunts", "cyalis", "cyberfuc", "cyberfuck", "cyberfucked", "cyberfucker", "cyberfuckers", "cyberfucking", "d1ck", "damn", "dick", "dickhead", "dildo", "dildos", "dink", "dinks", "dirsa", "dlck", "dog-fucker", "doggin", "dogging", "donkeyribber", "doosh", "duche", "dyke", "ejaculate", "ejaculated", "ejaculates", "ejaculating", "ejaculatings", "ejaculation", "ejakulate", "f u c k", "f u c k e r", "f4nny", "fag", "fagging", "faggitt", "faggot", "faggs", "fagot", "fagots", "fags", "fanny", "fannyflaps", "fannyfucker", "fanyy", "fatass", "fcuk", "fcuker", "fcuking", "feck", "fecker", "felching", "fellate", "fellatio", "fingerfuck", "fingerfucked", "fingerfucker", "fingerfuckers", "fingerfucking", "fingerfucks", "fistfuck", "fistfucked", "fistfucker", "fistfuckers", "fistfucking", "fistfuckings", "fistfucks", "flange", "fook", "fooker", "fuck", "fucka", "fucked", "fucker", "fuckers", "fuckhead", "fuckheads", "fuckin", "fucking", "fuckings", "fuckingshitmotherfucker", "fuckme", "fucks", "fuckwhit", "fuckwit", "fudge packer", "fudgepacker", "fuk", "fuker", "fukker", "fukkin", "fuks", "fukwhit", "fukwit", "fux", "fux0r", "f_u_c_k", "gangbang", "gangbanged", "gangbangs", "gaylord", "gaysex", "goatse", "God", "god-dam", "god-damned", "goddamn", "goddamned", "hardcoresex", "hell", "heshe", "hoar", "hoare", "hoer", "homo", "hore", "horniest", "horny", "hotsex", "jack-off", "jackoff", "jap", "jerk-off", "jism", "jiz", "jizm", "jizz", "kawk", "knob", "knobead", "knobed", "knobend", "knobhead", "knobjocky", "knobjokey", "kock", "kondum", "kondums", "kum", "kummer", "kumming", "kums", "kunilingus", "l3i+ch", "l3itch", "labia", "lust", "lusting", "m0f0", "m0fo", "m45terbate", "ma5terb8", "ma5terbate", "masochist", "master-bate", "masterb8", "masterbat*", "masterbat3", "masterbate", "masterbation", "masterbations", "masturbate", "mo-fo", "mof0", "mofo", "mothafuck", "mothafucka", "mothafuckas", "mothafuckaz", "mothafucked", "mothafucker", "mothafuckers", "mothafuckin", "mothafucking", "mothafuckings", "mothafucks", "mother fucker", "motherfuck", "motherfucked", "motherfucker", "motherfuckers", "motherfuckin", "motherfucking", "motherfuckings", "motherfuckka", "motherfucks", "muff", "mutha", "muthafecker", "muthafuckker", "muther", "mutherfucker", "n1gga", "n1gger", "nazi", "nigg3r", "nigg4h", "nigga", "niggah", "niggas", "niggaz", "nigger", "niggers", "nob", "nob jokey", "nobhead", "nobjocky", "nobjokey", "numbnuts", "nutsack", "orgasim", "orgasims", "orgasm", "orgasms", "p0rn", "pawn", "pecker", "penis", "penisfucker", "phonesex", "phuck", "phuk", "phuked", "phuking", "phukked", "phukking", "phuks", "phuq", "pigfucker", "pimpis", "piss", "pissed", "pisser", "pissers", "pisses", "pissflaps", "pissin", "pissing", "pissoff", "poop", "porn", "porno", "pornography", "pornos", "prick", "pricks", "pron", "pube", "pusse", "pussi", "pussies", "pussy", "pussys", "rectum", "retard", "rimjaw", "rimming", "s hit", "s.o.b.", "sadist", "schlong", "screwing", "scroat", "scrote", "scrotum", "semen", "sex", "sh!+", "sh!t", "sh1t", "shag", "shagger", "shaggin", "shagging", "shemale", "shi+", "shit", "shitdick", "shite", "shited", "shitey", "shitfuck", "shitfull", "shithead", "shiting", "shitings", "shits", "shitted", "shitter", "shitters", "shitting", "shittings", "shitty", "skank", "slut", "sluts", "smegma", "smut", "snatch", "son-of-a-bitch", "spac", "spunk", "s_h_i_t", "t1tt1e5", "t1tties", "teets", "teez", "testical", "testicle", "tit", "titfuck", "tits", "titt", "tittie5", "tittiefucker", "titties", "tittyfuck", "tittywank", "titwank", "tosser", "turd", "tw4t", "twat", "twathead", "twatty", "twunt", "twunter", "v14gra", "v1gra", "vagina", "viagra", "vulva", "w00se", "wang", "wank", "wanker", "wanky", "whoar", "whore", "willies", "willy", "xrated", "xxx"};
	
	String[] list = input.split(" ");
	ArrayList<String> strings =  new ArrayList<String>();
	for (String s: list){
	    strings.add(s);
	}
	//search and replace
	for (int i = 0; i < strings.size()-1; i++){
	    for (int x = 0; x < bad.length ; x++){
		if (strings.get(i).length() > 3 && strings.get(i).equalsIgnoreCase(bad[x])){
		    strings.set(i, "*******");
		}
	    }
	}
	String st = "";
	for (String s: strings){
	    st+=s;
	    st+=" ";
	}
	return st;
    }
	
	


    /*    
	   
    //main method for testing purposes
    public static void main(String[] args){
	System.out.println(bold("bold"));
        System.out.println(dim("dim"));
        System.out.println(underline("underlined"));
        System.out.println(flash("flash?"));
        System.out.println(reverse("reverse background?"));
	System.out.println(Rcolorbold("random bold"));
	System.out.println(Rcolordim("random dim"));
       	System.out.println(Rcolorunder("random underlined"));
	System.out.println(Rcolorflash("random flash?"));
        System.out.println(Rcolorreverse("random reverse background"));
	System.out.println(Rcolor("just a random color"));
	System.out.println(rString("rainbow"));
	System.out.println(rStringB("bold rainbow"));
	System.out.println(rStringU("underlined rainbowssssssssss"));
	System.out.println(rSentence("rainbow words of joy, ay!"));
       	System.out.println(rSentenceB("rainbow BOLD  words of joy, ay!"));
	System.out.println(rSentenceU("rainbow UNDERLINED  words of joy, ay!"));
	System.out.println(stringSUPER("This should return a JUST blue string.", "default", "blue", "flash"));
       	System.out.println(stringSUPER("This should return an underlined, bold, red string with a cyan background.", "cyan", "red", "underline"));
	delayedString("nincompoop", 1000L);
    }
    */
}
    
