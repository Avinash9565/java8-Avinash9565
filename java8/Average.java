import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class Average
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        System.out.println(fun(l));
	}
	public static int fun(List l){
         int s=0;
         Iterator<Integer> iterator = l.iterator();
         while(iterator.hasNext()){
             int i = (int) iterator.next();
             s+=i;
         }
         //for(int i=0;i<l.size();i++){
           // int x=l.get(i);
         //}
         s=s/l.size();
         return s;
     }
}