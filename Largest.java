//java program to find the largest value using ternary operation.
public class Largest{
public static void main(String[] args){
int num1=45,num2=55,num3=15;
int largest=(num1>num2 && num1>num3) ? num1:((num2>num1 && num2>num3)?num2:num3);
System.out.println("The largest among three i.e "+num1+","+num2+","+num3+" is "+largest);
}}