package dev.adambennett.progressleak

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_leave_page).setOnClickListener {
            Intent(this, SecondActivity::class.java)
                .run { startActivity(this) }

            finish()
        }
    }
}
