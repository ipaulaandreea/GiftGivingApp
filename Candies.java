package GiftGivingApp;

import java.util.Random;

class Candies implements ISurprise {
    private static final String[] candyTypes = {
            "chocolate", "jelly", "fruits", "vanilla"
    };
    int num;
    String type;


    public Candies(int num, String type) {
       this.num = num;
       this.type = type;
    }

    @Override
    public void enjoy() {
        System.out.println("You received " + this.num + " " + this.type + " candies.");
    }

    @Override
    public String toString() {
        return "[Candies] number = " +
                num + ", type = " + type;
    }

    public static Candies generate() {
        Random randomNumber = new Random();
        Random randomType = new Random();
        return new Candies(randomNumber.nextInt(20),
                candyTypes[randomType.nextInt(candyTypes.length)]);
    }
}
