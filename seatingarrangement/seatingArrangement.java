package seatingarrangement;

import java.util.ArrayList;
import java.util.Scanner;

public class seatingArrangement {
    static ArrayList<Integer> seatarrange(ArrayList<Integer> inp){
        ArrayList<Integer> out = new ArrayList<>();
        for(int i =0 ;i<inp.size();i++){
            out.add(inp.get(i));
            out.add(0);
            if(inp.get(i)%2==0)
                out.add(0);
        }
        return out;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of The Array : ");
        int n = sc.nextInt();
        ArrayList<Integer> inp = new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.print("Enter the "+i+" person val : ");
            inp.add(sc.nextInt());
        }
        ArrayList<Integer> out = seatarrange(inp);
        for (int i:out){
            System.out.print(i+" ");
        }

        sc.close();
    }
}
