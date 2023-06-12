package Lecture6.MyTable;

public class MyTable {
    private Entry[] entries;

    public String get(char c){
//implement
        return null;
    }
    //adds to the table a pair (c, s) so that s can be looked up using c
    public void add(char c, String s) {

    }

    public String toString() {
        return null;
    }

    private class Entry {
        char ch;
        String str;
        Entry(char ch, String str){
            this.ch = ch;
            this.str = str;
        }

        @Override
        public String toString() {
            return ch +"->"+str;
        }
    }

    public static void main(String[] args) {
        MyTable myTable = new MyTable();
        Entry[] entries = new Entry[26];

    }
}
