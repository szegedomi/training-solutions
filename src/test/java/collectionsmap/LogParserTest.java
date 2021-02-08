package collectionsmap;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

class LogParserTest {
    @Test
    public void entriesWithSameIpShouldBeInSameList() {
        // Given
        String log = "176.121.45.124:2016-12-02:derzsi\n"
                + "176.121.45.124:2016-12-03:ggrrrr\n";

        // When
        Map<String, List<Entry>> entries = new LogParser().parseLog(log);

        // Then
        assertEquals(1, entries.size());
        assertEquals(2, entries.get("176.121.45.124").size());
        assertEquals("derzsi", entries.get("176.121.45.124").get(0).getLogin());
        assertEquals("176.121.45.124", entries.get("176.121.45.124").get(0).getIpAddress());
        assertEquals(LocalDate.of(2016, 12, 2), entries.get("176.121.45.124").get(0).getEntryDate());
    }
}