package com.example.admin.sendmsg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final int req_cd1 = 1;
    EditText et;
    Button b;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById(R.id.editText);
        b = (Button) findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.textView);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, Main2Activity.class);
                in.putExtra("msg", et.getText().toString());
                startActivityForResult(in,req_cd1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent in) {
        if(requestCode==req_cd1){
            if(resultCode==RESULT_OK){
                Bundle bn= in.getExtras();
                String msg=bn.getString("MESSAGE");
                        tv.setText(""+msg);
        super.onActivityResult(requestCode, resultCode,in);

    }
}
}
}
