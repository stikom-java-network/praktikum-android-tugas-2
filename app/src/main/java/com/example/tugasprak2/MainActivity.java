package com.example.tugasprak2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText txtNama;
    private EditText txtUts;
    private EditText txtUas;
    private EditText txtTugas;
    private Button hitung;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNama = (EditText) findViewById(R.id.txtNama);
        txtUts = (EditText) findViewById(R.id.nilaiUTS);
        txtUas = (EditText) findViewById(R.id.nilaiUas);
        txtTugas = (EditText) findViewById(R.id.nilaiTugas);
        hitung = (Button) findViewById(R.id.hasile);
        hasil = (TextView) findViewById(R.id.hasil);
        hitung.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == hitung){
            String nama = txtNama.getText().toString();
            int uts = Integer.parseInt(txtUts.getText().toString());
            int uas = Integer.parseInt(txtUas.getText().toString());
            int tugas = Integer.parseInt(txtTugas.getText().toString());

            Double proses = (0.3*uts)+(0.3*uas)+(0.4*tugas);
            String predikat = "";
            if (proses >= 80 && proses <= 100 ){
                predikat = "A";
            }else if(proses >= 60 && proses < 80){
                predikat = "B";
            }else if (proses >= 40 && proses < 60){
                predikat = "C";
            }else if (proses >= 20 && proses< 40){
                predikat = "D";
            }else{
                predikat = "E";
            }
            hasil.setText("Selamat "+nama+" nilai akhir\nAnda "+proses+" dengan predikat "+predikat);
        }
    }
}
