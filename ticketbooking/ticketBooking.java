package ticketbooking;

import java.util.Scanner;

public class ticketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Quantity : ");
        int m = sc.nextInt();
        int tot = 0 ;
        for(int i = 0;i<m;i++){
            System.out.println("Enter Age Of The "+(i+1)+" Person: ");
            int n = sc.nextInt();
            if(n>60){
                tot = tot + 30;
            }
            else if(n<12){
                tot = tot + 20;
            }
            else{
                tot = tot + 50;
            }
        }
        System.out.println("The total amount for ticket booking is : "+tot);
        sc.close();
    }
}
