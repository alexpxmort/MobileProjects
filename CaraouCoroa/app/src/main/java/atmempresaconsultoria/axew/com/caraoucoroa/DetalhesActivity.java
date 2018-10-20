package atmempresaconsultoria.axew.com.caraoucoroa;

import android.content.Intent;
import android.media.Image;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetalhesActivity extends AppCompatActivity {

    private ImageView imagem;
    private ImageView btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);
        btnVoltar=(ImageView)findViewById(R.id.btnVoltarId);
        imagem=(ImageView)findViewById(R.id.caraId) ;

        //Volta para a tela inicial
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DetalhesActivity.this,MainActivity.class));
            }
        });

        Bundle extra=getIntent().getExtras();

        if (extra!=null){
            String opcaoescolhida=extra.getString("opcao");

            if(opcaoescolhida.equals("cara")){
                //Moeda Cara
                imagem.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.moeda_cara));
            }else{
                //Moeda Coroa
                imagem.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.moeda_coroa));
            }
        }
    }
}
