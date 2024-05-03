package com.example.learningrecycleview;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.learningrecycleview.adaptadores.UsuarioAdaptador;
import com.example.learningrecycleview.clases.Usuario;

public class DescriptionActivity extends AppCompatActivity {
    TextView txt_title,txt_description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        Usuario usuario = (Usuario) getIntent().getSerializableExtra("Usuario");
        txt_title = findViewById(R.id.txt_title);
        txt_description = findViewById(R.id.txt_description);

        assert usuario != null;
        txt_title.setText(usuario.getNombre());
        txt_description.setText(usuario.getDescripcion());

    }
}