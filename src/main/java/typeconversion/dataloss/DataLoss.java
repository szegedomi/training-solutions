package typeconversion.dataloss;

public class DataLoss {

    public void dataLoss(){
        long i = 0;
        for (int j=0; j<3; j++) {
            while (i == (long) ((float) i)) {
                i++;
            }
            System.out.println(i++);
        }
    }

    public static void main(String[] args) {

        new DataLoss().dataLoss();

    }

}
