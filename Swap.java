//Value swapping using third variable
import java.util.*;
public class Swap{
public static void main(String[] args){
Scanner kd=new Scanner(System.in);
System.out.println("Please enter two numbers:");
int a=kd.nextInt();
int b=kd.nextInt();
int temp;
System.out.println("Values before swapping a="+a+"and b="+b);
temp=a;
a=b;
b=temp;
System.out.println("Values after swapping a="+a+" and b="+b);
}}