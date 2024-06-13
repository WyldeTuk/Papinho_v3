package com.example.papinho_v3;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    private EditText editTextNome;
    private EditText editTextMatricula;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editTextNome = findViewById(R.id.editTextNome);
        editTextMatricula = findViewById(R.id.editTextMatricula);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonRegister = findViewById(R.id.buttonRegister);

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });
    }

    private void registerUser() {
        String nome = editTextNome.getText().toString().trim();
        String matricula = editTextMatricula.getText().toString().trim();
        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        if (TextUtils.isEmpty(nome)) {
            editTextNome.setError("Nome é obrigatório");
            return;
        }

        if (TextUtils.isEmpty(matricula)) {
            editTextMatricula.setError("Matrícula é obrigatória");
            return;
        }

        if (TextUtils.isEmpty(email)) {
            editTextEmail.setError("Email é obrigatório");
            return;
        }

        if (TextUtils.isEmpty(password)) {
            editTextPassword.setError("Senha é obrigatória");
            return;
        }

        // Adicione lógica para salvar os dados do usuário (por exemplo, no Firebase)

        Toast.makeText(RegisterActivity.this, "Usuário registrado com sucesso", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
        finish();
    }
}


