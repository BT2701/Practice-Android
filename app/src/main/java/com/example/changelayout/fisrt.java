package com.example.changelayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class fisrt extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
//        tb1=findViewById(R.id.tb1);
//        setSupportActionBar(tb1);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater im=getMenuInflater();
        im.inflate(R.menu.optionmenu,menu);
        return true;
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        MenuInflater im= getMenuInflater();
        im.inflate(R.menu.contextmenu,menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.itGD1){
            changGD1();
//            System.out.println(100);
        }
        else if (item.getItemId()==R.id.itGD2) {
            changGD2();
        }
        else if (item.getItemId()==R.id.itGD3) {
            changGD3();
        }
        else if (item.getItemId()==R.id.itcc){
            back();
        }
        return super.onOptionsItemSelected(item);
    }

    public void changGD1(){
        Intent it=new Intent(getApplicationContext(),fisrt.class);
//                Bundle bl=new Bundle();
        startActivity(it);
    }
    public void changGD2(){
        Intent it=new Intent(getApplicationContext(),second.class);
//                Bundle bl=new Bundle();
        startActivity(it);
    }
    public void changGD3(){
        Intent it=new Intent(getApplicationContext(),third.class);
//                Bundle bl=new Bundle();
        startActivity(it);
    }
    public void back(){
        Intent it=new Intent(getApplicationContext(),MainActivity.class);
//                Bundle bl=new Bundle();
        startActivity(it);
    }
}
