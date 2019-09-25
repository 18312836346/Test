package com.example.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class NoteActivity extends AppCompatActivity {
    private ListView lv_class;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_note );

        lv_class=findViewById( R.id.lv_class );


        initData();
        final ArrayAdapter adapter = new ArrayAdapter <>(
                NoteActivity.this,

                android.R.layout.simple_list_item_1,
                datas //数据
        );


        //给ListView设置Adapter
        lv_class.setAdapter( adapter );

        //给Item设置点击弹出提示信息监听事件
        lv_class.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {
                String data = (String )parent.getItemAtPosition( position );

                Intent intent = new Intent( NoteActivity.this, AndroidActivity.class );
                startActivity( intent );
            }
        } );

    }

    private List<String> datas;
    private void initData() {


        datas = new ArrayList<>(  );
        datas.add( "安卓应用程序开发" );
        datas.add( "移动应用程序测试" );
        datas.add( "高等数学" );
        datas.add( "高职英语" );
        datas.add( "Java程序设计语言" );
        datas.add( "Android游戏开发" );
        datas.add( "心理健康" );
        datas.add( "体育" );




    }
}
