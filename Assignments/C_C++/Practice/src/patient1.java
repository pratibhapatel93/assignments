class Patient1{
       public static void main(String[] args){
   
	       Patient info = new Patient ();
	       Patient inf = new InhousePatient ();
 		info.setPatientId(101);
		info.setPatientName("sagar");
		info.setnoofdays(10);
		System.out.println("enter the type of bed 1.icu 2.delux 3.genral  ");	
		info.setbedType(2);
     		 int x=info.getPricePerDay(info.getbedType());
       		System.out.printf("The price is :%d ",x);
		double y=info.getBillAmount(x);
       		System.out.printf("The bill is :%f ",y);
	      // Patient inf = new InhousePatient ();
		inf.setbedType(1);
     		 int u=inf.getPricePerDay(inf.getbedType());
       		System.out.printf("The price is :%d ",u);
		inf.setnoofdays(10);
		 inf.getnoofdays();
		double m=inf.getBillAmount(u);
       		System.out.printf("The bill of inhouse patient is :%f ",m);

       }
}       
