package Lecture5.Computer;

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer0 = new Computer("Apple", "Intel", 16, 3.2);
        Computer computer1 = new Computer("Apple", "Intel", 16, 3.2);
        System.out.println(computer0.equals(computer1));
        System.out.println(computer0.hashCode());
        System.out.println(computer1.hashCode());
    }
}
