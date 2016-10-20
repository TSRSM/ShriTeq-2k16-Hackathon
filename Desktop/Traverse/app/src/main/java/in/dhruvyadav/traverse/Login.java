package in.dhruvyadav.traverse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Clicks(View v)
    {
        switch(v.getId())
        {
            case R.id.buttonlogin:
                EditText usernameed = (EditText) findViewById(R.id.usernamelogin);
                EditText passworded = (EditText) findViewById(R.id.passwordlogin);
                String username = usernameed.getText().toString().trim();
                String password = passworded.getText().toString().trim();


                break;
        }
    }
}
