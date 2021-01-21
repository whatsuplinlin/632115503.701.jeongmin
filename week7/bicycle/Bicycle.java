// 632115503 Jeongmin Kim

package bicycle;

public class Bicycle {
    String bicycleNum;
    int speed;

    public Bicycle() {

    }

    public Bicycle(String bicycleNum, int speed) {
        this.bicycleNum = bicycleNum;
        this.speed = speed;
    }

    public void currentSpeed() {
        System.out.println("The speed of bicycle " + bicycleNum + " is " + speed + " km/h");
    }
}