package GiftGivingApp;

import java.util.ArrayList;

interface IBag {

    void put(ISurprise newSurprise);

    void put(IBag bagOfSurprises);

    ISurprise takeOut();

    boolean isEmpty();

    int size();


}
