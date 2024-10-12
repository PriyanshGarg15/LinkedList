public class test {
    String outerField = "Outer Field";

    public static void outerMethod() {
        System.out.println("Outer Method");
    }

    class InnerClass {
        public void accessOuter() {
            // Accessing outer class's instance variable
            System.out.println("Accessing: " + outerField);

            // Calling outer class's instance method
            outerMethod();
        }
    }

    public static void main(String[] args) {
        // Create an instance of the outer class
        test outer = new test();

        // Create an instance of the inner class
        InnerClass inner = outer.new InnerClass();

        // Call the method that accesses the outer class's members
        inner.accessOuter();
    }
}
