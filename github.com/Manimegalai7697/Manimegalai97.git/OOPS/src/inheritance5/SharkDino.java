package inheritance5;

import com.inheritance.LavaDino;

public class SharkDino extends LavaDino {
protected int nooffins;
protected int noofgills;
protected boolean canswim;
private boolean canbreathfire;
private boolean hasheatresistance;


public SharkDino(String species, String consumptiontype, boolean canbreathfire1, boolean hasheatresistance1,
int nooffins, int noofgills, boolean canswim) {
super(species, consumptiontype, canbreathfire1, hasheatresistance1);
this.nooffins = nooffins;
this.noofgills = noofgills;
this.canswim = canswim;
}


public int getNooffins() {
return nooffins;
}


public void setNooffins(int nooffins) {
this.nooffins = nooffins;
}


public int getNoofgills() {
return noofgills;
}


public void setNoofgills(int noofgills) {
this.noofgills = noofgills;
}


public boolean isCanswim() {
return canswim;
}


public void setCanswim(boolean canswim) {
this.canswim = canswim;
}


public void displaydinodetails()
{
System.out.println("Dino species details about LavaDino");
if(canbreathfire==true)
{
System.out.println(species+" breath fire");
}
else {
System.out.println(species+" can't breath fire");
}
if(hasheatresistance==true)
{
System.out.println("It is Resistent to heat ");
}
else {
System.out.println("It is not Resistent to heat ");
}
if(canswim==true)
{
System.out.println("It can swim ");
}
else {
System.out.println("It can't swim ");
}
}

}





