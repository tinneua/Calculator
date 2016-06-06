import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Launcher {
    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        Launcher launcher = applicationContext.getBean("launcher", Launcher.class);
        Calculator calculator = applicationContext.getBean("calculator", Calculator.class);
        launcher.execute(calculator);
    }

    private void execute(Calculator calculator) throws IOException {
        IOUtil.printToConsole("Please enter your expression:");
        String inputExpression = IOUtil.getExpression();
        String result = calculator.getCalculation(inputExpression);
        IOUtil.printToConsole("Result is:");
        IOUtil.printToConsole(inputExpression + " = " + result);
    }


}
