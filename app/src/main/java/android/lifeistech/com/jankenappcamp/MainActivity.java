package android.lifeistech.com.jankenappcamp;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView cpu;
    ImageView player;
    TextView result;
    Random random = new Random();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cpu = (ImageView)findViewById(R.id.cpu);
        result = (TextView)findViewById(R.id.result);
        player = (ImageView)findViewById(R.id.player);




    }

    public void goo(View v){

        int r = random.nextInt(3);

        player.setImageResource(R.drawable.goo);

        if (r == 0){
            cpu.setImageResource(R.drawable.goo);
            result.setText("引き分けです");
        }else if (r == 1){
            cpu.setImageResource(R.drawable.choki);
            result.setText("あなたの勝ちです！");
        }else if (r == 2){
            cpu.setImageResource(R.drawable.paa);
            result.setText("あなたの負けです");
        }




    }

    public void choki(View v){

        int r = random.nextInt(3);

        player.setImageResource(R.drawable.choki);

        if (r == 0){
            cpu.setImageResource(R.drawable.goo);
            result.setText("あなたの負けです");
        }else if (r == 1){
            cpu.setImageResource(R.drawable.choki);
            result.setText("引き分けです");
        }else if (r == 2){
            cpu.setImageResource(R.drawable.paa);
            result.setText("あなたの勝ちです！");

        }

    }

    public void paa(View v){

        int r = random.nextInt(3);

        player.setImageResource(R.drawable.paa);

        if (r == 0){
            cpu.setImageResource(R.drawable.goo);
            result.setText("あなたの勝ちです！");
        }else if (r == 1){
            cpu.setImageResource(R.drawable.choki);
            result.setText("あなたの負けです");
        }else if (r == 2){
            cpu.setImageResource(R.drawable.paa);
            result.setText("引き分けです");
        }

    }



}
