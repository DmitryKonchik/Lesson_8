public class Dog extends Animal{
    @Override
    public void voice() {
        super.voice();
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
}
