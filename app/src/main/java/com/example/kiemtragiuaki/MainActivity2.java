package com.example.kiemtragiuaki;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent nhanduoc = getIntent();
        String ten = nhanduoc.getStringExtra("ten");
        String ma = nhanduoc.getStringExtra("ma");
        String email = nhanduoc.getStringExtra("email");
        String lop = nhanduoc.getStringExtra("lop");
        TextView tvTen = findViewById(R.id.textView10);
        TextView tvMa = findViewById(R.id.textView11);
        TextView tvEmail = findViewById(R.id.textView12);
        TextView tvLop = findViewById(R.id.textView13);
        tvTen.setText(ten);
        tvMa.setText(ma);
        tvEmail.setText(email);
        tvLop.setText(lop);
    }
    public void quaylai (View v) {
        Intent quaylai = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(quaylai);
    }
}