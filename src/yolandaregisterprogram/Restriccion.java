/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yolandaregisterprogram;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author arang
 */
public class Restriccion {
    public boolean verificarUsuario(String username, String password) {
        ConexionDB conexion = new ConexionDB();
        MongoDatabase database = conexion.conectar();
        MongoCollection<Document> collection = database.getCollection("Usuario");
        Document user = collection.find(new Document("Usuario", username)).first();
        if (user != null) {
            String storedPassword = user.getString("Contraseña");
            if (password.equals(storedPassword)) {
                return true;
            }
        }
        return false;
    }
}
