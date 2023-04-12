package catsMutants;

import static catsMutants.UserInput.takeUserAnswer;

public class Player extends Humanoid {

  private String name;
  private int hp;
  private int baseDamage;


  public Player(String name, int hp, int baseDamage) {
    super(UserInput.enterName(), hp, baseDamage);
    this.name = name;
    this.hp = hp;
    this.baseDamage = baseDamage;
  }

  @Override
  public void prepareRound() {
    wannaBooster();
    UserInput.takeUserInputAttack();
    UserInput.takeUserInputBlock();
  }

  public void wannaBooster() {
    if (this.hp < (this.hp * 0.6)) {
      System.out.println("Wanna boost your HP? Press 'Y' if yes, press 'N', if not");
      String answer = takeUserAnswer();
      if (answer.equals("Yes")) {
        takeHealthBooster();
      } else {
        System.out.println("Your choice...");
      }
    }
  }

  public void takeHealthBooster() {
    this.hp += 20;
  }
}
