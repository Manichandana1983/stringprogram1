package string;
import java.util.Scanner;
public class Stringvnc {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter a word");
	String var=obj.next();
	int consonants=0,vowels=0,diff;
	for(int i=0; i<=var.length()-1; i++) {
		if(var.charAt(i)=='a' || var.charAt(i)=='e' ||var.charAt(i)== 'i' 
				||var.charAt(i)== 'o' ||var.charAt(i)== 'u' ) {
		vowels ++;	
	}
	       if(var.charAt(i)>'a'&& var.charAt(i)<'z' ) {
	consonants ++;
	}
}
	System.out.println("The vowels are in given string are" +vowels);
	System.out.println("The consonants are in given string are" +consonants);
	diff=vowels-consonants;
	System.out.println(" The difference is" +diff);
}
}

