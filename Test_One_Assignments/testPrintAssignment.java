public class TestPrint{
    public static void main(String [] args){
        nPrintln(5, "welcome to java");
    }
    public static void nPrintln(int n, String msg){
        for(int i=0; i<n; i++){
            System.out.println(msg);
        }
    }
}