package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {
    List<MilitaryUnit> army = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        if (militaryUnit == null) {
            throw new IllegalArgumentException("The value is null");
        }
        army.add(militaryUnit);
    }

    public void damageAll(int damage) {
        List<MilitaryUnit> damagedOrDeadUnits = new ArrayList<>();
        for (MilitaryUnit unit : army) {
            unit.sufferDamage(damage);
            if (unit.getHitPoints() < 25) {
                damagedOrDeadUnits.add(unit);
            }
        }
        army.removeAll(damagedOrDeadUnits);
    }

    public int getArmyDamage() {
        int sumDamage = 0;
        for (MilitaryUnit unit : army) {
            sumDamage += unit.doDamage();
        }
        return sumDamage;
    }

    public int getArmySize() {
        return army.size();
    }

}
