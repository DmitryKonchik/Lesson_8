public class Tiger extends Animal{
    @Override
    public void voice() {
        System.out.println("Тигр издает звук");
    }

    @Override
    public void eat(String food) {
        System.out.println("Тигр кушает " + food);
        if ( food.equalsIgnoreCase("meat")) {
            System.out.println("Тигр доволен");
        } else {
            System.out.println("Тигр хочет мяса");
        }
    }
}
