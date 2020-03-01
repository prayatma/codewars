import java.util.*;

public class WhichAreIn { 
	
	public static String[] inArray(String[] array1, String[] array2) {
    
     String iter = array1[0];
     Set <String>solution = new <String>HashSet();
     
     for(int j = 0; j < array1.length; j ++){
       for(int i = 0; i < array2.length; i ++){
         if(array2[i].contains(iter)){
             solution.add(iter);
         }
         iter = array1[j];
       }
     }
     String[] solutionArray = solution.toArray(new String[0]);
     Arrays.sort(solutionArray);
		 return solutionArray;
	}
}
