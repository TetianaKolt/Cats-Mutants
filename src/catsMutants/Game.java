package catsMutants;

public class Game {
    public static void main(String[] args) {

    Player p1 = new Player("P1", 100, 30);
    CatMutant c1 = new CatMutant("C1", 150, 50);

    p1.prepareRound();
    c1.prepareRound();

    c1.attack(p1);
    }
}
