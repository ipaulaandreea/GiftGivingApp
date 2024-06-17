package GiftGivingApp;


class BagFactory implements IBagFactory {
    private static BagFactory instance;


    private BagFactory() {
    }

    public static BagFactory getInstance() {
        if (instance == null) {
            instance = new BagFactory();
        }
        return instance;
    }

    @Override
    public IBag makeBag(String type) {
        return switch (type) {
            case "RANDOM" -> new BagRandom();
            case "FIFO" -> new BagFIFO();
            case "LIFO" -> new BagLIFO();
            default -> throw new IllegalArgumentException("Unsupported bag type: " + type);
        };
    }
}