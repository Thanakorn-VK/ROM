import java.io.*;
import java.util.*;

public class Pecopeco extends Moster{
    public Pecopeco(){
        super.setName("Pecopeco");
        super.setDamage(-30);
        super.setImage("1.gif");
        super.setEXP(4);
    }
    public void showProperty(){
        System.out.println(""+super.getName()+"have EXP +"+getDamage());
    }
}