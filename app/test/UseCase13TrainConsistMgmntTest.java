import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase13TrainConsistMgmntTest {

    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    private List<Bogie> getSampleBogies() {
        return Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24),
                new Bogie("General", 90)
        );
    }

    @Test
    void testLoopFilteringLogic() {
        List<Bogie> result = new ArrayList<>();

        for (Bogie b : getSampleBogies()) {
            if (b.capacity > 60) {
                result.add(b);
            }
        }

        assertEquals(2, result.size());
    }

    @Test
    void testStreamFilteringLogic() {
        List<Bogie> result = getSampleBogies().stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        assertEquals(2, result.size());
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        List<Bogie> loop = new ArrayList<>();
        for (Bogie b : getSampleBogies()) {
            if (b.capacity > 60) loop.add(b);
        }

        List<Bogie> stream = getSampleBogies().stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        assertEquals(loop.size(), stream.size());
    }

    @Test
    void testExecutionTimeMeasurement() {
        long start = System.nanoTime();

        List<Bogie> result = getSampleBogies().stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long end = System.nanoTime();

        long duration = end - start;

        assertTrue(duration > 0);
    }

    @Test
    void testLargeDatasetProcessing() {
        List<Bogie> large = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            large.add(new Bogie("Sleeper", i % 100));
        }

        List<Bogie> result = large.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        assertTrue(result.size() > 0);
    }
}