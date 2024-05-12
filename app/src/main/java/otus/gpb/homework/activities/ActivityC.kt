package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityC : AppCompatActivity() {
    private var openAbutton : Button? = null
    private var openDbutton : Button? = null
    private var closeCbutton : Button? = null
    private var closeStackbutton : Button? = null
    private val TAG = "nazarovTag"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        openAbutton = findViewById(R.id.openA)
        openAbutton?.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }
        openDbutton = findViewById(R.id.openD)
        openDbutton?.setOnClickListener {
            val intent = Intent(this, ActivityD::class.java)
            startActivity(intent)

        }
        closeCbutton = findViewById(R.id.closeC)
        closeCbutton?.setOnClickListener {

        }
        closeStackbutton = findViewById(R.id.closeStack)
        closeStackbutton?.setOnClickListener {

        }
        Log.i(TAG, "onCreate C")
    }
    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.i(TAG, "onNewIntent C")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart C")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume C")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause C")
    }
    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop C")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy C")
    }
}