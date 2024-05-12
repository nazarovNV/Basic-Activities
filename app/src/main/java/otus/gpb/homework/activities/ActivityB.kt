package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityB : AppCompatActivity() {
    private var openCbutton : Button? = null
    private val TAG = "nazarovTag"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        openCbutton = findViewById(R.id.openC)
        openCbutton?.setOnClickListener {
            val intent = Intent(this, ActivityC::class.java)
            startActivity(intent)
        }
        Log.i(TAG, "onCreate B")
    }
    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.i(TAG, "onNewIntent B")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart B")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume B")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause B")
    }
    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop B")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy B")
    }
}