package menutotal;

import java.util.Scanner;

public class menuTotal {
    public static void main(String[] args) {
        System.out.println("Options : ");
        System.out.println("Press to 1.Pizza : cost = 200");
        System.out.println("Press to 2.Burger : cost = 180");
        System.out.println("Press to 3.Briyani : cost = 250");
        System.out.println("Press to 4.Dosa : cost = 80");
        System.out.println("Press to 5.Idly : cost = 50");
        System.out.println("Press 0 To Exit ");
        int tot_cost = 0;
        int quantity = 0;
        Scanner sc = new Scanner(System.in);
        while (true){
        System.out.println("Enter Option needed : ");
        int opt = sc.nextInt();
       if(opt==0){
            break;
       }
       switch (opt) {
        case 1:
            tot_cost += 200;
            quantity++;
            break;
        case 2:
            tot_cost += 180;
            quantity++;
            break;
        case 3:
            tot_cost += 250;
            quantity++;
            break;   
        case 4:
            tot_cost += 80;
            quantity++;
            break;
        case 5:
            tot_cost += 50;
            quantity++;
            break;
        default:
            System.out.println("Wrong input please enter a valid one");
            break;
       }
        
        }
        System.out.println("The quantity is : " + quantity);
        System.out.println("The total cost is : " + tot_cost);
        sc.close();

    }
}
