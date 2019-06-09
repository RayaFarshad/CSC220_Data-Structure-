/**
 * DO NOT CHANGE
 *
 * Visit record could not be created
 * when the date information was invalid.
 */
public class BadVisitDateException extends Exception {

    public BadVisitDateException(String reason) {
        super(reason);
    }
}
