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
            case "BagRandom" -> new BagRandom();
            case "BagFIFO" -> new BagFIFO();
            case "BagLIFO" -> new BagLIFO();
            default -> throw new IllegalArgumentException("Unsupported bag type: " + type);
        };
    }
}