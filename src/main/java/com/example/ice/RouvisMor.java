package com.example.ice;

public class RouvisMor implements Datamon{

    private String name;
    private double hp;
    private int BaseDamage;
    private String CreatureType;

    RouvisMor(){
        this.name = "Henriette";
        this.hp = 300;
        this.BaseDamage = 10;
        this.CreatureType = "Milf";
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getHP() {
        return hp;
    }

    @Override
    public void setHP(int hp) {
        this.hp = hp;
    }

    @Override
    public double getBaseDamage() {
        return BaseDamage;
    }

    @Override
    public String getCreatureType() {
        return CreatureType;
    }
    @Override
    public double Damagebuff(Datamon target) {
        if("Ginger".equals(target.getCreatureType())){
            return getBaseDamage()*1.5;
        } else {
            return getBaseDamage();
        }
    }

    @Override
    public double takedamage(double damage) {
        return hp-= damage;
    }

    @Override
    public String introduction() {
        return "A hot milf appears in the wild. Her soul is kind, and her smile light up the world";
    }

    public void TeenSeduction(Datamon target){
        double damageDealt = 2*getBaseDamage();
        target.takedamage(damageDealt);
    }

}
