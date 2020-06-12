package com.github.robertomanfreda.java12.switchexpression;

import com.github.robertomanfreda.ITopic;

public class SwitchExpression implements ITopic {

    public SwitchExpression() {
        postConstruct();
    }

    @Override
    public void postConstruct() {
        String intro = "\nLa nuova sintassi rimuove la necessita di usare l’istruzione break in ogni opzione.\n" +
                "E’ possibile definire piu’ costanti nella stessa etichetta.\n" +
                "il caso di default è adesso obbligatorio .\n" +
                "break può essere usato per restituire valori dalla Switch Expression.";
        System.out.println(intro);
    }

    @Override
    public void exec() {
        System.out.println("\nCreato switch con case: 1 , 2 e default.");
        String switchCase = doSwitch(2);
        System.out.println(switchCase);
        String defaultCase = doSwitch(3);
        System.out.println(defaultCase);
    }

    private String doSwitch(int number) {
        String string = switch (number) {
            case 1, 2 -> string = "Value: case " + number;
            default -> string = "Value: default";
        };
        return string;
    }
}
