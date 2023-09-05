package LEE;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum2 {
    public static int[] twoSum(int[] numbers, int target) {
        if(numbers.length<2)return new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<numbers.length-1;i++){
            int num=target-numbers[i];
            if(map.containsKey(numbers[i])){
                return new int[]{map.get(numbers[i]), i+1};
            }else{
                map.put(num, i+1);
            }
        }
        return new int[2];
    }

    public static void main(String[] args) {
        int[] numbers = {2,3,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
}
