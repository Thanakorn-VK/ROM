import java.io.*;
import java.util.*;

public class Moster{
    private String name;
    private int damage;
    private String image;
    private int exp;

    public int getEXP(){
        return exp;
    }
    public String getImage(){
        return image;
    }
    public String getName(){
        return name;
    }
    public int getDamage(){
        return damage;
    }
    public void setImage(String image){
        this.image = image;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDamage(int damage){
        this.damage = damage;
    }
    public void setEXP(int exp){
        this.exp = exp;
    }

}