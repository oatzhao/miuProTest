package Lecture8.prob3;
import java.util.*;

public class MarketArraylist{
    private Marketing[] currentArray;
    private int size;
    private final int INITIAL_LENGTH = 4;

    public MarketArraylist(){
        currentArray = new Marketing[INITIAL_LENGTH];
        size = 0;
    }

    public void MarketArraylistSort(){
        Marketing [] marketings = {new Marketing("Bob", "pen", "$500"),
                new Marketing("Susan", "pen", "$600"),
                new Marketing("Jack", "pen", "$300"),
                new Marketing("Tom", "pen", "$700")};
        List<Marketing> empList = Arrays.asList(marketings);
        Comparator<Marketing> nameComp = new MarketComparator();
        Collections.sort(empList, nameComp);
        System.out.println(empList);
    }

    public void add(Marketing s){
        if(s == null) return;
        if(size == currentArray.length) resize();
        currentArray[size++] = s;
    }

    private void resize(){
        System.out.println("resizing");
        int len = currentArray.length;
        int newlen = 2*len;
        Marketing[] newArray = new Marketing[newlen];
        System.arraycopy(currentArray, 0,  newArray, 0, len);
        currentArray = newArray;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0;i<size-1; ++i){
            sb.append(currentArray[i] + ", ");
        }
        sb.append(currentArray[size-1] + "]");
        return sb.toString();
    }

    public boolean remove(String s){
        if(size == 0) return false;
        if(s == null) return false;
        int index = -1;
        for(int i = 0; i< size; i++){
            if(currentArray[i].getEmployeename().equals(s)){
                index = i;
                break;
            }
        }
        if(index == -1) return false;
        Marketing[] temp = new Marketing[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, index);
        System.arraycopy(currentArray, index+1, temp, index, currentArray.length-(index+1));
        currentArray= temp;
        --size;
        return true;
    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list){
        List<Marketing> sortList = new ArrayList<>();
        for(Marketing marketing : list){
            if(Integer.parseInt(marketing.getSalesamount()) > 1000){
                sortList.add(marketing);
            }
        }
        Comparator<Marketing> nameComp = new MarketComparator();
        Collections.sort(sortList, nameComp);
        System.out.println(sortList);
        return sortList;
    }



    public static void main(String[] args){
        MarketArraylist market = new MarketArraylist();
        market.add(new Marketing("Bob", "pen", "$200"));
        market.add(new Marketing("Susan", "pen", "$300"));
        market.add(new Marketing("Jack", "pen", "$400"));
        market.add(new Marketing("Tom", "pen", "$500"));
        Marketing newer0 = new Marketing("Tom", "pen" , "$600");
        Marketing newer1 = new Marketing("Tom", "pen" , "$600");
        System.out.println(newer0.equals(newer1));
        System.out.println("Number of elements:" + market.size);

        List<Marketing> list = new LinkedList<>();
        list.add(new Marketing("Aob", "pen", "1200"));
        list.add(new Marketing("Bob", "pen", "1300"));
        list.add(new Marketing("Cob", "pen", "1400"));
        list.add(new Marketing("Dob", "pen", "200"));
        listMoreThan1000(list);

        System.out.println(market.toString());

//        market.remove("Bob");
//        System.out.println(market.toString());
          market.MarketArraylistSort();
//        public static List<Marketing> listMoreThan1000(List<Marketing> list){
//            // Implement a body
//        }
    }



}
