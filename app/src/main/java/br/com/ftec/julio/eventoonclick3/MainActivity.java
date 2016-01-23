package br.com.ftec.julio.eventoonclick3;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private static final String TAG = "FTEC";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botao1 = (Button) findViewById(R.id.btnBotao1);
        botao1.setOnClickListener(onClickBotao1());

        Button botao2 = (Button) findViewById(R.id.btnBotao2);
        botao2.setOnClickListener(onClickBotao2());
    }

    public View.OnClickListener onClickBotao1(){
        return new Button.OnClickListener(){
            public void onClick(View v){
                Log.d(TAG, "Clicou no botão 1");
            }
        };
    };

    public View.OnClickListener onClickBotao2(){
        return new Button.OnClickListener(){
            public void onClick(View v){
                Log.d(TAG, "Clicou no botão 2");
            }
        };
    };
}

