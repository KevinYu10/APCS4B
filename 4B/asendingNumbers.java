import java.util.*;
public class asendingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int z = sc.nextInt();
        Ascending x = new Ascending();
        x.number(y, z);
    }
}

class Ascending {

    public void number(int low, int high) {
        int count = 0;
        for(int i = low; i<=high; i++) {
            if(strictlyAscending(i) == true) {
                count++;
            }
        }
        System.out.println(count);
    }

    public boolean strictlyAscending(int x) {
        int lastDigit = x%10;
        x = x/10;
        while(x>0) {
            int currentDigit = x%10;
            if(currentDigit >= lastDigit) {
                return false;
            }
            lastDigit = currentDigit;
            x = x / 10;
        }
        return true;
    }
}