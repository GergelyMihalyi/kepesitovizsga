package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {
    public static final int HIT_POINTS = 100;
    public static final int ATTACK_DAMAGE = 10;
    private boolean shield;

    public Swordsman(boolean armor) {
        super(HIT_POINTS, ATTACK_DAMAGE, armor);
        shield = true;
    }

    public void sufferDamage(int damage) {
        if (shield) {
            damage = 0;
            shield = false;
        } else {
            if (isArmor()) {
                damage = damage / 2;
            }
        }

        int hitPoints = getHitPoints() - damage;
        setHitPoints(hitPoints);
    }

}
