package mx.itesm.m6_srb_lab_listviewpersonalizada_1;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvTitulo;
    TextView tvIsbn;
    TextView tvFecha;
    ImageView ivLibro;
    Button btnAceptar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        tvTitulo    = (TextView) findViewById(R.id.text_valorTitulo);
        tvIsbn      = (TextView) findViewById(R.id.text_valorISBN);
        tvFecha     = (TextView) findViewById(R.id.text_valorFecha);
        ivLibro     = (ImageView) findViewById(R.id.image_libro);
        btnAceptar  = (Button) findViewById(R.id.button_ok);
        btnAceptar.setOnClickListener(this);
        Intent intent = getIntent();
        if (intent.getExtras() != null){
            tvTitulo.setText(intent.getStringExtra("titulo"));
            tvIsbn.setText(intent.getStringExtra("isbn"));
            tvFecha.setText(intent.getStringExtra("fechaPublicacion"));
            ivLibro.setImageDrawable(ContextCompat.getDrawable(this,intent.getIntExtra("imagen",R.mipmap.ic_launcher)));
        }
    }
    @Override
    public void onClick(View v){
        finish();
    }
}
