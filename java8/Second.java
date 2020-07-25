import java.util.*;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class Second{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
            		l.add(sc.nextInt());
       	 	}
		String ss="a";
		l.stream().map(s -> s.substring(0,3)).filter(x -> x.startsWith(ss)).forEach(System.out::println);
}
}
			
		