package day11.task2;


public abstract class Hero implements PhysAtt{

    int health;
    double physDef;
    double magicDef;
    int physAtt;
    int magicAtt;
    final int MIN_HEALTH = 0;
    final int MAX_HEALTH = 100;

    @Override
    public void physicalAttack(Hero hero) {
        double attackScore = physAtt * (1 - hero.physDef);
        if (hero.health - attackScore < MIN_HEALTH){
            hero.health = MIN_HEALTH;
        }
        else {
            hero.health -= attackScore;
        }
    }


    public Hero() {
        health = 100;
    }
}
