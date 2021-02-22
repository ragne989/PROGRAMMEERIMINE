import java.util.*;

/**
 * Apples
 */
public class Apples {

  public static void main(String[] args) {
    int[] apples = new int[] { 29, 70, 85, 77, 55, 44, 33, 98, 90, 47, 22, 44, 55, 37, 65 };

    List<Integer> smallApples = new ArrayList<Integer>();
    List<Integer> mediumApples = new ArrayList<Integer>();
    List<Integer> bigApples = new ArrayList<Integer>();

    for (int i = 0; i < apples.length; i++) {
      if (apples[i] <= 50) {
        smallApples.add(apples[i]);
      } else if (apples[i] < 71 && apples[i] > 50) {
        mediumApples.add(apples[i]);
      } else {
        bigApples.add(apples[i]);
      }
    }
    System.out.println("Kokku loendati enne sorteerimist " + apples.length + " õuna.");
    System.out.println("Õunad sorteeriti järgmiselt:");
    System.out.println("Väikseid õunu: " + smallApples.size() + " massiga " + smallApples);
    System.out.println("Keskmisi õunu: " + mediumApples.size() + " massiga " + mediumApples);
    System.out.println("Suuri õunu: " + bigApples.size() + " massiga " + bigApples);

  }

}

