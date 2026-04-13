import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase10TrainConsistMgmntTest {

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
        return bogies;
    }

    @Test
    void testReduce_TotalSeatCalculation() {
        int total = getSampleBogies().stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        assertEquals(222, total);
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {
        int total = getSampleBogies().stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        assertTrue(total > 0);
    }

    @Test
    void testReduce_SingleBogieCapacity() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));

        int total = list.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        assertEquals(72, total);
    }

    @Test
    void testReduce_EmptyBogieList() {
        List<Bogie> empty = new ArrayList<>();

        int total = empty.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        assertEquals(0, total);
    }

    @Test
    void testReduce_CorrectCapacityExtraction() {
        List<Integer> capacities = getSampleBogies().stream()
                .map(b -> b.capacity)
                .collect(Collectors.toList());

        assertEquals(Arrays.asList(72, 56, 24, 70), capacities);
    }

    @Test
    void testReduce_AllBogiesIncluded() {
        int total = getSampleBogies().stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        int manualSum = 72 + 56 + 24 + 70;

        assertEquals(manualSum, total);
    }

    @Test
    void testReduce_OriginalListUnchanged() {
        List<Bogie> original = getSampleBogies();

        int total = original.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        assertEquals(4, original.size()); // unchanged
    }
}