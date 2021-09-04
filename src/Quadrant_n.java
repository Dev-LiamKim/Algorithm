import java.util.Scanner;

public class Quadrant_n{
// Quadrant_n.java
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int p;
        if (x > 0) {
            if (y > 0)
                p = 1;
            else {
                p = 4;
            }
        } else {
            if (y > 0)
                p = 2;
            else {
                p = 3;
            }
        }
        System.out.println(p);
    }
}