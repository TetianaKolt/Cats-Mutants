package catsMutants;

import java.util.Random;

public class CatMutant extends Humanoid{

    private String name;
    public CatMutant(String name, int hp, int baseDamage) {
        super(name, hp, baseDamage);
    }

    public String getCatMutantName(){
        return name;
    }

    @Override
    public void prepareRound() {
        preparedAttack = DamageType.values()[new Random().nextInt(DamageType.values().length)];
        preparedBlock = DamageType.values()[new Random().nextInt(DamageType.values().length)];

    }


}
