package lesson7;

public class Plate {
    private int food;
    private int maxVolume = 10;
    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (0 <= food) {
            this.food = food;
        } else {
            System.out.println("Incorrect value.");
        }
    }

    public boolean decreaseFood(int n) {
        if (n <= food) {
            food -= n;
            return true;
        } else {
            System.out.println("Not enough food.");
            return false;
        }
    }

    public void info() {
        System.out.println("Plate: " + food);
    }

    public void filling(int n) {
        if (food < maxVolume) {
            food += n;
            if (food > maxVolume) {
                food = maxVolume;
            }
        } else {
            System.out.println("The plate is full of food.");
        }
    }
}
