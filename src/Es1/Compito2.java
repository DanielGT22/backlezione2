package Es1;

public class Compito2 {
    public static void main(String[] args) {

        int anno = 2012;
        if ( anno % 4 == 0 && anno % 100 != 0 ||  anno % 400 == 0) {
            System.out.println("leap year");
        } else {
            System.out.println("nope");
        }
    }
}
