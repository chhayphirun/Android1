package com.example.intentandintenfielter;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnok).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText email=(EditText)(findViewById(R.id.editText));
                EditText password=(EditText)(findViewById(R.id.editText2)) ;
                if(email.getText().toString().equals("news@gmail.com")&&password.getText().toString().equals("1234")){
                    openNews();

                }
                else if(email.getText().toString().equals("info@gmail.com")&&password.getText().toString().equals("1234")){
                    openInfo();

                }
                else if(email.getText().toString().equals("sport@gmail.com")&&password.getText().toString().equals("1234")){
                    openSport();

                }
            }
            private void openInfo(){
                Intent intent=new Intent();
                intent.setAction("com.example.action.INFO");
                startActivity(intent);
            }
            private void openNews(){
                Intent intent=new Intent();
                intent.setAction("com.example.action.NEWS");
                startActivity(intent);
            }
            private void openSport(){
                Intent intent=new Intent();
                intent.setAction("com.example.action.SPORT");
                startActivity(intent);
            }

            private void openAllapps(){
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_MAIN);
                intent.setAction(Intent.CATEGORY_LAUNCHER);

                startActivity(intent);
            }
            private void dial(){
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                startActivity(intent);
            }
            private void call(){
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:011666210"));
                startActivity(intent);
            }
        });

    }
}
