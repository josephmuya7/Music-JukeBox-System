
package pkgfinal;
import java.util.*;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


public class LibraryData {

    private static class Item {

        Item(String n, String a, int r) {
            name = n;
            artist = a;
            rating = r;
        }

        // instance variables 
        private String name;
        private String artist;
        private int rating;
        private int playCount;

        public String toString() {
            return name + " - " + artist;
        }
    }

    // with a Map you use put to insert a key, value pair 
    // and get(key) to retrieve the value associated with a key
    // You don't need to understand how this works!
    private static Map<String, Item> library = new TreeMap<String, Item>();


    static {
        // if you want to have extra library items, put them in here
        // use the same style - keys should be 2 digit Strings
        library.put("01", new Item("How much is that doggy in the window", "Zee-J", 3));
        library.put("02", new Item("Exotic", "Maradonna", 5));
        library.put("03", new Item("I'm dreaming of a white Christmas", "Ludwig van Beethoven", 2));
        library.put("04", new Item("Pastoral Symphony", "Cayley Minnow", 1));
        library.put("05", new Item("Anarchy in the UK", "The Kings Singers", 4));
        library.put("06",new Item("Numb", "LinkinPark",5));
        library.put("07",new Item("Loyal","Chris Brown",4));
        library.put("08",new Item("Boujee","Migos",3));
        library.put("09",new Item("Wap","Cardi B ft Megan Thee Stallion",2));
        library.put("10", new Item("Crown","Neffex",5));
        
    }

    public static String listAll() {
        String output = "";
        Iterator iterator = library.keySet().iterator();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            Item item = library.get(key);
            output += key + " " + item.name + " - " + item.artist + "\n";
        }
        return output;
    }

    public static String getName(String key) {
        Item item = library.get(key);
        if (item == null) {
            return null; // null means no such item
        } else {
            return item.name;
        }
    }

    public static String getArtist(String key) {
        Item item = library.get(key);
        if (item == null) {
            return null; // null means no such item
        } else {
            return item.artist;
        }
    }

    public static int getRating(String key) {
        Item item = library.get(key);
        if (item == null) {
            return -1; // negative quantity means no such item
        } else {
            return item.rating;
        }
    }

    public static void setRating(String key, int rating) {
        Item item = library.get(key);
        if (item != null) {
            item.rating = rating;
        }
    }

    public static int getPlayCount(String key) {
        Item item = library.get(key);
        if (item == null) {
            return -1; // negative quantity means no such item
        } else {
            return item.playCount;
        }
    }

    public static void incrementPlayCount(String key) {
        Item item = library.get(key);
        if (item != null) {
            item.playCount += 1;
        }
    }

    public static void close() {
      System.exit(0);
    }
    public static void main(String[] args) {
       
    }
    
}
