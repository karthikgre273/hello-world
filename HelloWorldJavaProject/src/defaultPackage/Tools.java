package defaultPackage;

public class Tools {

	public int add(int a, int b) {
		int result = 0;
		result = a + b;
		return result;
	}
	
	public int sub(int a, int b) {
		int result;
		if(a>b) 
			result=a-b;
		else
			result=b-a;
		return result;
	}

}
