import java.io.*;
import java.util.*;

public class Ghostring extends Moster{
    public Ghostring(){
        super.setName("Ghostring");
        super.setDamage(-23);
        super.setImage("6.gif");
        super.setEXP(3);
    }
    public void showProperty(){
        System.out.println(""+super.getName()+"have EXP +"+getDamage());
    }
}