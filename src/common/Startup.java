package common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Tatum Thomas
 */
public class Startup {
    public static void main(String[] args) {
        Movie m1 = new Movie("Gone In 60 Seconds", "Dominic Sena");
        Movie m2 = new Movie("Risky Business", "Paul Brickman");
        Movie m3 = new Movie("Risky Business", "Paul Brickman");
        Movie m4 = new Movie("Bridesmaids", "Paul Feig");
        
        Map<String, Movie> map =
                new HashMap<String, Movie>();
        map.put("Gone In 60 Seconds", m1);
        map.put("Risky Business", m2);
        map.put("Risky Business2", m3);
        map.put("Bridesmaids", m4);
        
        Collection<Movie> values = map.values();
        for(Movie value : values) {
//            Movie found = map.get(value);
            System.out.println(value.toString());
        }
        
        //Lab #3
        
        Map<String,Movie> map2 = new TreeMap<String,Movie>(map);
        Set<String> keys2 = map2.keySet();
        for(String key : keys2) {
            Movie found = map.get(key);
            System.out.println(found.toString());
        }
        
        Collection<Movie> values2 = map2.values();
        List<Movie> sortedList = new ArrayList<Movie>(values2);
        Collections.sort(sortedList);
        for (Movie movie : sortedList) {
            System.out.println(movie);
        }
        
        // Lab #4
        Collection<Movie> values3 = map2.values();
        List<Movie> sortedList2 = new ArrayList<Movie>(values3);
        Collections.sort(sortedList2, new MovieByDirector());
        for (Movie movie : sortedList2) {
            System.out.println(movie);
        }
        
        // Lab #5
        // Store the same four Movie objects in a TreeSet. Demonstrate that sorting works (default order)
        // AND that duplicates are removed by looping through the set and outputting the toString() value to the console.
        Set<Movie> treeSet = new TreeSet<Movie>();
        treeSet.add(m1);
        treeSet.add(m2);
        treeSet.add(m3);
        treeSet.add(m4);
        
        System.out.println("Lab #5");
        for(Movie movie : treeSet) {
            System.out.println(movie);
        }
    }

}
