package ntqnhu.baitap.n16dccn113;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView txtv_name, txtv_logo;
    EditText edt_name, edt_pass;
    Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //gọi tới file chứa giao diện
        setContentView(R.layout.activity_main);
        // bước 2 ánh xạ
        txtv_name =(TextView) findViewById(R.id.txtvName);
        txtv_logo =(TextView) findViewById(R.id.txtvLogo);
        edt_name =(EditText) findViewById(R.id.edtName);
        edt_pass =(EditText) findViewById(R.id.edtPass);
        btn_login =(Button) findViewById(R.id.btnDN);
        //bước 3: code
       // txtv.setText("HELLO NHƯ");
    }
}
