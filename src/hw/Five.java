package hw;
/*
Write a java program to concat 2 strings.
Expected output: I love java we love java
 */
public class Five {
    static String name = "I Love Java ";
    String name1 = "We Love Java";

    public static void main(String[] args) {
        Five F = new Five();
        System.out.println(name.concat(F.name1));
    }
}
