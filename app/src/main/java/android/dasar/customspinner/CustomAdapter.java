package android.dasar.customspinner;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by lind on 29/04/18.
 */

public class CustomAdapter extends ArrayAdapter {
    Context c;
    String [] nama;
    String [] uang;
    int [] logo;

    public CustomAdapter(@NonNull Context c,  String[] nama, String[] uang, int[] logo) {
        super(c,R.layout.support_simple_spinner_dropdown_item,nama);
        this.c = c;
        this.nama = nama;
        this.uang = uang;
        this.logo = logo;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.layout_spinner,null);
        ImageView iv_logo = row.findViewById(R.id.iv_logo);
        TextView tv_nama= row.findViewById(R.id.tv_nama);
        TextView tv_uang = row.findViewById(R.id.tv_uang);
        iv_logo.setImageResource(logo[position]);
        tv_nama.setText(nama[position]);
        tv_uang.setText(uang[position]);
        return row;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.layout_spinner,null);
        ImageView iv_logo = row.findViewById(R.id.iv_logo);
        TextView tv_nama= row.findViewById(R.id.tv_nama);
        TextView tv_uang = row.findViewById(R.id.tv_uang);
        iv_logo.setImageResource(logo[position]);
        tv_nama.setText(nama[position]);
        tv_uang.setText(uang[position]);
        return row;
    }
}
