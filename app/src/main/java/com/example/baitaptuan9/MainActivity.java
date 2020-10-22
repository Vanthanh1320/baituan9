package com.example.baitaptuan9;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Music> arrayMusic;
    MusicAdapter adapter;
    ImageButton imageButton;
    ConstraintLayout manhinh;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton=(ImageButton) findViewById(R.id.imabotton);
        manhinh=(ConstraintLayout) findViewById(R.id.mhinh);

        registerForContextMenu(imageButton);

        AnhXa();

        adapter=new MusicAdapter(this,R.layout.activity_main_music,arrayMusic);
        listView.setAdapter(adapter);


    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        getMenuInflater().inflate(R.menu.contexr_menu,menu);
        menu.setHeaderTitle("Cập nhật");
        super.onCreateContextMenu(menu, v, menuInfo);


    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.itemthem:
                break;
            case R.id.itemsua:
                break;
            case R.id.itemxoa:
                break;
        }
        return super.onContextItemSelected(item);
    }

    private void AnhXa(){
        listView=(ListView) findViewById(R.id.listmusic);
        arrayMusic=new ArrayList<>();

        arrayMusic.add(new Music("Yêu đơn phương","Only C - Karik",R.drawable.nhac5));
        arrayMusic.add(new Music("Phố không em","Thái Đinh",R.drawable.nhac7));
        arrayMusic.add(new Music("Như anh mơ","PC",R.drawable.nhac1));
        arrayMusic.add(new Music("Mãi mãi không phải anh","Thanh Bình",R.drawable.nhac2));
        arrayMusic.add(new Music("Có như không có","Hiền Hồ",R.drawable.nhac10));
        arrayMusic.add(new Music("1 phút","Andiez",R.drawable.nhac6));
        arrayMusic.add(new Music("Suýt nữa thì","Andiez",R.drawable.nhac8));

    }
}