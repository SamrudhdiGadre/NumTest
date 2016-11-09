
public class NumTest {

public static void main(String[] args){
				
		int x = 5;
		x = x + 10;
		System.out.println("Addition:" + x);
		
		int y = 10;
		y = x * y;
		System.out.println("Multiplication:" + y);
		
		int z = 5;
		z = y / z ;
		System.out.println("Division:" + z);
		
		System.out.println("Testing");
		
	} 

public int addNum(int x, int y){
	return (x + y);
}

public int substractNum(int x, int y){
	return (x - y);
}
	
public int multiplyNum(int x, int y){
	return (x * y);
}

public int divisionNum(int x, int y){
	return (x/y);
}

}
