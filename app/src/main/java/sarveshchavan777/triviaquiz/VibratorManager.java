package sarveshchavan777.triviaquiz;
import android.content.Context;
import android.os.Vibrator;

public class VibratorManager {

    private  Context mContext;

    public VibratorManager(Context context){
        mContext = context;
    }


    public  void   playVibrator (int seconde)
    {
        // Get instance of Vibrator from current Context
        Vibrator v = (Vibrator) mContext.getSystemService(Context.VIBRATOR_SERVICE);

// Vibrate for 400 milliseconds
        v.vibrate(seconde * 1000);
    }

}