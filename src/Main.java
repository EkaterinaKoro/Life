//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int price1 = 5_000;
        int miles1 = service.calculate(price1);
        System.out.println("Price: " + price1 + " -> Miles: " + miles1);

        int price2 = 15_000;
        int miles2 = service.calculate(price2);
        System.out.println("Price: " + price2 + " -> Miles: " + miles2);

        int price3 = 50_000;
        int miles3 = service.calculate(price3);
        System.out.println("Price: " + price3 + " -> Miles: " + miles3);
    }
}
