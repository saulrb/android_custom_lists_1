package mx.itesm.m6_srb_lab_listviewpersonalizada_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by saul on 12/2/2017.
 */

public class LibroAdapter extends ArrayAdapter<Libro> {

    public LibroAdapter(Context context, List<Libro> objects) {
        super(context, 0 , objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Libro libro = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row,parent,false);
        }
        TextView tvTitulo = (TextView) convertView.findViewById(R.id.text_titulo);
        TextView tvIsbn = (TextView) convertView.findViewById(R.id.text_isbn);
        TextView tvFechaPublicacion = (TextView) convertView.findViewById(R.id.text_fechaPublicacion);
        ImageView ivLibro = (ImageView) convertView.findViewById(R.id.imageView);

        tvTitulo.setText(libro.getTitulo());
        tvIsbn.setText(libro.getIsbn());
        tvFechaPublicacion.setText(libro.getFechaPublicacion());
        ivLibro.setImageResource(libro.getIdImagen());

        return convertView;
    }
}
