package catsMutants;

import static catsMutants.UserInput.takeUserAnswer;

public class Player extends Humanoid {


    public Player(String name, int hp, int baseDamage) {
        super(UserInput.enterName(), hp, baseDamage);
    }

    @Override
    public void prepareRound() {
        wannaBooster();
        UserInput.takeUserInputAttack();
        UserInput.takeUserInputBlock();
    }

    private void wannaBooster() {
        if (super.getHp() < (super.getHp() * 0.6)) {
            System.out.println("Wanna boost your HP? Press 'Y' if yes, press 'N', if not");
            String answer = takeUserAnswer();
            if (answer.equals("Yes")) {
                takeHealthBooster();
            } else {
                System.out.println("Your choice...");
            }
        }
    }

    public int takeHealthBooster() {
        return super.getHp() + 20;
    }
}
