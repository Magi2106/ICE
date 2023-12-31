package com.example.ice.Datamons;

import com.example.ice.Datamon;

public class Kevin implements Datamon {
    private String name;
    private int hp;
    private int BaseDamage;
    private String CreatureType;

    public Kevin(){
        this.name = "Kevin";
        this.hp = 100;
        this.BaseDamage = 5;
        this.CreatureType = "Ginger";
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
        if("Milf".equals(target.getCreatureType())){
            return getBaseDamage() - 4;
        } else {
            return getBaseDamage();
        }
    }

    @Override
    public String introduction() {
        return "A soulless Datamon appears, and it has.... red hair?";
    }
}
