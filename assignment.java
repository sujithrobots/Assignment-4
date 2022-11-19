package assignment_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class assignment {

	public static void main(String[] args) {
		
		assignment lap = new assignment();
		lap.method1();
		lap.method2();
		lap.method3();
		lap.method4();
		lap.method5();
		
	}
	public void method1() {
		List<Object> li=new ArrayList<Object>(Arrays.asList("Java","Selenium","TestNG","Git","Github"));
		
		
		System.out.println(li);
		
		System.out.print("Reverse order of given list = ");
		Collections.reverse(li);
		System.out.println(li);
		System.out.println("=====================================================================================================");
	}
	public void method2() {
		List<String> l=new ArrayList<String>();
		l.add("Git");
		l.add("Github");
		l.add("GitLab");
		l.add("GitBash");
		l.add("Selenium");
		l.add("Java");
		l.add("Maven");
		System.out.println(l);
		List<String> l2=new ArrayList<>();
		for(String i:l) {
		if(i.startsWith("Git")	) {
			l2.add(i);
		}
		
	}
	System.out.println(l2);
	System.out.println("=====================================================================================================");
}
	public void method3() {
		List<String> li1=new ArrayList<String>(Arrays.asList("Java","TestNG","Maven","Java"));
		
		Set<String> newlist = new LinkedHashSet<String>(li1);
		
		System.out.println(newlist);
		System.out.println("=====================================================================================================");
	}
	public void method4() {
		List<Integer> l=new ArrayList<Integer>(Arrays.asList(10,45,90,45,23,90,44));
		/*
		 * l.add(10); l.add(45); l.add(90); l.add(45); l.add(23); l.add(90); l.add(44);
		 */
		
		for(int i=1;i<l.size();i++) {
			if(i==1){
				System.out.println(l.get(i));
			}
			if(i==l.size()-2){
				System.out.println(l.get(i));
			}
		}
		System.out.println(l.size());
		System.out.println("=====================================================================================================");
	}
	public void method5() {
		List<Integer> ls1=new ArrayList<Integer>(Arrays.asList(11,22,33));
		List<Integer> ls2=new ArrayList<Integer>(Arrays.asList(9,19,29));
		List<Integer> ls3=new ArrayList<Integer>(Arrays.asList(7,17,18));
		
		ls2.addAll(ls3);
		ls1.addAll(ls2);
		System.out.println(ls1);
	}
}