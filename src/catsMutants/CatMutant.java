package catsMutants;

import java.util.Random;

public class CatMutant extends Humanoid{

    public CatMutant(String name, int hp, int baseDamage) {

        super(name, hp, baseDamage);
    }

    @Override
    public void prepareRound() {
//        DamageType[] values = DamageType.values();
//        Random randomChoice = new Random();

//        randomChoice.nextInt(values.length);

//       preparedAttack = randomChoice.nextInt(values.length);
//       preparedBlock = randomChoice.nextInt(values.length);

        preparedAttack = DamageType.values()[new Random().nextInt(DamageType.values().length)];
        preparedBlock = DamageType.values()[new Random().nextInt(DamageType.values().length)];

    }


}
