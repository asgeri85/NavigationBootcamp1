package com.example.navigationbootcamp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navigationbootcamp.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val takim=intent.getStringExtra("takim").toString()
        binding.textSon.text="Şampiyon $takim"
    }
}