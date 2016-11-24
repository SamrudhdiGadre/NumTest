
public class NumTest {

public static void main(String[] args){
				
		int x = 5;
		int y = 10;
		int z = 15;
		int sum = addNum(x,y);
		System.out.println("Addition:" + sum);
		
		System.out.println("Multiplication:" + multiplyNum(x,y));
		
		System.out.println("Division:" + divisionNum(z,x));
		
		System.out.println("Substraction:" + substractNum(z,y));
		
		System.out.println("Testing");
		
	} 

public static int addNum(int x, int y){
	return (x + y);
}

public static int substractNum(int x, int y){
	return (x - y);
}
	
public static int multiplyNum(int x, int y){
	return (x * y);
}

public static int divisionNum(int x, int y){
	return (x/y);
}

}
