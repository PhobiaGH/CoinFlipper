public class CoinFlipper {
  public static void main(String[] args) {
  	String Heads = "Heads";
    String Tails = "Tails";
    int randomNum = (int)(Math.random() * 2);
    
    String result = (randomNum > 0) ? Heads : Tails;
	System.out.println(result);
  }
}
