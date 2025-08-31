public class Turtle implements Animals{

  @Override
  public void Eat(String s) {
   System.out.println(s+" hello");
  }
  public static void main(String[] args) {
    Turtle t=new Turtle();
    t.Eat("Welcome");
  }
// implements Animal Interface
  // Provide functionality for eat()
}
