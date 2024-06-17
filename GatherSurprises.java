package GiftGivingApp;

import java.util.ArrayList;

final class GatherSurprises {

    static ArrayList<ISurprise> surprises = new ArrayList<>();

    private GatherSurprises() {
    }

    public static ISurprise[] gather(int n) {
        return new ISurprise[n];
    }

    public static ISurprise gather() {
        int randomIndex = (int) (Math.random() * surprises.size());
       return surprises.get(randomIndex);
    }
}
