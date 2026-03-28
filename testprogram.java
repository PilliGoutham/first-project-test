 class Test{
  public int checkMethod(){
    System.out.println("first Method");
    return 1;
  }
}

public class Testprogram{
  public static void main(String[] args){
    Test createObject = new Test();
    createObject.checkMethod();
  }
}
