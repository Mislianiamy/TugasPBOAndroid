package com.example.user.alarmtugasakhir;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

import com.example.user.alarmtugasakhir.R;

/**
 * Created by user on 06/06/2016.
 */
public class ReceiverClass extends BroadcastReceiver {
MediaPlayer player;
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Alarm aktif", Toast.LENGTH_LONG).show();
        player = MediaPlayer.create(context, R.raw.alarmm);
        player.start();
    }
}
