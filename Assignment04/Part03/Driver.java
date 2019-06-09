
/**
 * 
 * DO NOT CHANGE
 *
 * A driver for the class PatientRecord.
 */
public class Driver {

    public static void main(String args[]) {
        PatientRecord test1;
        PatientRecord test2;

        try {                                 
            test1 = new PatientRecord(101, 12, 15, 2006, "cough", "bed rest");
            System.out.println("Patient Record created:  " + test1);
            System.out.println("It has hash code " + test1.hashCode());
            
        }
        catch (BadVisitDateException e) {
            System.out.println("Creation failed " + e);
        } 
    

        try {
            test2 = new PatientRecord(101, 12, 17, 2006, "high fever", "antibiotics");
            System.out.println("Patient Record created:  " + test2);
            System.out.println("It has hash code " + test2.hashCode());
        } 
        catch (BadVisitDateException e) {
            System.out.println("Creation failed " + e);
        }

        try {
            test2 = new PatientRecord(101, 17, 17, 2006, "high fever", "antibiotics");
            System.out.println("Patient Record created:  " + test2);
            System.out.println("It has hash code " + test2.hashCode());
        } 
        catch (BadVisitDateException e) {
            System.out.println("Creation failed " + e);
        }

        try {
            test2 = new PatientRecord(101, 12, 92, 2006, "high fever", "antibiotics");
            System.out.println("Patient Record created:  " + test2);
            System.out.println("It has hash code " + test2.hashCode());
        }
        catch (BadVisitDateException e) {
            System.out.println("Creation failed " + e);
        } 

        try {
            test2 = new PatientRecord(101, 12, 17, 06, "high fever", "antibiotics");
            System.out.println("Patient Record created:  " + test2);
            System.out.println("It has hash code " + test2.hashCode());
        }
        catch (BadVisitDateException e) {
            System.out.println("Creation failed " + e);
        } 
    } 
}


