package lapgetter;


import java.io.IOException;
import java.util.Scanner;
public class Main {

public static void main(String[] args) throws IOException{
LapManager manager = new LapManager();
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
byte lapNo ;
byte throwsMade;
String fastestPlayer;
float fastestTime;
LapPlayGetter l[] = new LapPlayGetter[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter Lap Number");
lapNo=sc.nextByte();
System.out.println("Enter Maximum throws");
throwsMade=sc.nextByte();
System.out.println("Enter Player name");
fastestPlayer=sc.next();
System.out.println("Enter  Best time");
fastestTime=sc.nextFloat();
l[i]=new LapPlayGetter(lapNo,throwsMade,fastestPlayer,fastestTime);

}
manager.displayAllLaps(l);

}
}