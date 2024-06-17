package GiftGivingApp;

import java.util.ArrayList;
import java.util.LinkedList;

class BagFIFO implements IBag {

    LinkedList<ISurprise> bag = new LinkedList<>();

    BagFIFO() {
    }

    @Override
    public void put(ISurprise newSurprise) {
        bag.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        while (!bagOfSurprises.isEmpty()){
            bag.add(bagOfSurprises.takeOut());
        }
    }

    @Override
    public ISurprise takeOut() {
        ISurprise removedSurprise = bag.removeFirst();
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
