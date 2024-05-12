package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityA : AppCompatActivity() {
    private var openBbutton : Button? = null
    private val TAG = "nazarovTag"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        openBbutton = findViewById(R.id.openB)
        openBbutton?.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            startActivity(intent)
        }
        Log.i(TAG, "onCreate A")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.i(TAG, "onNewIntent A")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart A")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume A")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause A")
    }
    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop A")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy A")
    }

}