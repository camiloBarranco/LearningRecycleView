package com.example.learningrecycleview;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learningrecycleview.clases.Usuario;
import com.example.learningrecycleview.adaptadores.UsuarioAdaptador;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv_usuarios;
    List<Usuario> listaUsuarios = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv_usuarios = findViewById(R.id.rcv_usuarios);

        Usuario user1 = new Usuario("https://rickandmortyapi.com/api/character/avatar/72.jpeg","Camilo","Proin condimentum, neque eget imperdiet placerat, dolor odio luctus velit, id tempor quam erat ut libero. Suspendisse est augue, semper vel imperdiet a, malesuada at diam.");
        Usuario user2= new Usuario("https://rickandmortyapi.com/api/character/avatar/120.jpeg","Andres","Phasellus at erat ullamcorper risus rhoncus porttitor. Aenean eget mi vehicula, vulputate dui at, pulvinar urna. Phasellus at elit ligula. ");
        Usuario user3 = new Usuario("https://rickandmortyapi.com/api/character/avatar/190.jpeg","Barranco","Curabitur ultrices libero pharetra posuere auctor.");
        Usuario user4 = new Usuario("https://rickandmortyapi.com/api/character/avatar/241.jpeg","Rua","Integer pretium posuere mi, a viverra justo rhoncus sit amet. ");

        listaUsuarios.add(user1);
        listaUsuarios.add(user2);
        listaUsuarios.add(user3);
        listaUsuarios.add(user4);

        rcv_usuarios.setLayoutManager(new LinearLayoutManager(this));
        rcv_usuarios.setAdapter(new UsuarioAdaptador(listaUsuarios, new UsuarioAdaptador.OnItemClickListener() {
            @Override
            public void onItemClick(Usuario dato) {
                moveToDescription(dato);
            }
        }));
    }
    public void moveToDescription(Usuario dato) {
        Intent intent = new Intent(this,DescriptionActivity.class);
        intent.putExtra("Usuario",dato);
        startActivity(intent);
    }
}