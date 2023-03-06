import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CountingCharactersTest {

    @Disabled
    @Test
    void countingCharactersTest() {
        Map<Character, Integer> actualMap = CountingCharacters.countCharacters("Don't Stop Believing");
        assertNotNull(actualMap);

        // There are 14 distinct characters in the string "Don't Stop Believing"
        assertEquals(14, actualMap.size());

        Map<Character, Integer> expectedMap = new HashMap<>(
          Map.ofEntries(
                  Map.entry(' ', 2),
                  Map.entry('B', 1),
                  Map.entry('D', 1),
                  Map.entry('e', 2),
                  Map.entry('\'', 1),
                  Map.entry('g', 1),
                  Map.entry('i', 2),
                  Map.entry('l', 1),
                  Map.entry('n', 2),
                  Map.entry('o', 2),
                  Map.entry('p', 1),
                  Map.entry('S', 1),
                  Map.entry('t', 2),
                  Map.entry('v', 1)
          )
        );

        // Make sure the maps are equal
        assertEquals(expectedMap, actualMap);
    }

    @Disabled
    @Test
    void emptyStringTest() {
        Map<Character, Integer> actualMap = CountingCharacters.countCharacters("");
        assertNotNull(actualMap);

        // Ensure the map is empty
        assertTrue(actualMap.isEmpty());
    }
}