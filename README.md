# Java 101
A basic tutorial of Java language

## Features
- Write Once, Run Anywhere (cross platform)
- Object Oriented - Everything is Object
- Architecture-neutral - code executable on many processor systems
- JIT (just in time) compiler
![JIT scheme](https://aboullaite.me/content/images/2017/08/jit.png)

## Compiling
After installing JDK, we will compile and run with these commands:

``` 
javac HelloWorld.java 
java HelloWorld 
```

Class name and file name are case-sensitive and must be same.

## Simple Hello World program
```
public class HelloWorld {
    public static void main(String[] args) {
       System.out.println("Hello world");
    }
}
```

## Comments
```
// This is a single line comment.

/*
This is multiline comment.
*/
```


## Identifiers
- All identifiers should begin with a letter (A to Z or a to z), currency character ($) or an underscore (_).
- After the first character, identifiers can have any combination of characters.
- A key word cannot be used as an identifier.
- Most importantly, identifiers are case sensitive.
- Examples of legal identifiers: `age`, `$salary`, `_value`, `__1_value`.
- Examples of illegal identifiers: `123abc`, `-salary`.

## Data Types
Primitive data types:
```
int myNum = 5;               // Integer (whole number)
float myFloatNum = 5.99f;    // Floating point number
char myLetter = 'D';         // Character
boolean myBool = true;       // Boolean
String myText = "Hello";     // String
double myDouble = 20.2;     // Double
```

Non-primitive data types: Objects and wrappers (Integer, String, Float etc.)

## Operators
Mathematical:

|Operator|Name|Use|Example|
|------|------|------|------|
|+|	Addition|Adds together two values|x + y|
|-|	Subtraction|Subtracts one value from another|x - y|
|\*| Multiplication|Multiplies two values|x * y|
|/|	Division|Divides one value from another|x / y|
|%|	Modulus|Returns the division remainder|x % y|
|++|Increment|Increases the value of a variable by 1|++x|	
|--|Decrement|Decreases the value of a variable by 1|--x|

Assignment:

|Operator|Example|Same As|
|-----|-----|-----|
|=|x = 5|x = 5|
|+=|x += 3|x = x + 3|	
|-=|x -= 3|x = x - 3|
|\*=|x \*= 3|x = x \* 3|	
|/=|x /= 3|x = x / 3|
|%=|x %= 3|x = x % 3|

Comparison:

|Operator|Name|Example|
|-----|-----|-----|
|==|Equal to|x == y|
|!=|Not equal|x != y|
|>|Greater than|x > y|
|<|Less than|x < y|
|>=|Greater than or equal to|x >= y|
|<=|Less than or equal to|x <= y|

Logical:

|Operator|Name|Description|Example|
|-----|-----|-----|-----|
&&|and|true if both statements are true|x < 5 &&  x < 10|
|\|\||or|true if one of the statements is true	|x < 5 \|\| x < 4|
|!|not|reverse result|!(x < 5 && x < 10)|

## Decision Making (if-else, switch)
### Basic if-else example
```
int x = 2;
if (x > 10) {
    System.out.println("x is greater than 10");
} else if (x >= 5 && x <= 10) {
    System.out.println("x is between 5 and 10 inclusive");
} else {
    System.out.println("x is less than 5");
}
```
### Shorthand if-else
Long way:

```
if (t > 2) {
    System.out.println("t is greater than 2");
} else {
    System.out.println("t is less than or equal to 2");
}
```

Short way:

```
(t > 2) ? System.out.println("t is greater than 2"); : System.out.println("t is less than or equal to 2");
```

### Switch
```
int day = 4;
switch (day) {
    case 1:
        weekOfDay = "Monday";
        break;
    case 2:
        weekOfDay = "Tuesday";
        break;
    case 3:
        weekOfDay = "Wednesday";
        break;
    case 4:
        weekOfDay = "Thursday";
        break;
    case 5:
        weekOfDay = "Friday";
        break;
    case 6:
        weekOfDay = "Saturday";
        break;
    case 7:
        weekOfDay = "Sunday";
        break;
    default:
        System.out.println("Day is not between 1 and 7");
        break;
}
```

## Arrays
Initialize array:
```
int[] myArray = {1, 2, 3, 4, 5};
```
or
```
int[] myArray = new int[5];
myArray[0] = 1;
myArray[1] = 2;
...
```

## Loops
### for loops
Basic for loop:
```
for (int i = 0; i < 5; i++) {
    System.out.println("i = " + i);
}
```

foreach loop:
```
int[] numbers = {10, 20, 30, 40, 50};

for (int number : numbers) {
    System.out.println("number: " + number);
}
```

### while, do-while
```
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}

int j = 0;
do {
    System.out.println(j);
    j++;
} while (j < 0);
```

### break - continue
break:

```
for (int i = 0; i < 10; i++) {
    System.out.println(i);

    if (i == 5) {
        break;
    }
}
```

continue:

```
for (int j = 0; j < 10; j++) {
    if (j <= 2 || j >= 7) {
        continue;
    }
}
```

## Exceptions
```
try {
    // code block
} catch (Exception e) {
    e.printStackTrace();
}
```

Finally example (run if the exception is thrown or not)
```
try {
    System.out.println(numbers[12]);
} catch (Exception e) {
    throw e;
} finally {
    System.out.println("Finally is always printed!");
}
```
