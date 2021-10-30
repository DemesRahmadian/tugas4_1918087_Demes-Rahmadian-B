    package com.example.tgs4_RecycleView;

    import androidx.appcompat.app.AppCompatActivity;
    import androidx.recyclerview.widget.LinearLayoutManager;
    import androidx.recyclerview.widget.RecyclerView;

    import android.os.Bundle;

    import java.util.ArrayList;

    public class MainActivity extends AppCompatActivity {
        private RecyclerView recyclerView;
        private MahasiswaAdapter adapter;
        private ArrayList<Mahasiswa> mahasiswaArrayList;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            addData();

            recyclerView = (RecyclerView)findViewById(R.id.recycleview);

            adapter = new MahasiswaAdapter(mahasiswaArrayList);

            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

            recyclerView.setLayoutManager(layoutManager);

            recyclerView.setAdapter(adapter);

        }

        private void addData() {
            mahasiswaArrayList = new ArrayList<>();
            mahasiswaArrayList.add(new Mahasiswa(R.drawable.biru,"NAMA : Demes Rahmadian B ", "NIM : 1918087", "ANGKATAN : 2019"));
            mahasiswaArrayList.add(new Mahasiswa(R.drawable.ic_cow,"NAMA : Zaenal Ade Putra", "NIM : 1911085", "ANGKATAN : 2019"));
            mahasiswaArrayList.add(new Mahasiswa(R.drawable.ic_cew,"NAMA : Sasmita ", "NIM : 1818011", "ANGKATAN : 2018"));
            mahasiswaArrayList.add(new Mahasiswa(R.drawable.ic_cew,"NAMA : Fitri", "NIM : 1712071", "ANGKATAN : 2017"));
            mahasiswaArrayList.add(new Mahasiswa(R.drawable.ic_cow,"NAMA : Joko", "NIM : 1718020", "ANGKATAN : 2017"));
        }
    }
