package com.daksh.kuro.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.rengwuxian.materialedittext.MaterialEditText;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class login extends AppCompatActivity {

    MaterialEditText u;
    MaterialEditText p;
    JsonPlaceHolderApi jsonPlaceHolderApi;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("http://veritracksystems.com/api/customer/login")
                .addConverterFactory(GsonConverterFactory.create()).build();
        u = findViewById(R.id.User);
        p = findViewById(R.id.editPassword);
        jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);
        login = findViewById(R.id.btnSignIn1);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Call<List<Profile>> call = jsonPlaceHolderApi.getEmail(u.getText().toString());

                call.enqueue(new Callback<List<Profile>>() {
                    @Override
                    public void onResponse(Call<List<Profile>> call, Response<List<Profile>> response) {

                        if (!response.isSuccessful()) {
                            Toast.makeText(login.this, "Code: " + response.code(), Toast.LENGTH_SHORT).show();
                            return;
                        }
                        List<Profile> profiles = response.body();

                        for (Profile profile : profiles) {
                            String name = profile.getName();
                            String email = profile.getEmail();
                            String password = profile.getPassword();
                            if ((u.getText().toString().equals(email)) && (p.getText().toString().equals(password))) {
                                Toast.makeText(login.this, "Welcome, " + name, Toast.LENGTH_SHORT).show();
                                Intent in =new Intent(login.this,user.class);
                            } else
                                Toast.makeText(login.this, "Enter Correct User Name Password", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<List<Profile>> call, Throwable t) {
                        Toast.makeText(login.this, t.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}