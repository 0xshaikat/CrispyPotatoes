///takes the top 10 lyrics from genius.com and inputs them into a .txt file separated by newline

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.parser.Tag;

import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.*;
import java.util.*;
import java.lang.Character;

public class RapLyrics2{
    
    public final String access_token = "QD3MzatG7kXDSzm2WF9VXOQLqZzA2IOZRkWRzNQUk-mppG3ifUVsd33RmYB3fbM4"; //access token for api requests
    public final String base_URL = "http://api.genius.com";
    public static String links_rough = "";


    public static void main(String[] args) {
	try {
	    PrintWriter writer = new PrintWriter("lyrics.txt", "UTF-8");
	    PrintWriter writer1 = new PrintWriter("lyrics1.txt", "UTF-8");

	    // fetch the document over HTTP
	    Document doc = Jsoup.connect("https://genius.com/").get();

	    
	    // get all dem links and add them to one string?
	    Elements links = doc.select("a[href]");
	    ArrayList<String> linksrough = new ArrayList<String>();
	    ArrayList<Document> docs  = new ArrayList<Document>();

	    for (Element link : links) {
		if(link.attr("href").contains("lyrics")){
		    linksrough.add(link.attr("href")) ;
		}
	    }
	    
	    Document docs1 = Jsoup.connect(linksrough.get(0)).get();
            docs.add(docs1);					
	    Document docs2 = Jsoup.connect(linksrough.get(1)).get();
            docs.add(docs2);									    
	    Document docs3 = Jsoup.connect(linksrough.get(2)).get();
            docs.add(docs3);					
	    Document docs4 = Jsoup.connect(linksrough.get(3)).get();
            docs.add(docs4);					
	    Document docs5 = Jsoup.connect(linksrough.get(4)).get();
            docs.add(docs5);					
	    Document docs6 = Jsoup.connect(linksrough.get(5)).get();
            docs.add(docs6);					
	    Document docs7 = Jsoup.connect(linksrough.get(6)).get();
            docs.add(docs7);
            Document docs8 = Jsoup.connect(linksrough.get(7)).get();
            docs.add(docs8);					
	    Document docs9 = Jsoup.connect(linksrough.get(8)).get();
            docs.add(docs9);								
	    Document docs10 = Jsoup.connect(linksrough.get(9)).get();
            docs.add(docs10);					
	    ArrayList<String> el = new ArrayList<String>();
	    String lyrics="";
	    //get em lyrics
	    for(Document d : docs){
		Elements ex1 = d.getAllElements();

		for(Element e: ex1){
		    if (e.tagName().equalsIgnoreCase("lyrics")){
			if (e.hasText()){
			    lyrics = e.text();

			}
		    }
		}
		el.add(lyrics);
	    }
	    
	    for (String s1 : el){
		writer1.println(s1);
		writer1.println("\n");
	    }
	    writer1.close();	    
				
	
		
		
	    for (String s : el){
		String[] y = s.split("(?=[A-Z])");
		for(String s1: y){
		    writer.println(s1);
		}
		writer.println("\n");
	    }
	    writer.close();
	    
	    
	    
	    
	    
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
}
    
