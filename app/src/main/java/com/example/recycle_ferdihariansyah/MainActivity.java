package com.example.recycle_ferdihariansyah;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new Mahasiswa("2312500321", "wahyu permadi", "way@gmail.com", "01-01-1945"));
        mahasiswaList.add(new Mahasiswa("2312500532", "Budi", "budigaming@gmail.com", "02-02-1970"));
        mahasiswaList.add(new Mahasiswa("2312500743", "Citra kirana", "citra@gmail.com", "03-03-1999"));
        mahasiswaList.add(new Mahasiswa("2312500973", "Dewi sartika", "deway@gmail.com", "04-04-2002"));
        mahasiswaList.add(new Mahasiswa("2312500963", "khodijah", "kodijahasoy@gmail.com", "04-04-2001"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MahasiswaAdapter(mahasiswaList));
    }
}