package in.dhruvyadav.traverse;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 10/20/16.
 */

// @IgnoreExtraProperties
// public class Post {
//
//    public String uid;
//    public String author;
//    public String title;
//    public String body;
//    public int starCount = 0;
//    public Map<String, Boolean> stars = new HashMap<>();
//
//    public Post() {
//        // Default constructor required for calls to DataSnapshot.getValue(Post.class)
//    }
//
//    public Post(String uid, String author, String title, String body) {
//        this.uid = uid;
//        this.author = author;
//        this.title = title;
//        this.body = body;
//    }
//
//    @Exclude
//    public Map<String, Object> toMap() {
//        HashMap<String, Object> result = new HashMap<>();
//        result.put("username", author);
//        result.put("title", title);
//        result.put("body", body);
//         return result;
//    }
//
//}
public class Post { 	private String title;     private String message;       public Person() {       /*Blank default constructor essential for Firebase*/     }     //Getters and setters     public String getTitle() {         return title;     }       public void setTitle(String title) {         this.title = title;     }       public String getMessage() {         return message;     }       public void setMessage(String  message) {         this.message = message;     } } }
