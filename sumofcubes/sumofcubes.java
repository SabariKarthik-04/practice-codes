package sumofcubes;

import java.util.Scanner;

public class sumofcubes {
    static int cubicsum(int m,int n){
        int sum = 0;
        if(m>n)
            return 0;
        else{
            for(int i=m;i<=n;i++){
                sum += (i*i*i);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of M : ");
        int m = sc.nextInt();
        System.out.println("Enter Value of N : ");
        int n = sc.nextInt();
        System.out.println("The Sum of Cube between "+ m +" and "+ n +" is : "+cubicsum(m, n));
        sc.close();
    }
}
