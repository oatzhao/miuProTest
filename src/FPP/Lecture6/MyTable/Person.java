package FPP.Lecture6.MyTable;

class Person {
    private char letter;
    private String name;

    Person(char letter, String name){
        this.letter = letter;
        this.name = name;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
