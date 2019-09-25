package com.example.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText userName;
    private EditText passWord;
    private Button btn_login;
    private Button btn_exit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        userName = findViewById( R.id.username);
        passWord =findViewById( R.id.password );
        btn_login=findViewById( R.id.btn_login );
        btn_exit=findViewById( R.id.btn_exit );

        btn_login.setOnClickListener( this );
        btn_exit.setOnClickListener( this );
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){


            case R.id.btn_login:
                String username = userName.getText().toString();

                String password =passWord.getText().toString();


                if(username.equals("meng")&&password.equals("123") ){

                    Intent intent = new Intent( MainActivity.this, Main2Activity.class );
                    //数据传递
                    intent.putExtra( "id",userName.getText().toString());
                    startActivityForResult( intent ,100);


                }else{


//                  显示用户输入的用户名和密码
                    Toast.makeText( this, "用户名或密码为空！", Toast.LENGTH_SHORT);
                }



                break;

            case R.id.btn_exit:

                break;
        }


    }
}
