//java program to find the input number is even or odd.
import java.util.*;
public class Evenodd{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Please enter any positive number:");
int k=sc.nextInt();
if(k%2==0)
{
System.out.println("The number you entered is even.");
}
else{
System.out.println("The number you entered is odd.");
}}}
