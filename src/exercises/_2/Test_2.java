package exercises._2;

public class Test_2 {
    public static void main(String[] args) {
        var e = new Exercise_2();
        e.setParameterValue("x", 0);
        e.test();

        e.setParameterValue("x", -1);
        e.test();

        e.setParameterValue("x", -2);
        e.test();

        e.setParameterValue("x", 1);
        e.test();

        e.setParameterValue("x", 2);
        e.test();

        e.run();
    }
}
