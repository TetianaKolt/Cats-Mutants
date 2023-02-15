package catsMutants;

import java.util.HashMap;
import java.util.Map;

public class Humanoid {
    private int hp;
    private final int baseDamage;
    private final String name;

    DamageType preparedAttack = DamageType.HEAD;
    DamageType preparedBlock = DamageType.HEAD;


    Map<DamageType, Integer> damageTypeMultiplier = new HashMap<DamageType, Integer>() {{
        put(DamageType.HEAD, 50);
        put(DamageType.TORSO, 20);
        put(DamageType.LEGS, 30);
    }};

    Map<DamageType, Integer> damageTypeBlock = new HashMap<DamageType, Integer>(){{
        put(DamageType.HEAD, 70);
        put(DamageType.TORSO, 30);
        put(DamageType.LEGS, 55);
    }};

    public Humanoid(String name,int hp, int baseDamage) {
        this.name = name;
        this.hp = hp;
        this.baseDamage = baseDamage;
    }

    public boolean isDead() {
        return hp <= 0;
    }

    public void prepareRound() {}

    public void attack(Humanoid otherHumanoid) {

       double attackNumber = damageTypeMultiplier.get(preparedAttack);
        double damage = baseDamage+(baseDamage*(attackNumber/100));

        System.out.println(this.name + " attacks " + otherHumanoid.name + " with " +
        damage);

        otherHumanoid.receiveDamage(preparedAttack, (int) damage);

    }

    public void receiveDamage(DamageType atackType, int damage){
        if(atackType == preparedBlock){
            double decreaseDamage = damageTypeBlock.get(preparedBlock);
            damage-=damage*(decreaseDamage/100);
            System.out.println(name + " blocks attack for " + decreaseDamage);
        }
        hp -= damage;
        System.out.println(name + " receives " + damage + " damage ");
        System.out.println("HP = " + hp);
    }

}
