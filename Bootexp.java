import java.io.*;
import java.util.*;

public class Bootexp extends Item{
    public Bootexp(){
        super.setName("EXP-Potion");
        super.setProperty(4);
    }
    public void showProperty(){
        System.out.println(""+super.getName()+"have EXP +"+getProperty());
    }
}