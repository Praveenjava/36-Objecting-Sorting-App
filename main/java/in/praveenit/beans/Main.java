package in.praveenit.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		//List<Person>persons = new ArrayList<>();
		Person p1 = new Person(101, "Praveen", "praveen@gmail.com");
		Person p2 = new Person(102, "Bhatia", "bhatia@gmail.com");
		Person p3 = new Person(103, "Chinna", "chinna@gmail.com");
		Person p4 = new Person(104, "Nani", "nani@gmail.com");
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4);
		
		System.out.println("============Objects Before Sorting===========");
		for (Person p : persons) {
			System.out.println(p);
		}
		
		Collections.sort(persons,new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				
				return p1.getPname().compareTo(p2.getPname());
			}
			
		});
		
		
		
		System.out.println("============Objects After Sorting===========");
		for (Person p : persons) {
			System.out.println(p);
		}
		
		
	}

}

//class PersonComparator implements Comparator<Person> {
//	@Override
//	public int compare(Person p1, Person p2) {
//		return p1.getPname().compareTo(p2.getPname());
//		
//	}
//	
//	
//}
