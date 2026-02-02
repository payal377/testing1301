package listmethods;

import java.util.ArrayList;
import java.util.List;

public class listmethods {
	public boolean ArrayListTest( List<String> l1) {
		
		boolean l3 = l1.contains("pune");
		return l3;
	}
 public Object[] ConvertListTOArray(List <Integer> ListTestData) {
	 Object arr[] = ListTestData.toArray() ;
	 return arr;
	 
 }
	
}

