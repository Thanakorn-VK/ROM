import java.io.*;
import java.util.*;

public class HPPotion extends Item{
    public HPPotion(){
        super.setName("Potion");
        super.setProperty(50);
    }
    public void showProperty(){
        System.out.println(""+super.getName()+"have HP +"+getProperty());
    }
}