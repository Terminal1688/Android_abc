package com.example.tset12152;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.a:
                Toast.makeText(this, "您点击了发起群聊", Toast.LENGTH_SHORT).show();
                break;
            case R.id.b:
                Toast.makeText(this, "您点击了添加好友", Toast.LENGTH_SHORT).show();
                break;
            case R.id.c:
                Toast.makeText(this, "您点击了扫一扫", Toast.LENGTH_SHORT).show();
                break;
            case R.id.d:
                Toast.makeText(this, "您点击了收付款", Toast.LENGTH_SHORT).show();
                break;
            case R.id.e:
                Toast.makeText(this, "您点击了帮助与反馈", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return  true;
        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return  true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}