import java.awt.Window.Type;
import java.io.Console;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.w3c.dom.TypeInfo;
  
public class CountingDuplicates {
  public static int duplicateCount(String text) {

        text = text.toLowerCase();

        Map<Character, Integer> alphabet = new HashMap<>(){{
            put('a', 0);
            put('b', 0);
            put('c', 0);
            put('d', 0);
            put('e', 0);
            put('f', 0);
            put('g', 0);
            put('h', 0);
            put('i', 0);
            put('j', 0);
            put('k', 0);
            put('l', 0);
            put('m', 0);
            put('n', 0);
            put('o', 0);
            put('p', 0);
            put('q', 0);
            put('r', 0);
            put('s', 0);
            put('t', 0);
            put('u', 0);
            put('v', 0);
            put('w', 0);
            put('x', 0);
            put('y', 0);
            put('z', 0);
            put('1', 0);
            put('2', 0);
            put('3', 0);
            put('4', 0);
            put('5', 0);
            put('6', 0);
            put('7', 0);
            put('8', 0);
            put('9', 0);
            put('0', 0);
        }};
        int value;
        
        for(int i = 0; i< text.length();i++)
        {
            value = alphabet.get(text.charAt(i));
            alphabet.remove(text.charAt(i));
            value++;
            alphabet.put(text.charAt(i), value);
        }

        ArrayList<Integer> values = new ArrayList<>();
        values.addAll(alphabet.values());
        
        int count = 0;
        for(int i=0; i<values.size(); i++)
        {
            
            if(values.get(i) >= 2)
            {
                count++;
            }
        }
    
    return count;
  }
}