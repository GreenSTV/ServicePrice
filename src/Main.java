public class Main {
    public static void main(String[] args){
        BmiService service = new BmiService();
        int heft = 98;
        double height = 1.87;
        double weight = service.calculate(heft, height);

        int dog  = (int) weight;
        System.out.println(dog);

    }
}
