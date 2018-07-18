package com.example.niloofar.buttonlistner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button FirstObj=findViewById(R.id.btn_first);

       FirstObj.setOnLongClickListener(new View.OnLongClickListener() {
           @Override
           public boolean onLongClick(View view) {
               Toast.makeText(getApplicationContext(),"hello",Toast.LENGTH_SHORT).show();
               return true;
           }
       });


    }
}
