package catsMutants;
import java.util.Random;

public class Player extends Humanoid {

    public Player(String name, int hp, int baseDamage) {

        super(name, hp, baseDamage);
    }

    @Override
    public void prepareRound() {

        DamageType[] values = DamageType.values();
        Random randomChoice = new Random();

//        randomChoice.nextInt(values.length);

        int preparedAttack = randomChoice.nextInt(values.length);
        int preparedBlock = randomChoice.nextInt(values.length);
    }
}
