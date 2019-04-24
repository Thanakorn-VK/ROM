import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.FileChooserUI;
//import jdk.tools.jlink.internal.Jlink;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ROM extends JFrame
{
    int career=0;
    int career2=0;
    Novice novice = new Novice();
    Wizard wz = new Wizard();
    Knight kn = new Knight();
    Bag bag = new Bag();
    Mosters mosters = new Mosters();
    JFrame frame = new JFrame();
    
    public ROM ()
    {
        super("Raknarok Online");
        Container c = getContentPane();
        c.setLayout(new BorderLayout(5,5));
    

        JLabel im1 = new JLabel(new ImageIcon("c1.gif"));
        
        //JButton jb3 = new JButton("SOUTH");
        //JButton jb4 = new JButton("WEST");
        JPanel p3 = new JPanel();
        p3.setLayout(new BoxLayout(p3,BoxLayout.X_AXIS));

        JButton p3b1 = new JButton("BUY HPPOTION (5 Coin)");
        JButton p3b2 = new JButton("BUY EXPPOTION (5 Coin)");

        p3.add(Box.createRigidArea(new Dimension(230,15)));
        p3.add(p3b1);
        p3.add(Box.createRigidArea(new Dimension(15,15)));
        p3.add(p3b2);



        JPanel p4 = new JPanel();
        p4.setLayout(new GridLayout(5, 1));
        //p4.setLayout(new BoxLayout(p4,BoxLayout.Y_AXIS));
        // random moster
        /*
        String name1,name2,name3,name4,name5;
        name1 = random2.randommoster();
        name2 = random2.randommoster();
        name3 = random2.randommoster();
        name4 = random2.randommoster();
        name5 = random2.randommoster();
        JLabel imm1 = new JLabel(new ImageIcon(name1));
        JLabel imm2 = new JLabel(new ImageIcon(name2));
        JLabel imm3 = new JLabel(new ImageIcon(name3));
        JLabel imm4 = new JLabel(new ImageIcon(name4));
        JLabel imm5 = new JLabel(new ImageIcon(name5));
        */
        JButton att1 = new JButton("ATTACK");
        JButton att2 = new JButton("ATTACK");
        JButton att3 = new JButton("ATTACK");
        JButton att4 = new JButton("ATTACK");
        JButton att5 = new JButton("ATTACK");
        //JButton att6 = new JButton("ATTACK");

        mosters.spawnmoster();
        mosters.spawnmoster();
        mosters.spawnmoster();
        mosters.spawnmoster();
        mosters.spawnmoster();
        //mosters.showmosters();

        String image1 = mosters.getImage(0);
        String image2 = mosters.getImage(1);
        String image3 = mosters.getImage(2);
        String image4 = mosters.getImage(3);
        String image5 = mosters.getImage(4);
        
        JLabel imm1 = new JLabel(new ImageIcon(image1));
        JLabel imm2 = new JLabel(new ImageIcon(image2));
        JLabel imm3 = new JLabel(new ImageIcon(image3));
        JLabel imm4 = new JLabel(new ImageIcon(image4));
        JLabel imm5 = new JLabel(new ImageIcon(image5));
        /*
        JLabel imm1 = new JLabel(image1);
        JLabel imm2 = new JLabel(image2);
        JLabel imm3 = new JLabel(image3);
        JLabel imm4 = new JLabel(image4);
        */
        JPanel pm1 = new JPanel();
        pm1.setLayout(new BoxLayout(pm1,BoxLayout.Y_AXIS));
        JLabel txm1 = new JLabel(mosters.getName(0));
        pm1.add(txm1);
        pm1.add(imm1);

        JPanel pm2 = new JPanel();
        pm2.setLayout(new BoxLayout(pm2,BoxLayout.Y_AXIS));
        JLabel txm2 = new JLabel(mosters.getName(1));
        pm2.add(txm2);
        pm2.add(imm2);

        JPanel pm3 = new JPanel();
        pm3.setLayout(new BoxLayout(pm3,BoxLayout.Y_AXIS));
        JLabel txm3 = new JLabel(mosters.getName(2));
        pm3.add(txm3);
        pm3.add(imm3);

        JPanel pm4 = new JPanel();
        pm4.setLayout(new BoxLayout(pm4,BoxLayout.Y_AXIS));
        JLabel txm4 = new JLabel(mosters.getName(3));
        pm4.add(txm4);
        pm4.add(imm4);

        JPanel pm5 = new JPanel();
        pm5.setLayout(new BoxLayout(pm5,BoxLayout.Y_AXIS));
        JLabel txm5 = new JLabel(mosters.getName(4));
        pm5.add(txm5);
        pm5.add(imm5);


        //p4.add(imm1);
        p4.add(pm1);
        p4.add(att1);
        //p4.add(imm2);
        p4.add(pm2);
        p4.add(att2);
        //p4.add(imm3);
        p4.add(pm3);
        p4.add(att3);
        //p4.add(imm4);
        p4.add(pm4);
        p4.add(att4);
        // p4.add(imm5);
        p4.add(pm5);
        p4.add(att5);

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(1,5));

        JLabel tx1 = new JLabel("HP:  " + novice.getHP());
        JLabel tx2 = new JLabel("EXP:  " + novice.getEXP());
        JLabel tx3 = new JLabel("LV:  " + novice.getLEVEL());
        JLabel tx4 = new JLabel("CAREER:  " + novice.getNAME());
        JLabel tx5 = new JLabel("KILL:  " + novice.getKILL());

        p2.add(tx1);
        p2.add(tx2);
        p2.add(tx3);
        p2.add(tx4);
        p2.add(tx5);

        JPanel p1 = new JPanel();
        p1.setBorder(BorderFactory.createEmptyBorder(70,30,5,5));
        p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS));
        //JButton pjb1 = new JButton("ATTACK");
        JButton pjb2 = new JButton("RUN AWAY");
        JButton pjb3 = new JButton("POTION");
        JButton pjb4 = new JButton("EXP POTION");
        JButton pjb5 = new JButton("WARP");
        
        // image hppotion
        JLabel imhppotion = new JLabel(new ImageIcon("hppotion.png"));
        JLabel imexppotion = new JLabel(new ImageIcon("exppotion.png"));
        JLabel coin = new JLabel(new ImageIcon("coin-stack.png"));


        JLabel hppotion = new JLabel("x" + bag.getAmountHPPotion());
        JLabel exppotion = new JLabel("x" + bag.getAmountEXPPotion());
        JLabel coins1 = new JLabel("x" + bag.getamountCoin());

        //edit
        JPanel php = new JPanel();
        php.setLayout(new BoxLayout(php,BoxLayout.X_AXIS));
        php.setBorder(BorderFactory.createEmptyBorder(10,10,5,5));
        php.add(imhppotion);
        php.add(Box.createRigidArea(new Dimension(15,15)));
        php.add(hppotion);
        //end edit

        JPanel pexp = new JPanel();
        pexp.setLayout(new BoxLayout(pexp,BoxLayout.X_AXIS));
        pexp.setBorder(BorderFactory.createEmptyBorder(10,10,5,5));
        pexp.add(imexppotion);
        pexp.add(Box.createRigidArea(new Dimension(15,15)));
        pexp.add(exppotion);

        JPanel coins = new JPanel();
        coins.setLayout(new BoxLayout(coins,BoxLayout.X_AXIS));
        coins.setBorder(BorderFactory.createEmptyBorder(10,10,5,5));
        coins.add(coin);
        coins.add(Box.createRigidArea(new Dimension(15,15)));
        coins.add(coins1);


        //p1.add(pjb1);
        p1.add(Box.createRigidArea(new Dimension(15,15)));
        p1.add(pjb2);
        p1.add(Box.createRigidArea(new Dimension(15,15)));
        p1.add(pjb5);
        p1.add(Box.createRigidArea(new Dimension(15,15)));
        p1.add(pjb3);
        p1.add(Box.createRigidArea(new Dimension(15,15)));
        p1.add(pjb4);
        p1.add(Box.createRigidArea(new Dimension(15,15)));
        p1.add(php);
        p1.add(Box.createRigidArea(new Dimension(15,15)));
        p1.add(pexp);
        p1.add(Box.createRigidArea(new Dimension(15,15)));
        p1.add(coins);
        

        
/*
        att1.addActionListener( new java.awt.event.ActionListener(){   
            public void actionPerformed(ActionEvent e)
            {
                code;
            }

        });




*/

/*
        String[]  options = {"Knight", "Wizard"}; //button names
        int n = JOptionPane.showOptionDialog(frame,"Choose Your Career","",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,null); //default button title
        if (n == JOptionPane.YES_OPTION){
              //dosomething              
        }
        else {
            //dosomething;    
        }*/

        

        //*******************************
        att1.addActionListener( new java.awt.event.ActionListener() 
        {   
            public void actionPerformed(ActionEvent e)
                {   if(mosters.checkmoster() == 0) {
                    JOptionPane.showMessageDialog(null,"No Moster is Here!!");
                    }
                    novice.att(mosters.getEXP(0));
                    if(mosters.getName(0) == "Baphomet"){
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                    }
                    else {
                        bag.getCoin();
                    }
                    novice.heal(mosters.killmoster(0));
                    if(novice.getHP() <= 0){
                        JOptionPane.showMessageDialog(null,"---You Dead!!!---");
                        setVisible(false);
                    }
                    bag.getItem();
                    //bag.showBag();
                    int num = mosters.checkmoster();
                    //System.err.println(num);  im1.setIcon(new ImageIcon("knight.gif"));
                    if(num == 4) {
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon(mosters.getImage(1)));
                        txm2.setText(mosters.getName(1));
                        imm3.setIcon(new ImageIcon(mosters.getImage(2)));
                        txm3.setText(mosters.getName(2));
                        imm4.setIcon(new ImageIcon(mosters.getImage(3)));
                        txm4.setText(mosters.getName(3));
                        imm5.setIcon(new ImageIcon());
                        txm5.setText("");
                        //System.out.println(num+"chack");
                    }
                    else if(num == 3) {
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon(mosters.getImage(1)));
                        txm2.setText(mosters.getName(1));
                        imm3.setIcon(new ImageIcon(mosters.getImage(2)));
                        txm3.setText(mosters.getName(2));
                        imm4.setIcon(new ImageIcon());
                        txm4.setText("");
                        imm5.setIcon(new ImageIcon());
                        txm5.setText("");
                    }
                    else if(num == 2) {
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon(mosters.getImage(1)));
                        txm2.setText(mosters.getName(1));
                        imm3.setIcon(new ImageIcon());
                        txm3.setText("");
                        imm4.setIcon(new ImageIcon());
                        txm4.setText("");
                        imm5.setIcon(new ImageIcon());
                        txm5.setText("");
                    }
                    else if(num == 1) {
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon());
                        txm2.setText("");
                        imm3.setIcon(new ImageIcon());
                        txm3.setText("");
                        imm4.setIcon(new ImageIcon());
                        txm4.setText("");
                        imm5.setIcon(new ImageIcon());
                        txm5.setText("");
                    }
                    else if(num == 0) {
                        imm1.setIcon(new ImageIcon());
                        txm1.setText("");
                        imm2.setIcon(new ImageIcon());
                        txm2.setText("");
                        imm3.setIcon(new ImageIcon());
                        txm3.setText("");
                        imm4.setIcon(new ImageIcon());
                        txm4.setText("");
                        imm5.setIcon(new ImageIcon());
                        txm5.setText("");
                    }
                    if(novice.getLEVEL() >= 5 && career == 0) {
                        career++;
                        String[]  options = {"Knight", "Wizard"}; //button names
                        int n = JOptionPane.showOptionDialog(frame,"Choose Your Career","",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,null); //default button title
                        if (n == JOptionPane.YES_OPTION){
                            novice.setEXP(0);
                            novice.setHP((novice.getHP()+200));
                            novice.setLEVEL(5);
                            novice.setName("KNIGHT");
                            //im1.setIcon(new ImageIcon("spark.gif"));
                            im1.setIcon(new ImageIcon("knight.gif"));
                        }
                        else {
                            novice.setEXP(0);
                            novice.setHP((novice.getHP()+200));
                            novice.setLEVEL(5);
                            novice.setName("WIZARD");
                            im1.setIcon(new ImageIcon("wizard.gif"));
                        }
                    }
                    if(novice.getLEVEL() >= 10 && career2 == 0) {
                        career2++;
                        if (novice.getNAME() == "KNIGHT"){
                            novice.setEXP(0);
                            novice.setHP((novice.getHP()+800));
                            novice.setLEVEL(10);
                            novice.setName("LORDKNIGHT");
                            im1.setIcon(new ImageIcon("knight2.gif"));
                        }
                        else {
                            novice.setEXP(0);
                            novice.setHP((novice.getHP()+500));
                            novice.setLEVEL(10);
                            novice.setName("HIGHWIZARD");
                            im1.setIcon(new ImageIcon("wizard2.gif"));
                        }
                    }
                    tx1.setText("HP: " + novice.getHP());
                    tx2.setText("EXP: " + novice.getEXP());
                    tx3.setText("LV: " + novice.getLEVEL());
                    tx4.setText("CAREER: " + novice.getNAME());
                    tx5.setText("KILL: " + novice.getKILL());
                    hppotion.setText("x " + bag.getAmountHPPotion());
                    exppotion.setText("x " + bag.getAmountEXPPotion());
                    coins1.setText("x " + bag.getamountCoin());
                    if(bag.getAmountHPPotion()+bag.getAmountEXPPotion() == 10) JOptionPane.showMessageDialog(null,"Bagpack Full!!");
                }
        });
        att2.addActionListener( new java.awt.event.ActionListener() 
        {   
            public void actionPerformed(ActionEvent e)
                {
                    if(mosters.checkmoster() == 0) {
                        JOptionPane.showMessageDialog(null,"No Moster is Here!!");
                    }
                    novice.att(mosters.getEXP(1));
                    if(mosters.getName(1) == "Baphomet"){
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                    }
                    else {
                        bag.getCoin();
                    }
                    novice.heal(mosters.killmoster(1));
                    if(novice.getHP() <= 0){
                        JOptionPane.showMessageDialog(null,"---You Dead!!!---");
                        setVisible(false);
                    }
                    bag.getItem();
                    //bag.showBag();
                    int num = mosters.checkmoster();
                    //System.err.println(num);
                    if(num == 4) {
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon(mosters.getImage(1)));
                        txm2.setText(mosters.getName(1));
                        imm3.setIcon(new ImageIcon(mosters.getImage(2)));
                        txm3.setText(mosters.getName(2));
                        imm4.setIcon(new ImageIcon(mosters.getImage(3)));
                        txm4.setText(mosters.getName(3));
                        imm5.setIcon(new ImageIcon());
                        txm5.setText("");
                        //System.out.println(num+"chack");
                    }
                    else if(num == 3) {
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon(mosters.getImage(1)));
                        txm2.setText(mosters.getName(1));
                        imm3.setIcon(new ImageIcon(mosters.getImage(2)));
                        txm3.setText(mosters.getName(2));
                        imm4.setIcon(new ImageIcon());
                        txm4.setText("");
                        imm5.setIcon(new ImageIcon());
                        txm5.setText("");
                    }
                    else if(num == 2) {
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon(mosters.getImage(1)));
                        txm2.setText(mosters.getName(1));
                        imm3.setIcon(new ImageIcon());
                        txm3.setText("");
                        imm4.setIcon(new ImageIcon());
                        txm4.setText("");
                        imm5.setIcon(new ImageIcon());
                        txm5.setText("");
                    }
                    else if(num == 1) {
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon());
                        txm2.setText("");
                        imm3.setIcon(new ImageIcon());
                        txm3.setText("");
                        imm4.setIcon(new ImageIcon());
                        txm4.setText("");
                        imm5.setIcon(new ImageIcon());
                        txm5.setText("");
                    }
                    else if(num == 0) {
                        imm1.setIcon(new ImageIcon());
                        txm1.setText("");
                        imm2.setIcon(new ImageIcon());
                        txm2.setText("");
                        imm3.setIcon(new ImageIcon());
                        txm3.setText("");
                        imm4.setIcon(new ImageIcon());
                        txm4.setText("");
                        imm5.setIcon(new ImageIcon());
                        txm5.setText("");
                    }
                    if(novice.getLEVEL() >= 5 && career == 0) {
                        career++;
                        String[]  options = {"Knight", "Wizard"}; //button names

                        int n = JOptionPane.showOptionDialog(frame,"Choose Your Career","",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,null); //default button title
                        if (n == JOptionPane.YES_OPTION){
                            novice.setEXP(0);
                            novice.setHP((novice.getHP()+200));
                            novice.setLEVEL(5);
                            novice.setName("KNIGHT");
                            im1.setIcon(new ImageIcon("knight.gif"));
                        }
                        else {
                            novice.setEXP(0);
                            novice.setHP((novice.getHP()+200));
                            novice.setLEVEL(5);
                            novice.setName("WIZARD");
                            im1.setIcon(new ImageIcon("wizard.gif"));
                        }
                    }
                    if(novice.getLEVEL() >= 10 && career2 == 0) {
                        career2++;
                        if (novice.getNAME() == "KNIGHT"){
                            novice.setEXP(0);
                            novice.setHP((novice.getHP()+800));
                            novice.setLEVEL(10);
                            novice.setName("LORDKNIGHT");
                            im1.setIcon(new ImageIcon("knight2.gif"));
                        }
                        else {
                            novice.setEXP(0);
                            novice.setHP((novice.getHP()+500));
                            novice.setLEVEL(10);
                            novice.setName("HIGHWIZARD");
                            im1.setIcon(new ImageIcon("wizard2.gif"));
                        }
                    }
                    tx1.setText("HP: " + novice.getHP());
                    tx2.setText("EXP: " + novice.getEXP());
                    tx3.setText("LV: " + novice.getLEVEL());
                    tx4.setText("CAREER: " + novice.getNAME());
                    tx5.setText("KILL: " + novice.getKILL());
                    hppotion.setText("x " + bag.getAmountHPPotion());
                    exppotion.setText("x " + bag.getAmountEXPPotion());
                    coins1.setText("x " + bag.getamountCoin());
                    if(bag.getAmountHPPotion()+bag.getAmountEXPPotion() == 10) JOptionPane.showMessageDialog(null,"Bagpack Full!!");
                }
        });
        att3.addActionListener( new java.awt.event.ActionListener() 
        {   
            public void actionPerformed(ActionEvent e)
                {
                    if(mosters.checkmoster() == 0) {
                        JOptionPane.showMessageDialog(null,"No Moster is Here!!");
                    }
                    novice.att(mosters.getEXP(2));
                    if(mosters.getName(2) == "Baphomet"){
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                    }
                    else {
                        bag.getCoin();
                    }
                    novice.heal(mosters.killmoster(2));
                    if(novice.getHP() <= 0){
                        JOptionPane.showMessageDialog(null,"---You Dead!!!---");
                        setVisible(false);
                    }
                    bag.getItem();
                    //bag.showBag();
                    int num = mosters.checkmoster();
                    //System.err.println(num);
                    if(num == 4) {
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon(mosters.getImage(1)));
                        txm2.setText(mosters.getName(1));
                        imm3.setIcon(new ImageIcon(mosters.getImage(2)));
                        txm3.setText(mosters.getName(2));
                        imm4.setIcon(new ImageIcon(mosters.getImage(3)));
                        txm4.setText(mosters.getName(3));
                        imm5.setIcon(new ImageIcon());
                        txm5.setText("");
                        //System.out.println(num+"chack");
                    }
                    else if(num == 3) {
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon(mosters.getImage(1)));
                        txm2.setText(mosters.getName(1));
                        imm3.setIcon(new ImageIcon(mosters.getImage(2)));
                        txm3.setText(mosters.getName(2));
                        imm4.setIcon(new ImageIcon());
                        txm4.setText("");
                        imm5.setIcon(new ImageIcon());
                        txm5.setText("");
                    }
                    else if(num == 2) {
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon(mosters.getImage(1)));
                        txm2.setText(mosters.getName(1));
                        imm3.setIcon(new ImageIcon());
                        txm3.setText("");
                        imm4.setIcon(new ImageIcon());
                        txm4.setText("");
                        imm5.setIcon(new ImageIcon());
                        txm5.setText("");
                    }
                    else if(num == 1) {
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon());
                        txm2.setText("");
                        imm3.setIcon(new ImageIcon());
                        txm3.setText("");
                        imm4.setIcon(new ImageIcon());
                        txm4.setText("");
                        imm5.setIcon(new ImageIcon());
                        txm5.setText("");
                    }
                    else if(num == 0) {
                        imm1.setIcon(new ImageIcon());
                        txm1.setText("");
                        imm2.setIcon(new ImageIcon());
                        txm2.setText("");
                        imm3.setIcon(new ImageIcon());
                        txm3.setText("");
                        imm4.setIcon(new ImageIcon());
                        txm4.setText("");
                        imm5.setIcon(new ImageIcon());
                        txm5.setText("");
                    }
                    if(novice.getLEVEL() >= 5 && career == 0) {
                        career++;
                        String[]  options = {"Knight", "Wizard"}; //button names

                        int n = JOptionPane.showOptionDialog(frame,"Choose Your Career","",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,null); //default button title
                        if (n == JOptionPane.YES_OPTION){
                            novice.setEXP(0);
                            novice.setHP((novice.getHP()+200));
                            novice.setLEVEL(5);
                            novice.setName("KNIGHT");
                            im1.setIcon(new ImageIcon("knight.gif"));
                        }
                        else {
                            novice.setEXP(0);
                            novice.setHP((novice.getHP()+200));
                            novice.setLEVEL(5);
                            novice.setName("WIZARD");
                            im1.setIcon(new ImageIcon("wizard.gif"));

                        }
                    }
                    if(novice.getLEVEL() >= 10 && career2 == 0) {
                        career2++;
                        if (novice.getNAME() == "KNIGHT"){
                            novice.setEXP(0);
                            novice.setHP((novice.getHP()+800));
                            novice.setLEVEL(10);
                            novice.setName("LORDKNIGHT");
                            im1.setIcon(new ImageIcon("knight2.gif"));
                        }
                        else {
                            novice.setEXP(0);
                            novice.setHP((novice.getHP()+500));
                            novice.setLEVEL(10);
                            novice.setName("HIGHWIZARD");
                            im1.setIcon(new ImageIcon("wizard2.gif"));
                        }
                    }
                    tx1.setText("HP: " + novice.getHP());
                    tx2.setText("EXP: " + novice.getEXP());
                    tx3.setText("LV: " + novice.getLEVEL());
                    tx4.setText("CAREER: " + novice.getNAME());
                    tx5.setText("KILL: " + novice.getKILL());
                    hppotion.setText("x " + bag.getAmountHPPotion());
                    exppotion.setText("x " + bag.getAmountEXPPotion());
                    coins1.setText("x " + bag.getamountCoin());
                    if(bag.getAmountHPPotion()+bag.getAmountEXPPotion() == 10) JOptionPane.showMessageDialog(null,"Bagpack Full!!");
                }
        });
        att4.addActionListener( new java.awt.event.ActionListener() 
        {   
            public void actionPerformed(ActionEvent e)
                {
                    if(mosters.checkmoster() == 0) {
                        JOptionPane.showMessageDialog(null,"No Moster is Here!!");
                    }
                    novice.att(mosters.getEXP(3));
                    if(mosters.getName(3) == "Baphomet"){
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                    }
                    else {
                        bag.getCoin();
                    }
                    novice.heal(mosters.killmoster(3));
                    if(novice.getHP() <= 0){
                        JOptionPane.showMessageDialog(null,"---You Dead!!!---");
                        setVisible(false);
                    }
                    bag.getItem();
                    //bag.showBag();
                    int num = mosters.checkmoster();
                    //System.err.println(num);
                    if(num == 4) {
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon(mosters.getImage(1)));
                        txm2.setText(mosters.getName(1));
                        imm3.setIcon(new ImageIcon(mosters.getImage(2)));
                        txm3.setText(mosters.getName(2));
                        imm4.setIcon(new ImageIcon(mosters.getImage(3)));
                        txm4.setText(mosters.getName(3));
                        imm5.setIcon(new ImageIcon());
                        txm5.setText("");
                        //System.out.println(num+"chack");
                    }
                    else if(num == 3) {
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon(mosters.getImage(1)));
                        txm2.setText(mosters.getName(1));
                        imm3.setIcon(new ImageIcon(mosters.getImage(2)));
                        txm3.setText(mosters.getName(2));
                        imm4.setIcon(new ImageIcon());
                        txm4.setText("");
                        imm5.setIcon(new ImageIcon());
                        txm5.setText("");
                    }
                    else if(num == 2) {
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon(mosters.getImage(1)));
                        txm2.setText(mosters.getName(1));
                        imm3.setIcon(new ImageIcon());
                        txm3.setText("");
                        imm4.setIcon(new ImageIcon());
                        txm4.setText("");
                        imm5.setIcon(new ImageIcon());
                        txm5.setText("");
                    }
                    else if(num == 1) {
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon());
                        txm2.setText("");
                        imm3.setIcon(new ImageIcon());
                        txm3.setText("");
                        imm4.setIcon(new ImageIcon());
                        txm4.setText("");
                        imm5.setIcon(new ImageIcon());
                        txm5.setText("");
                    }
                    else if(num == 0) {
                        imm1.setIcon(new ImageIcon());
                        txm1.setText("");
                        imm2.setIcon(new ImageIcon());
                        txm2.setText("");
                        imm3.setIcon(new ImageIcon());
                        txm3.setText("");
                        imm4.setIcon(new ImageIcon());
                        txm4.setText("");
                        imm5.setIcon(new ImageIcon());
                        txm5.setText("");
                    }
                    if(novice.getLEVEL() >= 5 && career == 0) {
                        career++;
                        String[]  options = {"Kinght", "Wizard"}; //button names

                        int n = JOptionPane.showOptionDialog(frame,"Choose Your Career","",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,null); //default button title
                        if (n == JOptionPane.YES_OPTION){
                            novice.setEXP(0);
                            novice.setHP((novice.getHP()+200));
                            novice.setLEVEL(5);
                            novice.setName("KNIGHT");
                            im1.setIcon(new ImageIcon("knight.gif"));
                        }
                        else {
                            novice.setEXP(0);
                            novice.setHP((novice.getHP()+200));
                            novice.setLEVEL(5);
                            novice.setName("WIZARD");
                            im1.setIcon(new ImageIcon("wizard.gif"));
                        }
                    }
                    if(novice.getLEVEL() >= 10 && career2 == 0) {
                        career2++;
                        if (novice.getNAME() == "KNIGHT"){
                            novice.setEXP(0);
                            novice.setHP((novice.getHP()+800));
                            novice.setLEVEL(10);
                            novice.setName("LORDKNIGHT");
                            im1.setIcon(new ImageIcon("knight2.gif"));
                        }
                        else {
                            novice.setEXP(0);
                            novice.setHP((novice.getHP()+500));
                            novice.setLEVEL(10);
                            novice.setName("HIGHWIZARD");
                            im1.setIcon(new ImageIcon("wizard2.gif"));
                        }
                    }
                    tx1.setText("HP: " + novice.getHP());
                    tx2.setText("EXP: " + novice.getEXP());
                    tx3.setText("LV: " + novice.getLEVEL());
                    tx4.setText("CAREER: " + novice.getNAME());
                    tx5.setText("KILL: " + novice.getKILL());
                    hppotion.setText("x " + bag.getAmountHPPotion());
                    exppotion.setText("x " + bag.getAmountEXPPotion());
                    coins1.setText("x " + bag.getamountCoin());
                    if(bag.getAmountHPPotion()+bag.getAmountEXPPotion() == 10) JOptionPane.showMessageDialog(null,"Bagpack Full!!");
                }
        });
        att5.addActionListener( new java.awt.event.ActionListener() 
        {   
            public void actionPerformed(ActionEvent e)
                {
                    if(mosters.checkmoster() == 0) {
                        JOptionPane.showMessageDialog(null,"No Moster is Here!!");
                    }
                    novice.att(mosters.getEXP(4));
                    if(mosters.getName(4) == "Baphomet"){
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                        bag.getCoin();
                    }
                    else {
                        bag.getCoin();
                    }

                    novice.heal(mosters.killmoster(4));

                    if(novice.getHP() <= 0){
                        JOptionPane.showMessageDialog(null,"---You Dead!!!---");
                        setVisible(false);
                    }
                    bag.getItem();
                    //bag.showBag();
                    int num = mosters.checkmoster();
                    //System.err.println(num);
                    if(num == 4) {
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon(mosters.getImage(1)));
                        txm2.setText(mosters.getName(1));
                        imm3.setIcon(new ImageIcon(mosters.getImage(2)));
                        txm3.setText(mosters.getName(2));
                        imm4.setIcon(new ImageIcon(mosters.getImage(3)));
                        txm4.setText(mosters.getName(3));
                        imm5.setIcon(new ImageIcon());
                        txm5.setText("");
                        //System.out.println(num+"chack");
                    }
                    else if(num == 3) {
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon(mosters.getImage(1)));
                        txm2.setText(mosters.getName(1));
                        imm3.setIcon(new ImageIcon(mosters.getImage(2)));
                        txm3.setText(mosters.getName(2));
                        imm4.setIcon(new ImageIcon());
                        txm4.setText("");
                        imm5.setIcon(new ImageIcon());
                        txm5.setText("");
                    }
                    else if(num == 2) {
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon(mosters.getImage(1)));
                        txm2.setText(mosters.getName(1));
                        imm3.setIcon(new ImageIcon());
                        txm3.setText("");
                        imm4.setIcon(new ImageIcon());
                        txm4.setText("");
                        imm5.setIcon(new ImageIcon());
                        txm5.setText("");
                    }
                    else if(num == 1) {
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon());
                        txm2.setText("");
                        imm3.setIcon(new ImageIcon());
                        txm3.setText("");
                        imm4.setIcon(new ImageIcon());
                        txm4.setText("");
                        imm5.setIcon(new ImageIcon());
                        txm5.setText("");
                    }
                    else if(num == 0) {
                        imm1.setIcon(new ImageIcon());
                        txm1.setText("");
                        imm2.setIcon(new ImageIcon());
                        txm2.setText("");
                        imm3.setIcon(new ImageIcon());
                        txm3.setText("");
                        imm4.setIcon(new ImageIcon());
                        txm4.setText("");
                        imm5.setIcon(new ImageIcon());
                        txm5.setText("");
                    }
                    if(novice.getLEVEL() >= 5 && career == 0) {
                        career++;
                        String[]  options = {"Kinght", "Wizard"}; //button names

                        int n = JOptionPane.showOptionDialog(frame,"Choose Your Career","",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,null); //default button title
                        if (n == JOptionPane.YES_OPTION){
                            novice.setEXP(0);
                            novice.setHP((novice.getHP()+200));
                            novice.setLEVEL(5);
                            novice.setName("KNIGHT");
                            im1.setIcon(new ImageIcon("knight.gif"));
                        }
                        else {
                            novice.setEXP(0);
                            novice.setHP((novice.getHP()+200));
                            novice.setLEVEL(5);
                            novice.setName("WIZARD");
                            im1.setIcon(new ImageIcon("wizard.gif"));
                        }
                    }
                    if(novice.getLEVEL() >= 10 && career2 == 0) {
                        career2++;
                        if (novice.getNAME() == "KNIGHT"){
                            novice.setEXP(0);
                            novice.setHP((novice.getHP()+800));
                            novice.setLEVEL(10);
                            novice.setName("LORDKNIGHT");
                            im1.setIcon(new ImageIcon("knight2.gif"));
                        }
                        else {
                            novice.setEXP(0);
                            novice.setHP((novice.getHP()+500));
                            novice.setLEVEL(10);
                            novice.setName("HIGHWIZARD");
                            im1.setIcon(new ImageIcon("wizard2.gif"));
                        }
                    }
                    tx1.setText("HP: " + novice.getHP());
                    tx2.setText("EXP: " + novice.getEXP());
                    tx3.setText("LV: " + novice.getLEVEL());
                    tx4.setText("CAREER: " + novice.getNAME());
                    tx5.setText("KILL: " + novice.getKILL());
                    hppotion.setText("x " + bag.getAmountHPPotion());
                    exppotion.setText("x " + bag.getAmountEXPPotion());
                    coins1.setText("x " + bag.getamountCoin());
                    if(bag.getAmountHPPotion()+bag.getAmountEXPPotion() == 10) JOptionPane.showMessageDialog(null,"Bagpack Full!!");
                }
        });
        // ++++++++++++++++++++++++++++++++++ -------------------
        pjb3.addActionListener( new java.awt.event.ActionListener() 
        {   
            public void actionPerformed(ActionEvent e)
                {   
                    int index = bag.HPPotioninBag();
                    //System.out.print(index);
                    if(index != 20){
                        novice.heal(bag.useItem(index));
                    }
                    else JOptionPane.showMessageDialog(null,"You don't have Potion!!");
                    
                    tx1.setText("HP: " + novice.getHP());
                    tx2.setText("EXP: " + novice.getEXP());
                    tx3.setText("LV: " + novice.getLEVEL());
                    tx4.setText("CAREER: " + novice.getNAME());
                    tx5.setText("KILL: " + novice.getKILL());
                    hppotion.setText("x " + bag.getAmountHPPotion());
                    exppotion.setText("x " + bag.getAmountEXPPotion());
                    coins1.setText("x " + bag.getamountCoin());
                }
        });

        pjb4.addActionListener( new java.awt.event.ActionListener() 
        {   
            public void actionPerformed(ActionEvent e)
                {   
                    int index = bag.EXPPotioninBag();
                    //System.out.print(index);
                    if(index != 20){
                        novice.bootExp(bag.useItem(index));
                    }
                    else JOptionPane.showMessageDialog(null,"You don't have EXP-Potion!!");
                    if(novice.getLEVEL() >= 5 && career == 0) {
                        career++;
                        String[]  options = {"Kinght", "Wizard"}; //button names

                        int n = JOptionPane.showOptionDialog(frame,"Choose Your Career","",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,null); //default button title
                        if (n == JOptionPane.YES_OPTION){
                            novice.setEXP(0);
                            novice.setHP((novice.getHP()+200));
                            novice.setLEVEL(5);
                            novice.setName("KNIGHT");
                            im1.setIcon(new ImageIcon("knight.gif"));
                        }
                        else {
                            novice.setEXP(0);
                            novice.setHP((novice.getHP()+200));
                            novice.setLEVEL(5);
                            novice.setName("WIZARD");
                            im1.setIcon(new ImageIcon("wizard.gif"));
                        }
                    }
                    if(novice.getLEVEL() >= 10 && career2 == 0) {
                        career2++;
                        if (novice.getNAME() == "KNIGHT"){
                            novice.setEXP(0);
                            novice.setHP((novice.getHP()+800));
                            novice.setLEVEL(10);
                            novice.setName("LORDKNIGHT");
                            im1.setIcon(new ImageIcon("knight2.gif"));
                        }
                        else {
                            novice.setEXP(0);
                            novice.setHP((novice.getHP()+500));
                            novice.setLEVEL(10);
                            novice.setName("HIGHWIZARD");
                            im1.setIcon(new ImageIcon("wizard2.gif"));
                        }
                    }
                    tx1.setText("HP: " + novice.getHP());
                    tx2.setText("EXP: " + novice.getEXP());
                    tx3.setText("LV: " + novice.getLEVEL());
                    tx4.setText("CAREER: " + novice.getNAME());
                    tx5.setText("KILL: " + novice.getKILL());
                    hppotion.setText("x " + bag.getAmountHPPotion());
                    exppotion.setText("x " + bag.getAmountEXPPotion());
                    coins1.setText("x " + bag.getamountCoin());
                }
        });
        pjb2.addActionListener( new java.awt.event.ActionListener() 
        {   
            public void actionPerformed(ActionEvent e)
                {   
                    int num = mosters.checkmoster();
                    //System.err.println(num);
                    if(num == 4) {
                        mosters.spawnmoster();
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon(mosters.getImage(1)));
                        txm2.setText(mosters.getName(1));
                        imm3.setIcon(new ImageIcon(mosters.getImage(2)));
                        txm3.setText(mosters.getName(2));
                        imm4.setIcon(new ImageIcon(mosters.getImage(3)));
                        txm4.setText(mosters.getName(3));
                        imm5.setIcon(new ImageIcon(mosters.getImage(4)));
                        txm5.setText(mosters.getName(4));
                    }
                    else if(num == 3) {
                        mosters.spawnmoster();
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon(mosters.getImage(1)));
                        txm2.setText(mosters.getName(1));
                        imm3.setIcon(new ImageIcon(mosters.getImage(2)));
                        txm3.setText(mosters.getName(2));
                        imm4.setIcon(new ImageIcon(mosters.getImage(3)));
                        txm4.setText(mosters.getName(3));
                        imm5.setIcon(new ImageIcon());
                        txm5.setText("");
                    }
                    else if(num == 2) {
                        mosters.spawnmoster();
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon(mosters.getImage(1)));
                        txm2.setText(mosters.getName(1));
                        imm3.setIcon(new ImageIcon(mosters.getImage(2)));
                        txm3.setText(mosters.getName(2));
                        imm4.setIcon(new ImageIcon());
                        txm4.setText("");
                        imm5.setIcon(new ImageIcon());
                        txm5.setText("");
                    }
                    else if(num == 1) {
                        mosters.spawnmoster();
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon(mosters.getImage(1)));
                        txm2.setText(mosters.getName(1));
                        imm3.setIcon(new ImageIcon());
                        txm3.setText("");
                        imm4.setIcon(new ImageIcon());
                        txm4.setText("");
                        imm5.setIcon(new ImageIcon());
                        txm5.setText("");
                    }
                    else if(num == 0) {
                        mosters.spawnmoster();
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon());
                        txm2.setText("");
                        imm3.setIcon(new ImageIcon());
                        txm3.setText("");
                        imm4.setIcon(new ImageIcon());
                        txm4.setText("");
                        imm5.setIcon(new ImageIcon());
                        txm2.setText("");
                    }
                }
        });
        p3b1.addActionListener( new java.awt.event.ActionListener() //buy potion
        {   
            public void actionPerformed(ActionEvent e)
                {   
                    if(bag.getamountCoin() >= 5){
                        bag.getPotion();
                        bag.setCoin(5);
                        tx1.setText("HP: " + novice.getHP());
                        tx2.setText("EXP: " + novice.getEXP());
                        tx3.setText("LV: " + novice.getLEVEL());
                        tx4.setText("CAREER: " + novice.getNAME());
                        tx5.setText("KILL: " + novice.getKILL());
                        hppotion.setText("x " + bag.getAmountHPPotion());
                        exppotion.setText("x " + bag.getAmountEXPPotion());
                        coins1.setText("x " + bag.getamountCoin());
                    }
                    else JOptionPane.showMessageDialog(null,"You don't have enough coins!!");
                }
        });
        p3b2.addActionListener( new java.awt.event.ActionListener() //buy exppotion
        {   
            public void actionPerformed(ActionEvent e)
                {   
                    if(bag.getamountCoin() >= 5){
                        bag.getEXPPotion();
                        bag.setCoin(5);
                        tx1.setText("HP: " + novice.getHP());
                        tx2.setText("EXP: " + novice.getEXP());
                        tx3.setText("LV: " + novice.getLEVEL());
                        tx4.setText("CAREER: " + novice.getNAME());
                        tx5.setText("KILL: " + novice.getKILL());
                        hppotion.setText("x " + bag.getAmountHPPotion());
                        exppotion.setText("x " + bag.getAmountEXPPotion());
                        coins1.setText("x " + bag.getamountCoin());
                    }
                    else JOptionPane.showMessageDialog(null,"You don't have enough coins!!");
                }
        });
        pjb5.addActionListener( new java.awt.event.ActionListener() //buy exppotion
        {   
            public void actionPerformed(ActionEvent e)
                {  
                    int num = mosters.checkmoster();
                    //System.out.println(num);
                    if(num == 5){
                        mosters.killmoster(0);
                        mosters.killmoster(0);
                        mosters.killmoster(0);
                        mosters.killmoster(0);
                        mosters.killmoster(0);
                        mosters.spawnmoster();
                        mosters.spawnmoster();
                        mosters.spawnmoster();
                        mosters.spawnmoster();
                        mosters.spawnmoster();
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon(mosters.getImage(1)));
                        txm2.setText(mosters.getName(1));
                        imm3.setIcon(new ImageIcon(mosters.getImage(2)));
                        txm3.setText(mosters.getName(2));
                        imm4.setIcon(new ImageIcon(mosters.getImage(3)));
                        txm4.setText(mosters.getName(3));
                        imm5.setIcon(new ImageIcon(mosters.getImage(4)));
                        txm5.setText(mosters.getName(4));
                    }
                    else if(num == 4){
                        mosters.killmoster(0);
                        mosters.killmoster(0);
                        mosters.killmoster(0);
                        mosters.killmoster(0);
                        mosters.spawnmoster();
                        mosters.spawnmoster();
                        mosters.spawnmoster();
                        mosters.spawnmoster();
                        mosters.spawnmoster();
                        mosters.spawnmoster();
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon(mosters.getImage(1)));
                        txm2.setText(mosters.getName(1));
                        imm3.setIcon(new ImageIcon(mosters.getImage(2)));
                        txm3.setText(mosters.getName(2));
                        imm4.setIcon(new ImageIcon(mosters.getImage(3)));
                        txm4.setText(mosters.getName(3));
                        imm5.setIcon(new ImageIcon(mosters.getImage(4)));
                        txm5.setText(mosters.getName(4));
                    }
                    else if(num == 3){
                        mosters.killmoster(0);
                        mosters.killmoster(0);
                        mosters.killmoster(0);
                        mosters.spawnmoster();
                        mosters.spawnmoster();
                        mosters.spawnmoster();
                        mosters.spawnmoster();
                        mosters.spawnmoster();
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon(mosters.getImage(1)));
                        txm2.setText(mosters.getName(1));
                        imm3.setIcon(new ImageIcon(mosters.getImage(2)));
                        txm3.setText(mosters.getName(2));
                        imm4.setIcon(new ImageIcon(mosters.getImage(3)));
                        txm4.setText(mosters.getName(3));
                        imm5.setIcon(new ImageIcon(mosters.getImage(4)));
                        txm5.setText(mosters.getName(4));
                    }
                    else if(num == 2){
                        mosters.killmoster(0);
                        mosters.killmoster(0);
                        mosters.spawnmoster();
                        mosters.spawnmoster();
                        mosters.spawnmoster();
                        mosters.spawnmoster();
                        mosters.spawnmoster();
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon(mosters.getImage(1)));
                        txm2.setText(mosters.getName(1));
                        imm3.setIcon(new ImageIcon(mosters.getImage(2)));
                        txm3.setText(mosters.getName(2));
                        imm4.setIcon(new ImageIcon(mosters.getImage(3)));
                        txm4.setText(mosters.getName(3));
                        imm5.setIcon(new ImageIcon(mosters.getImage(4)));
                        txm5.setText(mosters.getName(4));
                    }
                    else if(num == 1){
                        mosters.killmoster(0);
                        mosters.spawnmoster();
                        mosters.spawnmoster();
                        mosters.spawnmoster();
                        mosters.spawnmoster();
                        mosters.spawnmoster();
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon(mosters.getImage(1)));
                        txm2.setText(mosters.getName(1));
                        imm3.setIcon(new ImageIcon(mosters.getImage(2)));
                        txm3.setText(mosters.getName(2));
                        imm4.setIcon(new ImageIcon(mosters.getImage(3)));
                        txm4.setText(mosters.getName(3));
                        imm5.setIcon(new ImageIcon(mosters.getImage(4)));
                        txm5.setText(mosters.getName(4));
                    }
                    else {
                        mosters.spawnmoster();
                        mosters.spawnmoster();
                        mosters.spawnmoster();
                        mosters.spawnmoster();
                        mosters.spawnmoster();
                        imm1.setIcon(new ImageIcon(mosters.getImage(0)));
                        txm1.setText(mosters.getName(0));
                        imm2.setIcon(new ImageIcon(mosters.getImage(1)));
                        txm2.setText(mosters.getName(1));
                        imm3.setIcon(new ImageIcon(mosters.getImage(2)));
                        txm3.setText(mosters.getName(2));
                        imm4.setIcon(new ImageIcon(mosters.getImage(3)));
                        txm4.setText(mosters.getName(3));
                        imm5.setIcon(new ImageIcon(mosters.getImage(4)));
                        txm5.setText(mosters.getName(4));
                    }

                }
        });

        //work !!!
        /*
        p1.add(pjb1);
        p1.add(Box.createRigidArea(new Dimension(15,15)));
        p1.add(pjb2);
        p1.add(Box.createRigidArea(new Dimension(15,15)));
        p1.add(pjb3);
        p1.add(Box.createRigidArea(new Dimension(15,15)));
        p1.add(pjb4);
        p1.add(Box.createRigidArea(new Dimension(15,15)));
        p1.add(imhppotion);
        p1.add(hppotion);
        p1.add(Box.createRigidArea(new Dimension(15,15)));
        p1.add(imexppotion);
        p1.add(exppotion);
        */
    
        /*
        p1.add(Box.createRigidArea(new Dimension(15,15)));
        p1.add(imhppotion);
        p1.add(Box.createRigidArea(new Dimension(15,15)));
        p1.add(im)*/
        
        c.add(p1,BorderLayout.EAST);
        c.add(im1,BorderLayout.CENTER);
        c.add(p2,BorderLayout.NORTH);
        c.add(p3,BorderLayout.SOUTH);
        c.add(p4,BorderLayout.WEST);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,700);
        setLocale(null);
        setVisible(true);
        
        //InputStream is = getClass().getClassLoader().getResourceAsStream("music.wav");
    }
    public static void main(String[] args)
    {
        new ROM();
    }
    
}