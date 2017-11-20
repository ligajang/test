package libarory;

import java.io.*;

public class lib {
	public static void main(String[] args) {
		char s[]= {'h','e','l','l','o'},b;
		int i,j=0;
		
		for(i=0;i<=5;i++) {
			for(j=i;j<=4;j++) {
				if (s[j]<s[j+1]) {
					b = s[i];
					s[i] = s[i+1];
					s[i+1] = b;
				}
			}
		}
		
		for (i=0;i<5;i++)
			System.out.println(s[i]);
	}
	
}
