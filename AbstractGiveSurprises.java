package GiftGivingApp;
import java.util.concurrent.TimeUnit;


public abstract class AbstractGiveSurprises {
     int waitTime;
     IBag bag;

    public AbstractGiveSurprises(String type, int waitTime) {
        BagFactory bagFactory = BagFactory.getInstance();
        this.bag = bagFactory.makeBag(type);
        this.waitTime = waitTime;

    }
    public void put(ISurprise newSurprise) {
        bag.put(newSurprise);
    }

    public void put(IBag surprises) {
        while (!surprises.isEmpty()){
            bag.put(surprises.takeOut());
        }
    }

    public void give() {
       ISurprise removedItem =  bag.takeOut();
       removedItem.enjoy();
        giveWithPassion();


    }

    public void giveAll() {
        while (!bag.isEmpty()){
            ISurprise removedItem =  bag.takeOut();
            removedItem.enjoy();
            giveWithPassion();
        }
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public boolean isEmpty() {
        return bag.isEmpty();
    }

    abstract void giveWithPassion();
}
