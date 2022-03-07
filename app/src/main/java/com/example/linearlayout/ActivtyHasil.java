package com.example.linearlayout;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivtyHasil extends AppCompatActivity {
    //Deklarasi variabel textView
    TextView Email, Password;

    //Deklarasi variabel String
    String email, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activtyhasil);

        //Memanggil Email dan Password
        Email = findViewById(R.id.tf_nama);
        Password = findViewById(R.id.tf_Password);

        //Penggunaan Bundle
        Bundle bundle = getIntent().getExtras();

        //Mendapatkan bundle dari MainActivity
        email = bundle.getString("a");
        pass = bundle.getString("b");

        Email.setText(email);
        Password.setText(pass);
    }
}
