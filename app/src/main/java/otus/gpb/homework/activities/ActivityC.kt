package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityC : AppCompatActivity() {
    private var openAbutton : Button? = null
    private var openDbutton : Button? = null
    private var closeCbutton : Button? = null
    private var closeStackbutton : Button? = null
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

        }
        closeCbutton = findViewById(R.id.closeC)
        closeCbutton?.setOnClickListener {

        }
        closeStackbutton = findViewById(R.id.closeStack)
        closeStackbutton?.setOnClickListener {

        }
    }
}