package com.isgarsi.pruebadesignsupportlibrary;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class FloatingLabelActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtNombre;
    private EditText txtApel;

    private Button butAceptar;

    private TextInputLayout textInputLayoutNombre;
    private TextInputLayout textInputLayoutApel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_label);

        txtNombre = (EditText) findViewById(R.id.txtNombre);
        txtApel = (EditText) findViewById(R.id.txtApel);

        butAceptar = (Button) findViewById(R.id.butAceptar);
        butAceptar.setOnClickListener(this);

        textInputLayoutNombre = (TextInputLayout) findViewById(R.id.textInputLayoutNombre);
        textInputLayoutApel = (TextInputLayout) findViewById(R.id.textInputLayoutApel);
        textInputLayoutNombre.setErrorEnabled(true);
        textInputLayoutApel.setErrorEnabled(true);
    }


    @Override
    public void onClick(View v) {
        String mensaje = "Campos correctos";

        if(txtApel.getText().toString().trim().equals("")){
            mensaje = "Revise los datos";
            textInputLayoutApel.setError("Debe introducir un apellido");
        }

        if(txtNombre.getText().toString().trim().equals("")){
            mensaje = "Revise los datos";
            textInputLayoutNombre.setError("Debe introducir un nombre");
        }

        Toast.makeText(this,mensaje,Toast.LENGTH_SHORT).show();
    }
}
