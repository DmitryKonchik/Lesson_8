public class Rabbit extends Animal{
    @Override
    public void voice() {
        System.out.println("Кролик издает звук");
    }

    @Override
    public void eat(String food) {
        System.out.println("Кролик кушает " + food);
        if ( food.equalsIgnoreCase("grass")) {
            System.out.println("Кролик доволен");
        } else {
            System.out.println("Кролик хочет травы");
        }
    }
}
