package InheritanceChallenge;

/**
 * Created by robertsg on 11/25/2015.
 */
public class Main {
    public static void main(String[] args) {
        Supra suzyQ = new Supra(1997, 0, 0, 0, "Toyota" ,"Supra", "Sport", "white", 4, 2, 2, 4.7,true,true);

        System.out.println("This " + suzyQ.getMake() + " " + suzyQ.getModel() + " " + suzyQ.getTrim() + " " + suzyQ.isTurbo() + " has " + suzyQ.getColor() + " paint," + suzyQ.getWheels() + " wheels," + suzyQ.getWindows() + " windows," + suzyQ.getDoors() + " doors,a " + suzyQ.getEngine() + " engine, and is " + suzyQ.isTargaRoof() + ".");
    }
}
