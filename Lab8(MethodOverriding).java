//Write a program to calculate bonus for different departments using method overriding.


abstract class Department
{
  double salary,bonus,totalsalary;
  public abstract void calBonus(double salary);

 public void displayTotalSalary(String dept)
 {
   System.out.println(dept+"\t"+salary+"\t\t"+bonus+"\t"+totalsalary);
 }
}

class Accounts extends Department
{
    public void calBonus(double sal)
    {
       salary = sal;
       bonus = sal * 0.2;
       totalsalary=salary+bonus;
    }
}

class Sales extends Department
{
   public void calBonus(double sal)
   {
      salary = sal;
      bonus = sal * 0.3;
     totalsalary=salary+bonus;

   }
}

class BonusCalculate
{
    public static void main(String args[])
    {
        Department acc = new Accounts();
        Department sales = new Sales();
       
        acc.calBonus(10000);
        sales.calBonus(20000);

       System.out.println("Department \t Basic Salary \t Bonus \t Total Salary");

       System.out.println("--------------------------------------------------------------");
       acc.displayTotalSalary("Accounts Dept");
       sales.displayTotalSalary("Sales Dept");
       System.out.println("---------------------------------------------------------------");
    }
}