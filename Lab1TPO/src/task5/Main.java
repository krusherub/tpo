package task5;

public class Main {
    public static void main(String[] args) {
        PrintSync p3 = new PrintSync(1,"-");
        PrintSync p4 = new PrintSync(2,"|");

        PrintNoSync p5 = new PrintNoSync("-");
        PrintNoSync p6 = new PrintNoSync("|");
        p3.start();
        p4.start();


    }
}
