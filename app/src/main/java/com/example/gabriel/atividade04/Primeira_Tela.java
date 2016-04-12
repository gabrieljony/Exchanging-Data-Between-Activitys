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

public class Primeira_Tela extends AppCompatActivity implements View.OnClickListener {
    private EditText edtPrimeira;
    private TextView txtPrimeira;
    private Button btnAvancar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.primeira_tela);

        edtPrimeira = (EditText)findViewById(R.id.edtPrimeira);
        txtPrimeira = (TextView)findViewById(R.id.txtPrimeira);
        btnAvancar = (Button)findViewById(R.id.btnAvancar);

        btnAvancar.setOnClickListener(this);

        /*Bundle pacote2 = getIntent().getExtras();
        //verificar se o parametro foi realmente passado
        if(pacote2.containsKey("VALOR")){
            String valor2 = pacote2.getString("VALOR");
            txtPrimeira.setText(valor2);
        }*/
    }

    @Override
    public void onClick(View v) {
        //Classe por chamar outro activity que é a classe Intent "Muito IMPORTANTE", irá chamar a segunda tela
        Intent i = new Intent(this, Segunda_Tela.class);// esta passando como referencia a classe Primeira_tela que é a activict que vai se comunicar com a outra activity que é a segunda tela que iremos informar.
        i.putExtra("VALOR", txtPrimeira.getText().toString() + " " + edtPrimeira.getText().toString());//será o valor que foi digitado na primeira tela ira passar para a segunda tela
        startActivity(i);//chamar a activity
    }
}
