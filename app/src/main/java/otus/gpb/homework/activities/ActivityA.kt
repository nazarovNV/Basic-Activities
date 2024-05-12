package otus.gpb.homework.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityA : AppCompatActivity() {
    private var button : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        button = findViewById(R.id.openB)
        button?.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)

            startActivity(intent)
        }
    }
}