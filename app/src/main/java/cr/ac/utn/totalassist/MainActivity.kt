package cr.ac.utn.totalassist

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnManagerService: Button = findViewById<Button>(R.id.btnAdminServ)
        btnManagerService.setOnClickListener(View.OnClickListener { view ->

            val intentMagService = Intent(this, ManagerService::class.java)
            startActivity(intentMagService)

        })


        val btnViewRequest: Button = findViewById<Button>(R.id.btnAdminResq)
        btnViewRequest.setOnClickListener(View.OnClickListener { view ->

            val intentViewRequest = Intent(this, ViewRequest::class.java)
            startActivity(intentViewRequest)

        })

    }
}