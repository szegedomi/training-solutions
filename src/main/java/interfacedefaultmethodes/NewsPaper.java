package interfacedefaultmethodes;

import java.util.ArrayList;
import java.util.List;

public class NewsPaper implements Printable{

    private List<String> pages = new ArrayList<>();


    @Override
    public String getPage(int pageNumber) {
        return pages.get(pageNumber);
    }

    @Override
    public int getLength(){
        return pages.size();
    }

    public void addPage(String page){
        pages.add(page);
    }


}
