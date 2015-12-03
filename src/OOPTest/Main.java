package OOPTest;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * Created by robertsg on 12/2/2015.
 */
public class Main {
    public static void main(String[] args) {
        Burger orderOne = new Burger("roll","beef",BigDecimal.valueOf(2.50));
        orderOne.addLettuce();
        orderOne.addCarrot();
        System.out.println("Your bread type is " + orderOne.getBreadType() + ", meat is " + orderOne.getMeat()
                + " the base price is " + NumberFormat.getCurrencyInstance().format(orderOne.getBasePrice()) + " with your additions being "
                + orderOne.getAdditions() + " and the total price is " + NumberFormat.getCurrencyInstance().format(orderOne.calculatePrice()));

        System.out.println();

        HealthyBurger orderTwo = new HealthyBurger("turkey",BigDecimal.valueOf(4.00));
        orderTwo.addCarrot();
        orderTwo.addAvocado();
        orderTwo.addSprouts();
        System.out.println("Your bread type is " + orderTwo.getBreadType() + ", meat is " + orderTwo.getMeat()
                + " the base price is " + NumberFormat.getCurrencyInstance().format(orderTwo.getBasePrice()) + " with your additions being "
                + orderTwo.getAdditions() + " and the total price is " + NumberFormat.getCurrencyInstance().format(orderTwo.calculatePrice()));

        System.out.println();

        DeluxeBurger orderThree = new DeluxeBurger("sesame seed bun","angus beef",BigDecimal.valueOf(11.00),"Sprite","medium fries");
        System.out.println("Your bread type is " + orderThree.getBreadType() + ", meat is " + orderThree.getMeat()
                + " the base price is " + NumberFormat.getCurrencyInstance().format(orderThree.getBasePrice()) + " with your additions being "
                + orderThree.getDrink() + " and " + orderThree.getFries() +  " and the total price is " + NumberFormat.getCurrencyInstance().format(orderThree.calculatePrice()));
    }
}
