package method;

public class Call {
	int val=150;

	int operation(int val) {
		val =val*1/10;
		return val;
	}

	public static void main(String args[]) {
		Call d= new Call();
		System.out.println("Before operation value of data is "+d.val);
		int a= d.operation(100);
		System.out.println("After operation value of data is "+a);
		}
	

}
