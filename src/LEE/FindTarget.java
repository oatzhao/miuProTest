package LEE;

public class FindTarget {
    public static char nextGreatestLetter(char[] letters, char target){
        int distance = Integer.MAX_VALUE;
        int temp;
        char letter=letters[0];
        for(int i=0; i<letters.length; i++){
            if (letters[i] == target) continue;
            temp = letters[i] - target;
            if(distance>temp && temp>0){
                distance = temp;
                letter = letters[i];
            }

        }
        return letter;
    }
    public static void main(String[] args) {
        char[] letters = new char[]{'c','f','j'};
        char letter = nextGreatestLetter(letters, 'd');
        System.out.println(letter);
    }
}
