package me.samuel.mysqllphplogreg;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DashBoard extends AppCompatActivity {

    Button LogOut;
    TextView EmailShow;
    String EmailHolder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);


        LogOut = (Button)findViewById(R.id.button);
        EmailShow = (TextView)findViewById(R.id.EmailShow);


        Intent intent = getIntent();
        EmailHolder = intent.getStringExtra(Login.UserEmail);
        EmailShow.setText(EmailHolder);


        LogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

                Intent intent = new Intent(DashBoard.this, Login.class);

                startActivity(intent);

                Toast.makeText(DashBoard.this, "Log Out Successfully", Toast.LENGTH_LONG).show();


            }
        });
    }
}