package yycpetresort;

import java.util.List;

public class CareProfile {
    private int id;
    private String feedingDetails;
    private List<String> medications;
    private String medicationInstructions;

    // these are the getters & setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFeedingDetails() {
        return feedingDetails;
    }

    public void setFeedingDetails(String feedingDetails) {
        this.feedingDetails = feedingDetails;
    }

    public List<String> getMedications() {
        return medications;
    }

    public void setMedications(List<String> medications) {
        this.medications = medications;
    }

    public String getMedicationInstructions() {
        return medicationInstructions;
    }

    public void setMedicationInstructions(String medicationInstructions) {
        this.medicationInstructions = medicationInstructions;
    }
}