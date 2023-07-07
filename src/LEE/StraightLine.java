package LEE;

public class StraightLine {
    public boolean checkStraightLine(int[][] coordinates){
        double s;
        if(coordinates[1][0] - coordinates[0][0] == 0){
            s =  Double.MAX_VALUE;
        }else {
            s = (double)(coordinates[1][1] - coordinates[0][1]) / (coordinates[1][0] - coordinates[0][0]);
        }

        for(int i=2; i<coordinates.length; i++){
            double slope = Double.MAX_VALUE;
            if(coordinates[i][0] - coordinates[i-1][0] != 0){
                slope = (double)(coordinates[i][1] - coordinates[i-1][1])/(coordinates[i][0] - coordinates[i-1][0]);
            }
            if(slope!=s){
                return false;
            }
        }
        return true;
    }
}
