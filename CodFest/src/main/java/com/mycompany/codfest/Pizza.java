
package com.mycompany.codfest;
import static spark.Spark.*;
/**
 *
 * @author Ronald
 */
public class Pizza {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}
