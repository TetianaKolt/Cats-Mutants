package catsMutants;

import java.util.Random;

public class CatMutant extends Humanoid{

    public CatMutant(String name, int hp, int baseDamage) {

        super(name, hp, baseDamage);
    }

    @Override
    public void prepareRound() {
        preparedAttack = DamageType.values()[new Random().nextInt(DamageType.values().length)];
        preparedBlock = DamageType.values()[new Random().nextInt(DamageType.values().length)];

    }


}
