package LEE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            int[] count =new int[26];
            String str=strs[i];
            for(int j=0;j<str.length();j++){
                count[str.charAt(j)-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int k=0;k<26;k++){
                if(count[k]!=0){
                    sb.append((char)('a'+k)).append(count[k]);
                }
            }

            if(map.containsKey(sb.toString())){
                map.get(sb.toString()).add(str);
            }else{
                List<String> strsList = new ArrayList<>();
                strsList.add(str);
                map.put(sb.toString(), strsList);
            }
        }

        List<List<String>> list=new ArrayList<>();
        for(String c: map.keySet()){
            List<String> anagrams = map.get(c);
            list.add(anagrams);
        }

        return list;
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}
