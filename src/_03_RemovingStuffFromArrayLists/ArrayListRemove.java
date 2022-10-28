package _03_RemovingStuffFromArrayLists;

import java.util.ArrayList;

public class ArrayListRemove {

    class Stuff {
        public String type;
    }
    
    class Worm extends Stuff {
        public Worm() {
            type = "worm";
        }
    }
    
    class Dirt extends Stuff {
        public Dirt() {
            type = "dirt";
        }
    }

    // 1. Write a method that removes the dirt in the yard and returns the
    //    ArrayList
    public static ArrayList<Stuff> cleanOutTheYard( ArrayList<Stuff> yard ) {
    	ArrayList<Stuff> new_ = new ArrayList<Stuff>();
    	for(Stuff a : yard) {
    		if(!a.type.equals("dirt")) {
    			new_.add(a);
    		}
    	}
    	return new_;
    }
    
    // 2. Write a method that removes the hash tag ('#') characters from the
    //    ArrayList and returns it
    public static ArrayList<Character> removeHashTags(ArrayList<Character> list) {
    	ArrayList<Character> new_ = new ArrayList<Character>();
    	for(Character b : list) {
    		if(!b.equals('#')) {
    			new_.add(b);
    		}
    	}
    	
    	return new_;
    }
}
