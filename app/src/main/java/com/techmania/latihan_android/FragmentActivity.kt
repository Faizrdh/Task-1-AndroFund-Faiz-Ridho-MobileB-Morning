package com.techmania.latihan_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.techmania.latihan_android.databinding.ActivityFragmentBinding
import com.techmania.latihan_android.databinding.ActivityMainBinding

class FragmentActivity : AppCompatActivity() {
    lateinit var binding: ActivityFragmentBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fragment1Btn.setOnClickListener {

            replaceFragment(Fragment1())

        }
        binding.fragment2Btn.setOnClickListener {

            replaceFragment(Fragment2())
        }
    }

    private fun replaceFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.commit()

    }
}