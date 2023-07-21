package com.page;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrokenLink extends Utility{
	
	public static void main(String[] args) throws IOException {
		
		browserLaunch("http://www.deadlinkcity.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) {
			
			WebElement w = links.get(i);
			
			String allLinks = w.getAttribute("href");
			
			//create an instance for the URL
			URL url = new URL(allLinks);
			
			//open the connection to the server
			 URLConnection urlConnection = url.openConnection();
			 
			 //to send request to the server
			 HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
			 
			//to connect with server
			 httpURLConnection.connect();
			 
			 if(httpURLConnection.getResponseCode() == 200) {
				 System.out.println(allLinks + " - " + httpURLConnection.getResponseMessage());
				 
			 }
			 else {
				 System.err.println(allLinks + " - " + httpURLConnection.getResponseCode() + " - " + httpURLConnection.getResponseMessage()); 
			 }
		}
	}
}
