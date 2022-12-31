package com.example.si_nau;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rKelas;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Kelas> listKelas;

    void dataDummy(){
        listKelas = new ArrayList<>();
        listKelas.add(new Kelas("Matematika", "Tersedia untuk kelas 1 sampai dengan 6",R.drawable.business));
        listKelas.add(new Kelas("Matematika", "Tersedia untuk kelas 1 sampai dengan 6",R.drawable.business));
        listKelas.add(new Kelas("Matematika", "Tersedia untuk kelas 1 sampai dengan 6",R.drawable.business));
        listKelas.add(new Kelas("Matematika", "Tersedia untuk kelas 1 sampai dengan 6",R.drawable.business));
        listKelas.add(new Kelas("Matematika", "Tersedia untuk kelas 1 sampai dengan 6",R.drawable.business));
    }

    void data(){
        rKelas = findViewById(R.id.course_recycler);
        adapter = new AdapterKelas(this,listKelas);
        layoutManager = new LinearLayoutManager(this);
        rKelas.setLayoutManager(layoutManager);
        rKelas.setAdapter(adapter);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataDummy();
        data();
    }
}