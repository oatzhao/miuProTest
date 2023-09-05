package LEE;

public class Search2D {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int l=0, r=matrix.length-1;
        if(target<matrix[0][0]) return false;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(matrix[mid][0]<=target){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }

        int row=l-1;
        int le=0, ri=matrix[0].length-1;
        while(le<=ri){
            int mid=le+(ri-le)/2;
            if(matrix[row][mid]==target){
                return true;
            }else if(matrix[row][mid]<target){
                le=mid+1;
            }else {
                ri=mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix ={{1}};
        int target=0;
        //System.out.println(searchMatrix(matrix, target));
        System.out.println(' '-'0');
    }
}
