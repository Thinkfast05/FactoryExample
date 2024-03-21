# Java Factory Design Pattern Example

This is a simple Java project demonstrating the Factory Design Pattern. In this project, we have an `Enemy` class which describes attributes and actions of an enemy, and several subclasses representing special enemies, all extending the `Enemy` superclass.

## Overview

The Factory Design Pattern is a creational pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. It promotes loose coupling by eliminating the need to bind application-specific classes into the code.

## How it works

1. **Enemy Class**: Represents the base class for all enemies. It defines common attributes and methods shared by all enemy types.

2. **Special Enemy Subclasses**: These are subclasses of `Enemy` representing different types of enemies with specialized behaviors. For example, `Zombie`, `Knight`, and `Mage` could be special enemy types.

3. **EnemyFactory**: This class is responsible for creating instances of enemies based on user input. It encapsulates the object creation logic and shields the client from the complexities of instantiation.

## Usage

To demonstrate the Factory Design Pattern, follow these steps:

1. Clone this repository to your local machine.
2. Navigate to the project directory.
3. Compile the Java files using a Java compiler.
4. Run the compiled program.
5. Follow the prompts to input the type of enemy you want to create.
6. The program will create an instance of the specified enemy type using the `EnemyFactory`.

## Example

```java
package com.example.testing;

import com.example.factory.EnemyFactory;
import com.example.models.Enemy;

import java.util.Scanner;

public class FactoryCreationTesting {
    public static void main(String[] args) {
        EnemyFactory enemyFactory = new EnemyFactory();
        Enemy theEnemy=null;
        Scanner userInput = new Scanner(System.in);
        System.out.println("What type of enemy would you like to choose? (Zombie/ Knight/ Mage)");
        if(userInput.hasNextLine()){
            String typeOfEnemy = userInput.nextLine();
            theEnemy = enemyFactory.makeEnemy(typeOfEnemy);
            if(theEnemy!=null)
                theEnemy.attack();
        }
    }
}
```

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Feel free to customize and extend this project according to your needs. Happy coding! 🚀
