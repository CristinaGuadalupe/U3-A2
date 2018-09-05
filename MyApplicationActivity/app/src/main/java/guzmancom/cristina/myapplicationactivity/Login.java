package guzmancom.cristina.myapplicationactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends Activity {
EditText txtUsuario,txtpassword;
Button btnLogin;
TextView titulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtUsuario=findViewById(R.id.txtUsuario);
        txtpassword=findViewById(R.id.txtpassword);
        btnLogin=findViewById(R.id.btnLogin);
        titulo=(TextView)findViewById(R.id.txtTitulo);
        titulo.setText(getIntent().getStringExtra("titulo"));

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent respuesta=new Intent();
                respuesta.putExtra("usuario",txtUsuario.getText().toString());
                respuesta.putExtra("password",txtpassword.getText().toString());
                setResult(MainActivity.LOGIN_INTENT_CODE,respuesta);
                finish();
            }
        });

    }
}
