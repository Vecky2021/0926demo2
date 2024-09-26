package com.example.app0910;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //声明组件
    Button btn1;
    EditText et1;
    TextView tv1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //通过id，找到界面文件中对应的组件
        btn1 = findViewById(R.id.button1);
        et1 = findViewById(R.id.editText1);
        tv1 = findViewById(R.id.myText1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = String.valueOf(et1.getText());
//                Toast.makeText(MainActivity.this,"点到我了。。。。",Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this,str,Toast.LENGTH_LONG).show();
            }
        });

    }
}