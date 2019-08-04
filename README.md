# java101

## Javanın özellikleri
Burayı doldur

## Simple Hello World program
```
public class HelloWorld {
    public static void main(String[] args) {
       System.out.println("Hello world");
    }
}
```

## Data Types


## Decision Making (if-else, switch)
### Basic if-else example
```
int x = 2;
if (x > 10) {
    System.out.println("x 10'dan büyük");
} else if (x >= 5 && x <= 10) {
    System.out.println("x 5 ile 10 arasında");
} else {
    System.out.println("x 5'ten küçük");
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
See code for more details
```
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
