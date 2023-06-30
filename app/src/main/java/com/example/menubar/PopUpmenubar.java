package com.example.menubar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class PopUpmenubar extends AppCompatActivity {

    Button popupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_upmenubar);

        popupButton = (Button) findViewById(R.id.popupButton);
    }

    public void openPopUpMenu(View view) {

        PopupMenu popUpmenubar = new PopupMenu(PopUpmenubar.this, popupButton);
        popUpmenubar.getMenuInflater().inflate(R.menu.option_menubars, popUpmenubar.getMenu());


        popUpmenubar.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {

                int item_id = menuItem.getItemId();

                if (item_id == R.id.Option_One) {
                    Toast.makeText(PopUpmenubar.this, "Option 1 selected", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (item_id == R.id.Option_Two) {
                    Toast.makeText(PopUpmenubar.this, "Option 2 selected", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (item_id == R.id.Option_Three) {
                    Toast.makeText(PopUpmenubar.this, "Option 3 selected", Toast.LENGTH_SHORT).show();
                    return true;
                }

                return true;
            }
        });

        popUpmenubar.show();
    }


}