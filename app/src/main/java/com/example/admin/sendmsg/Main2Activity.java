package com.example.admin.sendmsg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
EditText et;
    Button b;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        et= (EditText) findViewById(R.id.editText);
        b= (Button) findViewById(R.id.button);
        tv= (TextView) findViewById(R.id.textView);
        Intent in=getIntent();
        Bundle bn=in.getExtras();
        String sms=bn.getString("msg");
        tv.setText(sms);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent();
                in.putExtra("MESSAGE",et.getText().toString());
                setResult(RESULT_OK,in);
                finish();

            }
        });

    }
}
