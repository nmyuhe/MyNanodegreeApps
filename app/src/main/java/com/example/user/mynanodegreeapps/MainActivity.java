package com.example.user.mynanodegreeapps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void showMsg(View view) {
        String msg = ((Button)view).getText().toString();
        Toast.makeText(MainActivity.this,
                "启动应用："+msg,
                Toast.LENGTH_SHORT).show();
    }
}
