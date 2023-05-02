package org.techtown.kotlinpractice09

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import org.techtown.kotlinpractice09.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView.text = getString(R.string.txt_data1)
        binding.textView.setTextColor(ResourcesCompat.getColor(resources, R.color.txt_color, null))
        binding.textView.textSize = resources.getDimension(R.dimen.txt_size)
    }
}