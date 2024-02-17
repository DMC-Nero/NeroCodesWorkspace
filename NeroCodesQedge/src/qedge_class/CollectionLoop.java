package qedge_class;
import java.util.*;
public class CollectionLoop {

	public static void main(String[] args) {
		List<Integer> marksCollections = List.of(80,81,75,90,56);
		
		// Iterate / loop over the items of collection
		//Using traditional  for loop
		// list colleaction maintains data in a zero based index
		for( int i=0; i< marksCollections.size(); i++) {
			System.out.println(marksCollections.get(i));
			
		}
		System.out.println("=============");
		//Using enhanced for loop
		for (Integer elements : marksCollections) {
			System.out.println(elements);
		}
	}

}
