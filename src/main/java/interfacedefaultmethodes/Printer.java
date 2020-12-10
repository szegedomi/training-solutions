package interfacedefaultmethodes;

public class Printer {

    public String print(Printable printable){
        StringBuilder stringBuilder = new StringBuilder();

        for( int i = 0; i < printable.getLength(); i++){
            if(!"#000000".equals(printable.getColor(i))){
                stringBuilder.append("[" + printable.getColor(i) + "]");
            }
            stringBuilder.append(printable.getPage(i)).append("\n");
        }
        return stringBuilder.toString();
    }



}
