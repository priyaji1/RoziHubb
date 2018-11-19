package rozihub.infor.gt009.rozihubb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity  {
    TextView newuser;
TextView forgatpassword;
    Button test;
Button login;
Button next1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        newuser = findViewById(R.id.newuser);
        login=findViewById(R.id.loginbutton);
        forgatpassword=findViewById(R.id.forgot);
        newuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
       forgatpassword.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(LoginActivity.this,ForgatPasswordActivity.class);
               startActivity(intent);
           }
       });
       login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(LoginActivity.this,MainActivity.class);
               startActivity(intent);
           }
       });
        test=findViewById(R.id.test);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,RoziHubProfessionals.class);
                startActivity(intent);
                finish();
            }
        });
        next1=findViewById(R.id.test1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}
