public class Main {
    public static void main(String[] args) {

        Animal tiger = new Tiger();
        Animal rabbit = new Rabbit();
        tiger.eat("Meat");
        tiger.eat("meat");
        tiger.eat("grass");
        tiger.voice();
        rabbit.voice();
        rabbit.eat("grass");

        //
        Dog.eat1("Meat");
        Dog.voice1();

    }
}