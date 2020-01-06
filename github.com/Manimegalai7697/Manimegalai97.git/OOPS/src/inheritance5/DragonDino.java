package inheritance5;

public class DragonDino extends LavaDino {
protected int noofwings;
protected int noofscales;
protected boolean canfly;
private boolean canbreathfire;
private String species;
private boolean hasheatresistance;

public DragonDino(String species, String consumptiontype, boolean canbreathfire, boolean hasheatresistance,
int noofwings, int noofscales, boolean canfly) {
super();
this.noofwings = noofwings;
this.noofscales = noofscales;
this.canfly = canfly;
}

public int getNoofwings() {
return noofwings;
}

public void setNoofwings(int noofwings) {
this.noofwings = noofwings;
}

public int getNoofscales() {
return noofscales;
}

public void setNoofscales(int noofscales) {
this.noofscales = noofscales;
}

public boolean isCanfly() {
return canfly;
}

public void setCanfly(boolean canfly) {
this.canfly = canfly;
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
if(canfly==true)
{
System.out.println(species+" can fly");
}
else {
System.out.println(species+" can't fly");
}
}
}
