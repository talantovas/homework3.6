package com.geeks.homework36

// MainActivity.kt
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.geeks.homework36.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.container, PersonListFragment())
                .commit()
        }
    }
}
