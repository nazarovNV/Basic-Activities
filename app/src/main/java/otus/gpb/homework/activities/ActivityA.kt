package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityA : AppCompatActivity() {
    private var openBbutton : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        openBbutton = findViewById(R.id.openB)
        openBbutton?.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)

            startActivity(intent)
        }
    }
}