package lesson8;

import lesson8.barriers.Treadmill;
import lesson8.barriers.Wall;
import lesson8.interfaces.Barrier;
import lesson8.interfaces.Members;
import lesson8.members.Cat;
import lesson8.members.Human;
import lesson8.members.Robot;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Members> members = new ArrayList<>();
        Object[] member = new Object[6];
        for (int i = 0; i < member.length; i++) {
            if (i < member.length / 3) {
                member[i] = new Human("Human" + (i+1));
                members.add((Members) member[i]);
            } else if (i < (member.length / 3) * 2) {
                member[i] = new Cat("Cat" + (i+1));
                members.add((Members) member[i]);
            } else {
                member[i] = new Robot("Robot" + (i+1));
                members.add((Members) member[i]);
            }
        }

        ArrayList<Barrier> barriers = new ArrayList<>();
        Treadmill[] treadmills = new Treadmill[2];
        for (int i = 0; i < treadmills.length; i++) {
            treadmills[i] = new Treadmill();
            barriers.add(treadmills[i]);
        }
        Wall[] walls = new Wall[4];
        for (int i = 0; i < walls.length; i++) {
            walls[i] = new Wall();
            barriers.add(walls[i]);
        }

        for (Members m : members) {
            boolean isContinue = true;
            for (Barrier b : barriers) {
                if (b instanceof Treadmill) {
                    isContinue = m.run((Treadmill) b);
                } else if (b instanceof Wall) {
                    isContinue = m.jump((Wall) b);
                }
                if (!isContinue){
                    break;
                }
            }
            if (isContinue) {
                System.out.println(m.getName() + " завершил полосу препятствий");
            } else {
                System.out.println(m.getName() + " сошёл с дистанции");
            }
            System.out.println();
        }

    }
}
