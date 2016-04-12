package com.example.gabriel.atividade04;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segunda_Tela extends AppCompatActivity implements View.OnClickListener {
    private EditText edtSegunda;
    private TextView txtSegunda;
    private Button btnVoltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_tela);


        edtSegunda = (EditText)findViewById(R.id.edtSegunda);
        txtSegunda = (TextView)findViewById(R.id.txtSegunda);
        btnVoltar = (Button)findViewById(R.id.btnVoltar);

        btnVoltar.setOnClickListener(this);
        //recuperar o conteudo que foi passado como parametro na primeira tela
        //objeto Bundle
        Bundle pacote = getIntent().getExtras();
        //verificar se o parametro foi realmente passado
        if(pacote.containsKey("VALOR")){
            String valor = pacote.getString("VALOR");
            txtSegunda.setText(valor);
        }
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this, Primeira_Tela.class);
        i.putExtra("VALOR", txtSegunda.getText().toString() + " " + edtSegunda.getText().toString());
        startActivity(i);//chamar a activity

    }
}
