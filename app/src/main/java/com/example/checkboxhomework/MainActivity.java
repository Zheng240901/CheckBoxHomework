package com.example.checkboxhomework;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private String message = "Toppings: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastMessage(View view) {
        toppings((CheckBox) findViewById(R.id.chocolate_syrup), getString(R.string.chocolate_syrup));
        toppings((CheckBox) findViewById(R.id.sprinkles), getString(R.string.sprinkles));
        toppings((CheckBox) findViewById(R.id.crushed_nuts), getString(R.string.crushed_nuts));
        toppings((CheckBox) findViewById(R.id.cherries), getString(R.string.cherries));
        toppings((CheckBox) findViewById(R.id.orio_cookies), getString(R.string.orio_cookies));
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void toppings(CheckBox checkBox, String topping){
        if (checkBox.isChecked()){
            if (!message.contains(topping)){
                message = message + " " + topping;
            }
        }
        else{
            if (message.contains(topping)){
                message = message.replace(" " + topping, "");
            }
        }
    }
}