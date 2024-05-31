package com.example.changelayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private SeekBar sb;
    private TextView tv1,tv2,tv3,tv4,tv5;
    Toolbar tb1;
    int option=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
//        tb1=findViewById(R.id.tb1);
//        setSupportActionBar(tb1);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        eventSeekBar();
    }
    public void initComponents(){
        sb=findViewById(R.id.sb1);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        tv4=findViewById(R.id.tv4);
        tv5=findViewById(R.id.tv5);


    }
    public void eventSeekBar(){
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                updateColor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    public void updateColor(){
        option++;
        if(option==1){
            tv1.setBackgroundColor(ContextCompat.getColor(this,R.color.tv1_1));
            tv2.setBackgroundColor(ContextCompat.getColor(this,R.color.tv2_1));
            tv3.setBackgroundColor(ContextCompat.getColor(this,R.color.tv3_1));
            tv4.setBackgroundColor(ContextCompat.getColor(this,R.color.tv4_1));
            tv5.setBackgroundColor(ContextCompat.getColor(this,R.color.tv5_1));
        }
        else if(option==2){
            tv1.setBackgroundColor(ContextCompat.getColor(this,R.color.tv1_2));
            tv2.setBackgroundColor(ContextCompat.getColor(this,R.color.tv2_2));
            tv3.setBackgroundColor(ContextCompat.getColor(this,R.color.tv3_2));
            tv4.setBackgroundColor(ContextCompat.getColor(this,R.color.tv4_2));
            tv5.setBackgroundColor(ContextCompat.getColor(this,R.color.tv5_2));
        }
        else if(option==3){
            tv1.setBackgroundColor(ContextCompat.getColor(this,R.color.tv1_3));
            tv2.setBackgroundColor(ContextCompat.getColor(this,R.color.tv2_3));
            tv3.setBackgroundColor(ContextCompat.getColor(this,R.color.tv3_3));
            tv4.setBackgroundColor(ContextCompat.getColor(this,R.color.tv4_3));
            tv5.setBackgroundColor(ContextCompat.getColor(this,R.color.tv5_3));
        }
        else{
            option=1;
        }

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
        else if (item.getItemId()==R.id.itIF){
            showAlertDialog();
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
    private void showAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Thông tin thành viên nhóm");  // Tiêu đề của dialog
        builder.setMessage("Tiền Minh Vy - Phan Huỳnh Minh Tiến - Trần Trọng Phú - Trần Đăng Nam - Huỳnh Công Khoa - Dương Thành Trưởng.");  // Nội dung của dialog

        // Thêm nút "OK" và xử lý sự kiện khi nút được nhấn
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // Xử lý khi nút "OK" được nhấn
                dialog.dismiss();  // Đóng dialog
            }
        });

        // Tạo và hiển thị dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }


//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        if (item.getItemId() == R.id.itDN) {
//            openWebPage("https://www.facebook.com");
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
//
//    private void openWebPage(String url) {
//        Uri webpage = Uri.parse(url);
//        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
//        if (intent.resolveActivity(getPackageManager()) != null) {
//            startActivity(intent);
//
//    }}

}





