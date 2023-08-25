//java program to check if the number is even and divisible by 3
import java.util.*;
public class Even3{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Please enter the number you want to check:");
int k=sc.nextInt();
if(k%2==0)
{
System.out.print("The number is even,");
if(k%3==0)
{
System.out.println(" and divisible by 3.");
}
else{
System.out.println(" But not divisible by 3.");
}
}
else{
System.out.print("The number is odd,");
if(k%3==0)
{
System.out.println(" and divisible by 3.");
}
else{
System.out.println(" and not divisible by 3.");
}}}}