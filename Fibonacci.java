class Fibonacci{
  public static void main(String[] args){
    fibo(10);
  }
  
  private static void fibo(int n){
    int a=0;
    int b=1;
    for(int i; i<n;i++){
      int c = a+b;
      a=b;
      b=c;
      System.out.println(a);
    }
  }
}
