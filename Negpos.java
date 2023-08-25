//java program to check input number is negetive positive or 0
import java.util.*;
public class Negpos{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Please enter any integer:");
int k=sc.nextInt();
if(k>0)
{
System.out.println("The number you entered is positive.");
}
else if(k<0)
{
System.out.println("The number you entered is negative.");
}
else{
System.out.println("The number you entered is 0.");
}}}
