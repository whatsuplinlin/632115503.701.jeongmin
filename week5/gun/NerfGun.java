// 632115503 JEONGMIN KIM

package gun;

public class NerfGun {
    private int numOfAmmunition = 0;
    private int ID = 0;

    public NerfGun() {
        this.ID = 1;
    }
    
    public NerfGun(int n) {
        this.numOfAmmunition = n;
        this.ID = 2;
    }

    public void fire() {
        if (numOfAmmunition == 0)
            System.out.println("There is no ammunition");
        else {
            System.out.println("BANG !!!");
            numOfAmmunition--;
        }
    }

    public void reload(int n) {
        numOfAmmunition = numOfAmmunition + n;
        if (numOfAmmunition > 15) {
            System.out.println("Error!! the ammunition is overload");
            numOfAmmunition = numOfAmmunition - n;
        }
    }

    public void displayNumOfAmmunition() {
        System.out.println(numOfAmmunition + " bullet left");
    }

    public void displayGunID() {
        System.out.println("The ID of this gun is " + ID);
    }

}