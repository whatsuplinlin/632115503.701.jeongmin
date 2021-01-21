// 632115503 Jeongmin Kim

package bicycle;

public class Main {
    public static void main(String[] args) {
        NormalBicycle normalBi = new NormalBicycle("1", 5);

        normalBi.currentSpeed();
        normalBi.brake();
        normalBi.speedUp();

        System.out.println(" ");

        MountainBike mountainBi = new MountainBike("2", 90);

        mountainBi.currentSpeed();
        mountainBi.gear = 2;
        mountainBi.userApply = 5;
        mountainBi.speedUp();
        mountainBi.userApply = 2;
        mountainBi.speedUp();
        mountainBi.brake();
    }
}