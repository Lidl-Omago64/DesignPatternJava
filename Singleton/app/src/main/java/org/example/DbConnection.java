package org.example;

public class DbConnection {
    private static DbConnection instance;

    /**
     * Private Constructor
     * in this way you can instance a new {@link DbConnection}
     */
    private DbConnection(){

    }

    /**
     * You Can Only use getInstance for enter in the db
     * @return
     */
    public static DbConnection getInstance(){
        if(instance == null){
            instance = new DbConnection();
        }
        return instance;
    }
}
