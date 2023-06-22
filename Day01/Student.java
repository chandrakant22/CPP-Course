import java.util.Scanner;

public class Student {
	int id;
	String name;
	double result;
	
	
	void setStudent()
	{
		Scanner  sc =new Scanner(System.in);
		System.out.println("Enter your Roll");
		id=Integer.parseInt(sc.nextLine());
		System.out.println("Enter your Name");
		name=sc.nextLine();
		System.out.println("Enter your Result");
		result=Double.parseDouble(sc.nextLine());
	}
	
	void getStudent()
	{
		System.out.println("Roll = "+id);
		System.out.println("Name = "+name);
		System.out.println("Result = "+result);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", result=" + result + "]";
	}

	
	
	
}
