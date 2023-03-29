package com.example.intento3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class FinalizarPedidoActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalizar_pedido);

        // Obtener los datos del pedido
        getIntent().getStringExtra("usuario");
        String pizzaSeleccionada = getIntent().getStringExtra("pizzaSeleccionada");
        getIntent().getStringExtra("bebidaSeleccionada");

        // Calcular el total del pedido
        if (!pizzaSeleccionada.isEmpty()) {
            switch (pizzaSeleccionada) {
                case "Peperoni":
                case "Hawaiana":
                case "Mexicana":
                    break;
            }
        }

    }

}
