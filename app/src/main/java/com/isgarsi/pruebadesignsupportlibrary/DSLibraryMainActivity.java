package com.isgarsi.pruebadesignsupportlibrary;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class DSLibraryMainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button butFloatingLabel;
    private Button butFAB;
    private Button butSnackBar;
    private Button butNavDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butFloatingLabel = (Button) findViewById(R.id.butFloatingLabel);
        butFAB = (Button) findViewById(R.id.butFAB);
        butSnackBar = (Button) findViewById(R.id.butSnackBar);
        butNavDrawer= (Button) findViewById(R.id.butNavigationDrawer);

        butFloatingLabel.setOnClickListener(this);
        butFAB.setOnClickListener(this);
        butSnackBar.setOnClickListener(this);
        butNavDrawer.setOnClickListener(this);
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
            case R.id.butSnackBar:
                createSnackBar(v,"Holaaaa");
                break;
            case R.id.butNavigationDrawer:
                intent = new Intent(this,NavigationDrawerActivity.class);
                break;
        }

        if(intent != null){
            startActivity(intent);
        }
    }

    private void createSnackBar(View view, final String message){
        //Creo la snackbar
        Snackbar snackBar = Snackbar.make(view, message, Snackbar.LENGTH_SHORT)
                .setActionTextColor(Color.RED)
                .setAction("Mostrar Toast", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(DSLibraryMainActivity.this, message, Toast.LENGTH_SHORT).show();
                    }
                });

        //Asigno el fondo a su vista
        snackBar.getView().setBackgroundColor(Color.BLUE);

        //Por último la muestro
        snackBar.show();
    }
}
