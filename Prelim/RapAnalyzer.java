//Shaikat: Day 1 Log



import java.io.*;
import cs1.Keyboard;
import java.util.*;


//the objective of this program is to create basic rhyme checker. also necessary is a tool to check for number of multis in a verse, assonance, consonance, and other factors
//step 1: create a dictionary (done) (uses ArrayList instead of a LinkedHashMap but oh well)
//step 2: basic rhyme checker (done)
//step 3: assonance (done)
//step 4: rhyme checker that uses phenomes (not complete yet)

 

public class RapAnalyzer  {

    //instance variables
    // private static Map<String, String> dictionary;
    private static ArrayList<String> dictionary;
    private static ArrayList<String> sentence;
    
    //constructor for LinkedHashMap
    public RapAnalyzer(){
	//	dictionary = new LinkedHashMap<String, String>();
	dictionary= new ArrayList<String>();
	sentence = new ArrayList<String>();
    }

    //basic reading of the file and construction of the dictionary
    public static void dictionary() {
	int counter = 0;
	File file = new File("c06d.txt");
        
	FileInputStream fis = null;
	BufferedInputStream bis = null;
	DataInputStream dis = null;
 
	try {
	    fis = new FileInputStream(file);
 
	    // Here BufferedInputStream is added for fast reading.
	    bis = new BufferedInputStream(fis);
	    dis = new DataInputStream(bis);
	    Scanner sc = new Scanner(dis);
	    sc.useDelimiter("  |\\n");//use two delimiters: double space and newline
	    
	    while(sc.hasNext()){
		counter++;
		dictionary.add(sc.next());
	    }
	    
	    //test
	    // System.out.println(counter); //testing that all elements from the sc got into temp
	    // System.out.println(dictionary);
	   

	    /* broken code (might be able to fix?)
	    //for loop to populate the dictionary (this is kind of messed up for some reason)
	    for (int i = 0; i < temp.size() - 1; i+=2){//have to add two to make sure duplicate entries dont get messed up
		String key = temp.get(i);
		String value = temp.get(i+1);
		dictionary.put(key, value);	       
	    }
	    */
 
	    // dispose all the resources after using them.
	    fis.close();
	    bis.close();
	    dis.close();
	    sc.close();
 
	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }//end dictionary

    //binarysearch method

    //a rudimentary rhyme checker
    public static boolean rhymeornot(){
	int counter = 0;
       	System.out.println("Input a word.");
	String input1 = Keyboard.readString().toUpperCase();
	System.out.println("Input another word.");
	String input2 = Keyboard.readString().toUpperCase();
        int x = dictionary.indexOf(input1);
        if ( x == -1){
	    System.out.println("\"" + input1 + "\"" + " is  not a word by this program's standards. Sorry. Try again.");
	    System.exit(0);
	}
	int y = dictionary.indexOf(input2);
        if ( y == -1){
	    System.out.println("\"" + input2 + "\"" + " is  not a word by this program's standards. Sorry. Try again.");
	    System.exit(0);
	}
	String p1 = dictionary.get(x+1);
	String p2 = dictionary.get(y+1);
	//System.out.println(x);
	//System.out.println(y);
	String one = new StringBuilder(p1).reverse().toString().replaceAll(" ", "");
	String two = new StringBuilder(p2).reverse().toString().replaceAll(" ", "");
	
	if(one.length() > two.length()){
	    for (int i = 0 ; i < two.length(); i++){
		if(one.charAt(i) == two.charAt(i)){
		    counter ++;
		}
	    }
	}
	else{
	    for (int i = 0; i < one.length(); i++){
		if(one.charAt(i) == two.charAt(i)){
		    counter++;
		}
	    }
	}
	
	//some semblance of statistical analysis
	float avg = (one.length() + two.length())/2;
	float confidence = counter/avg * 100;
	      
        if(counter > 0 && (confidence > 35.0)){
	    System.out.println("Confidence Level: " + confidence + "%");
	    System.out.println("I suppose those two words rhyme.");
	    return true;
	}
	else{
	    System.out.println("Confidence Level: " + confidence + "%");
	    System.out.println("Seems like these two words do not rhyme.");
	    return false;
	}
    }

    public static String sentenceanalyzer(){
	int counter = 0;
	System.out.println("Type in a sentence. The program will analyze it for consonance and rhyme.");
	String input = Keyboard.readString().toUpperCase();
	Scanner sc1 = new Scanner(input);
	sc1.useDelimiter("[/*#.,\\s]");
	while (sc1.hasNext()){
	    sentence.add(sc1.next());
	}
	//strict consonance checking
	for (int i = 0; i < sentence.size() - 1; i++){
	    if(sentence.get(i).charAt(0) == sentence.get(i+1).charAt(0)){
		counter++;
	    }
	}

	//less strict consonance checking
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < sentence.size() ; i++){
	    sb.append(sentence.get(i).charAt(0));
	}
	
	//a lot of copypaste here :)/:(
	int cA = sb.toString().length() - sb.toString().replace("A", "").length();
	int cB= sb.toString().length() - sb.toString().replace("B", "").length();
	int cC = sb.toString().length() - sb.toString().replace("C", "").length();
	int cD = sb.toString().length() - sb.toString().replace("D", "").length();
	int cE = sb.toString().length() - sb.toString().replace("E", "").length();
	int cF = sb.toString().length() - sb.toString().replace("F", "").length();
	int cG = sb.toString().length() - sb.toString().replace("G", "").length();
	int cH = sb.toString().length() - sb.toString().replace("H", "").length();
	int cI = sb.toString().length() - sb.toString().replace("I", "").length();
	int cJ = sb.toString().length() - sb.toString().replace("J", "").length();
	int cK = sb.toString().length() - sb.toString().replace("K", "").length();
	int cL = sb.toString().length() - sb.toString().replace("L", "").length();
	int cM = sb.toString().length() - sb.toString().replace("M", "").length();
	int cN = sb.toString().length() - sb.toString().replace("N", "").length();
	int cO = sb.toString().length() - sb.toString().replace("O", "").length();
	int cP = sb.toString().length() - sb.toString().replace("P", "").length();
	int cQ = sb.toString().length() - sb.toString().replace("Q", "").length();
	int cR = sb.toString().length() - sb.toString().replace("R", "").length();
	int cS = sb.toString().length() - sb.toString().replace("S", "").length();
	int cT = sb.toString().length() - sb.toString().replace("T", "").length();
	int cU = sb.toString().length() - sb.toString().replace("U", "").length();
	int cV = sb.toString().length() - sb.toString().replace("V", "").length();
	int cW = sb.toString().length() - sb.toString().replace("W", "").length();
	int cX = sb.toString().length() - sb.toString().replace("X", "").length();
	int cY = sb.toString().length() - sb.toString().replace("Y", "").length();
	int cZ = sb.toString().length() - sb.toString().replace("Z", "").length();

	ArrayList<Integer> consonance = new ArrayList<Integer>();
	consonance.add(cA);
	consonance.add(cB);
	consonance.add(cC);
	consonance.add(cD);
	consonance.add(cE);
	consonance.add(cF);	
	consonance.add(cG);
	consonance.add(cH);
	consonance.add(cI);
	consonance.add(cJ);
	consonance.add(cK);
	consonance.add(cL);
	consonance.add(cM);
	consonance.add(cN);
	consonance.add(cO);
	consonance.add(cP);	
	consonance.add(cQ);
	consonance.add(cR);
	consonance.add(cS);
	consonance.add(cT);
	consonance.add(cU);
	consonance.add(cV);
	consonance.add(cW);
	consonance.add(cX);
	consonance.add(cY);
	consonance.add(cZ);
	
	char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	System.out.println("\nResults: ");
	System.out.println("Your Sentence/Lyric: " + "\"" + input + "\"");
	
	//where the magic happens
	for(int i = 0; i < consonance.size() - 1; i ++){
	    if (consonance.get(i) != 0){
		System.out.println("The letter " + "\"" + alphabet[i] + "\"" + " appeared " + consonance.get(i) + " time(s).");
	    }
	}
	//one problem: if two letters have the same occurrences, the following line of code returns the indice of the letter that is alphabetically lower than the other letter
	int maxEl = Collections.max(consonance);
	int maxElement = consonance.indexOf(Collections.max(consonance));
	
	System.out.println("\nYou seem to be fond of the letter" + " " + "\"" + alphabet[maxElement] +"\"" +  ".");

	String strictmeasure = "Strict Measure of Assonance:"; //num of consonant  words next to each other over the num of words times 100
	float strict = (float)counter/(float)sentence.size() * 100;
	String exp = "(Only counts if consonant words are next to each other)";

	String notstrictmeasure = "The Not Strict Measure of Assonance:";
	String exp2 = "(Based on occurrence of same-lettered words in a sentence, regardless of position)";
	//takes the max element over the num of words times 100;
	int s = sentence.size();
	float notstrict = (float)maxEl/(float)s * 100;
	
	if (maxEl != 1){
	System.out.println("\nMore statistics:");
	System.out.println(strictmeasure + " " + strict + "% " + exp);
	System.out.println(notstrictmeasure + " " + notstrict + "% " + exp2);
	}
	else{
	    System.out.println("Your sentence is not consonant.");
	    System.out.println(notstrictmeasure + " " + 0 + "% " + exp2);
	    notstrict = 0;
	}
	    
        return "";
    }
	    
	
	
    
	
    //main method
    public static void main (String [] args){
	RapAnalyzer test = new RapAnalyzer();
	dictionary();
	
	//test for keys and entries in the dictionary (if I get to fix the populating of the LinkedHashMap)
	/*
        for (Map.Entry <String, String> entry : dictionary.entrySet()){
	    System.out.println("key=" + entry.getKey() + ", value=" + entry.getValue());
	}
	*/

	
	System.out.println("Welcome to a rudimentary rhyme analyzer. This program checks if two words rhyme.");
	rhymeornot();
	sentenceanalyzer();
	System.out.println(sentence);
	
    }//end main
    
}//end class
	
	
