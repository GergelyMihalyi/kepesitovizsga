package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    private int hitPoints;
    private int attackDamage;
    private boolean armor;

    public MilitaryUnit(int hitPoints, int attackDamage, boolean armor) {
        this.hitPoints = hitPoints;
        this.attackDamage = attackDamage;
        this.armor = armor;
    }

    public int doDamage() {
        return attackDamage;
    }

    public void sufferDamage(int damage) {
        if (armor) {
            damage = damage / 2;
        }

        hitPoints = hitPoints - damage;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public boolean isArmor() {
        return armor;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public void setArmor(boolean armor) {
        this.armor = armor;
    }
}
