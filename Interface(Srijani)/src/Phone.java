class Phone1{
    public void sms(){
        System.out.println("Phone sending SMS");
    }
    public void call(){
        System.out.println("Phone call");
    }
}

interface Camera{
    public void click();
    public void record();
}

interface MusicPlayer{
    public void play();
    public void stop();
}

class SmartPhone extends Phone1 implements Camera,MusicPlayer{
    public void videoCall() { System.out.println("Smart Phone video calling"); }
    public void click() { System.out.println("Smart Phone Clicking Photo"); }
    public void record() { System.out.println("Smart Phone recording video"); }
    public void play() { System.out.println("Smart Phone playing music"); }
    public void stop() { System.out.println("Smart Phone stopped playing music"); }
}

public class Phone {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
//      Phone1 p = s;
//      Camera c = s;
//      MusicPlayer m = s;
//      m.play();
//      m.stop();
          s.play();
          s.stop();
          s.click();
          s.record();
          s.videoCall();
          s.call();
          s.sms();
    }
}
