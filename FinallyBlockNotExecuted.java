package TestAutomationCentral;

public class FinallyBlockNotExecuted {
    public static void main(String[] args) {
        //TestAutomationCentral.com
        //Call below methods one by one
        systemExitFinally();
        infiniteLoopFinally();
    }

    public static void systemExitFinally() {
        System.out.println("#1 - System.exit(0)");
        try {
            System.out.println("Hello from try");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Hello from catch");
            System.exit(0);
        } finally {
            System.out.println("Hello from finally");
        }
    }

    public static void infiniteLoopFinally() {
        System.out.println("#2 - Infinite Loop");
        try {
            System.out.println("Hello from try");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Hello from catch");
            while (true) {

            }
        } finally {
            System.out.println("Hello from finally");
        }
    }
}

