# Java 101
A basic tutorial of Java language

## Features
- Write Once, Run Anywhere (cross platform)
- Object Oriented - Everything is Object
- Architecture-neutral - code executable on many processor systems
- JIT (just in time) compiler
![JIT scheme](https://aboullaite.me/content/images/2017/08/jit.png)

## Simple Hello World program
```
public class HelloWorld {
    public static void main(String[] args) {
       System.out.println("Hello world");
    }
}
```

## Compiling
After installing JDK, we will compile and run with these commands:

```
javac HelloWorld.java 
java HelloWorld 
```

Class name and file name are case-sensitive and must be same.

## Comments
```
// This is a single line comment.

/*
This is multiline comment.
*/
```

## Variables and Data Types
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

## Identifiers
- All identifiers should begin with a letter (A to Z or a to z), currency character ($) or an underscore (_).
- After the first character, identifiers can have any combination of characters.
- A key word cannot be used as an identifier.
- Most importantly, identifiers are case sensitive.
- Examples of legal identifiers: `age`, `$salary`, `_value`, `__1_value`.
- Examples of illegal identifiers: `123abc`, `-salary`.

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

## Strings
Strings must be opened and closed with double quotes.
```
String firstName = "John";
String lastName = "Doe";
System.out.println(firstName + " " + lastName);
```

We must escape double quotes in strings:
```
String txt = "We are the so-called "Vikings" from the north.";
```

Correct way:
```
String txt = "We are the so-called \"Vikings\" from the north.";
```


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
(t > 2) ? System.out.println("t is greater than 2") : System.out.println("t is less than or equal to 2");
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

Size of array: `myArray.length`

You access an array element by referring to the index number.


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
When an error occurs, Java will normally stop and generate an error message. The technical term for this is: Java will throw an exception (throw an error).

```
try {
    // code block
} catch (Exception e) {
    // when exception catched
}
```

Finally example (run if the exception is thrown or not)
```
try {
    x = 5 / 0;
} catch (Exception e) {
    throw e;
} finally {
    System.out.println("Finally is always printed!");
}
```

## Methods
See MethodDemo.java for details

```
static void printMethod() {
    System.out.println("Called printMethod directly with no arguments");
}

static void printMethod(Integer n) {
    System.out.println("The entered value is " + n);
}

public static void main(String[] args) {
    printMethod();
    printMethod(3);
    printMethod(null);
}
```
static means that the method belongs to the class and not an object of the class.
void means that this method does not have a return value. 

## Classes/Objects
Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.
In Java, an object is created from a class. Example:
```
public class MyClass {
  int x = 5;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    System.out.println(myObj.x);
  }
}
```

Multiple classes (compile one file and it generates two classes) :

MyClass.java

```
public class MyClass {
  int x = 5;
}
```

YourClass.java

```
public class YourClass {
  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    System.out.println(myObj.x);
  }
}
```

### Attributes

We can access and modify attributes (fields) by `.` sign unless it is not declared final. 

```
public class MyClass {
  int x = 5;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    System.out.println(myObj.x);
    myObj.x = 10;
    System.out.println(myObj.x);
  }
}
```
### Methods

We can declare methods as static or public. Public methods require that instantiating a new object, while static does not.

Static method example:

```
public class MyClass {
  static void myMethod() {
    System.out.println("Hello World!");
  }

  public static void main(String[] args) {
    myMethod();
  }
}
```

Public method example:

```
public class Car {
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  public static void main(String[] args) {
    Car myCar = new Car();
    myCar.fullThrottle(); 
    myCar.speed(200);  
  }
}
```

We can compile and run them also in separate classes.

### Constructor

```
public class MyClass {
  int x;  
  
  public MyClass() {
    x = 5;
  }

  public static void main(String[] args) {
    MyClass myObj = new MyClass(); 
    System.out.println(myObj.x);
  }
}
```
Note that the constructor name must match the class name, and it cannot have a return type (like void).
Also note that the constructor is called when the object is created. All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. However, then you are not able to set initial values for object attributes.

Example with many parameters:

```
public class Car {
  int modelYear;
  String modelName;

  public Car(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Car myCar = new Car(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}
```

### Modifiers

Access level modifiers:

|Modifier|Description|Uses|
|-----|-----|-----|
|public|The class is accessible by any other class|classes, methods, attributes, constructors|
|private|The code is only accessible within the declared class|methods, attributes, constructors|
|protected|The code is accessible in the same package and subclasses|methods, attributes, constructors|
|default|The code is only accessible in the same package|classes, methods, attributes, constructors|

Non-access level modifiers:

|Modifier|Description|Uses|
|-----|-----|-----|
|final|Attributes and methods cannot be overridden/modified and class cannot be inherited|classes, methods, attributes|
|static|Attributes and methods belongs to the class, rather than an object|methods, attributes|
|abstract|Can only be used in an abstract class, and can only be used on methods|methods|


### Encapsulation

The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
- declare class variables/attributes as private (only accessible within the same class)
- provide public setter and getter methods to access and update the value of a private variable

Example: (also see GetSetPerson.java)
Person.java
```
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
	    this.name = name;
    }

	public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```

Why Encapsulation?
- Better control of class attributes and methods
- Class variables can be made read-only (if you omit the set method), or write-only (if you omit the get method)
- Flexible: the programmer can change one part of the code without affecting other parts
- Increased security of data

### Inheritance

There are two class types for inheritance:
- subclass (child) - the class that inherits from another class
- superclass (parent) - the class being inherited from

We use `extends` keyword for inheriting.

Example:

```
class Vehicle {
  protected String brand = "Ford";  
  
  public void honk() {       
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";
  public static void main(String[] args) {
    Car myCar = new Car();
    myCar.honk();

    System.out.println(myCar.brand + " " + myCar.modelName); 
  }
}
```

It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.

### Polymorphism
Polymorphism overrides parent class methods to perform different tasks. This allows us to perform a single action in different ways.

```
class Animal {
  public void animalSound() {
    System.out.println("Ses yap");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("Hav hav");
  }
}
```

## Abstraction

### Abstract classes
Data abstraction is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces.

Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class). It cannot be instantiated.
Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

### Interface
An interface is a completely "abstract class" that is used to group related methods with empty bodies:

```
interface Animal {
  public void animalSound();
  public void run(); // 
}
```

We use `implements` keyword for implementing interfaces.

Class can implement multiple interfaces:
```
interface FirstInterface {
  public void myMethod(); // interface method
}

interface SecondInterface {
  public void myOtherMethod(); // interface method
}

// DemoClass "implements" FirstInterface and SecondInterface
class DemoClass implements FirstInterface, SecondInterface {
  public void myMethod() {
    System.out.println("Some text..");
  }
  public void myOtherMethod() {
    System.out.println("Some other text...");
  }
}
```

- Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
- Interface methods do not have a body - the body is provided by the "implement" class
- On implementation of an interface, you must override all of its methods
- Interface methods are by default abstract and public
- Interface attributes are by default public, static and final
- An interface cannot contain a constructor (as it cannot be used to create objects)

## Enums
An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters:

```
enum Level {
  LOW,
  MEDIUM,
  HIGH
}
```

We can declare enums outside or inside class: (outside example is below)
```
public class MyClass { 
  enum Level {
    LOW,
    MEDIUM,
    HIGH
  }

  public static void main(String[] args) { 
    Level myVar = Level.MEDIUM; 
    System.out.println(myVar); 
  } 
}
```

An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).

## Packages
A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code. 
