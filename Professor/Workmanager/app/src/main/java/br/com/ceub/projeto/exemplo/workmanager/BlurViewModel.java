package br.com.ceub.projeto.exemplo.workmanager;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;

public class BlurViewModel extends ViewModel {

    private WorkManager mWorkManager;

    public BlurViewModel(@NonNull Application application) {
        super();
        mWorkManager = WorkManager.getInstance(application);
    }

    void applyBlur(int blurLevel) {
        /*
           Representa uma solicitação para realizar algum trabalho.
	       Tipos: OneTimeWorkRequest (para trabalhos únicos) e PeriodicWorkRequest (para trabalhos repetidos).
	       Constraints: (ex: apenas quando o dispositivo estiver conectado ao Wi-Fi).
       */


        WorkRequest blurRequest = OneTimeWorkRequest.from(BlurWorker.class);
        mWorkManager.enqueue(blurRequest);
    }
}
