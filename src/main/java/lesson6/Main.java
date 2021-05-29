package lesson6;

public class Main {
    public static void main(String[] args) {
        Cat catBarsik = new Cat("Барсик", 2, "манчкин");
        catBarsik.run(150);
        System.out.println("jump: " + catBarsik.jump(1.5));
        if (catBarsik.jump(1.5) == true) {
            System.out.println(catBarsik.name + " перепрыгнул препятствие.");
        } else {
            System.out.println(catBarsik.name + " не хочет прыгать и недовольно мяукает.");
        }
        catBarsik.swim(2);
        System.out.println();

        Cat catMurzik = new Cat("Мурзик", 4, "метис");
        catMurzik.run(200);
        System.out.println("jump: " + catMurzik.jump(2));
        if (catMurzik.jump(2) == true) {
            System.out.println(catMurzik.name + " перепрыгнул препятствие.");
        } else {
            System.out.println(catMurzik.name + " не хочет прыгать и недовольно мяукает.");
        }
        catMurzik.swim(2);
        System.out.println();

        Cat catSimon = new Cat("Саймон", 6, "мейн-кун");
        catSimon.run(300);
        System.out.println("jump: " + catSimon.jump(2.5));
        if (catSimon.jump(2.5) == true) {
            System.out.println(catSimon.name + " перепрыгнул препятствие.");
        } else {
            System.out.println(catSimon.name + " не хочет прыгать и недовольно мяукает.");
        }
        catSimon.swim(2);
        System.out.println();

        Dog dogBobby = new Dog("Бобик", 4, "такса");
        dogBobby.run(500);
        System.out.println("jump: " + dogBobby.jump(1.5));
        if (dogBobby.jump(1.5) == true) {
            System.out.println(dogBobby.name + " перепрыгнул препятствие.");
        } else {
            System.out.println(dogBobby.name + " не может перепрыгнуть препятствие и протестующе лает.");
        }
        dogBobby.swim(10);
        System.out.println();

        Dog dogJack = new Dog("Джек", 6, "маламут");
        dogJack.run(600);
        System.out.println("jump: " + dogJack.jump(1.5));
        if (dogJack.jump(1.5) == true) {
            System.out.println(dogJack.name + " перепрыгнул препятствие.");
        } else {
            System.out.println(dogJack.name + " не может перепрыгнуть препятствие и протестующе лает.");
        }
        dogJack.swim(20);
    }
}