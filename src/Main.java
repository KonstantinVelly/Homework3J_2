public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m = 101;
        double h = 1.84;
        double bodyIndex = service.calculate(m, h);
        System.out.printf("Ваш индекс массы тела:" + "%.2f", bodyIndex);
    }
}
