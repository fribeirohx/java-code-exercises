package exercises._3;

public class Test_3 {
    public static void main(String[] args) {
        var e = new Exercise_3();
        e.setParameterValue("A", 0);
        e.setParameterValue("B", 0);
        e.test();

        e.setParameterValue("A", 4);
        e.setParameterValue("B", 2);
        e.test();

        e.setParameterValue("A", 3);
        e.setParameterValue("B", 3);
        e.test();
    }
}
