package my.favourite.code;

public class Usn {
    public static int usnTax6(int earnings){
        int usn = (earnings * 6 / 100);
        if (usn >= 0) {
            return usn;
        } else {
            return 0;
        }
    }
}
