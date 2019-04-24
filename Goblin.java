import java.io.*;
import java.util.*;

public class Goblin extends Moster{
    public Goblin(){
        super.setName("Goblin");
        super.setDamage(-17);
        super.setImage("7.gif");
        super.setEXP(2);
    }
    public void showProperty(){
        System.out.println(""+super.getName()+"have EXP +"+getDamage());
    }
}