package app;

import java.util.Random; 
import java.util.Scanner;

public class DrawingApp {
	public static boolean isValidColor(char color) {
		return "RGBY*.".indexOf(color) != -1; // Checks if the given color is valid
	}
	public static String getRectangle(int maxRows, int maxCols, char symbol) { //This block of code sets of the getRectangle pattern
		if (maxRows < 1 || maxCols < 1) {
			return null;
		} 
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < maxRows;i++) {
	   for (int j = 0; j < maxCols;j++) {
		sb.append(symbol);
	}
	   if (i != maxRows -1)
	   sb.append('\n'); 
	}
	return sb.toString();
	}

public static char getRandomColor (Random random) {  // This creates a random color 
	return "RGBY*.".charAt(random.nextInt(6));
}
public static String getHorizontalBars(int maxRows, int maxCols, int bars, char color1, char color2, char color3) {
if (maxRows/bars < 1 || !isValidColor(color1) || !isValidColor(color2) || !isValidColor(color3)) {
	return null;
}
      StringBuilder sb = new StringBuilder(); //This line of code prints the Horizontal Bars
      char RGB;
    for (int i = 0; i<bars; i++) {
     if (i % 3 == 0) { // If I remainder 3 = 0 it will print R
    	 RGB = color1;
     } else if (i % 3 == 1) // If I remainder 3 = 1 it will print G
    	 RGB = color2; 
    else {
    	 RGB = color3; // Else it will print B
     }
		sb.append(getRectangle(maxRows / bars,maxCols,RGB));
		
	  if (i != bars -1) { //Basically removes last line 
    sb.append('\n');
	  }
    }
     return sb.toString();
}  
public static String getFlag(int size, char color1, char color2, char color3) { // Sets up the Flag where when inputed certain numbers it will present a flag to resemble that
if (size < 3) {
		return null; 
	}
	 StringBuilder sb = new StringBuilder(); //This line of code will print Flag

	 for (int i = 0; i < size ; i++) {
	 for (int j = 0; j < size * 5; j++) {
	    if (j <= i) {
				sb.append(color1);  
	    }
	     else { 
	    	 if (i == 0 || i == size - 1) {
	    		 sb.append(color2);
	    	 } else {
		        sb.append(color3);
	    	 }
	     }
	 }
		sb.append('\n');
		}
		for (int k = size - 1 ; k >= 0; k--) {
			for (int j = 0; j < size * 5;j++) {
				if (j <= k) {
					sb.append(color1); 
				}
				else {
					if (k == 0|| k == size - 1)
					sb.append(color2);
				else { 
					sb.append(color3);
				}
			  }
			}
			if (k != 0 ) {
			sb.append('\n'); //Deletes the last line so leaves no error
			}
	      
	       }
		 return sb.toString();
}
			
public static String getVerticalBars(int maxRows, int maxCols, int bars, char color1, char color2, char color3) { //Creates a Vertical Bars with RGB 
if (maxCols/bars < 1 || !isValidColor(color1) || !isValidColor(color2) || !isValidColor(color3)) {
	return null; }
       StringBuilder sb = new StringBuilder();
       char colors;

    for (int i = 0; i <maxRows ; i++) { 
	for (int j = 0; j < bars; j++) {
		if (j % 3 == 0) {
			colors =color1;
		} else if (j% 3== 1) {
			colors = color2; }
		else {
			colors = color3;
		}
		for (int m = 0; m<maxCols/bars; m++) {
			sb.append(colors);
		}
	}
	if (i != maxRows - 1)
	 sb.append('\n');
}
return sb.toString();
}
	
 public static void main(String[]args) {
	 
	 char color1 = 'R';
	 char color2 = 'G';
	 char color3 = 'B';
	 char color4 = 'Y';
	 char color5 = '.';
	 
	String Rectangle = DrawingApp.getRectangle(6,9,'*'); 
	System.out.print(Rectangle); //Prints out Rectangle Program
	 System.out.println('\n');
	 
	String Horizontal = DrawingApp.getHorizontalBars(10,30,3,color1,color2,color3);
	System.out.print(Horizontal); //Prints out HorizontalBars
	 System.out.println('\n');
	 
	String Flag = DrawingApp.getFlag(9,color1,'.',color4);
	System.out.println(Flag); //Prints out Flag
	 System.out.println('\n');
	 
	String Vertical = DrawingApp.getVerticalBars(10,12,5,color1,color2,color3);
	System.out.print(Vertical); //Prints out VerticalBars
System.out.println('\n');
   }
}
