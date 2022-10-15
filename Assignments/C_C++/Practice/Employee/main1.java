class Main{ 
	public static void main (String[] args){
	int id = Integer.parseInt(args[0]);

	int a = Integer.parseInt(args[1]);

	double r = Double.parseDouble(args[2]);

	int h = Integer.parseInt(args[3]);

	Employee emp =new Employee(id ,a,r,h);

        emp.Display();
	System.out.printf("The net income is :%f %n" , emp.Getnetincome());
}
}
