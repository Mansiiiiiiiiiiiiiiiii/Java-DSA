import java.nio.charset.Charset;

public class StringCons {
    //Variables in methods
    static byte[] b_arr={65,66,67,68,69,70};
    static Charset cs = Charset.defaultCharset();
    static char[] char_arr = {'K','i','n','j','a','l','M','a','h','o','t','r','a'};
    static int[] uni_code = {75,105,110,106,97,108,77,97,104,111,116,114,97};
    static StringBuffer s_buffer = new StringBuffer("Kinjal");
    static StringBuilder s_builder = new StringBuilder("Mahotra"); 
    public static void main(String[] args) {
        //Method 1
        String s1 = new String(b_arr);
        System.out.println(s1);
        //Method 2
        String s2 = new String(b_arr, cs);
        System.out.println(s2); 
        //Method 3
        String s3 = new String(char_arr);
        System.out.println(s3);
        //Method 4  
        String s4 = new String(char_arr, 6, 7);
        System.out.println(s4);
        //Method 5
        String s5 = new String(uni_code, 0, 7);
        System.out.println(s5);
        //Method 6
        String s6 = new String(s_buffer);
        System.out.println(s6);
        //Method 7
        String s7 = new String(s_builder);
        System.out.println(s7);
        //Method 8
        String s8 = new String("Kinjal Mahotra");
        System.out.println(s8);
        //Method 9
        String s9 = new String("Kinjal Mahotra");
        System.out.println(s9);
    }
}
