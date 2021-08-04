package com.arbud.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KalkulatorActivity extends AppCompatActivity {

    private EditText et_input1, et_input2;
    private Button bt_tambah, bt_kali, bt_bagi, bt_minus, bt_hapus;
    private TextView tv_hasilAkhir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        //toolbar

        getSupportActionBar().setTitle("Aplikasi Kalkulator");

        // Inisialisasi Widget
        et_input1 = findViewById(R.id.et_input1);
        et_input2 = findViewById(R.id.et_input2);
        bt_bagi = findViewById(R.id.bt_bagi);
        bt_kali = findViewById(R.id.bt_kali);
        bt_minus = findViewById(R.id.bt_minus);
        bt_tambah = findViewById(R.id.bt_tambah);
        tv_hasilAkhir = findViewById(R.id.tv_hasilakhir);
        bt_hapus = findViewById(R.id.bt_bersih);

        // Button Tambah

        bt_tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Input1 = et_input1.getText().toString().trim();
                String Input2 = et_input2.getText().toString().trim();
                if (Input1.isEmpty()){
                    et_input1.setError("Tolong Masukan Nilai 1");
                } else if (Input2.isEmpty()) {
                    et_input2.setError("Tolong Masukan Nilai 2");
                } else {
                    Double inputa = Double.parseDouble(Input1);
                    Double inputb = Double.parseDouble(Input2);
                    Double ans = inputa + inputb;
                    String hasil1 = String.valueOf(ans);
                    tv_hasilAkhir.setText(hasil1);
                }
            }
        });

        //button minus
        bt_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Input1 = et_input1.getText().toString().trim();
                String Input2 = et_input2.getText().toString().trim();
                if (Input1.isEmpty()){
                    et_input1.setError("Tolong Masukan Nilai 1");
                } else if (Input2.isEmpty()) {
                    et_input2.setError("Tolong Masukan Nilai 2");
                } else {
                    Double inputa = Double.parseDouble(Input1);
                    Double inputb = Double.parseDouble(Input2);
                    Double ans = inputa - inputb;
                    String hasil1 = String.valueOf(ans);
                    tv_hasilAkhir.setText(hasil1);
                }
            }
        });

        //button kali
        bt_kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Input1 = et_input1.getText().toString().trim();
                String Input2 = et_input2.getText().toString().trim();
                if (Input1.isEmpty()){
                    et_input1.setError("Tolong Masukan Nilai 1");
                } else if (Input2.isEmpty()) {
                    et_input2.setError("Tolong Masukan Nilai 2");
                } else {
                    Double inputa = Double.parseDouble(Input1);
                    Double inputb = Double.parseDouble(Input2);
                    Double ans = inputa * inputb;
                    String hasil1 = String.valueOf(ans);
                    tv_hasilAkhir.setText(hasil1);
                }
            }
        });

        // button bagi
        bt_bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Input1 = et_input1.getText().toString().trim();
                String Input2 = et_input2.getText().toString().trim();
                if (Input1.isEmpty()){
                    et_input1.setError("Tolong Masukan Nilai 1");
                } else if (Input2.isEmpty()) {
                    et_input2.setError("Tolong Masukan Nilai 2");
                } else {
                    Double inputa = Double.parseDouble(Input1);
                    Double inputb = Double.parseDouble(Input2);
                    Double ans = inputa / inputb;
                    String hasil1 = String.valueOf(ans);
                    tv_hasilAkhir.setText(hasil1);
                }
            }
        });

        bt_hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_input1.getText().clear();
                et_input2.getText().clear();
                tv_hasilAkhir.setText("0");
            }
        });

    }
}