class Calculator{

  int power (int n,int p) throws Exception {

    if(n>=0 && p>=0){
      return (int)Math.pow(n,p);
    }
    else{
      throw new Exception("n and p should be non-negative");
    }
  }
}
