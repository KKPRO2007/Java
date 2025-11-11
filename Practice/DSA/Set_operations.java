package DSA;
import java.util.*;
public class Set_operations {
	public static void main(String[] kk) {
		Scanner z = new Scanner(System.in);
		
//		int n =z.nextInt();
//		HashSet<Integer> set = new HashSet<>();
//		for(int i=0; i<n; i++)
//			set.add(z.nextInt());
//		System.out.println(set);
		
		
//		int n =z.nextInt();
//		HashSet<String> set = new HashSet<>();
//		for(int i=0; i<n; i++)
//			set.add(z.next());
//		System.out.println(set);
//		String sr = z.next();
//		if(set.contains(sr))
//		System.out.println("found");
//		else 
//			System.out.println("not found");
//		
		
//		int n =z.nextInt();
//		LinkedHashSet<String> set = new LinkedHashSet<>();
//		for(int i=0; i<n; i++)
//			set.add(z.next());
//		System.out.println(set);
		
//		int n =z.nextInt();
//		TreeSet<Integer> set = new TreeSet<>();
//		for(int i=0; i<n; i++)
//			set.add(z.nextInt());
//		System.out.println(set);
		
//		int n =z.nextInt();
//		HashSet<String> set = new HashSet<>();
//		for(int i=0; i<n; i++)
//			set.add(z.next());
//		System.out.println(set);
//		String sr = z.next();
//		set.remove(sr);
//		System.out.println(set);
		
//		int n =z.nextInt();
//		HashSet<Integer> set = new HashSet<>();
//		HashSet<Integer> set2 = new HashSet<>();
//		for(int i=0; i<n; i++)
//			set.add(z.nextInt());
//		for(int i=0; i<n; i++)
//			set2.add(z.nextInt());
//		set.retainAll(set2);
//		System.out.println(set);
		
		
//
//		int n =z.nextInt();
//		ArrayList<Integer> list=  new ArrayList<>();
//		for(int i=0; i<n; i++)
//     	list.add(z.nextInt());
//		HashSet<Integer> set = new HashSet<>(list);
//		System.out.println(list);
//		System.out.println(set);
//		
		
		
//		int n =z.nextInt();
//		HashSet<Integer> set = new HashSet<>();
//		for(int i=0; i<n; i++)
//			set.add(z.nextInt());
//		System.out.println(Collections.min(set));
//		System.out.println(Collections.max(set));


//		int n =z.nextInt();
//		HashSet<Integer> set = new HashSet<>();
//		HashSet<Integer> set2 = new HashSet<>();
//    	for(int i=0; i<n; i++)
//			set.add(z.nextInt());
//    	int k =z.nextInt();
//		for(int i=0; i<k; i++)
//			set2.add(z.nextInt());
//		
//		if (set.containsAll(set2))
//            System.out.println("yes");
//        else
//            System.out.println("no");
    
		
		
		int n =z.nextInt();
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<n; i++)
    	set.add(z.nextInt());
		System.out.println(set);
		
		int j =z.nextInt();
		int count = 0;
		
		for ( int x : set) {
			if( x > j)
				count++;
		}
        System.out.println("Elements greater than " + j+ ": " + count);
		
		
		
	}

}
