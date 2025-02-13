public class TOH {
    public static void towerOfHanoi(int n, char source, char helper,char destination){
        if(n==1){
            System.out.println("Move disk 1 from "+source+" to "+destination);
            return;
        }
        else{
            towerOfHanoi(n-1, source, destination, helper);
            System.out.println("Move disk "+n+" from "+source+" to "+destination);
            towerOfHanoi(n-1, helper, source, destination);
        }
    }
    public static void main(String args[]){
        int n = 3;
        towerOfHanoi(n, 'S', 'H', 'D');
    }
}
