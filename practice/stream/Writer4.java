package com.multi.practice.stream;

import java.io.FileWriter;
import java.io.Writer;

public class Writer4 {
	public static void main(String[] args) throws Exception {
		
		Writer writer=new FileWriter("C:/Temp/test10.txt");
		
		String str="ABC";
		writer.write(str);
		writer.flush();
		writer.close();
		
		
	}
}
