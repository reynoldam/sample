public class SwapLastTwo {
   static String stringSwap(String string, int i, int j) {
      StringBuilder sb = new StringBuilder(string);
      sb.setCharAt(i, string.charAt(j));
      sb.setCharAt(j, string.charAt(i));
      return sb.toString();
   }

   public static void main(String args[]) {
      String str = "Mathew";
      System.out.println(str);
      System.out.println(stringSwap(str, 3,4));
   }
}