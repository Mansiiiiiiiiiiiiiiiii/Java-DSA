public class StringComparison {
    public static void main(String[] args) {
        String name1="Priyanshu";
        String name2="Nandani";
        if(name1.compareTo(name2)==0){
            System.out.println("Both strings are equal");
        }
        else if(name1.compareTo(name2)>0){
            System.out.println("Name1 is greater than Name2");
        }
        else{
            System.out.println("Name2 is greater than Name1");
        }
    }
}
