package holamundo.app.morales.nuria.appconbutterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    TextView textViewA;
    @BindView(R.id.textB) TextView textViewB;
    @BindView(R.id.boton) Button boton;
    @BindView(R.id.botonA) Button botonA;
    @BindView(R.id.botonB) Button botonB;

    @OnClick({R.id.boton,R.id.botonA,R.id.botonB})
    public void clicked(Button button){
        switch (button.getId()){
            case R.id.boton:
                Toast.makeText(this,"Click con Butter Knife BOTON ",Toast.LENGTH_SHORT).show();
                break;
            case R.id.botonA:
                Toast.makeText(this,"Click con Butter Knife BOTON A",Toast.LENGTH_SHORT).show();
                break;
            case R.id.botonB:
                Toast.makeText(this,"Click con Butter Knife BOTON B",Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        textViewB.setText("Texto modificado con Butter Knife");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this); // Se tiene que poner detrás de setContentView porque la Vista tiene que estar ya creada.

        textViewA = (TextView) findViewById(R.id.textA);
        textViewA.setText("TEXTO C");
        textViewB.setText("TEXTO D");
    }
}
