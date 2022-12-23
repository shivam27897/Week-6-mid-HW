package hw;
/*
Write a Java program to your name on screen and then print your surname on a separate line
 */
public class One {
    static String name = "Shivam\nPatel";
    String name1 = "Shivam";
            String name2 = "Patel";
    public static void main(String[] args) {
        System.out.println(name);
        System.out.println("Shivam\nPatel");
        One o = new One();
        System.out.println(o.name1);
        System.out.println(o.name2);

    }
}
