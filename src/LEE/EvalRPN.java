package LEE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class EvalRPN {
    public static int evalRPN(String[] tokens) {
        List<String> operator = Arrays.asList("+","-","*","/");
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<tokens.length;i++){
            if(operator.contains(tokens[i]) && !stack.isEmpty()){
                int fNum=stack.pop();
                int sNum=stack.pop();
                int ans=operate(sNum, tokens[i], fNum);
                stack.push(ans);
            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }

    public static int operate(int sNum, String s, int fNum){
        if(s=="+"){
            return sNum+fNum;
        }else if(s=="-"){
            return sNum-fNum;
        }else if(s=="/"){
            return sNum/fNum;
        }
        return sNum*fNum;
    }

    public static void main(String[] args) {
       String[] tokens = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
       System.out.println(evalRPN(tokens));
       List<String> aa = new ArrayList<>();
    }
}
