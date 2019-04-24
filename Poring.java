import java.io.*;
import java.util.*;

public class Poring extends Moster{
    public Poring(){
        super.setName("Poring");
        super.setDamage(-1);
        super.setImage("4.gif");
        super.setEXP(1);
    }
    public void showProperty(){
        System.out.println(""+super.getName()+"have EXP +"+getDamage());
    }
}