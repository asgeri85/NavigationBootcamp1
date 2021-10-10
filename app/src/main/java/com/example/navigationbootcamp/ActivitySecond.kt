package com.example.navigationbootcamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navigationbootcamp.databinding.ActivitySecondBinding

class ActivitySecond : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ad=intent.getStringExtra("ad").toString()
        binding.textAd.text="Merhaba $ad"
        binding.buttonSecond.setOnClickListener {
            val takim=when(binding.radio.checkedRadioButtonId){
                R.id.galata->"Galatasaray"
                R.id.fener->"Fenerbahçe"
                else -> "Diğer"
            }

            val intent=Intent(this,ThirdActivity::class.java)
            intent.putExtra("takim",takim)
            startActivity(intent)
            finish()
        }
    }
}