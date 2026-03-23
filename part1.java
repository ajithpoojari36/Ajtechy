import java.util.*;
class pay
 {
 String name;
double salary,da,hra,pf,gs,ns;
pay(String n,double s)
 {
  n=name;
  s=salary;
da=0;hra=0;pf=0;gs=0;ns=0;
}
void calculate()
 {
 da=salary/12*100;
hra=salary/10*100;
pf=salary/12*100;
gs=salary+da+hra;
ns=gs+pf;
}
void display()
 {
 System.out.println("Employee name "+name);
 System.out.println("Salary + "+salary);
System.out.println("Dearness Allowance "+hra);
 System.out.println("PF "+pf);
 System.out.println("GS "+gs);
 System.out.println("NS "+ns);
}
}
class part1
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter student name ");
 String name=sc.nextLine();
 System.out.println("Enter Salary");
double salary=sc.nextInt();
pay ob=new pay(name,salary);
ob.calculate();
ob.display();
}
}
