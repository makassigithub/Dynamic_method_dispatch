/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method_dispacth;

/**
 *
 * @author makas
 */
public class Test {
    
    public static void main(String...args){
    
    Person person = new Person();// Object of type Person
    Man man = new Man(); // Objet of type man
    Woman woman  = new Woman(); // Object of type Woman
    
    Person r;// Rference of type Person
    
    // Now, let's see what version of the createPerson() is call on the above objects.
    r = person; // This reference is of type person
    r.createPerson();
    
    r = man;// This reference is of type man
    r.createPerson();
    
    r = woman;// This reference is of type woman
    r.createPerson();
    
/*  The output of the this program is
    
    This object is of type Person
     This object is of type Man
     This object is of type Woman
      BUILD SUCCESSFUL (total time: 1 second
    
    This polymorphism is resolved at runtime and called
    DYNAMIC METHOD DISPACH that is one of the powers of JAVA language
    */

    }
    
}

