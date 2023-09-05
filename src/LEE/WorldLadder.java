package LEE;

import java.util.*;

public class WorldLadder {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        Queue<String> q=new LinkedList<>();
        q.add(beginWord);
        int level=1;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                String str=q.poll();
                if(str.equals(endWord)) return level;
                for(char j='a';j<='z';j++){
                    for(int k=0;k<str.length();k++){
                        String newStr=str.substring(0, k)+j+str.substring(k+1);
                        if(set.contains(newStr)){
                            q.add(newStr);
                            set.remove(newStr);
                        }
                    }
                }
            }
            level++;
        }
        return 0;
    }
    public static void main(String[] args) {
        String beginWord = "hit", endWord = "cog";
        List<String> wordList = new ArrayList<String>(){
            {add("hot");
            add("dot");
            add("dog");
            add("lot");
            add("log");
            add("cog");
            }};
        System.out.println(ladderLength(beginWord, endWord, wordList));
    }
}
