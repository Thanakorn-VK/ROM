import java.io.*;
import java.util.*;

public class Knight extends Novice
{   
    public void setKnight(int hp,int exp,int level){
        super.setHP(hp+200);
        super.setEXP(exp);
        super.setLEVEL(level);
        super.setName("KNIGHT");
    }

    public void BowlingBash(){
        super.changeHP(60);
        super.changeEXP(3);
    }

}