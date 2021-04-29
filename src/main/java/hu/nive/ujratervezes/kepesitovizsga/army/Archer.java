package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends MilitaryUnit {

    public static final int HIT_POINTS = 50;
    public static final int ATTACK_DAMAGE = 20;
    public static final boolean ARMOR = false;

    public Archer() {
        super(HIT_POINTS, ATTACK_DAMAGE, ARMOR);
    }
}
