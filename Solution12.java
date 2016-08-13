class Student extends Person{
  private int[] testScores;
  
  Student(String firstName, String lastName, int identification, int[] testScores){
    
    
    super(firstName, lastName, identification);
    this.testScores = testScores;
  }
  
  
  public char calculate(){
    
    int count = 0;
    int sum = 0;
    int avg = 0;
    char score = ' ';
    for(int i=0; i<testScores.length;i++){
      sum = sum + testScores[i]; 
      
    }
    avg = sum/testScores.length;
    
    if(avg<=100 && avg>=90){
      score = 'O';
    }
    else if(avg<90 && avg >=80){
      score = 'E'; 
    }
    else if(avg<80 && avg>=70){
      score = 'A';
    }
    else if(avg<70 && avg>=55){
      score = 'P';
    }
    else if(avg<55 && avg>=40){
      score = 'D';
    }
    else if(avg<40){
      score = 'T';
    }
    return score;
    
  }
}