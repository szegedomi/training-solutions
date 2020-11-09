package arrayofarrays;

public class ArrayOfArraysMain {

    private static int[][] multiplicationTable(int size){
        int[][] table = new int[size][size];
        for (int i=0;i<size; i++){
            for(int j =0;  j<size; j++){
                table[i][j]=(i+1)*(j+1);
            }
        }
        return table;
    }

    private static void printArrayOfArrays(int[][] a){
        for (int i=0;i<a.length; i++){
            for(int j =0;  j<a[i].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    private static int[][] triangularMatrix(int size){
        int[][] table = new int[size][];
        for (int i=0;i<size; i++){
            table[i] = new int[i+1];
            for(int j =0;  j<i+1; j++){
                table[i][j]=i;
            }
        }
        return table;
    }

    public static void main(String[] args) {
        int size=5;
        int[][] a = new int[size][];
        a = multiplicationTable(5);
        printArrayOfArrays(a);
        int[][] b = new int[size][];
        b=triangularMatrix(size);
        printArrayOfArrays(b);
    }

}
