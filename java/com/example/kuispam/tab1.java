package com.example.kuispam;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class tab1 extends Fragment {
    private RecyclerView recyclerView;
    private Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private TextView text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1, container, false);
        return rootView;
//        final ArrayList<List> list = new ArrayList<>(); // inisialisasi array
//        list.add(new List(R.drawable.ic_android_, "Andre Herera", "Midfielder")); //memasukkan array yang akan ditampilkan di
//        list.add(new List(R.drawable.ic_android_, "David De Gea", "GoalKeeper")); // recyclerView
//        list.add(new List(R.drawable.ic_android_, "Michael Carrick", "Midfielder"));
//        list.add(new List(R.drawable.ic_android_, "Juan Mata", "PlayMaker"));
//        list.add(new List(R.drawable.ic_android_, "Diego Costa", "Striker"));
//        list.add(new List(R.drawable.ic_android_, "Oscar", "PlayMaker"));
//
//        recyclerView = findViewById(R.id.Recyler);
//        recyclerView.setHasFixedSize(true);
//        layoutManager = new LinearLayoutManager(this);
//        adapter = new Adapter(list);
//
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setAdapter(adapter);
//
//        adapter.setOnItemClickListener(new Adapter.OnItemClickListener() {
//            @Override
//            public void onItemCLick(int position) {
//                Intent i = new Intent(MainActivity.this, profilActivity.class);//jika recyler view diklik
//                startActivity(i);                                                            // maka akan pindah kehalaman profil
//            }
//        });
//
//    }
//}
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu){ //inisialisasi menu
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.menuitem,menu);// memanggil menu
//        return true;
//    }
//}

    }
}

