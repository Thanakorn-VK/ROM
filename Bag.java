import java.io.*;
import java.util.*;

public class Bag
{   
    Item item = new Item();
    //HPPotion hppotion = new HPPotion();
    //Bootexp bootexp = new Bootexp();
    Random random = new Random(); 
    Coin coin = new Coin();
    ArrayList<Item> items;
    ArrayList<Coin> coins;
    private int amountcoin;
    private int Max;
    private int amountHPPotion;
    private int amountEXPPotion;
    public Bag(){
        items = new ArrayList<Item>();
        coins = new ArrayList<Coin>();
        Max = 10;
        amountEXPPotion = 0;
        amountHPPotion = 0;
    }
    public void setCoin(int num){
        amountcoin = amountcoin - num;
    }
    public void getCoin(){
        coins.add(new Coin());
        amountcoin++;
    }
    public int getamountCoin(){
        return amountcoin;
    }
    public boolean checkbag(){
        if(items.size() < Max) return true;
        return false;
    }
    public void getPotion() {
        items.add(new HPPotion());
        amountHPPotion = amountHPPotion + 1; 
    }
    public void getEXPPotion() {
        items.add(new Bootexp());
        amountEXPPotion = amountEXPPotion + 1;
    }
    public int getMax(){
        return Max;
    }
    public void setMax(){
        Max = Max + 1;
    }
    public void getItem(){
        int number2;
        number2 = random.nextInt(3);
        if(number2 == 0){
            int number = random.nextInt(2);
            if(number == 0){ //get HPPotion
                if(checkbag()) items.add(new HPPotion());
                if((amountHPPotion + amountEXPPotion) < Max ){
                    amountHPPotion = amountHPPotion + 1;  
                }        
            }
            else if(number == 1){ // get Bootexp
                if(checkbag()) items.add(new Bootexp());
                if((amountHPPotion + amountEXPPotion) < Max ){
                    amountEXPPotion = amountEXPPotion + 1;
                }
            }
        }
    }
    /*
    public void showBag(){ 
        for(int i = 0 ; i < items.size() ; i++){
            if(items.get(i).getName() == "Potion"){
                amountHPPotion = amountHPPotion + 1;
            }
            if(items.get(i).getName() == "EXP-Potion" ){
                amountEXPPotion = amountEXPPotion + 1;
            }
            //System.out.println((i+1)+"."+items.get(i).getName());
        }
    }*/
    public int useItem(int index){
        int number = items.get(index).getProperty();
        if(items.get(index).getName() == "Potion") amountHPPotion = amountHPPotion - 1;
        else amountEXPPotion = amountEXPPotion - 1;
        items.remove(index);
        return number;
    }
    public int checkitem(int index){
        if(items.get(index-1).getName().equals("Potion") == true) return 1; // usepotion
        return 0; // useexppotion
    }

    public int VIP(int num){
        int i;
        i = num/50;
        return Max = Max + i;
    }
    public int getAmountHPPotion(){
        return amountHPPotion;
    }
    public int getAmountEXPPotion(){
        return amountEXPPotion;
    }

    public int HPPotioninBag(){ 
        for(int i = 0 ; i < items.size() ; i++){
            if(items.get(i).getName() == "Potion"){
                return i;
            }
            //System.out.println((i+1)+"."+items.get(i).getName());
        }
        return 20;
    }

    public int EXPPotioninBag(){ 
        for(int i = 0 ; i < items.size() ; i++){
            if(items.get(i).getName() == "EXP-Potion"){
                return i;
            }
            //System.out.println((i+1)+"."+items.get(i).getName());
        }
        return 20;
    }
}