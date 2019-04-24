import java.io.*;
import java.util.*;

public class LordKnight extends Novice
{   
    public void setLordKnight(int hp,int exp,int level){
        super.setHP(hp+200);
        super.setEXP(exp);
        super.setLEVEL(level);
        super.setName("LORDKNIGHT");
    }

    public void BowlingBash(){
        super.changeHP(60);
        super.changeEXP(3);
    }

}