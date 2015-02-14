import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class MaxOccurringChar {

    private static String INPUT_STRING = "HELLO to the World. This is awesome\n";
    
    public static void main(String []args){
      System.out.println(String.format("%s", INPUT_STRING));
      HelloWorld test = new HelloWorld();
      List<Character> result = test.maxOccuringChars(INPUT_STRING);
      System.out.println(String.format("%s=%s\n","result",result));
    }
    
    private List<Character> maxOccuringChars(String str) {
        Map<Character, Integer> map = new HashMap<>();
        List<Character> occur = new ArrayList<>();
        Integer maxOccurring = 0;
        
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                continue;
            }
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
            
            if (map.get(ch) > maxOccurring) {
                maxOccurring = map.get(ch);
            }
        }
        
        for (Map.Entry<Character, Integer> entry:map.entrySet()) {
            if (entry.getValue() == maxOccurring) {
                occur.add (entry.getKey());
            }
        }
        
        System.out.println("maxOccurring="+maxOccurring);
        return occur;
    }
}
