package com.example.tarea1mongodb.config;


/**
 * Clase de configuracuón para mongoDb
 */
public class MongoDbConnection {

    /**
     * variables provadas, estáticas y finales de la url donde está la base de mongo en la nube y el nombre de la base de datos
     */
    private static final String connectionMongoDb = "mongodb+srv://mongo:mongo@proyectoad.xgtsf.mongodb.net/?retryWrites=true&w=majority&appName=ProyectoAD";
    private static final String databaseName = "dbpokemons";

    /**
     * Metodo que crea la conexión a mongo con las variables anteriores
     * @return la base de datos de mongo
     */
    public static MongoDatabase getConnectionMongoDB(){
        MongoClient mongoClient = MongoClients.create(connectionMongoDb);
        System.out.println("Conexion exitosa con la base de datos de mongo db");
        return mongoClient.getDatabase(databaseName);

    }

}
