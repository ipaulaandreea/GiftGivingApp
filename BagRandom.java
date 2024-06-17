package GiftGivingApp;

import java.util.ArrayList;

class BagRandom implements IBag {
    ArrayList <ISurprise> bag = new ArrayList<>();
    BagRandom() {

    }


    @Override
    public void put(ISurprise newSurprise) {
        bag.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        while(!bagOfSurprises.isEmpty()){
            bag.add(bagOfSurprises.takeOut());
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
