public class Strings {
    public static void main(String[] args) {
        String firstName = "Priyanshi";
        String lastName =" Gupta";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());

        //CharAt
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
