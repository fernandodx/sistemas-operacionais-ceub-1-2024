package br.com.ceub.meu.work;

import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import br.com.ceub.meu.work.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private  static final int REQUEST_CODE_POST_NOTIFICATION = 1;

    private ActivityMainBinding mBinding;


    //Estudar ciclo de vida Android
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());


        mBinding.applyButotn.setOnClickListener(view -> {
            //posso fazer algo, porque o botão foi clicado
        });

        requestPermission();

    }

    private void requestPermission(){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU){
            if(ActivityCompat.checkSelfPermission(this,android.Manifest.permission.POST_NOTIFICATIONS)
                    != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(this,new String[]{android.Manifest.permission.POST_NOTIFICATIONS},REQUEST_CODE_POST_NOTIFICATION);
            }
        }
    }
    private int getBlurLevel(){
        int idSelected=mBinding.radioBlurGroup.getCheckedRadioButtonId();
        if (idSelected== R.id.radio_blur_lv_3){
            return 3;
        }else if (idSelected== R.id.radio_blur_lv_2){
            return 2;
        }else {
            return 1;
        }
    }
}