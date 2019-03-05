package practicetest;

import java.util.Scanner;

public class ConsoleView implements View {

    @Override

    public String get() {

         String input;

         System.out.println(">");

         Scanner s = new Scanner(System.in);

         input = s.nextLine();

         s.close();

         return input;

    }

    @Override

    public <T> void say(T message) {

         System.out.println(message);

    }

    @Override

    public void start() {

         System.out.println("STARTING");

    }

    @Override

    public void stop() {

         System.out.println("bye!");

    }

}
