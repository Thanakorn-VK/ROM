import java.io.*;
import java.util.*;

public class Magnolia extends Moster{
    public Magnolia(){
        super.setName("Magnolia");
        super.setDamage(-20);
        super.setImage("8.gif");
        super.setEXP(4);
    }
    public void showProperty(){
        System.out.println(""+super.getName()+"have EXP +"+getDamage());
    }
}