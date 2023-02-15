package catsMutants;


public class Game {
    public static void main(String[] args) {


        Player p1 = new Player("P1", 100, 30);
        CatMutant c1 = new CatMutant("C1", 150, 50);


        for (int i = 0;i<5 && !p1.isDead() && !c1.isDead(); i++) {
            int round = i+1;
            System.out.println("Round number " + round);
            p1.prepareRound();
            c1.prepareRound();

            System.out.println();
            System.out.println("Let's fight!");


            p1.attack(c1);
            c1.attack(p1);
            System.out.println();
        }
    }

//    public static void init(){
//        Player player = new Player(UserInput.enterName(),150,30);
//        CatMutant catMutantJunior = new CatMutant("Junior Cat", 100,15);
//        CatMutant catMutantMiddle = new CatMutant("Middle Cat", 150, 30);
//        CatMutant catMutantBoss = new CatMutant("Boss Cat", 200,50);
//
//    }
}
