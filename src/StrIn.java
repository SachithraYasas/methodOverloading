public class StrIn {
    void display(double a) {
        System.out.println("Double!");
    }

    void display(String b) {
        System.out.println("String!");
    }

    public static void main(String[] args) {
        StrIn si = new StrIn();
        si.display("sachi");
        si.display(78.56);
    }
}

