package _00_Intro_To_ArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
    public static void main(String[] args) {
        // 1. Create an array list of Strings
        //    Don't forget to import the ArrayList class

    	ArrayList<String> cha = new ArrayList<String>();
        // 2. Add five Strings to your list
    	cha.add("cha");
    	cha.add("ahc");
    	cha.add("cha");
    	cha.add("ehc");
    	cha.add("cha");
        // 3. Print all the Strings using a standard for-loop
    	for(int i = 0; i< cha.size();i++) {
    		System.out.println(cha.get(i));
    	}
        // 4. Print all the Strings using a for-each loop
    	for(String ach : cha) {
    		System.out.println(ach);
    	}
    	System.out.println();
        // 5. Print only the even numbered elements in the list.
    	for(int hac = 1; hac < cha.size(); hac+=2) {
    		System.out.println(cha.get(hac));
    	}
        // 6. Print all the Strings in reverse order.
    	
    	 for(int hca = cha.size()-1; hca >= 0; hca--) {
    		 System.out.println(cha.get(hca));
    	 }
        // 7. Print only the Strings that have the letter 'e' in them.
    	 
    	 for(String a : cha) {
     			if(a.indexOf("e") != -1) {
     				System.out.println(cha.indexOf(a));
     		}
    	 }
        
    }
}
