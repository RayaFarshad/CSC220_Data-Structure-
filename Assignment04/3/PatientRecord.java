

public class PatientRecord {

    private int id;
    private String date;
    private String reasonForVisit;
    private String treatmentPrescribed;

    public PatientRecord(int anId, int month, int day, int year, String reason, String treatment) throws BadVisitDateException{
        
        if(month < 1 || month > 12 ){
             throw new BadVisitDateException("Month not in range 1-12");
        }
             else if(day < 1 || day > 31 ){
                 throw new BadVisitDateException("Day not in range 1-31");
             }
             else if(year < 1900){                
                 throw new BadVisitDateException("Year not greater than 1900");                                    
                     }
        
        
       this.id = anId;
       this.date = month + "/" + day + "/" + year;
       this.reasonForVisit = reason;
       this.treatmentPrescribed = treatment;
    }

    /**
     * Returns the patient's ID number.
     */
    public int getPatientID() {
        return this.id;
    } 

    /**
     * Returns the patient's visit date.
     */
    public String getVisitDate() {
        return this.date;
    } 

    /**
     * Returns the patient's reason for visiting.
     */
    public String getReasonForVisit() {
        return this.reasonForVisit;
    } 

    /**
     * Returns the patient's prescribed treatment.
     */
    public String getTreatmentPrescribed() {
        return this.treatmentPrescribed;
    } 

    @Override
    public int hashCode() {
        
        int prime = 37;
        int result = 17;
        result = prime * result + date.hashCode();
        result = prime * result + reasonForVisit.hashCode();
        result = prime * result + treatmentPrescribed.hashCode();
        return result;
        //return this.getVisitDate().hashCode();
        
        
    } 

    @Override
    public boolean equals(Object other) {
        if(other instanceof PatientRecord){
            PatientRecord obj = (PatientRecord) other;
            return (obj.date.equals(this.date)&&
                    obj.reasonForVisit.equals(this.reasonForVisit)&&
                    obj.treatmentPrescribed.equals(this.treatmentPrescribed));
        }else{
            return false;
            
        }
    } 

    
    
    @Override
    public String toString() {
       
      return id + " [" + date + "] " + "Complaint: " + reasonForVisit + " Prescribed: " + treatmentPrescribed; 
    } 
} 
