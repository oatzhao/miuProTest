package LEE;

class EatingSpeed {
    public static int totalTime(int[] piles, int k){
        int totalh=0;
        for(int i=0;i<piles.length;i++){
            totalh+=piles[i]%k==0?piles[i]/k:piles[i]/k+1;
        }
        return totalh;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int mins=1;
        int maxs=1;

        for(int i=0;i<piles.length;i++){
            maxs=Math.max(maxs, piles[i]);
        }

        while(maxs>mins){
            int mid=mins+(maxs-mins)/2;
            if(totalTime(piles, mid)>h){
                mins=mid+1;
            }else{
                maxs=mid;
            }
        }
        return mins;
    }

    public static void main(String[] args) {
        int[] piles=new int[]{30,11,23,4,20};
        System.out.println(minEatingSpeed(piles, 6));
    }
}