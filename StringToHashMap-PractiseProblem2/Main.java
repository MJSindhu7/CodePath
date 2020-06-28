import java.util.HashMap;
import java.util.Set;
import java.util.Map;

class Main {
  public static HashMap stringToMap(String s){
    HashMap<String,Integer> map = new HashMap();
    String[] words = s.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
    for(int i=0; i<words.length; i++){
      if(map.containsKey(words[i])){
        int val = map.get(words[i]);
        val = val+1;
        map.put(words[i], val);
      }
      else{
        map.put(words[i], 1);
      }
    }
    return map;
  }
  public static void main(String[] args) {
    System.out.println("Hello world!");
    String s = "To be or not to be, that is the question";
    HashMap<String,Integer> map = new HashMap();
    map = stringToMap(s);
    Set<Map.Entry<String,Integer>> set = map.entrySet();
    for(Map.Entry<String,Integer> eachSet :set){
            System.out.println(eachSet.getKey()+" ==> "+eachSet.getValue());
        }
  }
}