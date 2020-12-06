package methodchain;

public class Robot {

    private int distance;
    private int azimut;

    public Robot(int distance, int azimut) {
        this.distance = distance;
        this.azimut = azimut;
    }

    public Robot go(int meter){
        return new Robot(this.distance + meter, this.azimut);
    }

    public Robot rotate(int angle){
        return new Robot( this.distance, this.azimut + angle);
    }

}
