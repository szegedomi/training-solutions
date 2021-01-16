package ioreadwritebytes;

public class Temperatures {

    private byte[] data;

    public Temperatures(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }

    public double getYearAverage(){
        double result = 0;
        for (byte b : data){
            result += b;
        }
        return result/365;
    }

    public double getMonthAverage(){
        double result = 0;
        for (int i = 0; i < 30; i++){
            result += data[data.length - 1 - i];
        }
        return result/30;
    }

}
