package assgn_14.hashset.assignment13;

import java.util.*;
public class Filter {
	public static void main(String[] args) {
		HashSet<String> hashSet=new HashSet<String>();
		hashSet.add("a");
		hashSet.add("b");
		hashSet.add("b");
		hashSet.add("c");
		hashSet.add("d");
		System.out.println(hashSet);
		System.out.println(hashSet.contains('d'));
	}
}
