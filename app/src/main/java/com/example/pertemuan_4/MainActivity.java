    package com.example.pertemuan_4;

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
            mahasiswaArrayList.add(new Mahasiswa(R.drawable.fotosmk,"Nur Achmad Abdillah ", "1918107", "2019"));
            mahasiswaArrayList.add(new Mahasiswa(R.drawable.ic_launcher_background,"Budi", "1718082", "2017"));
            mahasiswaArrayList.add(new Mahasiswa(R.drawable.fotosmk,"Mufid ", "1818002", "2018"));
            mahasiswaArrayList.add(new Mahasiswa(R.drawable.ic_launcher_foreground,"Banteng", "1618008", "2016"));
            mahasiswaArrayList.add(new Mahasiswa(R.drawable.fotosmk,"Aku", "1618039", "2016"));
        }
    }
