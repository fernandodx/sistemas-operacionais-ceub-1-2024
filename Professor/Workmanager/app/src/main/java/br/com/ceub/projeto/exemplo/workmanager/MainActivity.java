package br.com.ceub.projeto.exemplo.workmanager;

import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import br.com.ceub.projeto.exemplo.workmanager.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE_POST_NOTIFICATIONS = 1;
    private BlurViewModel mViewModel;
    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mViewModel = new BlurViewModel(getApplication());

        mBinding.applyButton.setOnClickListener(view -> {
            mViewModel.applyBlur(getBlurLevel());
        });

        requestPermission();
    }

    private void requestPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
                // Permissão ainda não foi concedida, solicitar a permissão
                ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.POST_NOTIFICATIONS}, REQUEST_CODE_POST_NOTIFICATIONS);
            }
        }
    }

    private int getBlurLevel() {
       int idSelected = mBinding.radioBlurGroup.getCheckedRadioButtonId();
       if(idSelected == R.id.radio_blur_lv_3) {
           return 3;
       } else if(idSelected == R.id.radio_blur_lv_2) {
           return 2;
       } else {
           return 1;
       }
    }

}
