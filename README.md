# CodiFier

### A Java Indenter for the 21st century.
![Image of codifier](https://github.com/giorgoslivas/Codyfier/blob/master/Readme_resources/Screen%20Shot%202018-01-14%20at%2016.03.22.png)
## Getting Started
First thing to do, is download the fip file, and unzip it. then you need t compail the code, do that by oepning a terminal, navigating to the correct directory and then type

### Using jar file
```
java -jar "file's path"/Codyfier.jar "code's path"/code.txt 
```

### Using Cofifier.sh file [recomended]

## System Requirements

* Java 1.8 
* Java Virtual Machine

## Results

### Input

```
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

```
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
