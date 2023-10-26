import java.util.*;
public class timeTable {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int y = sc.nextInt();
    table t = new table();
    t.numbers(y);
    }
}

class table {
    public void numbers(int x) {
        for(int i = 1; i<x+1; i++) {
            for(int q = 1; q<x+1; q++) {
                System.out.print(q*i + " ");
            }
            System.out.println("");
        }
    }
}