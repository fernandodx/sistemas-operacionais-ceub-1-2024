package br.com.ceub.projeto.exemplo.workmanager;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Data;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class BlurWorker  extends Worker {

    public BlurWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        //código para o trabalho real que deseja executar em segundo plano.
        Context applicationContext = getApplicationContext();

//        String resourceUri = getInputData().getString(Constants.KEY_IMAGE_URI);

        try{
            Bitmap picture = BitmapFactory.decodeResource(applicationContext.getResources(), R.drawable.android_cupcake);

//            if(TextUtils.isEmpty(resourceUri)){
//                Log.e("WORKER", "Invalid input uri");
//                throw new IllegalArgumentException("Invalid input uri");
//            }
//            ContentResolver resolver = applicationContext.getContentResolver();
//            Bitmap picture = BitmapFactory.decodeStream(resolver.openInputStream(Uri.parse(resourceUri)));

            Bitmap output = WorkerUtils.blurBitmap(picture, applicationContext);

            Uri outputUri = WorkerUtils.writeBitmapToFile(applicationContext, output);

            WorkerUtils.makeStatusNotification("Finalizado: " + outputUri.toString(), applicationContext);

            Data outputData = new Data.Builder()
                    .putString(Constants.KEY_IMAGE_URI, outputUri.toString())
                    .build();

            return Result.success(outputData);
        } catch (Throwable e) {
          Log.e("WORKER", e.getMessage());
          return Result.failure();
        }
    }
}
