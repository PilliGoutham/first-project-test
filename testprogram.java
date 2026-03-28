Public class Test{
  public int checkMethod(){
    System.out.println("first Method");
    return 1;
  }
}
public static void Main(String args[]){
  Test createObject = new Test();
  createObject.checkMethod();
}
