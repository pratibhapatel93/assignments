class Patient{
	private int patientid;
	private String patientName;
	private int bedType;
	private int noofdays;
	public Patient()
	{
	
	}	
	public int getPatientId()
	{
		return patientid;
	}
	
	public void setPatientId(int id)
	{
	   patientid=id;
	 
	}	
	public String getPatientName()
	{
		return patientName;
	}
	
	public void setPatientName(String n)
	{
	   patientName=n;
	 
	}	
	public int getbedType()
	{
		return bedType;
	}
	
	public void setbedType(int t)
	{
	   bedType=t;
	 
	}	
	public int getnoofdays()
	{
		return noofdays;
	}
	
	public void setnoofdays(int d)
	{
	   noofdays=d;
	 
	}
	public int getPricePerDay(int bedType)
	{  int price=0;
		switch (bedType){
		
		case 1:price= 500;
		       break;
		case 2:price= 350;
			break;
		case 3:price= 200;
			break;}       
		return price;
	
	}
	public double getBillAmount(int price){
		double amount;
		amount= noofdays*price;
			return amount;
	}

	
}

class InhousePatient extends Patient{

	private double discount;
//	public InhousePatient (){} 

	public double getdiscount()
	{
		return discount;
	}
	
	public void setdiscount(int ds)
	{
	   discount=ds;
	 
	}	


	public double getBillAmount(int price){
		double amount;
		amount= getnoofdays()*price;
		if (amount>5000)
			return amount*discount;
		else
			return amount*0.95;
	}

}

