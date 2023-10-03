package Type_of_Singleton;


public class Operatingfactory {
    public Os getInstance(String str) {
        if (str.equals("Open")) {
            return new Android();
        } else if (str.equals("Closed")) {
            return new Ios();
        } else {
            return new Windows();
        }
    }
}
