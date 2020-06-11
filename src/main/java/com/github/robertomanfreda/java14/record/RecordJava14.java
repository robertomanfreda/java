package com.github.robertomanfreda.java14.record;

import com.github.robertomanfreda.ITopic;

public class RecordJava14 implements ITopic {

    public RecordJava14() {
        postConstruct();
    }

    @Override
    public void postConstruct() {
        //TEXT BLOCK
        System.out.println("""
                                
                - - - - - - - RECORD - - - - - - -
                A partire da Java 14 è stata introdotta la keyword "record".
                Sostituisce i POJO utilizzati per la memorizzazione di uno stato.
                Sono immutabili. Evitano la scrittura del classico "boilerplate" in comune tra tutti i POJO.
                I metodi equals, hashCode, toString, i field e il costruttore vengono generati dal compilatore a partire 
                dalla firma del record. È comunque possibile esplicitarli.
                """);
    }

    @Override
    public void exec() {
        record Person(String firstname, String lastname) {
        }
        record CustomPerson(String firstname, String lastname) {
            public CustomPerson(String firstname, String lastname) {
                this.firstname = "Lorenzo";
                this.lastname = "Panetta";
            }
        }
        Person p1 = new Person("Lorenzo", "Panetta");
        System.out.println(p1);

        CustomPerson p2 = new CustomPerson("Prova", "Prova");
        System.out.println(p1);
    }
}
