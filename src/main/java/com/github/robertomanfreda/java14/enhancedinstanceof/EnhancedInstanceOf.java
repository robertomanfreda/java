package com.github.robertomanfreda.java14.enhancedinstanceof;

import com.github.robertomanfreda.ITopic;

public class EnhancedInstanceOf implements ITopic {

    public EnhancedInstanceOf() {
        postConstruct();
    }

    @Override
    public void postConstruct() {
        System.out.println("""
                
                - - - - - - - ENHANCED INSTANCEOF - - - - - - - -
                Con questa nuova feature non è necessario castare in ogni blocco di condizione.
                Risulta quindi più leggibile e compatta, di coneguenza più manutenibile.
                Di seguito un confronto tra i due approcci.
                """);
    }

    @Override
    public void exec() {

        Animal animal = new Cat();

        // Traditional instanceOf Operator
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.meow();
        } else if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.woof();
        }

        // Enhanced instanceOf
        if (animal instanceof Cat cat) {
            cat.meow();
        } else if(animal instanceof Dog dog) {
            dog.woof();
        }

    }

    private class Animal {}
    private class Cat extends Animal {
        private void meow(){
            System.out.println("meow");
        }
    }
    private class Dog extends Animal {
        private void woof(){
            System.out.println("woof");
        }
    }
}
