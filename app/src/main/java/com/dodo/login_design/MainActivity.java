package com.dodo.login_design;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*透明状态栏*/
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        //获取注册和登陆按钮的ID
        Button button_Login=findViewById(R.id.button_login);
        Button button_Sign_in=findViewById(R.id.button_signin);
        //设置按键监听器
        button_Login.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                Intent intent =new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}
