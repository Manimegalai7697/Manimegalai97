package hotelInheritance;

import java.util.Scanner;
public class Main {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("1.Delux Room /n 2.Delux AC Room /n 3.Luxury Suit");
System.out.println("Choose Room: ");
int n = sc.nextInt();
switch(n)
{
case 1:
System.out.println("Enter hotel name:");
String name=sc.next();
System.out.println("Enter room area:");
int noofsqclaw=sc.nextInt();
System.out.println("Enter rate/sq claw:");
int ratepersqclaw=sc.nextInt();
System.out.println("Hotel has wifi?:");
//boolean haswifi=sc.hasNext("yes");
boolean haswifi=sc.hasNext();
DeluxRoom dr=new DeluxRoom(name,noofsqclaw,ratepersqclaw,haswifi);
dr.calculateTariff();
break;
case 2:
System.out.println("Enter hotel name:");
String name1=sc.next();
System.out.println("Enter room area:");
int noofsqclaw1=sc.nextInt();
System.out.println("Enter rate/sq claw:");
int ratepersqclaw1=sc.nextInt();
System.out.println("Hotel has Ac?:");
boolean hasac=sc.hasNext();
DeluxAcRoom dar=new DeluxAcRoom(name1,ratepersqclaw1,noofsqclaw1,hasac);
dar.calculatetariff();
break;
case 3:
System.out.println("Enter hotel name:");
String name2=sc.next();
System.out.println("Enter room area:");
int noofsqclaw2=sc.nextInt();
System.out.println("Enter rate/sq claw:");
int ratepersqclaw2=sc.nextInt();
System.out.println("Hotel has wifi?:");
boolean haswifi2=sc.hasNext();
System.out.println("Hotel has Ac?:");
boolean hasac2=sc.hasNext();
SuitACRoom sar=new SuitACRoom(name2,ratepersqclaw2,noofsqclaw2,haswifi2,hasac2);
sar.calculatetariff();
break;


}

}
}