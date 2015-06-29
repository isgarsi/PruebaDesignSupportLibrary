package com.isgarsi.pruebadesignsupportlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button butFloatingLabel;
    private Button butFAB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butFloatingLabel = (Button) findViewById(R.id.butFloatingLabel);
        butFAB = (Button) findViewById(R.id.butFAB);
        butFloatingLabel.setOnClickListener(this);
        butFAB.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        Intent intent = null;

        switch (v.getId()){
            case R.id.butFloatingLabel:
                intent = new Intent(this,FloatingLabelActivity.class);
                break;
            case R.id.butFAB:
                intent = new Intent(this,FABActivity.class);
                break;
        }

        if(intent != null){
            startActivity(intent);
        }
    }
}
