public class override extends Okay {

    public void bus(){
        System.out.println("hello bus");
    }
    public static void main(String[] args) {
        override o=new override();
        o.car();
        o.bus();
        
        
    }
}
