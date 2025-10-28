package org.example;

public class DbConnection {
    // SessionDb is a fake class, the behavior is that use this class for link the app with database
    private static SessionDb instance;

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
    public static SessionDb getInstance(){
        if(instance == null){
            instance = new SessionDb();
        }
        return instance;
    }
}
