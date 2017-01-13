import cs1.Keyboard;
import color.Text;

public class test{
    public static void main(String[] args){
	/*
	System.out.println("input sentence or whatever.\n");
	String s = Keyboard.readString();
	System.out.println(Text.bold(s));
	System.out.println(Text.rString(s));
	System.out.println("now gimme a color");
	String color = Keyboard.readString();
	System.out.println("now gimme a background color");
	String bgcolor = Keyboard.readString();
	System.out.println("now gimme a text style");
	String style = Keyboard.readString();
	System.out.println("now gimme another sentence");
	String anothersentence= Keyboard.readString();
	System.out.println("Here you go.");
	System.out.println(Text.stringSUPER(anothersentence, bgcolor, color, style));
	*/
	
	RapAnalyzer test = new RapAnalyzer();
	RapAnalyzer.dictionary();
	System.out.println(Text.rSentenceB("Welcome to a rudimentary rhyme analyzer. This program checks if two words rhyme."));
       	System.out.print(Text.stringSUPER("", "default", "default", "default"));
	System.out.print("");
	System.out.println(Text.rSentenceB("Input a word."));
       	System.out.print(Text.stringSUPER("", "default", "default", "default"));
	System.out.print("");
	String in1 = Keyboard.readString().toUpperCase();
	System.out.println(Text.rSentenceB("Input another word. It doesn't have to rhyme, but it can."));
       	System.out.print(Text.stringSUPER("", "default", "default", "default"));
	System.out.print("");
	String in2 = Keyboard.readString().toUpperCase();
	RapAnalyzer.rhymeornot(in1, in2);
	System.out.println(Text.rSentenceB("Type in a sentence. The program will analyze it for consonance."));
       	System.out.print(Text.stringSUPER("", "default", "default", "default"));
	System.out.print("");
	String sent = Keyboard.readString().toUpperCase();
	RapAnalyzer.sentenceanalyzer(sent);
	System.out.println(Text.rStringB("Input MULTI NO. 1"));
       	System.out.print(Text.stringSUPER("", "default", "default", "default"));
	System.out.print("");
	String multi1 = Keyboard.readString();
	System.out.println(Text.rStringB("Input MULTI NO. 1"));
       	System.out.print(Text.stringSUPER("", "default", "default", "default"));
	System.out.print("");
	String multi2 = Keyboard.readString();
	RapAnalyzer.multi(multi1, multi2);



    }
}
	
	
