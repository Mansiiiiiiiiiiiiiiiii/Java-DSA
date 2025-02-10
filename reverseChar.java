public class reverseChar {
   public static void main(String[] args) {
    StringBuilder name = new StringBuilder("Prateek");
    
    for(int i=0; i<name.length()/2; i++){
        int front=i;
        int back = name.length()-1-i;

        char temp = name.charAt(front);
        char temp2 = name.charAt(back);

        name.setCharAt(front, temp2);
        name.setCharAt(back, temp);
    }
    System.out.println(name);
   }
}
