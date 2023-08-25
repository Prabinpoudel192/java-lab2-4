import java.util.*;
public class AveandPer{
public static void main(String[] args){
Scanner pr=new Scanner(System.in);
System.out.println("Please enter the mark obtained in 5 subjects:");
float k=pr.nextFloat();
float l=pr.nextFloat();
float m=pr.nextFloat();
float n=pr.nextFloat();
float o=pr.nextFloat();
float average=(k+l+m+n+o)/5;
float percentage=((k+l+m+n+o)*100)/500;
System.out.println("The average is "+average+" and the percentage is "+percentage);
}}