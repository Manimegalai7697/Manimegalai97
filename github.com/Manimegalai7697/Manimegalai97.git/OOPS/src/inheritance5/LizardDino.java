package inheritance5;

import com.inheritance.LavaDino;

public class LizardDino extends LavaDino {
protected int noofclaw;
protected int nooflegs;
protected boolean canrun;
private boolean canbreathfire;
private boolean hasheatresistance;
public LizardDino(String species, String consumptiontype, boolean canbreathfire, boolean hasheatresistance,
int noofclaw, int nooflegs, boolean canrun) {
super(species, consumptiontype, canbreathfire, hasheatresistance);
this.noofclaw = noofclaw;
this.nooflegs = nooflegs;
this.canrun = canrun;
}
public int getNoofclaw() {
return noofclaw;
}
public void setNoofclaw(int noofclaw) {
this.noofclaw = noofclaw;
}
public int getNooflegs() {
return nooflegs;
}
public void setNooflegs(int nooflegs) {
this.nooflegs = nooflegs;
}
public boolean isCanrun() {
return canrun;
}
public void setCanrun(boolean canrun) {
this.canrun = canrun;
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
if(canrun==true)
{
System.out.println(species+" can run");
}
else {
System.out.println(species+" can't run");
}
}

}
