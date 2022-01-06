import java.util.Scanner; 
class PrimeNumber 
 { 
     public static void main(String args[]) 
            { 
                   int upper, lower,n,b,c,count,i; 
		   boolean flag=false;
                   Scanner s=new Scanner(System.in); 
                   System.out.println("Enter the upper Limit"); 
                   upper =s.nextInt(); 
                   System.out.println("Enter the lower Limit"); 
		   lower=s.nextInt();
                   System.out.println("The Prime Numbers from"+lower+"to"+upper+"are :");
		   for (n=lower;n<=upper;n++)
                    {    
                        count=0;
                        for(i=2; i<=n/2; i++)
                          {
                            // check for prime number
                            if(n%i==0)
                              {
                                 count=1;
                                 break;
                              }
                          }
                       
                       if (count==0)
                           System.out.println(n);
                       
                    }
                   
            } 
  }