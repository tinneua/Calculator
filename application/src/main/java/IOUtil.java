import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class IOUtil {

    static String getExpression() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    static void printToConsole(String input){
        System.out.println(input);
    }

}
