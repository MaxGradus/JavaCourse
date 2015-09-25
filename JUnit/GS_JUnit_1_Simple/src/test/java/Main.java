import org.junit.runner.Description;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;


public class Main {

    public static void main(String[] args) {

        // call from main
        JUnitCore core = new JUnitCore();
        core.addListener(new JUnitRunListener());
        Result result = core.run(CalcTest.class, CalcTest2.class);
        System.out.println("result = " + result);
    }



    public static class JUnitRunListener extends RunListener {

        @Override
        public void testStarted(Description desc) {
            System.out.println("Started:" + desc.getDisplayName());
        }

        @Override
        public void testFinished(Description desc) {
            System.out.println("Finished:" + desc.getDisplayName());
        }

        @Override
        public void testFailure(Failure fail) {
            System.out.println("Failed:" + fail.getDescription().getDisplayName() + " [" + fail.getMessage() + "]");
        }
    }
}
