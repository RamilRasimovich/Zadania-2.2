public class Main {
    public static void main(String[] args) {
        int initialbalance = 522;
        int addend = 1900;

        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;
        }
        int Finalblance = initialbalance + addend + bonus;
        System.out.println("итоговый бонус :" + Finalblance);
        System.out.println("бонус:" + bonus);


    }
}
