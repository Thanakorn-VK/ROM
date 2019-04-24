import java.io.*;
import java.util.*;

public class HighWizard extends Novice
{   
    public void setHighWizard(int hp,int exp,int level){
        super.setHP(hp+200);
        super.setEXP(exp);
        super.setLEVEL(level);
        super.setName("HIGHWIZARD");
    }

    public void BowlingBash(){
        super.changeHP(60);
        super.changeEXP(3);
    }

}