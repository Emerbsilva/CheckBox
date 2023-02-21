package com.ebsindustrial.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ebsindustrial.checkbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setStatus()

        binding.checkbox.setOnCheckedChangeListener{_,_ ->
            setStatus()
        }

    }

    fun setStatus(){
        binding.textView.text = if (binding.checkbox.isChecked){
            "Ativado"
        }else{
            "Desativado"
        }
    }
}