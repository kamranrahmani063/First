class Prime5
{
public static void main(String[] args)
{
int i,j,count;
for(i=2;i<=100;i++)
{
count=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
count ++;
}
if(count==2)
System.out.println(i);
}
}
}