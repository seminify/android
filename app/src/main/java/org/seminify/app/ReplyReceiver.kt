package org.seminify.app

import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.core.app.RemoteInput

class ReplyReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val replyTxt = RemoteInput.getResultsFromIntent(intent)?.getCharSequence("key_text_reply")
        Log.d("kkang", "replyTxt : $replyTxt")
        val manger =
            context.getSystemService(ComponentActivity.NOTIFICATION_SERVICE) as NotificationManager
        manger.cancel(11)
    }
}