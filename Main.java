public class Main {
    public static void main (String[] args){
        BmiService imt = new BmiService();
        double mass = 90;
        double height  = 182;
        System.out.println(imt.calculate(mass, height));
    }
}