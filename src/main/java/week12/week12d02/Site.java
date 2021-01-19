package week12.week12d02;

public class Site {

    private int length;
    private int site;
    private Fence fenceType;

    public Site(int length, int site, Fence fenceType) {
        this.length = length;
        this.site = site;
        this.fenceType = fenceType;
    }

    public int getLength() {
        return length;
    }

    public int getSite() {
        return site;
    }

    public Fence getFenceType() {
        return fenceType;
    }
}
