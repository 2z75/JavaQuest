class CandyCount {

//      réel money ← 12.4; 
//    réel price ← 1.2
//    entier candies ← 0
//    Si money > 0 ET price > 0
//        Tant que (money - price) >= 0
//            candies ← candies + 1
//            money ← money - price
//        Fin Tant que
//    Fin Si
//    afficher candies


    public static void main(String[] args) {
        double money = 12.4;
        double price = 1.2;
        int candies = 0;

        if (money > 0 && price > 0) {
            while ( money - price >= 0) {
                candies = candies + 1;
                money = money - price;
            }
        }
        System.out.println(candies);
    }
}