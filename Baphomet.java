import java.io.*;
import java.util.*;

public class Baphomet extends Moster{
    public Baphomet(){
        super.setName("Baphomet");
        super.setDamage(-800);
        super.setImage("5.gif");
        super.setEXP(8);
    }
    public void showProperty(){
        System.out.println(""+super.getName()+"have EXP +"+getDamage());
    }
}