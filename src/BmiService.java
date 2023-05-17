public class BmiService {
    public double calculate(int heft, double height){
        double body;
        body = heft / (height * height);
        return body;
    }
}
