package ru.chmutenko;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        var validPaths = List.of("/index.html", "/spring.svg", "/spring.png",
                "/resources.html", "/styles.css", "/app.js", "/links.html", "/forms.html",
                "/classic.html", "/events.html", "/events.js");
        var mainThread = new Thread(new Server(validPaths,8989, 64));
        mainThread.start();
    }
}
