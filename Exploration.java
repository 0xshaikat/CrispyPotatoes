///takes the top 10 lyrics from genius.com and inputs them into a .txt file separated by newline

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.parser.Tag;

import java.io.IOException;
import com.google.gson.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.*;
import java.util.*;
import java.lang.Character;
import cs1.Keyboard;
import color.Text;

public class Exploration{
    
    public static final String access_token = "access_token=lTq4bJmwDD-fFFhUrfOabKVSZf38z2b7BQ9BrAPmbypZ-zt4iOPQgM4-pp3idjGd"; //access token for api requests
    public static final String base_URL = "http://api.genius.com/search?";

    //per user request, returns the top 10 songs at the moment
    public static String top10(){
	System.out.println("Your Selection");
	return "";
    }

    public static String URL(String query){
	try{
	    String search =  base_URL + access_token + "&q=" + query;
	    String doc1 = Jsoup.connect(search).ignoreContentType(true).execute().body();
	    return doc1;
	} catch (IOException e) {
	    e.printStackTrace();
	    return "";
	}
    }
	

    public static void main(String[] args){
	System.out.println("Password:");
	String p = Keyboard.readString();
	if (p.equalsIgnoreCase("RAPGOD1999")){
		System.out.println("Dope pass! You're in!");
	}
	else{
		System.out.println("Ya haven't won the game yet!");
		System.exit(0);
	}	    
	System.out.println("Search up bro!");
	int counter = 1;
	String q = Keyboard.readString();
	Gson gson = new Gson();

	Result result = gson.fromJson(URL(q), Result.class);
	
	if (result != null){
	    Hit h0 = result.getResponse().getHits().get(0);
	    String h0x = "Hit #" + 1 + ": " + h0;
	    String h0type = "\t" + "Type: " +  h0.getType();
	    String h0annat = "\t" + "# Annotations: " + h0.getResult().getAnnotationCount();
	    String h0tit = "\t" + "Title: " + h0.getResult().getFullTitle();
	    String h0art = "\t" + "Artist: " + h0.getResult().getPrimaryArtist().getName();
	    String h0bio = "\t" + "Artist Bio: " + h0.getResult().getPrimaryArtist().getUrl();
	    String h0PV = "\t" + "Page views: " + h0.getResult().getStats().getPageviews();
	    String H0L =   h0.getResult().getUrl();
	    Hit h1 = result.getResponse().getHits().get(1);
	    String h1x = "Hit #" + 2 + ": " + h1;
	    String h1type = "\t" + "Type: " +  h1.getType();
	    String h1annat = "\t" + "# Annotations: " + h1.getResult().getAnnotationCount();
	    String h1tit = "\t" + "Title: " + h1.getResult().getFullTitle();
	    String h1art = "\t" + "Artist: " + h1.getResult().getPrimaryArtist().getName();
	    String h1bio = "\t" + "Artist Bio: " + h1.getResult().getPrimaryArtist().getUrl();
	    String h1PV = "\t" + "Page views: " + h1.getResult().getStats().getPageviews();
	    String H1L =   h1.getResult().getUrl();
	    Hit h2 = result.getResponse().getHits().get(2);
	    String h2x= "Hit #" + 3 + ": " + h2;
	    String h2type = "\t" + "Type: " +  h2.getType();
	    String h2annat = "\t" + "# Annotations: " + h2.getResult().getAnnotationCount();
	    String h2tit ="\t" + "Title: " + h2.getResult().getFullTitle();
	    String h2art = "\t" + "Artist: " + h2.getResult().getPrimaryArtist().getName();
	    String h2bio = "\t" + "Artist Bio: " + h2.getResult().getPrimaryArtist().getUrl();
	    String h2PV = "\t" + "Page views: " + h2.getResult().getStats().getPageviews();
	    String H2L =   h2.getResult().getUrl();
	    Hit h3 = result.getResponse().getHits().get(3);
	    String h3x= "Hit #" + 4 + ": " + h3;
	    String h3type = "\t" + "Type: " +  h3.getType();
	    String h3annat = "\t" + "# Annotations: " + h3.getResult().getAnnotationCount();
	    String h3tit = "\t" + "Title: " + h3.getResult().getFullTitle();
	    String h3art = "\t" + "Artist Bio: " + h3.getResult().getPrimaryArtist().getUrl();
	    String h3bio = "\t" + "Artist Bio: " + h3.getResult().getPrimaryArtist().getUrl();
	    String h3PV =  "\t" + "Page views: " + h3.getResult().getStats().getPageviews();
	    String H3L =   h3.getResult().getUrl();
	    Hit h4 = result.getResponse().getHits().get(4);
	    String h4x= "Hit #" + 5 + ": " + h4;
	    String h4type = "\t" + "Type: " +  h4.getType();
	    String h4annat = "\t" + "# Annotations: " + h4.getResult().getAnnotationCount();
	    String h4tit = "\t" + "Title: " + h4.getResult().getFullTitle();
	    String h4art = "\t" + "Artist: " + h4.getResult().getPrimaryArtist().getName();
	    String h4bio = "\t" + "Artist Bio: " + h4.getResult().getPrimaryArtist().getUrl();
	    String h4PV =  "\t" + "Page views: " + h4.getResult().getStats().getPageviews();
	    String H4L =   h4.getResult().getUrl();
	    Hit h5 = result.getResponse().getHits().get(5);
	    String h5x= "Hit #" + 6 + ": " + h5;
	    String h5type = "\t" + "Type: " +  h5.getType(); 
	    String h5annat = "\t" + "# Annotations: " + h5.getResult().getAnnotationCount();
	    String h5tit = "\t" + "Title: " + h5.getResult().getFullTitle();
	    String h5art = "\t" + "Artist: " + h5.getResult().getPrimaryArtist().getName();
	    String h5bio = "\t" + "Artist Bio: " + h5.getResult().getPrimaryArtist().getUrl();
	    String h5PV =  "\t" + "Page views: " + h5.getResult().getStats().getPageviews();
	    String H5L =   h5.getResult().getUrl();
	    Hit h6 = result.getResponse().getHits().get(6);
	    String h6x= "Hit #" + 7 + ": " + h6;   
	    String h6type = "\t" + "Type: " +  h6.getType();
	    String h6annat = "\t" + "# Annotations: " + h6.getResult().getAnnotationCount();
	    String h6tit = "\t" + "Title: " + h6.getResult().getFullTitle();
	    String h6art = "\t" + "Artist: " + h6.getResult().getPrimaryArtist().getName();
	    String h6bio = "\t" + "Artist Bio: " + h6.getResult().getPrimaryArtist().getUrl();
	    String h6PV =  "\t" + "Page views: " + h6.getResult().getStats().getPageviews();
	    String H6L =   h6.getResult().getUrl();
	    Hit h7 = result.getResponse().getHits().get(7);
	    String h7x= "Hit #" + 8 + ": " + h7;
	    String h7type = "\t" + "Type: " +  h7.getType();
	    String h7annat = "\t" + "# Annotations: " + h7.getResult().getAnnotationCount();
	    String h7tit = "\t" + "Title: " + h7.getResult().getFullTitle();
	    String h7art = "\t" + "Artist: " + h7.getResult().getPrimaryArtist().getName();
	    String h7bio = "\t" + "Artist Bio: " + h7.getResult().getPrimaryArtist().getUrl();
	    String h7PV =  "\t" + "Page views: " + h7.getResult().getStats().getPageviews();
	    String H7L =   h7.getResult().getUrl();
	    Hit h8 = result.getResponse().getHits().get(8);
	    String h8x= "Hit #" + 9 + ": " + h8;
	    String h8type = "\t" + "Type: " +  h8.getType();
	    String h8annat = "\t" + "# Annotations: " + h8.getResult().getAnnotationCount();
	    String h8tit = "\t" + "Title: " + h8.getResult().getFullTitle();
	    String h8art = "\t" + "Artist: " + h8.getResult().getPrimaryArtist().getName();
	    String h8bio = "\t" + "Artist Bio: " + h8.getResult().getPrimaryArtist().getUrl();
	    String h8PV =  "\t" + "Page views: " + h8.getResult().getStats().getPageviews();
	    String H8L =   h8.getResult().getUrl();
	    Hit h9 = result.getResponse().getHits().get(9);
	    String h9x= "Hit #" + 10 + ": " + h9;
	    String h9type = "\t" + "Type: " +  h9.getType();
	    String h9annat = "\t" + "# Annotations: " + h9.getResult().getAnnotationCount();
	    String h9tit = "\t" + "Title: " + h9.getResult().getFullTitle();
	    String h9art = "\t" + "Artist: " + h9.getResult().getPrimaryArtist().getName();
	    String h9bio = "\t" + "Artist Bio: " + h9.getResult().getPrimaryArtist().getUrl();
	    String h9PV =  "\t" + "Page views: " + h9.getResult().getStats().getPageviews();
	    String H9L =   h9.getResult().getUrl();
	    System.out.println("\n");
	    System.out.println("Here's the first hit! Type 'l' to get lyrics, and 'next' for the next hit. Type 'exit' to exit.");
	    System.out.println("\n");
	    System.out.println(h0type);
	    System.out.println(h0annat);
	    System.out.println(h0tit);
	    System.out.println(h0art);
	    System.out.println(h0bio);
	    System.out.println(h0PV);
	    

	    String choice1 = Keyboard.readString();
	    
	    if(choice1.equalsIgnoreCase("L")){
		try{
		    Document d0 = Jsoup.connect(H0L).get();
		    String lyrics = "";
		    Elements ex0 = d0.getAllElements();
		    for(Element e: ex0){
			if (e.tagName().equalsIgnoreCase("lyrics")){
			    if (e.hasText()){
				lyrics = Text.filtered(e.text());
			    }
			}
		    }
		    String[] y = lyrics.split("(?=[A-Z])");
		    for(String s1: y){
			System.out.println(Text.rSentenceB(s1));
		    }
		    System.out.println(Text.stringSUPER("", "default", "default", "default"));

		}catch(IOException e){
		    e.printStackTrace();
		}
	    }
	    
	    else if(choice1.equalsIgnoreCase("NEXT")){
		
	        System.out.println("Here's the second hit! Type 'l' to get lyrics, and 'next' for the next hit. Type 'exit' to exit.");
		System.out.println(h1type);
		System.out.println(h1annat);
		System.out.println(h1tit);
		System.out.println(h1art);
		System.out.println(h1bio);
		System.out.println(h1PV );
		String choice2 = Keyboard.readString();
		if(choice2.equalsIgnoreCase("L")){
		    try{
			Document d1 = Jsoup.connect(H1L).get();
			String lyrics = "";
			Elements ex0 = d1.getAllElements();
			for(Element e: ex0){
			    if (e.tagName().equalsIgnoreCase("lyrics")){
				if (e.hasText()){
				    lyrics = Text.filtered(e.text());
				}
			    }
			}
			String[] y = lyrics.split("(?=[A-Z])");
			for(String s1: y){
			    System.out.println(Text.rSentenceB(s1));
			}
			System.out.println(Text.stringSUPER("", "default", "default", "default"));

		    }catch(IOException e){
			e.printStackTrace();
		    }
		}
		else if (choice2.equalsIgnoreCase("NEXT")){
		    System.out.println("Here's the third hit! Type 'l' to get lyrics, and 'next' for the next hit. Type 'exit' to exit.");
		    System.out.println(h2type);
		    System.out.println(h2annat);
		    System.out.println(h2tit);
		    System.out.println(h2art);
		    System.out.println(h2bio);
		    System.out.println(h2PV);
		    String choice3 = Keyboard.readString();
		    if(choice3.equalsIgnoreCase("L")){
			try{
			    Document d1 = Jsoup.connect(H2L).get();
			    String lyrics = "";
			    Elements ex0 = d1.getAllElements();
			    for(Element e: ex0){
				if (e.tagName().equalsIgnoreCase("lyrics")){
				    if (e.hasText()){
					lyrics = Text.filtered(e.text());
				    }
				}
			    }
			    String[] y = lyrics.split("(?=[A-Z])");
			    for(String s1: y){
				System.out.println(Text.rSentenceB(s1));
			    }
			    System.out.println(Text.stringSUPER("", "default", "default", "default"));
			}catch(IOException e){
			    e.printStackTrace();
			}
		    }
		    else if (choice3.equalsIgnoreCase("NEXT")){
			System.out.println("Here's the fourth hit! Type 'l' to get lyrics, and 'next' for the next hit. Type 'exit' to exit.");
			System.out.println(h3type);
			System.out.println(h3annat);
			System.out.println(h3tit);
			System.out.println(h3art);
			System.out.println(h3bio);
			System.out.println(h3PV);
			String choice4 = Keyboard.readString();
			if(choice4.equalsIgnoreCase("L")){
			    try{
				Document d1 = Jsoup.connect(H3L).get();
				String lyrics = "";
				Elements ex0 = d1.getAllElements();
				for(Element e: ex0){
				    if (e.tagName().equalsIgnoreCase("lyrics")){
					if (e.hasText()){
					    lyrics = Text.filtered(e.text());
					}
				    }
				}
				String[] y = lyrics.split("(?=[A-Z])");
				for(String s1: y){
				    System.out.println(Text.rSentenceB(s1));
				}
				System.out.println(Text.stringSUPER("", "default", "default", "default"));

				    
			    }catch(IOException e){
				e.printStackTrace();
			    }
			}
			else if(choice4.equalsIgnoreCase("NEXT")){
			    System.out.println("Here's the fifth hit! Type 'l' to get lyrics, and 'next' for the next hit. Type 'exit' to exit.");
			    System.out.println(h4type);
			    System.out.println(h4annat);
			    System.out.println(h4tit);
			    System.out.println(h4art);
			    System.out.println(h4bio);
			    System.out.println(h4PV);
			    String choice5 = Keyboard.readString();
			    if(choice5.equalsIgnoreCase("L")){
				try{
				    Document d1 = Jsoup.connect(H4L).get();
				    String lyrics = "";
				    Elements ex0 = d1.getAllElements();
				    for(Element e: ex0){
					if (e.tagName().equalsIgnoreCase("lyrics")){
					    if (e.hasText()){
						lyrics = Text.filtered(e.text());
					    }
					}
				    }
				    String[] y = lyrics.split("(?=[A-Z])");
				    for(String s1: y){
					System.out.println(Text.rSentenceB(s1));
				    }
				    System.out.println(Text.stringSUPER("", "default", "default", "default"));

				}catch(IOException e){
				    e.printStackTrace();
				}			    	
			    }
			    else if(choice5.equalsIgnoreCase("NEXT")){
				System.out.println("Here's the sixth hit! Type 'l' to get lyrics, and 'next' for the next hit. Type 'exit' to exit.");
				System.out.println(h5type);
				System.out.println(h5annat);
				System.out.println(h5tit);
				System.out.println(h5art);
				System.out.println(h5bio);
				System.out.println(h5PV);
				String choice6 = Keyboard.readString();
				if(choice6.equalsIgnoreCase("L")){
				    try{
					Document d1 = Jsoup.connect(H5L).get();
					String lyrics = "";
					Elements ex0 = d1.getAllElements();
					for(Element e: ex0){
					    if (e.tagName().equalsIgnoreCase("lyrics")){
						if (e.hasText()){
						    lyrics = Text.filtered(e.text());
						}
					    }
					}
					String[] y = lyrics.split("(?=[A-Z])");
					for(String s1: y){
					    System.out.println(Text.rSentenceB(s1));
					}
					System.out.println(Text.stringSUPER("", "default", "default", "default"));

				    }catch(IOException e){
					e.printStackTrace();
				    }			    	
				}
				else if(choice6.equalsIgnoreCase("NEXT")){
				    System.out.println("Here's the seventh  hit! Type 'l' to get lyrics, and 'next' for the next hit. Type 'exit' to exit.");
				    System.out.println(h6type);
				    System.out.println(h6annat);
				    System.out.println(h6tit);
				    System.out.println(h6art);
				    System.out.println(h6bio);
				    System.out.println(h6PV);
				    String choice7 = Keyboard.readString();
				    if(choice7.equalsIgnoreCase("L")){
					try{
					    Document d1 = Jsoup.connect(H6L).get();
					    String lyrics = "";
					    Elements ex0 = d1.getAllElements();
					    for(Element e: ex0){
						if (e.tagName().equalsIgnoreCase("lyrics")){
						    if (e.hasText()){
							lyrics = Text.filtered(e.text());
						    }
						}
					    }
					    String[] y = lyrics.split("(?=[A-Z])");
					    for(String s1: y){
						System.out.println(Text.rSentenceB(s1));
					    }
					    System.out.println(Text.stringSUPER("", "default", "default", "default"));

					}catch(IOException e){
					    e.printStackTrace();
					}			    	
				    }
				    else if(choice7.equalsIgnoreCase("NEXT")){
					System.out.println("Here's the eighth hit! Type 'l' to get lyrics, and 'next' for the next hit. Type 'exit' to exit.");
					System.out.println(h7type);
					System.out.println(h7annat);
					System.out.println(h7tit);
					System.out.println(h7art);
					System.out.println(h7bio);
					System.out.println(h7PV);
					String choice8 = Keyboard.readString();
					if(choice8.equalsIgnoreCase("L")){
					    try{
						Document d1 = Jsoup.connect(H7L).get();
						String lyrics = "";
						Elements ex0 = d1.getAllElements();
						for(Element e: ex0){
						    if (e.tagName().equalsIgnoreCase("lyrics")){
							if (e.hasText()){
							    lyrics = Text.filtered(e.text());
							}
						    }
						}
						String[] y = lyrics.split("(?=[A-Z])");
						for(String s1: y){
						    System.out.println(Text.rSentenceB(s1));
						}
						System.out.println(Text.stringSUPER("", "default", "default", "default"));

					    }catch(IOException e){
						e.printStackTrace();
					    }			    	
					}
					else if(choice8.equalsIgnoreCase("NEXT")){
					    System.out.println("Here's the ninth hit! Type 'l' to get lyrics, and 'next' for the next hit. Type 'exit' to exit.");
					    System.out.println(h8type);
					    System.out.println(h8annat);
					    System.out.println(h8tit);
					    System.out.println(h8art);
					    System.out.println(h8bio);
					    System.out.println(h8PV);
					    String choice9 = Keyboard.readString();
					    if(choice9.equalsIgnoreCase("L")){
						try{
						    Document d1 = Jsoup.connect(H8L).get();
						    String lyrics = "";
						    Elements ex0 = d1.getAllElements();
						    for(Element e: ex0){
							if (e.tagName().equalsIgnoreCase("lyrics")){
							    if (e.hasText()){
								lyrics = Text.filtered(e.text());
							    }
							}
						    }
						    String[] y = lyrics.split("(?=[A-Z])");
						    for(String s1: y){
							System.out.println(Text.rSentenceB(s1));
						    }
						    System.out.println(Text.stringSUPER("", "default", "default", "default"));

						}catch(IOException e){
						    e.printStackTrace();
						}			    	
					    }
					    else if(choice9.equalsIgnoreCase("NEXT")){
						System.out.println("Here's the final hit! Type 'l' to get lyrics. Type 'exit' to exit.");
						System.out.println(h9type);
						System.out.println(h9annat);
						System.out.println(h9tit);
						System.out.println(h9art);
						System.out.println(h9bio);
						System.out.println(h9PV);
						String choice10 = Keyboard.readString();
						if(choice10.equalsIgnoreCase("L")){
						    try{
							Document d1 = Jsoup.connect(H8L).get();
							String lyrics = "";
							Elements ex0 = d1.getAllElements();
							for(Element e: ex0){
							    if (e.tagName().equalsIgnoreCase("lyrics")){
								if (e.hasText()){
								    lyrics = Text.filtered(e.text());
								}
							    }
							}
							String[] y = lyrics.split("(?=[A-Z])");
							for(String s1: y){
							    System.out.println(Text.rSentenceB(s1));
							}
							System.out.println(Text.stringSUPER("", "default", "default", "default"));

						    }catch(IOException e){
							e.printStackTrace();
						    }	    	
						}

						else if(choice9.equalsIgnoreCase("EXIT")){
						    System.exit(0);
						} 
					    
						else if(choice8.equalsIgnoreCase("EXIT")){
						    System.exit(0);
						}
					    }
					
					    
					    else if(choice7.equalsIgnoreCase("EXIT")){
						System.exit(0);
					    }
					    
				    
					}
					else if(choice6.equalsIgnoreCase("EXIT")){
					    System.exit(0);
					}
				    }
				    
				}
				
				else if(choice5.equalsIgnoreCase("EXIT")){
				    System.exit(0);
				}
			    }
			    
			}
			else if(choice4.equalsIgnoreCase("EXIT")){
			    System.exit(0);
			}	
		    }
		    else if(choice3.equalsIgnoreCase("EXIT")){
			System.exit(0);
		    }
		}
		else if(choice2.equalsIgnoreCase("EXIT")){
		    System.exit(0);
		}
	    }
	    
	    
	    
	    
	    else if(choice1.equalsIgnoreCase("EXIT")){
		System.exit(0);
	    }
	    
	}//end main if
    }//end main
}//end class



