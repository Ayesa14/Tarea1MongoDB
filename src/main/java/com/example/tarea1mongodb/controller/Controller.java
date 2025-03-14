package com.example.tarea1mongodb.controller;


import java.util.List;
import java.util.Map;
import com.example.tarea1mongodb.config.MongoDbInserccionConJSon;
import com.example.tarea1mongodb.config.MongoDbInserccionSinJSon;
import com.example.tarea1mongodb.config.LecturaJsonColecciones;

/**
 * Clase controller con la lógica de la aplicación
 */
public class Controller {


    /**
     * Metodo principal que crea objetos de las diferentes clases que realizan las insercciones en la base de mongo db
     */
    public void logicaPrograma(){

        /*
        Metodos realizando 1 inserccion
         */
        MongoDbInserccionSinJSon mongoSinJson = new MongoDbInserccionSinJSon();
        MongoDbInserccionConJSon mongoJson = new MongoDbInserccionConJSon();

        LecturaJsonColecciones lJson = new LecturaJsonColecciones();
        //mongoSinJson.insertarDatosMongoSinJson();

        /*
        MongoDbInserccionConJSon mongoJson = new MongoDbInserccionConJSon();
        List<Map<String, Object>> pokemonsList = lJson.readValueObjectsJson("pokemons.json");
        List<Map<String, Object>> adestradorsList = lJson.readValueObjectsJson("adestradores.json");

        mongoJson.insertarDatosConJson(adestradorsList, pokemonsList);
         */

        /*
        Metodos realizando muchas insercciones
         */

        mongoSinJson.insertarDatosMongoSinJson();
        List<Map<String, Object>> pokemonsList = lJson.readValueObjectsJson("pokemons.json");
        List<Map<String, Object>> adestradorsList = lJson.readValueObjectsJson("adestradores.json");

        mongoJson.insertarDatosConJson(adestradorsList, pokemonsList);
    }
}
