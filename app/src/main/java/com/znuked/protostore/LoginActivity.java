package com.znuked.protostore;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class LoginActivity extends ActionBarActivity {

//    private Button mLoginButton;
//    private EditText mPassword;
//    private EditText mUsername;

    private String username;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getUsername();
        getPassword();

        Button mLoginButton = (Button) findViewById(R.id.login_button);
        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn();
            }
        });

    }

    private void getUsername() {
        EditText mUsername = (EditText) findViewById(R.id.userNameEditText);
        username = mUsername.getText().toString();
    }

    private void getPassword() {
        EditText mPassword = (EditText) findViewById(R.id.passwordEditText);
        password = mPassword.getText().toString();
    }

    private void signIn() {
        if (isValidUsername(username) && isValidPassword(password)) {
            Intent intent = new Intent(this, MainActivity.class);
//            intent.putExtra("",);
            startActivity(intent);
            finish();
        }
    }

    private boolean isValidUsername(String uName) {
//        if(uName.matches("")) {
//            return true;
//        } else {
//            return false;
//        }
        return true;
    }

    private boolean isValidPassword(String pWord) {
//        if(pWord.matches("")) {
//            return true;
//        } else {
//            return false;
//        }
        return true;
    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
