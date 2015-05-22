package com.example.sanztorm.ahorcadotest;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends Activity {
    private Button botonchk;
    private TextView texto;
    private TextView ltf,lto,ltc,ltu,lts;
    private EditText textinput;
    private TextView texto2;
    private int contador=0;



    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonchk=(Button)findViewById(R.id.button);
        texto=(TextView)findViewById(R.id.texto);
        ltf=(TextView)findViewById(R.id.letraf);
        lto=(TextView)findViewById(R.id.letrao);
        ltc=(TextView)findViewById(R.id.letrac);
        ltu=(TextView)findViewById(R.id.letrau);
        lts=(TextView)findViewById(R.id.letras);
        textinput=(EditText)findViewById(R.id.input);
        texto2=(TextView)findViewById(R.id.titulo);





        botonchk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String f,o,c,u,s;

                f="f";o="o";c="c";u="u";s="s";
                String aux= textinput.getText().toString();
               if(aux.equals(f)){
                   ltf.setText("f");
                   textinput.setText("");
               }
               else if(aux.equals(o)){
                   lto.setText("o");
                   textinput.setText("");
               }

               else if(aux.equals(c)){
                   ltc.setText("c");
                   textinput.setText("");
               }
               else if(aux.equals(u)){
                   ltu.setText("u");
                   textinput.setText("");
               }
               else if(aux.equals(s)){
                   lts.setText("s");
                   textinput.setText("");
               }

               else {
                   contador++;

                   if(contador == 1){
                       texto.setText("5");

                   }
                   else if(contador == 2){
                       texto.setText("4");

                   }
                   else if(contador == 3){
                       texto.setText("3");

                   }

                   else if (contador == 4){
                       texto.setText("2");


                   }
                   else if (contador == 5){
                       texto.setText("1");


                   }
                   else{
                       texto.setText("0");
                       texto2.setText("Has perdido");
                       botonchk.setEnabled(false);

                   }


                       }

            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
