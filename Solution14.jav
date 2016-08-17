public Difference (int [] elements){
  
  this.elements = elements;
}

public int computeDifference(){
  int difference = 0; 
  
  for(int i = 0; i<elements.length-1;i++){
    for(int j = i+1; j<elements.length; j++){
      if(elements[i]<=elements[j]){
        difference = elements[j]-elements[i];
        
      }
      else{
        difference = elements[i]-elements[j];
        
      }
      
      if(maximumDifference <= difference){
        maximumDifference = difference;
        
      }
    }
  }
  return maximumDifference;
}