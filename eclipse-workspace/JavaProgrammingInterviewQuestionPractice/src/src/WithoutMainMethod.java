package src;
import static java.lang.System.*;

public class WithoutMainMethod {
    static
    {
        out.println("hello"); // Not working in jdk 21
        exit(0);
    }
}
