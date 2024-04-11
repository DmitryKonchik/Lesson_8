public class Dog extends Animal{


    private Dog() {}          // Приватный конструктор, который запрещает создание класса

    @Override
    public void voice() {
        System.out.println("Собака гавкает");
    }

    @Override
    public void eat(String food) {
        System.out.println("Собака кушает " + food);
        if ( food.equalsIgnoreCase("meat")) {
            System.out.println("Собака довольна");
        } else {
            System.out.println("Собака хочет мяса");
        }
    }
    // Статические методы для доп задания
    public static void eat1(String food) {
        System.out.println("Собака кушает " + food);
        if ( food.equalsIgnoreCase("meat")) {
            System.out.println("Собака довольна");
        } else {
            System.out.println("Собака хочет мяса");
        }
    }
    public static void voice1() {
        System.out.println("Собака гавкает");
    }
}
