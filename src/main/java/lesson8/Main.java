package lesson8;

public class Main {
    public static void main(String[] args) {
        Object[] members = new Object[6];
        for (int i = 0; i < members.length; i++) {
            if (i < members.length / 3) {
                members[i] = new Human("Human" + (i+1));
            } else if (i < (members.length / 3) * 2) {
                members[i] = new Cat("Cat" + (i+1));
            } else {
                members[i] = new Robot("Robot" + (i+1));
            }
        }

        Treadmill[] treadmills = new Treadmill[4];
        for (int i = 0; i < treadmills.length; i++) {
            treadmills[i] = new Treadmill();
        }

        Wall[] walls = new Wall[4];
        for (int i = 0; i < walls.length; i++) {
            walls[i] = new Wall();
        }

        for (Object member : members) {
            if (member instanceof Running) {
                Running running = (Running) member;
                for (int i = 0; i < treadmills.length; i++) {
                    running.run(treadmills[i]);
                }
            }
            System.out.println();
            if (member instanceof Jumping) {
                Jumping jumping = (Jumping) member;
                for (int i = 0; i < walls.length; i++) {
                    jumping.jump(walls[i]);
                }
            }
            System.out.println();
        }

    }
}
