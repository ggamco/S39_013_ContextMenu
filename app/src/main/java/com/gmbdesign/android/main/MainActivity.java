package com.gmbdesign.android.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Si queremos ocultar la barra superior donde aparece el nombre de la app y el menu
        //usamos el siguiente metodo

        //getSupportActionBar().hide();

        //Otra manera de eliminar esta barra es desde la configuración de style
        //usamos otro estilo prdefinido


        //CONTEXTMENU
        EditText ed = (EditText) findViewById(R.id.edt);
        registerForContextMenu(ed);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        //super.onCreateContextMenu(menu, v, menuInfo);
        MenuItem mi = menu.add(Menu.NONE, 8, 8, "Dale duro");

    }
}
