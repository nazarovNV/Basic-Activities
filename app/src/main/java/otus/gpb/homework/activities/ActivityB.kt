package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityB : AppCompatActivity() {
    private var openCbutton : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        openCbutton = findViewById(R.id.openC)
        openCbutton?.setOnClickListener {
            val intent = Intent(this, ActivityC::class.java)
            startActivity(intent)
        }
    }
}