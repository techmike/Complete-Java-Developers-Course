package InheritanceChallenge;

/**
 * Created by robertsg on 11/25/2015.
 */
public class Vehicle {
    private int year;
    private int steering;
    private int gear;
    private int move;
    private boolean upShift;
    private boolean downShift;

    public Vehicle() {
    }

    public Vehicle(int year, int steering, int gear, int move) {
        this.year = year;
        this.steering = steering;
        this.gear = gear;
        this.move = move;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSteering() {
        return steering;
    }

    public void setSteering(int steering) {
        this.steering = steering;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getMove() {
        return move;
    }

    public void setMove(int move) {
        this.move = move;
    }

    public int setUpShift(boolean upShift, int gear) {
        if(upShift == true) {
            return gear++;
        } else {
            return gear;
        }

    }

    public int setDownShift(boolean downShift, int gear) {
        if(downShift == true) {
            return gear--;
        } else {
            return gear;
        }
    }
}
