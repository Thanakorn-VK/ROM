import java.io.*;
import java.util.*;

public class Mosters {
    ArrayList<Moster> mosters;
    Random random = new Random();
    public Mosters(){
        mosters = new ArrayList<Moster>();
    }
    public void spawnmoster(){
        int number;
        number = random.nextInt(20);
        if(number == 0){
            mosters.add(new Baphomet());
        }
        else {
            int number2 = random.nextInt(7);
            if(number2 == 0){ 
                mosters.add(new Andre());
            }
            else if(number2 == 1){ 
                mosters.add(new Poring());
            }
            else if(number2 == 2){ 
                mosters.add(new Pecopeco());
            }
            else if(number2 == 3){ 
                mosters.add(new Lunatic());
            }
            else if(number2 == 4){ 
                mosters.add(new Ghostring());
            }
            else if(number2 == 5){ 
                mosters.add(new Goblin());
            }
            else if(number2 == 6){ 
                mosters.add(new Magnolia());
            }
        }
    }
    public String getImage(int index){
        String image = mosters.get(index).getImage();
        return image;
    }
    public String getName(int index){
        String name = mosters.get(index).getName();
        return name;
    }
    public int getEXP(int index){
        int exp = mosters.get(index).getEXP();
        return exp;
    }
    /*public void showmosters(){ 
        System.out.println("------------------ inventory ------------------");
        for(int i = 0 ; i < mosters.size() ; i++){
            System.out.println((i+1)+"."+mosters.get(i).getName()+"."+mosters.get(i).getImage());
        }
        System.out.println("-----------------------------------------------");
    }*/
    public int killmoster(int index){
        int number = mosters.get(index).getDamage();
        mosters.remove(index);
        return number;
    }
    public int checkmoster(){
        int num=0;
        for(int i = 0 ; i < mosters.size() ; i++){
            //System.out.println("--------------------");
            //System.out.println((i+1)+"."+mosters.get(i).getName()+"."+mosters.get(i).getImage());
            num = num + 1;
        }
        //System.out.println(num);
        return num;
    }
}