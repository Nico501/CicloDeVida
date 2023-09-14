package nicolasrusso.ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSiguienteMain;
    Button btnToastMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("ESTADOS", "1 - Estoy en onCreate");

        inicializarVistas();
        btnSiguienteMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                startActivity(intent);
            }
        });

        btnToastMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Toast", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void inicializarVistas() {
        btnSiguienteMain = findViewById(R.id.btnSiguienteMain);
        btnToastMain = findViewById(R.id.btnToastMain);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ESTADOS", "6 - Estoy en onDestroy");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ESTADOS", "2 - Estoy en onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ESTADOS", "3 - Estoy en onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ESTADOS", "4 - Estoy en onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ESTADOS", "5 - Estoy en onStop");
    }
}