package VILLEGASE_070317;

public class AbstractDemo {
    public static void main(String[] args ){
        FlyingSuperHero fsh = new FlyingSuperHero ();
        //fsh.displayPower();
        Spiderman sm = new Spiderman ();
       // sm.displayPower();
        fsh.setSuperPowers("New Power",2);
        fsh.printSuperPowers();
        
    }
}
