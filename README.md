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
### A shorthand code
```
if (t > 2) {
    System.out.println("t is greater than 2");
} else {
    System.out.println("t is less than or equal to 2");
}
```

```
(t > 2) ? System.out.println("t is greater than 2"); : System.out.println("t is less than or equal to 2");
```

### Switch
