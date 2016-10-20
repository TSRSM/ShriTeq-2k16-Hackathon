package in.dhruvyadav.traverse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class RegisterLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_login);
    }
    public void Clicks(View v)
    {
        switch (v.getId())
        {
            case R.id.gotologinbutton:
                Intent login = new Intent(RegisterLogin.this, Login.class);
                login.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(login);
                break;
            case R.id.gotoregisterbutton:
                Intent register = new Intent(RegisterLogin.this, Register.class);
                register.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(register);
                break;
        }
    }

}
