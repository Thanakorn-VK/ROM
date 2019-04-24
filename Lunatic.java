import java.io.*;
import java.util.*;

public class Lunatic extends Moster{
    public Lunatic(){
        super.setName("Lunatic");
        super.setDamage(-16);
        super.setImage("2.gif");
        super.setEXP(2);
    }
    public void showProperty(){
        System.out.println(""+super.getName()+"have EXP +"+getDamage());
    }
}