import java.io.*;
import java.util.*;

public class Novice
{   
    private int HP;
    private int EXP;
    private int LEVEL;
    private String NAME;
    private int KILL;

    public Novice(){
        HP = 500;
        EXP = 0;
        LEVEL = 1;
        NAME = "NOVICE";
        KILL = 0;
    }
    public void att(int exp){
        KILL = KILL + 1;
        //HP = HP - 24;
        EXP = EXP + exp;
        //if (EXP >= 5)
        while(EXP >= 10){
            LEVEL = LEVEL + 1;
            HP = HP + 100;
            EXP-= 10; // EXP = EXP - 5;
        }
    }
    public void dead(){
        HP = 0;
    }
    public void heal(int heal){
        HP += heal;
    }
    public void hit(){
        HP = HP - 50;
    }
    public void bootExp(int boot){
        EXP = EXP + boot;
        while(EXP >= 10){
            LEVEL = LEVEL + 1;
            HP = HP + 100;
            EXP-= 10; // EXP = EXP - 5;
        }
    }

    // ----------------------------------------------
    public int getKILL(){
        return KILL;
    }
    public String getNAME(){
        return NAME;
    }
    public int getHP(){
        return HP;
    }

    public int getEXP(){
        return EXP;
    }

    public int getLEVEL(){
        return LEVEL;
    }
    /*public void getSkill(){

    }*/
    public void setHP(int hp){
        HP = hp;
    }

    public void setEXP(int exp){
        EXP = exp;
    }

    public void setLEVEL(int level){
        LEVEL = level;
    }
    public void changeHP(int hp){
        HP = HP - hp;
    }
    public void changeEXP(int exp){
        EXP = EXP + exp;
        while(EXP >= 10){
            LEVEL = LEVEL + 1;
            HP = HP + 100;
            EXP-= 10; // EXP = EXP - 5;
        }
    }
    public void setName(String name){
        this.NAME = name;
    }
    /*public void changeLEVEL(int level){

    }*/
}