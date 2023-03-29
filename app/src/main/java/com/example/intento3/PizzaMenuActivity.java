package com.example.intento3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class PizzaMenuActivity extends AppCompatActivity {

    private final RadioGroup mPizzaRadioGroup;

    public PizzaMenuActivity(RadioGroup mPizzaRadioGroup) {
        this.mPizzaRadioGroup = mPizzaRadioGroup;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_menu);


        View mFinalizeOrderButton = null;
        assert false;
        mFinalizeOrderButton.setOnClickListener(new View.OnClickListener() {

            class FinalizeOrderActivity {
            }

            public void onClick(View v) {
                String pizza = "";
                int selectedPizzaId = mPizzaRadioGroup.getCheckedRadioButtonId();
                if (selectedPizzaId != -1) {
                    RadioButton selectedPizzaRadioButton = findViewById(selectedPizzaId);
                    pizza = selectedPizzaRadioButton.getText().toString();
                }
                String beverage = "ninguna";
                Intent intent = new Intent(PizzaMenuActivity.this, FinalizeOrderActivity.class);
                intent.putExtra("pizza", pizza);
                intent.putExtra("beverage", beverage);
                startActivity(intent);
            }
        });

        View mBeveragesButton = null;
        mBeveragesButton.setOnClickListener(v -> {
            Intent intent = new Intent(PizzaMenuActivity.this, BeverageMenuActivity.class);
            startActivity(intent);
        });
    }
}
