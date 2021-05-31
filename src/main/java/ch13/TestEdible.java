package ch13;

/**
 * @author jimmy xu
 * @date 2021/5/28 11:06
 */
public class TestEdible {
    public static void main(String[] args) {
        Object[] objects = {new Tiger(), new Chicken(), new Apple()};
        for (Object object : objects) {
            if (object instanceof Edible) System.out.println(((Edible) object).howToEat());
            if (object instanceof Animal) System.out.println(((Animal) object).sound());
        }
    }


    static abstract class Animal {
        public abstract String sound();
    }

    static class Chicken extends Animal implements Edible {

        @Override
        public String howToEat() {
            return "chicken: fry it";
        }

        @Override
        public String sound() {
            return "chicken: cock-a-doodle-doo";
        }
    }

    static class Tiger extends Animal {

        @Override
        public String sound() {
            return "tiger: RROOAARR";
        }
    }

    static abstract class Fruit implements Edible {

    }

    static class Apple extends Fruit {

        @Override
        public String howToEat() {
            return "apple: make apple cider";
        }
    }

    static class Orange extends Fruit {

        @Override
        public String howToEat() {
            return "orange: make orange juice";
        }
    }
}
