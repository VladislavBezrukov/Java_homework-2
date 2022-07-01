public class Main {
    public static void main(String[] args) {
        int price = 521; // стоймоть билета
        int bonusAmount = 20; // стоймость одной мили

        int bonus = price / bonusAmount;

        System.out.println("Итоговый бонус: " + bonus);
    }
}
