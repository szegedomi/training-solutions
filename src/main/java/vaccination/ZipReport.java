package vaccination;

public class ZipReport {

    private String zip;
    private int notVaccinated;
    private int firstVaccination;
    private int secondVaccination;

    public ZipReport(String zip) {
        this.zip = zip;
    }

    public String getZip() {
        return zip;
    }

    public int getNotVaccinated() {
        return notVaccinated;
    }

    public int getFirstVaccination() {
        return firstVaccination;
    }

    public int getSecondVaccination() {
        return secondVaccination;
    }

    public void increaseNV() {
        this.notVaccinated++;
    }

    public void increaseFV() {
        this.firstVaccination++;
    }

    public void increaseSV() {
        this.secondVaccination++;
    }

    @Override
    public String toString(){
        return zip + " irányítószámú körzetben " + this.notVaccinated + " nem beoltott, " + this.firstVaccination + " első oltáson túlesett és " + this.secondVaccination + " második oltást is megkapott, regisztrált állampolgár van.";
    }

    public String toCSVRow(){
        return zip + ";" + this.notVaccinated + ";" + this.firstVaccination + ";" + this.secondVaccination;
    }
}
