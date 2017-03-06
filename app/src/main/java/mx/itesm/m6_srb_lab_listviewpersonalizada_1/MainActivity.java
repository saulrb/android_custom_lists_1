package mx.itesm.m6_srb_lab_listviewpersonalizada_1;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends ListActivity implements AdapterView.OnItemClickListener{

    ArrayList<Libro> arrayListLibro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayListLibro = getDataForListView();
        LibroAdapter adapterLibros = new LibroAdapter(this, arrayListLibro);
        setListAdapter(adapterLibros);
        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view,int position, long id){
        Libro libro = (Libro) parent.getItemAtPosition(position);
        //Toast.makeText(this, libro.getTitulo(), Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, DetalleActivity.class);
        intent.putExtra("isbn",libro.getIsbn());
        intent.putExtra("fechaPublicacion",libro.getFechaPublicacion());
        intent.putExtra("titulo",libro.getTitulo());
        intent.putExtra("imagen",libro.getIdImagen());
        startActivity(intent);
    }

    public ArrayList<Libro> getDataForListView(){
        ArrayList<Libro> listaLibros = new ArrayList<Libro>();
        listaLibros.add(new Libro("The Android Developer´s Cookbook",
                                   "9780321741233",
                                    "23/01/2010",
                                    R.drawable.libro_cookbook));
        listaLibros.add(new Libro("Beginning Android Application Development",
                "9781118017111",
                "10/08/2011",
                R.drawable.libro_beginnig));
        listaLibros.add(new Libro("Java for Android Develoment",
                "9781430257226",
                "25/03/2014",
                R.drawable.libro_java));
        return listaLibros;
    }

}
