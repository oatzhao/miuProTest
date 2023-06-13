package Lecture6.MyTable;

public class MyTable {
    private Entry[] entries;

    MyTable(){
        entries = new Entry[26];
    }

    public String get(char c){
        for(Entry e: entries){
            if(e != null && e.ch == c)
                return e.str;
        }
        return null;
    }

    public void add(char c, String s) {
        int charInt = (int)c;
        entries[charInt - 97] = new Entry(c, s);
    }

    public String toString() {
        String str = "";
        for(Entry entry: entries){
            if(entry!=null){
                str+=entry+"\n";
            }
        }
        return str;
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
        myTable.add('A', "hfaiwe");
        myTable.add('B', "dhwuie");
        myTable.add('C', "bua");

        String s = myTable.get('B');
        System.out.println(s);
        System.out.println(myTable);
    }
}
