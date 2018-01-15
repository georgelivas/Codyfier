![Image of codifier](https://github.com/giorgoslivas/Codyfier/blob/master/Readme_resources/logo.png)
## Getting Started
If you are using Windows follow the instructions under 
[Using Codifier.jar](https://github.com/giorgoslivas/Codyfier#using-codifierjar). 
If you are a Mac or linux user is easier 
[Using Codifier.sh](https://github.com/giorgoslivas/Codyfier#using-codifiersh-recommended)
### Using Codifier.jar
1. [Download](https://github.com/giorgoslivas/Codyfier/releases) the Codifier.jar
2. Open a cmd 
3. Navigate to the correct directory
4. Then type:

```
java -jar "file's path"/Codyfier.jar "code's path"/code.txt 
```

### Using Codifier.sh [recommended for mac/linux]
1. [Download](https://github.com/giorgoslivas/Codyfier/releases) the Codifier.zip
2. Unzip the files
3. Open a terminal
4. Navigate to the unzipped folder 
5. Then type:

```
sh Codyfier.sh
```

>**important: don't move the shell file from the folder!**



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

                  _            ___  _               
                 | |          / __)(_)              
  ____  ___    __| | _   _  _| |__  _  _____   ____ 
 / ___)/ _ \  / _  || | | |(_   __)| || ___ | / ___)
( (___| |_| |( (_| || |_| |  | |   | || ____|| |    
 \____)\___/  \____| \__  |  |_|   |_||_____)|_|    
                    (____/                          
</ code > by George Livas
```


## Licence
This project is licensed under the MIT License - see the [LICENSE](https://github.com/giorgoslivas/Codyfier/blob/master/LICENSE) file for details
