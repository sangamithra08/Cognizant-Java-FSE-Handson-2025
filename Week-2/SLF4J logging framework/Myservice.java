import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Myservice {
    private static final Logger logger = LoggerFactory.getLogger(Myservice.class);

    public void performTask() {
        logger.warn("⚠️  This is a warning message");
        logger.error("❌ This is an error message");
    }

    public static void main(String[] args) {
        Myservice service = new Myservice();
        service.performTask();
    }
}
