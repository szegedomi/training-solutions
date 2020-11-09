package array;



public class ArrayMain {

    public static void main(String[] args) {

        String[] napok = {"hetfo", "kedd", "szerda", "csutortok", "pentek", "szombat", "vasarnap"};
        System.out.println(napok[1]);
        System.out.println(napok.length);

        int[] squares = new int[5];

        for (int i=0; i<5; i++){
            squares[i]= (int) Math.pow(2,i);
        }
        for (int i=0; i<5; i++){
            System.out.println(squares[i]);
        }

        boolean[] trueOrFalse = new boolean[6];
        for (int i=0; i<6; i++){
            trueOrFalse[i] = (i % 2) > 0;
        }
        for (int i=0; i<6; i++) {
            System.out.println(trueOrFalse[i]);;
        }


        }
}
