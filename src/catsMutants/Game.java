package catsMutants;


import static catsMutants.Service.fight;
import static catsMutants.Service.initCatMutantBoss;
import static catsMutants.Service.initCatMutantJunior;
import static catsMutants.Service.initCatMutantMiddle;
import static catsMutants.Service.initPlayer;

public class Game {

  public static void main(String[] args) {

    Player p1 = initPlayer();
    CatMutant c1 = initCatMutantJunior();
    CatMutant c2 = initCatMutantMiddle();
    CatMutant c3 = initCatMutantBoss();

    fight(p1, c1);
    fight(p1, c2);
    fight(p1, c3);

  }
}
