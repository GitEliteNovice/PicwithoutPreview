package info.androidhive.babgcamera;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button click;
    //http://stackoverflow.com/questions/21752637/how-to-capture-an-image-in-background-without-using-the-camera-application/24849344#24849344
//android.hardware.Camera.Parameters camCapture;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    click=(Button)findViewById(R.id.click);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent front_translucent = new Intent(getApplication()
                        .getApplicationContext(), CamerService.class);
                front_translucent.putExtra("Front_Request", true);
                front_translucent.putExtra("Quality_Mode","100");
                getApplication().getApplicationContext().startService(
                        front_translucent);

            }
        });
    }
}
