package models;
import java.time.LocalDateTime;
import java.util.ArrayList;

//public class Post {
//
//    public Post (String content){
//
//    }
//}
public class Post {
    private String content;
    private static ArrayList<Post> instances = new ArrayList<>(); // I’m new. When do I get created?
    private boolean published; //i’m new
    private LocalDateTime createdAt; //see constructor and my method


    public Post(String content) {
        this.content = content;
        instances.add(this); //Also new. Can you figure out what I do and how I work?

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
    }
}
