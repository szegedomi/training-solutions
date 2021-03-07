package vaccination;

public enum VaccinationType {

    PFIZER_BIONTECH("Pfizer Biontech"), ASTRA_ZENECA("Astra Zeneca"), SINOFARM("Sinofarm"), SPUTNIK("Sputnik"), MODERNA("Moderna");

    private String type;

    VaccinationType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
