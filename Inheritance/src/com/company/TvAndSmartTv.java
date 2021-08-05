package com.company;

class Tv{
    public void switchON(){
        System.out.println("TV is Switched ON.");
    }
    public void changeChannel(){
        System.out.println("Channel is Changed.");
    }
}
class SmartTv extends Tv{
    public void switchON(){ System.out.println("Smart TV is Switched ON"); }
    public void changeChannel() { System.out.println("SmartTV Channel is Changed "); }
    public void browse(){ System.out.println("Smart Tv Browsing");}
}
public class TvAndSmartTv {
    public static void main(String[] args) {
        Tv t = new Tv();
        t.switchON();
        t.changeChannel();

        SmartTv s = new SmartTv();
        s.switchON();
        s.changeChannel();
        s.browse();
    }
}
