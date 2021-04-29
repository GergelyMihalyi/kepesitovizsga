package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit {
    public static final int HIT_POINTS = 150;
    public static final int ATTACK_DAMAGE = 20;
    public static final boolean ARMOR = true;
    private int attackCounter;

    public HeavyCavalry() {
        super(HIT_POINTS, ATTACK_DAMAGE, ARMOR);
        attackCounter = 0;
    }

    public int doDamage() {
        int attackDamage = getAttackDamage();
        if (attackCounter == 0) {
            attackDamage = attackDamage * 3;
        }
        attackCounter++;
        return attackDamage;
    }
}
