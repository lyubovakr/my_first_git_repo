public class MyFirstClass {
    public static String returnString(int x) {
        return "John";
    }

    public static String returnString(String s) {
        return "Mary";
    }

    public static String returnStringFromTwoInputs(String s, int i) {
        return "String from String int";
    }

    public String returnStringFromTwoInputs(int i, String s) {
        return "String from int String";
    }

    public String returnGreeting(String name, int age) {
        String pattern = "Hello %s,how are you. looks like you`re %s";
        return String.format(pattern, name, age);

    }


    public static void main(String[] args) {
        String result = returnString("Hello");
        System.out.println(result);
        MyFirstClass myFirstClass = new MyFirstClass();
        String result2 = myFirstClass.returnStringFromTwoInputs(50, "Foo");

        byte b = (byte) 127;
        short s = 32767;
        int i = 454545;
        long l = 121212122121212121L;
        float f = 10.5F;
        double d = 100.80;
        boolean bo1 = true;
        boolean bo2 = false;
        char c = "A".charAt(0);

        System.out.println(c);

        String s2 = "Mary";
        String s3 = new String("Mary");
        String s4 = "Mary";

//        System.out.println(s2.equals("John"));
        System.out.println("John".equals(s2));

        String s5 = "Foo";
        String s6 = "Foo";
        System.out.println(s5.equals(s6));

        System.out.println(myFirstClass.returnGreeting("Mary", 25));

        double d4 = 10.123456789;
        double d5 = 1000.123456789;
        System.out.println("Rounded double %.2f".format(String.valueOf(d4)));
        System.out.println("Rounded double %.2f".format(String.valueOf(d5)));
        System.out.println("Rounded double %10.2f".format(String.valueOf(d4)));
        System.out.println("Rounded double %10.2f".format(String.valueOf(d5)));

        MySecondClass secondClassInstance = new MySecondClass();
        System.out.println(secondClassInstance.returnBar());




    }
}
