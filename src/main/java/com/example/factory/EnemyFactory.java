package com.example.factory;

import com.example.models.Enemy;
import com.example.models.Mage;
import com.example.models.PossessedKnight;
import com.example.models.Zombie;

public class EnemyFactory {
    public static Enemy makeEnemy(String typeOfEnemy){
        Enemy newEnemy = null;
        if(typeOfEnemy.equals("Zombie")){
            return new Zombie();
        } else if(typeOfEnemy.equals("Knight")){
            return new PossessedKnight();
        }else if(typeOfEnemy.equals("Mage")){
            return new Mage();
        }else
            return null;
    }
}
