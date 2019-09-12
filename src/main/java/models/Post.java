package models;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class Post {
    private String content;
    private static ArrayList<Post> instances = new ArrayList<>(); // I’m new. When do I get created?
    private boolean published; //i’m new
    private LocalDateTime createdAt; //see constructor and my method
    private int id;

    public Post(String content) {
        this.content = content;
        this.published = false;
        this.createdAt = LocalDateTime.now();
        instances.add(this); //Also new. Can you figure out what I do and how I work?
        this.id = instances.size();
    }
    public String getContent() {
        return content;
    }
    public static ArrayList<Post> getAll(){
        return instances;
    }

    public static void clearAllPosts(){

        instances.clear();
    }

    public boolean getPublished(){ //new too
        return this.published;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }public int getId() {
        return id;
    }
    public static Post findById(int id){
        return instances.get(id-1); //why minus 1? See if you can figure it out.
    }
}
