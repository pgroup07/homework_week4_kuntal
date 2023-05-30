package methodoverriding24;

public class Test2 {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI RAte of interest: " + s.getRateOfInterest());
        System.out.println("ICICI RAte of interest: " + i.getRateOfInterest());
        System.out.println("AXIS RAte of interest: " + a.getRateOfInterest());

    }
}
