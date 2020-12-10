package interfacedefaultmethodes;

public interface Printable {

    int getLength();

    String getPage(int pageNumber);

    default String getColor(int pageNumber){
        return "#000000";
    }

}
