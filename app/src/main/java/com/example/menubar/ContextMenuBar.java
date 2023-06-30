package com.example.menubar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ContextMenuBar extends AppCompatActivity {

    ListView contract_list;
    String[] contracts = {"Your Channel", "Turn on incognito", "Add Account", "Get Premium", "Purchase and membership", "Time watched", "Your data", "Setting", "Help", "Studio", "Music", "Kids"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu_bar);

        contract_list = (ListView) findViewById(R.id.contract_list);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,contracts);
        contract_list.setAdapter(arrayAdapter);

        //long press functionality
        registerForContextMenu(contract_list);

    }


    //long press
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.option_menubars,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int item_id = item.getItemId();

        if (item_id == R.id.Option_One) {
            Toast.makeText(this, "Option 1 selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item_id == R.id.Option_Two) {
            Toast.makeText(this, "Option 2 selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item_id == R.id.Option_Three) {
            Toast.makeText(this, "Option 3 selected", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onContextItemSelected(item);
    }
}