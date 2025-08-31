public class Test{
    final static String Bank="SBI";
    public static void main(String[] args) {
          Emp e=new Emp();
          
          e.setId( (byte) 1);
          e.setBalance(2000);
          e.setBank(Bank);
          e.setGender('m');
          System.out.println("the id is  "+e.getId());
          System.out.println("the balance is "+e.getBalance());
          System.out.println("name of the Bank is "+e.getBank());
          System.out.println("The candidate is  "+e.getGender());

          Emp E=new Emp((byte)1,2000,"HDFC",'m');
        Emp E2=new Emp((byte)1,2000,"HDFC",'m');
          System.out.println(E2.toString());
          System.out.println(E.toString());
          
    }
    private static void Bank() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Bank'");
    }
  
// 1)Prepare an Object of Emp() and Initialize a Variable
// 2)Print Values using Getters()
// 3)Prepare an Object of Emp() Initialize it through Args()Constructor
// 4)Print Values by using toString();
  
}
