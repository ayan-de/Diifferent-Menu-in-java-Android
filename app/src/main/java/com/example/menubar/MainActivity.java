package com.example.menubar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button popupActivity = (Button) findViewById(R.id.popupActivity);
        Button contextmenuActivity = (Button) findViewById(R.id.contextmenuActivity);

        popupActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PopUpmenubar.class);
                startActivity(intent);
            }
        });

        contextmenuActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ContextMenuBar.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menubars,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
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
        return super.onOptionsItemSelected(item);
    }
}