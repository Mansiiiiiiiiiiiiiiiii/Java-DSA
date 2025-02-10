public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Kinjal");
        System.out.println(name);
        //charAt
        System.out.println(name.charAt(3));
        
        //setCharAt
        name.setCharAt(3, 'a');
        System.out.println(name);
        
        //insert
        name.insert(6, ' ');
        System.out.println(name);
        
        //delete
        name.delete(6, 7);
        System.out.println(name);

        //append
        name.append(" Mahotra");
        System.out.println(name);
    }
}
