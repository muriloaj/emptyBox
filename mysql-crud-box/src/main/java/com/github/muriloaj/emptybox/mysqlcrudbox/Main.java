package com.github.muriloaj.emptybox.mysqlcrudbox;

import static spark.Spark.get;

public class Main {
    public static void main(String[] args) {
        get("/hello/:name", (req, res) -> "Hello World ".concat(req.params("name")));
    }
}


