package task3;

public class InvalidFormatting extends java.lang.Throwable {
    public final static String Error = "An invalid format has been detected";

    public InvalidFormatting() {
        super(InvalidFormatting.Error);
    }

    public InvalidFormatting(String additionalMsg) {
        super(InvalidFormatting.Error + "\n" + additionalMsg);
    }
}