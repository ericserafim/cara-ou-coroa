package caraoucoroa.ericserafim.com.caraoucoroa;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends AppCompatActivity {

    private ImageView caraCoroa;
    private ImageView botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        caraCoroa = (ImageView) findViewById(R.id.imgCaraCoroa);
        botaoVoltar = (ImageView) findViewById(R.id.botarVoltarId);

        Bundle extra = getIntent().getExtras();

        if (extra != null){
            String opcao = extra.getString("opcao");

            if (opcao.equals("cara")){
                caraCoroa.setImageDrawable(ContextCompat.getDrawable(DetalheActivity.this, R.drawable.moeda_cara));
            } else {
                caraCoroa.setImageDrawable(ContextCompat.getDrawable(DetalheActivity.this, R.drawable.moeda_coroa));
            }
        }

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}
