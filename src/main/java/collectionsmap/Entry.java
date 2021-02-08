package collectionsmap;

import java.time.LocalDate;

public class Entry {

    private String ipAddress;
    private String login;
    private LocalDate entryDate;

    public Entry(String ipAddress, String login, LocalDate date) {
        this.ipAddress = ipAddress;
        this.login = login;
        this.entryDate = date;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getLogin() {
        return login;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }



}
