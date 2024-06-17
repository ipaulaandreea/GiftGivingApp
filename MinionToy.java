package GiftGivingApp;

class MinionToy implements ISurprise {

    private static final String[] names = { "Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim" };
    private String name;
    private static int lastMinionIndex = 0;

    public MinionToy(String name) {
        this.name = name;
    }

    @Override
    public void enjoy() {
        System.out.println("You got a minion named "+ this.name+"!");
    }

    @Override
    public String toString() {
        return "[Minion] name = " + name ;
    }

    public static MinionToy generate() {
        String chosenMinion = names[lastMinionIndex];
        lastMinionIndex = (lastMinionIndex+1) % names.length;
        return new MinionToy(chosenMinion);
    }
}
