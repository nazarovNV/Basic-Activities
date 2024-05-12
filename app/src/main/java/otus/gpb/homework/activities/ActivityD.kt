package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActivityD : AppCompatActivity() {
    private val TAG = "nazarovTag"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d)
        Log.i(TAG, "onCreate D")


    }
    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.i(TAG, "onNewIntent D")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart D")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume D")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause D")
    }
    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop D")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy D")
    }
}