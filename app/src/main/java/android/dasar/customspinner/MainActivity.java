package android.dasar.customspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
Spinner sp;
CustomAdapter adapter;
String [] nama  ;
String [] uang = {"RenMimbi","Euro","Rupiah","Rupe","Yen","Won","Ringgit","Dolar sin","Dolar usa"};
int [] logo = {R.drawable.chn,R.drawable.eng,R.drawable.idn,R.drawable.ind,R.drawable.jpn,R.drawable.kor,R.drawable.mas,R.drawable.sin,R.drawable.usa};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nama= getResources().getStringArray(R.array.negara);
        sp = findViewById(R.id.sp_cari);
        adapter = new CustomAdapter(MainActivity.this,nama,uang,logo);
        sp.setAdapter(adapter);
    }
}
