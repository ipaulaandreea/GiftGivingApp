package GiftGivingApp;

import java.util.ArrayList;

class BagRandom implements IBag {
    ArrayList <ISurprise> bag = new ArrayList<>();
    BagRandom() {
        System.out.println("Random Bag created!");

    }


    @Override
    public void put(ISurprise newSurprise) {
        bag.add(newSurprise);
        System.out.println("Added "+newSurprise.toString()+" to Random Bag");
    }

    @Override
    public void put(IBag bagOfSurprises) {
        while(!bagOfSurprises.isEmpty()){
            bag.add(bagOfSurprises.takeOut());
        }
        System.out.println("Random Bag now contains:");
        for (ISurprise surprise : bag){
            System.out.println(surprise.toString());
        }

    }

    @Override
    public ISurprise takeOut() {
        int randomIndex = (int) (Math.random() * bag.size());
        ISurprise removedSurprise =  bag.remove(randomIndex);
        return removedSurprise;
    }

    @Override
    public boolean isEmpty() {
        return bag.isEmpty();
    }

    @Override
    public int size() {
        return bag.size();
    }
}
