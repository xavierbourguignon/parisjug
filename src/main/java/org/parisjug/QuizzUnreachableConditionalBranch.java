package org.parisjug;

public class QuizzUnreachableConditionalBranch {

  public int ultimateBoringBusinessLogic(
      int charlesAge, int khanhAge, int sunAge) {
    
    if (charlesAge > khanhAge
        && khanhAge == sunAge
        && sunAge > charlesAge) {
      return Integer.MAX_VALUE;
    }
    
    return -1;
  }  
}
