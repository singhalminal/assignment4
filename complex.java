import java.util.Scanner;
class complex
{
int real,img;
public void Display(int real,int img)
{
System.out.println(real + "+" + img + "i");
}
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int r=s.nextInt();
int i=s.nextInt();
complex c=new complex();
c.Display(r,i);
}
}