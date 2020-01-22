public class Concat_sample  {
    public static void main(String[] args) {
    /*
        String str_Sample = "a";
        System.out.println("Compare To 'a' b is : " + str_Sample.compareTo("b"));
        str_Sample = "b";
        System.out.println("Compare To 'b' a is : " + str_Sample.compareTo("a"));
        str_Sample = "b";
        System.out.println("Compare To 'b' b is : " + str_Sample.compareTo("b"));
        
        String strS = "RockStar";
        System.out.println("Compare To 'ROCKSTAR': " + strS.compareTo("rockstar"));
        //Compare to - Ignore case
        System.out.println("Compare To 'ROCKSTAR' - Case Ignored: " + strS.compareToIgnoreCase("ROCKSTAR"));
        
      */
    	
    	//The contains() method is Java method to check if String contains another substring or not. 
    	// String str_Sample = "this example contains() method is Java method to check if String contains another substring or not. It returns boolean value so it can use directly inside if statements.";
         //Check if String contains a sequence
      //   System.out.println("Contains sequence 'ing': " + str_Sample.contains("ing"));
      //   System.out.println("Contains sequence 'Example': " + str_Sample.contains("Example"));
         //String contains method is case sensitive  
      //   System.out.println("Contains sequence 'example': " + str_Sample.contains("example"));
      //   System.out.println("Contains sequence 'is String': " + str_Sample.contains("is String"));
    	 
    	 String str_Sample = "Java String endsWith example sentences";
         //Check if ends with a particular sequence
         System.out.println("EndsWith character 'e': " + str_Sample.endsWith("e"));
         System.out.println("EndsWith character 'ple': " + str_Sample.endsWith("ple"));
         System.out.println("EndsWith character 'Java': " + str_Sample.endsWith("Java"));
    	
    }

}
/*
public class Concat_sample {
	public static void main(String[] args) {
	String str1 = "Rock";
	String str2 = "Start";
	String str3 = str1.concat(str2);
	
	System.out.println(str3);
	
	String str4 = str1 +str2;
	System.out.println(str4);
	
	}
}
*/

/*
public class Sample_String{
	  public static void main(String[] args){  //Check if String contains a sequence
	String str_Sample = "RockStar";
	  System.out.println("Contains sequence 'tar': " + str_Sample.contains("tar"));
	  }
	}
*/