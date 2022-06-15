public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m = 96.5;
        double h = 1.84;
        double BMIndex = service.calculate(m, h);
        System.out.printf("Ваш индекс массы тела:" + "%.2f", BMIndex);
    }
}
