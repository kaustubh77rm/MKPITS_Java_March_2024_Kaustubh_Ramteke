package database;

public abstract interface DatabaseOperations {
    //create read update delete
    public int create();
    public int read();
    public int update();
    public int delete();
}