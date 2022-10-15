class Math
{    
		public static  boolean IS_Even(int n)
		{
		    if (n%2==0)
			    return true;
		    else 
			return false;
		
		}
	
		public static  boolean IS_Odd(int n)
		{
		    if (n%2!=0)
			    return true;
		    else 
			return false;
		}
		public static boolean IS_Prime(int n)
		{   int num=n,i,count=0;
			for(i=2;i<num;++i)
			{	if(num%i==0)
				   return false;
			}	
					return true;
		} 
		public static int CountPrimes(int n,int m)
		{
		   int i,total=0;
			for(i=n;i<=m;++i)			
			{	if(IS_Prime(i))
					total++;
			
		  	  
			}  return total;
		}	

		public static int Reverse(int n)
		{
		   int r,p=0;
			while(n!=0)			
			{	
				r=n%10;
				p=p*10+r;
				n=n/10;
				

			}return p;
		}	 
			
		public static int Countdigits(int n)
		{
		   int r,count=0;
			while(n!=0)			
			{	
				r=n%10;
				count++;
				n=n/10;
				

			}return count;
		}	 
}
