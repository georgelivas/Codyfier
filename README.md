# Codyfier

### A Java Indenter for the 21st century.
![Image of codifier](https://github.com/giorgoslivas/Codyfier/blob/master/Readme_resources/logo.png)
## Getting Started
First thing to do, is [download](https://github.com/giorgoslivas/Codyfier/releases) the latest release, and unzip it. Then you need to open a terminal, navigate to the correct directory and type

### Using Codifier.jar
```
java -jar "file's path"/Codyfier.jar "code's path"/code.txt 
```

### Using Codifier.sh [recomended]

## System Requirements

* Java 1.8 
* Java Virtual Machine

## Results

### Input

```java
import java.lang.Thread;//Use External class

// a comment
// an other comment

class Countdown {
public static void main( String args[] ){// Main entry point

int countdown=10;// Start from 10
while ( countdown > 0 )// While greater than 0
{
for (int i = 0; i < 9; i++)// hello its working
System.out.println(countdown);// Write // contents of // countdown  trying to have // in a comment
if ( countdown == 3 )// If equal to 3
{ // open comment
System.out.println("// \"Ignition\" }  // "); // Write Ignition
}
countdown--;// Decrement countdown by 1
try {
Thread.sleep( 100 );// 1000 milliseconds delay
}
catch( InterruptedException e ) {}
}
System.out.println( "Blast Off");// Write Blast off
}
}
```

### Output

```java
import java.lang.Thread;                                 //Use External class

// a comment
// an other comment

class Countdown {
  public static void main( String args[] ){              // Main entry point
    
    int countdown=10;                                    // Start from 10
    while ( countdown > 0 )                              // While greater than 0
    {
      for (int i = 0; i < 9; i++)                        // hello its working
      System.out.println(countdown);                     // Write // contents of // countdown  trying to have // in a comment
      if ( countdown == 3 )                              // If equal to 3
      {                                                  // open comment
        System.out.println("// \"Ignition\" }  // ");    // Write Ignition
      }
      countdown--;                                       // Decrement countdown by 1
      try {
        Thread.sleep( 100 );                             // 1000 milliseconds delay
      }
      catch( InterruptedException e ) {}
    }
    System.out.println( "Blast Off");                    // Write Blast off
  }
}
```
