package hw;
/*
Write a java program which replace a “I@love@java” to “we love java”
Expected output: We love java
 */
public class Six {
    public static void main(String[] args) {
        String name = "I@love@java";
        String name1 = "We Love Java";
        String name2 = name;
        name = name1;
        name1 = name2;
        System.out.println(name);
    }
}
