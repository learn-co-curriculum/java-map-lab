# Map Lab

## Learning Goals

- Practice using the Map interface.

## Introduction

In this lab we will practice creating `Map` objects, iterating through them,
and using various `Map` methods!

Fork and clone this repository. When you do, you will see a `CountingCharacters`
class and a `CountingCharactersTest` for unit testing.

## Instructions

Create a program that counts the number of characters in a given message. The
message should come from user input and the program should return the character
followed by the number of times it appeared in the message. For example:

```text
Enter a sentence for me to count the characters:
Hello World!
Character : Number of times a character appeared
  : 1
! : 1
r : 1
d : 1
e : 1
W : 1
H : 1
l : 3
o : 2
```

Follow the given instructions and tips:

- Start by writing the `countCharacters(String message)` method.
  - Implement a `Map` object that has a `Character` for the key and an `Integer`
    for the value.
  - Iterate through a `Map` like we did in the lesson previously. For reference,
    here is that example from the lesson again:

  ```java
  import java.util.Map;
  import java.util.HashMap;
  
  public class Example {
     public static void main(String[] args) {
        HashMap<String, Character> studentGrades = new HashMap<String, Character>();
  
        studentGrades.put("Dustin", 'B');
        studentGrades.put("Suzie", 'A');
        studentGrades.put("Mike", 'C');
  
        for (Map.Entry<String, Character> studentGrade : studentGrades.entrySet()) {
           System.out.println(studentGrade.getKey() + "'s grade is " + studentGrade.getValue());
        }
     }
  }
  ```

  - Remove the `@Disabled` annotation from the `countingCharactersTest()`
    method in the unit test and run the test when you think you have finished
    writing the `countCharacters(String message)` method.
  - Remove the `@Disabled` annotation from the `emptyStringTest()` method in the
    unit test and run the test.
- Write the `main` method in the `CountingCharacters` class.
  - Use a `Scanner` object to take in user input.
  - Call the `countCharacters(String message)` method appropriately.
  - Iterate through the map that is returned back and display the output in the
    following format:
    - Character : Number of times a character appeared
- Run the program using the output example above and the sample output below.

Make sure all unit tests in the `CountingCharactersTest` class pass. You may
also run the tests and program with the IntelliJ debugger, or the Java
Visualizer.

## Starter Code

Consider the following starter code to get started. Notice the `main()` method
and the `countCharacters()` methods are for you to write your code.

```java
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        // Your code here
    }

    public static Map<Character, Integer> countCharacters(String message) {
        // Your code here
    }
}
```

```java
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
```

## Sample Output

Consider the following sample output:

```text
Enter a sentence for me to count the characters:
Flatiron School rules!
Character : Number of times a character appeared
  : 2
a : 1
! : 1
c : 1
e : 1
F : 1
h : 1
i : 1
l : 3
n : 1
o : 3
r : 2
S : 1
s : 1
t : 1
u : 1
```

```text
Enter a sentence for me to count the characters:
the quick brown fox jumps over the lazy dog
Character : Number of times a character appeared
  : 8
a : 1
b : 1
c : 1
d : 1
e : 3
f : 1
g : 1
h : 2
i : 1
j : 1
k : 1
l : 1
m : 1
n : 1
o : 4
p : 1
q : 1
r : 2
s : 1
t : 2
u : 2
v : 1
w : 1
x : 1
y : 1
z : 1
```
