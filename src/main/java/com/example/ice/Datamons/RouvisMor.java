package com.example.ice.Datamons;

import com.example.ice.Datamon;

public class RouvisMor implements Datamon {

    private String name;
    private int hp;
    private int BaseDamage;
    private String CreatureType;

    public RouvisMor(){
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
    public int getHP() {
        return hp;
    }

    @Override
    public void setHP(int hp) {
        this.hp = hp;
    }

    @Override
    public int getBaseDamage() {
        return BaseDamage;
    }

    @Override
    public String getCreatureType() {
        return CreatureType;
    }

    @Override
    public int DamageBuff(Datamon target) {
        if("Ginger".equals(target.getCreatureType())){
            return getBaseDamage() +10;
        } else {
            return getBaseDamage();
        }
    }

    @Override
    public String introduction() {
        return "A hot milf appears in the wild. Her soul is kind, and her smile lights up the world";
    }
}
