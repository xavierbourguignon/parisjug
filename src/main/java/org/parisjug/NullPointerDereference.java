package org.parisjug;

public class NullPointerDereference {

  public int searchForAnimalID(String animal) {
    String trimmedAnimal = trim(animal);
    if (trimmedAnimal.equals("Antonio")) {
      return 1;
    }
    return -1;
  }

  private String trim(String animal) {
    return animal.trim();
  }
}
