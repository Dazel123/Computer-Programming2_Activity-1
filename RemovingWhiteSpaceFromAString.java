package Catabuena;

public class RemovingWhiteSpaceFromAString {

public static void main(String[] args) {
  String str = " D  az  el   C a  ta b u  en a ";
  
    String str1 = str.replaceAll("\\s", "");
    System.out.println(str1);
}
}
