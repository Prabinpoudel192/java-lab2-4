import java.util.*;
public class Vowel{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Please enter any alphabet:");
String k=sc.next();
switch(k){
case "a":
case "A":
case "e":
case "E":
case "i":
case "I":
case "o":
case "O":
case "u":
case "U":
System.out.println("The alphabet is vowel.");
break;
default:
System.out.println("The alphabet is consonant.");
break;
}}}