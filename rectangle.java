import java.util.Scanner;
class rectangle
{
int length,breadth;
public void CalculateArea(int length,int breadth)
{
int area;
area=length*breadth;
System.out.println("Area of Rectangle is :" + area);
}
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int l=s.nextInt();
int b=s.nextInt();
rectangle r=new rectangle();
r.CalculateArea(l,b);
}
}


