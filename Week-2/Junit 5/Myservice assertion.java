public class Myservice {

    public static void main(String[] args) {
        // Use runtime logic to avoid dead code
        Object obj = getNullObject(); // could return null
        if (obj == null) {
            System.out.println("Object is null");
        } else {
            System.out.println("Object is not null");
        }

        Object newObj = getNonNullObject(); // could return non-null
        if (newObj != null) {
            System.out.println("Object is not null");
        } else {
            System.out.println("Object is null");
        }
    }

    static Object getNullObject() {
        return Math.random() > 0.5 ? null : new Object(); // returns null or object randomly
    }

    static Object getNonNullObject() {
        return new Object(); // always returns object
    }
}
