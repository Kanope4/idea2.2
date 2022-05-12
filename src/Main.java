public class Main {

    public static void main(String[] args) {
        int account = 500;

        int replenishment = 1200;

        int bonuse = replenishment / 100;


        if (replenishment >= 1000) {
            bonuse = replenishment / 100;
        } else {
            bonuse = 0;
        }

        int total = account + replenishment + bonuse;


        System.out.println("Ваш баланс" + total);


    }
}


