class Enemy extends GameCharacter {
    public Enemy(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println(getName() + " lashes out at " + target.getName() + " with a venomous Snake Bite!");
        target.setHealth(target.getHealth() - 15);
        System.out.println(target.getName() + " now has " + target.getHealth() + " health remaining.");
    }
}