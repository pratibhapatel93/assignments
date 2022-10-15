class Employee{

	    private int empid;
	    private int  age;
	    private double rate;
	    private int hour;
	public Employee(int id,int a,double r,int h)
	{
	      empid=id;
	      age=a;
	      rate=r;
	      hour=h;

	
	}

	public double Getnetincome()
	{       double income;
	
		income=rate*hour;
			if (hour<=8)
			return income;
			else 
			  return income+(hour-8)*100;

	}

	public void Display()
	{ 	System.out.printf("employee id;%d%n",empid);
	 	System.out.printf("employee age;%d%n",age);
	 	System.out.printf("employee rate;%f%n",rate);
	 	System.out.printf("employee hour;%d%n",hour);
	}
	  
	
	
	
	
	
 
}
