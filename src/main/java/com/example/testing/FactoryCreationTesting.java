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
