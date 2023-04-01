public class Main {
    public static void main(String[] args) {
        int initialBalance = 522;
        int addend = 1900;

        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;
        }
        int FinalBlance = initialBalance + addend + bonus;
        System.out.println("итоговый бонус :" + FinalBlance);
        System.out.println("бонус:" + bonus);


    }
}
