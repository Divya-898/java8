import java.util.stream.IntStream;

public class ImperativeVsDeclarative {
public static void main(String args[]) {
	
	int sum=0;
	for(int i=0;i<=100;i++) {
		sum+=i;
	}
	System.out.println("sum using Imperative Approach"+sum);
	
	
	int sum1=IntStream.rangeClosed(0, 100).sum();
	System.out.println("sum using Declarative Approach"+sum1);
	
}
}
