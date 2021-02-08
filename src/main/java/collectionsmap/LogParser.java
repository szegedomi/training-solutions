package collectionsmap;

import java.io.Reader;
import java.time.LocalDate;
import java.util.*;

public class LogParser {

    public Map<String, List<Entry>> parseLog(String log){
        Scanner scanner = new Scanner(log);
        String line;
        Entry item;
        Map<String, List<Entry>> result = new HashMap<>();
        while(scanner.hasNext()) {
            line = scanner.nextLine();
            System.out.println(line);
            String[] entry = line.split(":");
            item = new Entry(entry[0], entry[2], parseDate(entry[1]));
            fillItem(result, item);
        }
        return result;
    }

    private LocalDate parseDate(String date){
        String[] ld = date.split("-");
        return LocalDate.of(Integer.parseInt(ld[0]), Integer.parseInt(ld[1]), Integer.parseInt(ld[2]));

    }
    private void fillItem(Map<String, List<Entry>> entries, Entry entry){
        if(!entries.containsKey(entry.getIpAddress())){
            entries.put(entry.getIpAddress(), new ArrayList<>());
        }

        entries.get(entry.getIpAddress()).add(entry);
    }

    public static void main(String[] args) {

        String log = "176.121.45.124:2016-12-02:derzsi\n"
                + "176.121.45.124:2016-12-03:ggrrrr\n";

        new LogParser().parseLog(log);

    }


}
