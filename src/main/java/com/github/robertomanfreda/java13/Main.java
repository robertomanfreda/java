package com.github.robertomanfreda.java13;

import com.github.robertomanfreda.java13.niosocket.SocketChannelClient;
import com.github.robertomanfreda.java13.niosocket.SocketChannelServer;
import com.github.robertomanfreda.java13.switchexpression.SwitchExpression;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n\n+-------------------------+");
        System.out.println("| Java 13 - main features |");
        System.out.println("+-------------------------+");
        System.out.println("Di seguito una serie di esempi delle novità portate dalla versione 13 di Java.");

        String html = """
                <html>
                    <body>
                        <p>Hello, world</p>
                    </body>
                </html>
                """;
        System.out.println(html);

        new SwitchExpression().exec();
// LANCIARE PRIMA SocketServer e poi SocketClient
//        new SocketChannelServer();
//
//        new SocketChannelClient();
    }
}
