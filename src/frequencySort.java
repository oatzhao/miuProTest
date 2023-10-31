import java.util.PriorityQueue;

public class frequencySort {
    public static String frequencySort(String s) {
        int[] count=new int[128];
        PriorityQueue<int[]> p=new PriorityQueue<>((a, b)->b[0]-a[0]);
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]++;
        }

        for(int i=0;i<128;i++){
            int[] letter=new int[2];
            if(count[i]!=0){
                letter[0]=count[i];
                letter[1]=i;
            }
            p.add(letter);
        }

        while(!p.isEmpty()){
            int[] letter=p.poll();
            for(int j=0;j<letter[0];j++){
                sb.append(String.valueOf((char)(letter[1])));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Aabb";
        System.out.println(frequencySort(s));
    }
}
