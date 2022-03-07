package com.example.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variabel untuk button
    Button btnLogin;

    //Deklarasi variabel untuk EditText
    EditText edemail, edpassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btnLogin dengan componen button pada Layout
        btnLogin=findViewById(R.id.btSignin);

        //Menghubungkan variabel edemail dengan componen button pada layout
        edemail=findViewById(R.id.edEmail);

        //Menghubungkan variabel edpassword dengan componan button pada Layout
        edpassword=findViewById(R.id.edPassword);

        //Membuat fungsi onclik pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Menyimpan input user di edittext email kedalam variabel nama
                nama = edemail.getText().toString();

                //Menyimpan input user di edittext password kedalam variabel password
                password = edpassword.getText().toString();

               //Membuat Kondisi validasi inputan User untuk Login
                if(nama.equals("admin@mail.com")&& password.equals("umy123")){
                    // pembuatan Bundle
                     Bundle b = new Bundle();

                     //Key parsing data dimasukkan ke dalam Bundle
                    b.putString("a", nama.trim());
                    b.putString("b", password.trim());

                    //Membuat objek untuk pindah halaman
                    Intent i = new Intent(getApplicationContext(),ActivtyHasil.class);

                    //Memasukkan bundle ke dalam intent
                    i.putExtras(b);

                    //Berpindah ke halaman login
                    startActivity(i);

                    Toast.makeText(getApplicationContext(),"Login Berhasil", Toast.LENGTH_SHORT).show();

                    //Delete isi dari edittext
                    edemail.getText().clear();
                    edpassword.getText().clear();
                }
                else if (nama.equals("admin@mail.com")){
                    Toast.makeText(getApplicationContext(),"Password Salah", Toast.LENGTH_SHORT).show();
                }
                else if (password.equals("umy123")){
                    Toast.makeText(getApplicationContext(), "Email Salah", Toast.LENGTH_SHORT).show();
                }
                else if (nama.equals("") || password.equals("")){
                    Toast.makeText(getApplicationContext(), "Email dan Password Salah", Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
}