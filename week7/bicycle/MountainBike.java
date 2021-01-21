// 632115503 Jeongmin Kim

package bicycle;

public class MountainBike extends Bicycle {
    int gear;
    int userApply;

    public MountainBike(String bicycleNum, int speed) {
        this.bicycleNum = bicycleNum;
        this.speed = speed;
    }

    public void speedUp() {
        speed = speed + gear * userApply;
        if (speed > 99) {
            System.out.println("** The speed of a bicycle cannot exceed 99 km/h **");
            speed = speed - gear * userApply;
        }
        else {
            System.out.println("Speed Up!!!");
            System.out.println("The speed of bicycle " + bicycleNum + " is " + speed + " km/h");
        }
    }

    public void brake() {
        speed = speed - 5;
        if (speed < 0) {
            System.out.println("** The speed of bicycle is 0 km/h **");
            System.out.println("** You cannot apply more brake **");
        }
        else {
            System.out.println("Brake!! Speed Down!!!");
            System.out.println("The speed of bicycle " + bicycleNum + " is " + speed + " km/h");
        }
    }
}
