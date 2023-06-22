import java.util.Scanner;


//array

public class Test {

	public static void main(String[] args) {
		
	
		
		Student s[]=new Student[3];  //s[0] s[1] s[2]
		
		for(int i=0;i<s.length;i++)
		{
			s[i]=new Student();  // 
			
			s[i].setStudent();
		}
		
		for(int i=0;i<s.length;i++)
		{
			s[i].getStudent();
		  //System.out.println(s[i]);	
		}
		
		
	}

}





//int a[]=new int[5];

/*	a[0]=34;
	a[1]=22;
	a[2]=45;
	a[3]=12;
	a[4]=99;
	*/
	
/*	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println(a[3]);
	System.out.println(a[4]);
	*/
	/*Scanner sc=new Scanner(System.in);
	
	
	for(int i=0;i<5;i++)
	{
		System.out.print("Enter A["+i+"] = ");
		a[i]=Integer.parseInt(sc.nextLine());
	}
	*/
	
	// a[0]=1
	
/*
	for(int i=0;i<5;i++)
	{
	System.out.println("a["+i+"]="+a[i]);
	}
*/