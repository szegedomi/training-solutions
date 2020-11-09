package array;

public class ArrayHandler {

    public boolean contains(int[] source, int itemToFind) {
        for (int element : source){
            if (element == itemToFind) { return true; }
        }
        return false;
    }

    public int find(int[] source, int itemToFind){
        for(int i=0;i < source.length; i++){
            if (source[i] == itemToFind) {
                return i;
            }
        }
        return -1;
    }

}
