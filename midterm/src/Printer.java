public class Printer {
    private static Printer p1;
    private Printer(){

    }

    public static Printer getInstance(){
        if(p1 == null){
            p1 = new Printer();
        }
        return p1;
    }

    public String getConnection(){
        return this.toString();
    }
}
