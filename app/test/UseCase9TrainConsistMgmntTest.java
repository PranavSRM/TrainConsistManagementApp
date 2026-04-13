import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase9TrainConsistMgmntTest {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    private List<Bogie> getSampleBogies() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("AC Chair", 60));
        return bogies;
    }

    @Test
    void testGrouping_BogiesGroupedByType() {
        Map<String, List<Bogie>> result =
                getSampleBogies().stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        assertTrue(result.containsKey("Sleeper"));
        assertTrue(result.containsKey("AC Chair"));
    }

    @Test
    void testGrouping_MultipleBogiesInSameGroup() {
        Map<String, List<Bogie>> result =
                getSampleBogies().stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        assertEquals(2, result.get("Sleeper").size());
    }

    @Test
    void testGrouping_DifferentBogieTypes() {
        Map<String, List<Bogie>> result =
                getSampleBogies().stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        assertEquals(3, result.keySet().size());
    }

    @Test
    void testGrouping_EmptyBogieList() {
        List<Bogie> emptyList = new ArrayList<>();

        Map<String, List<Bogie>> result =
                emptyList.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        assertTrue(result.isEmpty());
    }

    @Test
    void testGrouping_SingleBogieCategory() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));

        Map<String, List<Bogie>> result =
                list.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        assertEquals(1, result.size());
        assertTrue(result.containsKey("Sleeper"));
    }

    @Test
    void testGrouping_MapContainsCorrectKeys() {
        Map<String, List<Bogie>> result =
                getSampleBogies().stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        assertTrue(result.containsKey("Sleeper"));
        assertTrue(result.containsKey("AC Chair"));
        assertTrue(result.containsKey("First Class"));
    }

    @Test
    void testGrouping_GroupSizeValidation() {
        Map<String, List<Bogie>> result =
                getSampleBogies().stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        assertEquals(2, result.get("AC Chair").size());
    }

    @Test
    void testGrouping_OriginalListUnchanged() {
        List<Bogie> original = getSampleBogies();

        Map<String, List<Bogie>> result =
                original.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        assertEquals(5, original.size()); // unchanged
    }
}