package com.example.intento3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class BeverageMenuActivity extends AppCompatActivity {

    private final RadioGroup mBeverageRadioGroup;

    public BeverageMenuActivity(RadioGroup mBeverageRadioGroup) {
        this.mBeverageRadioGroup = mBeverageRadioGroup;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverage_menu);

        View mFinalizeOrderButton = null;
        assert false;
        mFinalizeOrderButton.setOnClickListener(new View.OnClickListener() {
            class FinalizeOrderActivity {
            }

            @Override
            public void onClick(View v) {
                String beverage = "";
                int selectedBeverageId = mBeverageRadioGroup.getCheckedRadioButtonId();
                if (selectedBeverageId != -1) {
                    RadioButton selectedBeverageRadioButton = findViewById(selectedBeverageId);
                    beverage = selectedBeverageRadioButton.getText().toString();
                }
                String pizza = "ninguna";
                Intent intent = new Intent(BeverageMenuActivity.this, FinalizeOrderActivity.class);
                intent.putExtra("pizza", pizza);
                intent.putExtra("beverage", beverage);
                startActivity(intent);
            }
        });

        View mPizzasButton = null;
        mPizzasButton.setOnClickListener(v -> {
            Intent intent = new Intent(BeverageMenuActivity.this, PizzaMenuActivity.class);
            startActivity(intent);
        });
    }
}
