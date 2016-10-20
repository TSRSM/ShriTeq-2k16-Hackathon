package in.dhruvyadav.traverse;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.nearby.connection.dev.Strategy;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

import static android.webkit.ConsoleMessage.MessageLevel.LOG;

public class Register extends AppCompatActivity {
    private EditText editText;
    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
//    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        editText = (EditText) findViewById(R.id.usernameregister);
        editText1 = (EditText) findViewById(R.id.passwordregister);
        editText2 = (EditText) findViewById(R.id.confirmpasswordregister);
        editText3 = (EditText) findViewById(R.id.emailregister);
//        auth = FirebaseAuth.getInstance();

    }

    public void Clicks(View v) {
        switch (v.getId()) {
            case R.id.buttonregister:
                Log.i("Debug","Register Pressed!");
                ValueEventListener postListener = new ValueEventListener() {
                    @Override
                    public void onDataChange(Dat
                                                     aSnapshot dataSnapshot) {
                        // Get Post object and use the values to update the UI
                        Post post = dataSnapshot.getValue(Post.class);
                        // ...
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        // Getting Post failed, log a message
                        Log.w(TAG, "loadPost:onCancelled", databaseError.toException());
                        // ...
                    }
                };
                mPostReference.addValueEventListener(postListener);
//            ArrayList<String> users = new ArrayList<String>();// make an array list
//            SharedPreferences spf = getSharedPreferences("data",MODE_PRIVATE);//init json spf
//            SharedPreferences.Editor edit = spf.edit();// init editor
//            String json = spf.getString("usernames","");// get arraylist of users in json format
//            Gson gson = new Gson();// just use this object to convert arraylist from normal arraylist to json string and back
//            users = gson.fromJson(json, new TypeToken<ArrayList<String>>(){}.getType());// get arraylist from json string stored in spf
//            users.add(editText.getText().toString().trim());// add new user to arraylist from edittext
//            json = gson.toJson(users, new TypeToken<ArrayList<String>>(){}.getType());// convert arraylist back to json string
//            edit.putString("usernames",json);// store the json string in spf
//                edit.apply();// commit changes
            break;
        }

        }
}
// Take in user as a parameter and return the password of that user as a string
//public String getPassword()
//{
//    SharedPreferences shared=getSharedPreferences("data", MODE_PRIVATE);
//    String json = shared.getString("userdata","");
//    ArrayList userdat = new ArrayList<String>();
//    Gson gson = new Gson();
//    userdat = gson.fromJson(json, new TypeToken<ArrayList<String>>(){}.getType());
//    return "";
//}