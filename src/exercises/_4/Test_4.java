package exercises._4;

public class Test_4 {
    public static void main(String[] args) {
        var e = new Exercise_4();
        e.setParameterValue("X", 0);
        e.test();

        e.setParameterValue("X", 2);
        e.test();

        e.setParameterValue("X", 10);
        e.test();

        e.run();
    }
}
