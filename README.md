# Map Lab

## Learning Goals

- Create and use Maps

## Instructions

In this lab we will practice creating `Map` objects, iterating through them,
and using various `Map` methods!

Create a program that counts the number of characters in a given message. The
message should come from user input and the program should return the character
followed by the number of times it appeared in the message. For example:

```plaintext
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

Follow the given tips and hints:

- Implement a `Map` object that has a Character for the key and an Integer for
  the value.
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

## Starter Code and Sample Output

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

Consider the following sample output:

```plaintext
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

```plaintext
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
