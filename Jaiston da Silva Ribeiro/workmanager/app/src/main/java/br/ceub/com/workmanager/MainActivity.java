package br.ceub.com.workmanager;

import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

//import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;



import br.ceub.com.workmanager.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private  static final int REQUEST_CODE_POST_NOTIFICATION = 1;

    private ActivityMainBinding mBinding;


    //Estudar ciclo de vida Android
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mBinding.applyButton.setOnClickListener(view -> {
            //posso fazer algo,porque o batão foi clicado

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

}