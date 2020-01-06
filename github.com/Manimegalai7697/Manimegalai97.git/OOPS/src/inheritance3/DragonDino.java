package inheritance3;

public class DragonDino extends LavaDino {
protected int noofwings;
protected int noofscales;

public DragonDino(String species, String consumptiontype, String breath, String heat, int noofwings,
int noofscales) {
super(species, consumptiontype, breath, heat);
this.noofwings = noofwings;
this.noofscales = noofscales;
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
public void displaydinodetails()
{
System.out.println("Dino Report");
System.out.println("Dragon Dino Properties");
System.out.println("Files with "+noofwings+" wings");
System.out.println("Has "+noofscales+" Scales");
System.out.println("Inherited Dino Properties");
System.out.println(species+" breathes fire");
System.out.println("It is Resistent to heat");
System.out.println("Inherited base Dino Properties");
System.out.println(species+" is a herbivore");
 
}
}