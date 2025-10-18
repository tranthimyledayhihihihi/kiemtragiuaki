package com.example.kiemtragiuaki;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void Chuyenquamh2 (View v) {
        EditText edtTen = findViewById(R.id.etName);
        EditText edtMa = findViewById(R.id.etStudentId);
        EditText edtEmail = findViewById(R.id.editTextTextEmailAddress);
        EditText edtLop = findViewById(R.id.etClass);
        String ten = edtTen.getText().toString();
        String ma = edtMa.getText().toString();
        String email = edtEmail.getText().toString();
        String lop = edtLop.getText().toString();
        if(ten.isEmpty() || ma.isEmpty() || email.isEmpty() || lop.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
            return;
        }


        Intent kichhoatqua2 = new Intent(MainActivity.this, MainActivity2.class);
        kichhoatqua2.putExtra("ten", ten);
        kichhoatqua2.putExtra("ma", ma);
        kichhoatqua2.putExtra("email", email);
        kichhoatqua2.putExtra("lop", lop);
        startActivity(kichhoatqua2);
    }
}