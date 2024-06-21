package GiftGivingApp;

import java.util.ArrayList;
import java.util.LinkedList;

class BagLIFO implements IBag {
    LinkedList<ISurprise> bag = new LinkedList<>();

    BagLIFO() {
        System.out.println("LIFO Bag created!");
    }

    @Override
    public void put(ISurprise newSurprise) {
        bag.add(newSurprise);
        System.out.println("Added "+newSurprise.toString()+" to LIFO Bag");
    }

    @Override
    public void put(IBag bagOfSurprises) {
        while(!bagOfSurprises.isEmpty()){
            bag.add(bagOfSurprises.takeOut());
        }
        System.out.println("LIFO Bag now contains:");
        for (ISurprise surprise : bag){
            System.out.println(surprise.toString());
        }

    }

    @Override
    public ISurprise takeOut() {
        return bag.removeLast();

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
