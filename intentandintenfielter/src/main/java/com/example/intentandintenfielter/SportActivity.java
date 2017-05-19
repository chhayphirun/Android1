package com.example.intentandintenfielter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNews();
            }
            private void openNews(){
                Intent intent=new Intent();
                intent.setAction("com.example.action.NEWS");
                startActivity(intent);
            }
        });
    }
}
