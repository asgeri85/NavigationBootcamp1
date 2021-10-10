package com.example.navigationbootcamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.navigationbootcamp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener {
            val ad=binding.editTextTextPersonName2.text.toString().trim()
            if (ad.isNotEmpty()){
                val intent=Intent(this@MainActivity,ActivitySecond::class.java)
                intent.putExtra("ad",ad)
                startActivity(intent)
            }else{
                Toast.makeText(applicationContext,"Lutfen adınızı girin",Toast.LENGTH_SHORT).show()
            }

        }
    }
}