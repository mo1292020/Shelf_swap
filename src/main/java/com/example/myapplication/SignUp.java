package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;


public class SignUp extends AppCompatActivity {

    FirebaseFirestore db;
    FirebaseAuth mAuth;
    EditText name, email, password;

    Button submit;
    String name_, email_, password_;
    TextView error, tv, signNow;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        name = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        db = FirebaseFirestore.getInstance();
        mAuth = FirebaseAuth.getInstance();


        submit = (Button) findViewById(R.id.sign_up);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //error.setVisibility(View.GONE);
                //progressBar.setVisibility(View.VISIBLE);
                name_ = name.getText().toString();
                email_ = email.getText().toString();
                password_ = password.getText().toString();
                // Create a new user account with email and password
                if (!email_.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email_).matches()) {
                    if (!password_.isEmpty() && !name_.isEmpty()) {
                        createUser();
                        Intent intent = new Intent(getApplicationContext(), gender.class);
                        startActivity(intent);
                        finish();

                    } else if(password_.isEmpty()){
                        password.setError("Password is empty");
                        progressBar.setVisibility(View.INVISIBLE);
                    }
                    else{
                        name.setError("name is empty");
                    }
                } else if (email_.isEmpty()) {
                    email.setError("Email is empty");
                    //progressBar.setVisibility(View.INVISIBLE);
                } else {
                    email.setError("Enter correct email");
                    //progressBar.setVisibility(View.INVISIBLE);
                }
            }
        });
        signNow = findViewById(R.id.sign_in);
        signNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
                finish();
            }
        });

    }

    public void createUser() {
        mAuth.createUserWithEmailAndPassword(email_, password_)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            FirebaseUser firebaseUser = mAuth.getCurrentUser();
                            firebaseUser.sendEmailVerification();
                            createFirestoreUser(firebaseUser.getUid());
                            Toast.makeText(getApplicationContext(), "user created",
                                    Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(), Login.class);
                            startActivity(intent);
                            finish();
                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(getApplicationContext(), task.getException().getMessage(),
                                    Toast.LENGTH_LONG).show();
                            //progressBar.setVisibility(View.INVISIBLE);

                        }
                    }
                });

    }

    void createFirestoreUser(String id) {
        User user = new User(name_, email_);
        db.collection("users").document(id).set(user);
        System.out.println("done");
    }

}