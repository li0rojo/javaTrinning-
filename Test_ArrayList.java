import java.util.ArrayList;


public class Test_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> arlTest = new ArrayList<String>();
		System.out.println("Size of ArrayList at Creation: "+  arlTest.size());
		arlTest.add("D");
		arlTest.add("U");
		arlTest.add("K");
		arlTest.add("E");
		
	   System.out.println("Size of ArrayList after adding elements: " + arlTest.size());
	
	   System.out.println("List of all elements: " + arlTest);

	   //Remove some elements from the list
	   arlTest.remove("D");
	   System.out.println("See contents after removing one element: " + arlTest);

      //Remove element by index
	   arlTest.remove(2);
	   System.out.println("See contents after removing element by index: " + arlTest);

	  //Check size after removing elements
	   System.out.println("Size of arrayList after removing elements: " + arlTest.size());
	   System.out.println("List of all elements after removing elements: " + arlTest);

	  //Check if the list contains "K"
	   System.out.println(arlTest.contains("K"));
	}
}

