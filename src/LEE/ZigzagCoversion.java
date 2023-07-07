package LEE;

public class ZigzagCoversion {
    public String covert(String s, int numRow){
        if(numRow == 1) return s;

        StringBuilder res = new StringBuilder();
        int cycleLen = 2 * numRow -2;
        for(int r=0;r<numRow; r++){
            int increment = 2*(numRow-1);
            for(int i=0;r+i<s.length();i+=cycleLen){
                res.append(s.charAt(r+i));
                if(i!=0 && i!=numRow-1 && r+cycleLen-i<s.length()){
                    res.append(s.charAt(r+cycleLen-i));
                }
            }
        }
        return res.toString();
    }
}
