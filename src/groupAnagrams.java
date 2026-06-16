import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        // aet : aet-> tea [eat,tea]
        List<List<String>> result = new ArrayList<>();
        // key value as each string but sorted and value as list of string that shares same anagrams
        // in the need to figure out how to convert hashmap to a list  
        for(String str:strs){
            char[] charstr = str.toCharArray();
            Arrays.sort(charstr);
            // need the sorted char array to string
            String sortedstr = new String(charstr);
            if(!map.containsKey(sortedstr)){
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                map.put(sortedstr,list);
            }
            else{
                // map contains Key
                map.get(sortedstr).add(str);
            }
        }
        for(String key:map.keySet()){
            result.add(map.get(key));
        }
        return result;
    }
}
