import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.HashSet;

class Main2{
    public static HashMap stringToMap(String s){
        if(s == ""){
            return null;
        }
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

    public static HashMap quest2(Map<String, Integer> m){
        if(m == null)
        {
            return null;
        }
        HashMap<Integer,HashSet<String>> map = new HashMap();
        Set<Map.Entry<String,Integer>> set = m.entrySet();
        for(Map.Entry<String,Integer> eachSet :set){
            System.out.println(eachSet.getKey()+" ==> "+eachSet.getValue());
            if(map.containsKey(eachSet.getValue())){
                HashSet<String> see = new HashSet();
                see = map.get(eachSet.getValue());
                see.add(eachSet.getKey());
                map.put(eachSet.getValue(), see);
            }
            else{
               HashSet<String> see1 = new HashSet();
               see1.add(eachSet.getKey());
                map.put(eachSet.getValue(), see1);
            }

        }
        return map;
    }
    public static void main(String[] args) {
        String s = "To be or not to be, that is the question";
        HashMap<String,Integer> map = new HashMap();
        map = stringToMap(s);
        Set<Map.Entry<String,Integer>> set = map.entrySet();
        for(Map.Entry<String,Integer> eachSet :set){
            System.out.println(eachSet.getKey()+" ==> "+eachSet.getValue());
        }
        HashMap<Integer,HashSet<String>> map2 = new HashMap();
        map2 = quest2(map);
        Set<Map.Entry<Integer, HashSet<String>>> set1 = map2.entrySet();
        for(Map.Entry<Integer, HashSet<String>> eachSet1 :set1){
            System.out.println(eachSet1.getKey()+" ==> "+eachSet1.getValue());
        }
    }
}