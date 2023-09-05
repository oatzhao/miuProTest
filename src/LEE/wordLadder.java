package LEE;

import java.util.*;

public class wordLadder {
    public static HashMap<Integer, List<List<String>>> map=new HashMap<>();
    public static boolean[] visited;
    public static List<String> path = new ArrayList<>();
    public static List<List<String>> res=new ArrayList<>();
    public static List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        visited=new boolean[wordList.size()];
        dfs(beginWord, endWord, 0, wordList);
        if(map.isEmpty()) return Collections.emptyList();
        int minKey = Integer.MAX_VALUE;
        for (int key : map.keySet()) {
            minKey=Math.min(minKey, key);
        }
        res = map.get(minKey);
        return res;
    }

    public static void dfs(String word, String endWord, int level, List<String>wordList){
        if(word.equals(endWord)){
            System.out.println(level);
            if(map.containsKey(level)){
                map.get(level).add(new ArrayList<>(path));
            }else{
                List<List<String>> list=new ArrayList<>();
                list.add(new ArrayList<>(path));
                map.put(level, list);
            }
        }

        for(char j='a';j<='z';j++){
            for(int k=0;k<word.length();k++){
                String newStr=word.substring(0,k)+j+word.substring(k+1);
                System.out.println(newStr);
                int index=wordList.indexOf(newStr);
                if(index!=-1 && visited[index]!=true){
                    visited[index]=true;
                    path.add(newStr);
                    dfs(newStr, endWord, level+1, wordList);
                    visited[index]=false;
                    path.remove(newStr);
                }
            }
        }
    }

    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        String[] wordList =new String[]{"hot","dot","dog","lot","log"};
        System.out.println(findLadders(beginWord, endWord, Arrays.asList(wordList)));
    }
}
