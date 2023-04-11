package catsMutants;

public class Service {

  public static Player initPlayer() {
    return new Player(UserInput.enterName(), 300, 50);
  }

  public static CatMutant initCatMutantJunior() {
    return new CatMutant("Junior Cat", 100, 15);
  }

  public static CatMutant initCatMutantMiddle() {
    return new CatMutant("Middle Cat", 150, 30);
  }

  public static CatMutant initCatMutantBoss() {
    return new CatMutant("Boss Cat", 200, 50);
  }

  public static void fight(Player player, CatMutant catMutant) {
    for (int i = 0; i < 5 && !player.isDead() && !catMutant.isDead(); i++) {
      int round = i + 1;
      player.wannaBooster();
      System.out.println("Round number " + round);
      player.prepareRound();
      catMutant.prepareRound();

      System.out.println();
      System.out.println("Let's fight!");

      player.attack(catMutant);
      catMutant.attack(player);
      System.out.println();

      if(player.isDead()){
        System.out.println("The player is dead. Cats-mutants will conquer the world!");
      }
      else {
        System.out.println(catMutant.getCatMutantName() + " is dead. The player wins!");
      }
    }
  }


}
