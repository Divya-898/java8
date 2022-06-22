import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//imperative
      List<Integer> integerList=Arrays.asList(1,2,3,3,3,4,5,6,7);
      
      List<Integer> duplicate=new ArrayList<Integer>();
      for(Integer integer:integerList)
      {
    	  if(!duplicate.contains(integer)) {
    		  duplicate.add(integer);
      }}
      System.out.println("Uniquelist are:"+duplicate);
      //Declarative
      List<Integer> list1=integerList.stream().distinct().collect(Collectors.toList());
      System.out.println("Declarative Uniquelist :"+list1);
	}

	
	
}
