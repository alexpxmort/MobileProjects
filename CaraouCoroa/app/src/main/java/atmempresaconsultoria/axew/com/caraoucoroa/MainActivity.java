package atmempresaconsultoria.axew.com.caraoucoroa;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends Activity {

    private ImageView btnJogar;
    private String[] opcao={"cara","coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJogar=(ImageView)findViewById(R.id.btnJogarId);

        //Muda de tela exibindo os dados que foram enviados
      btnJogar.setOnClickListener(new View.OnClickListener(){

          @Override
          public void onClick(View v) {
              Random randomico=new Random();
              int numero_aleatoria=randomico.nextInt(2);

              Intent intent=new Intent(MainActivity.this,DetalhesActivity.class);
              intent.putExtra("opcao",opcao[numero_aleatoria]);
              startActivity(intent);
          }
      });
    }


}
