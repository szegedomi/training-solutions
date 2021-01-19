package week12.week12d02;

import exceptionclass.SimpleTime;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Street {

    private List<Site> sites = new ArrayList<>();

    public void sellSite(Site site){
        sites.add(site);
    }

    public int lastSoldHouseNumber(){
        int lastSoldSite = sites.get(sites.size()).getSite();
        int housesOnSite = 0;
        for ( Site site : sites) {
            if (site.getSite() == lastSoldSite) {
                housesOnSite++;
            }
        }
        int numbers = Fence.values().length;
        return lastSoldSite == 0 ? housesOnSite*2 : housesOnSite*2-1;
    }

    public String statisticsFence(){
        int categoriesCount = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for(Fence fence : Fence.values()){
            for(Site site : sites) {
                if(fence.equals(site.getFenceType())){
                    categoriesCount++;
                }
            }
            stringBuilder.append("Fencetype " + fence.toString() + " is at " + categoriesCount + " sites." + "\n");
            categoriesCount = 0;
        }
        return stringBuilder.toString();
    }




}
