package com.company;

class Phone {
    public void SwitchOn() {
        System.out.println("Phone is switched on");
    }
    public void playMusic() {
        System.out.println("We can play music");
    }
    public void phoneCall() {
        System.out.println("We have to make phone calls by using touchpad");
    }
}

    class SmartPhone extends Phone {
        public void phoneCall() {
            System.out.println("We have to make phone calls by touching the screen itself.");
        }
        public void internetConnection() {
            System.out.println("It has Wi-Fi facility.");
        }
    }

public class PhoneAndSmartPhone {
    public static void main(String[] args) {
        Phone p = new SmartPhone();
        p.SwitchOn();
        p.playMusic();
        p.phoneCall();
//      p.internetConnection();
    }
}
