import java.util.*;
public class sequenceCheck
{
    static void sequence_check(int[] a,int t){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
		for(int i =0 ;i<a.length-1;i++){
		   ArrayList<Integer> sub = new ArrayList<>();
		   sub.add(a[i]);
		  for(int j=i+1;j<a.length;j++){
		    sub.add(a[j]);
		}
		res.add(sub);
        }
        System.out.println(res);
        
        int index = Integer.MIN_VALUE;
        for(int i =0;i<res.size();i++){
            int sum = res.get(i).get(0);
            for(int j =0;j<res.get(i).size()-1;j++){
                sum=sum+res.get(i).get(j+1);
                System.out.println(sum);
            }
            if(sum==t){
                System.out.println(res.get(i));
                
                break;
            }
        }
    
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter Array Size : ");
	    int size = sc.nextInt();
	    System.out.println("Enter Array Elements");
		int[] a = new int[size];
		for(int i=0;i<size;i++){
		    a[i]=sc.nextInt();
		}
		System.out.print("Enter Target Value : ");
		int target=sc.nextInt();
        sequence_check(a,target);
		sc.close();
	}
}
