package com.multi.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ReadLone {
	public static void main(String[] args) throws Exception {
		
		Reader reader=new FileReader(
				"hi.txt"
		);
		
		BufferedReader br=new BufferedReader(reader);
		
		while (true){
			String data=br.readLine();
			if(data==null) break;
			System.out.println(data);
		}
		
		br.close();
		
		
	}
	
	
	
}
