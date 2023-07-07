package FPP.Lecture5.Bird;

class Swallow extends Bird{
    private String color;

    Swallow(String color){
        super();
        this.color = color;
    }

    private void calcula(){
        System.out.println("distance per hour: 60");
    }

    public static void main(String[] args){
        String color = "black";
        Swallow swallow = new Swallow(color);
        swallow.calcula();
    }
}
