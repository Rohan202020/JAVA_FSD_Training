package constructor;
class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class ParameterizedCon {
	public static void main(String[] args) {

		Std std1=new Std(200,"Rohan");
		Std std2=new Std(110,"Aditya");
		std1.display();
		std2.display();
			}

}
