import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Test map iterator and the basic for-each loop over map elements 
 */
public class HashMapIteratorTest {
    public static void main(String[] args) {
        System.out.println("Testing HashMap iterator");
        
        Map<Character, Integer> testMap = new HashMap<>();
        testMap.put((char) 'a', 1);
        testMap.put((char) 'b', 2);
        testMap.put((char) 'c', 3);
        testMap.put((char) 'd', 4);
        testMap.put((char) 'e', 5);
        
        System.out.println("Using for-each for Map elements");
        for (Map.Entry<Character, Integer> e: testMap.entrySet()) {
            System.out.println(String.format("(key, value) = (%s, %s)", e.getKey(), e.getValue()));
        }
        
        System.out.println("Using Map Iterator");
        Iterator<Map.Entry<Character, Integer>> t = testMap.entrySet().iterator();
        while (t.hasNext()) {
            Map.Entry e = (Map.Entry<Character, Integer>) t.next();
            System.out.println(String.format("(key, value) = (%s, %s)", e.getKey(), e.getValue()));
        }
    }
}