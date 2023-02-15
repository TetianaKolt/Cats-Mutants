package catsMutants;

import java.util.Scanner;

public class Player extends Humanoid {

    public Player(String name, int hp, int baseDamage) {

        super(name, hp, baseDamage);
    }

    @Override
    public void prepareRound() {

        //// додати новий метод сюди
//        preparedAttack = DamageType.HEAD;
//        preparedBlock = DamageType.TORSO;

        UserInput.takeUserInputAttack();
        UserInput.takeUserInputBlock();


//        preparedAttack = DamageType.values()[enteredAttack-1];
//        preparedBlock = DamageType.values()[enteredBlock-1];

    }
}
