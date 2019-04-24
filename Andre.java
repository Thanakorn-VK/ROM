import java.io.*;
import java.util.*;

public class Andre extends Moster{
    public Andre(){
        super.setName("Andre");
        super.setDamage(-20);
        super.setImage("3.gif");
        super.setEXP(2);
    }
    public void showProperty(){
        System.out.println(""+super.getName()+"have EXP +"+getDamage());
    }
}