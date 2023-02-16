package com.harjot.alertdialogoptionaltask

import android.app.AlertDialog
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import com.harjot.alertdialogoptionaltask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var number=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnDialog.setOnClickListener {
            var alertDialog = AlertDialog.Builder(this)
            alertDialog.setTitle(resources.getString(R.string.operations))
            alertDialog.setMessage(resources.getString(R.string.message))

            alertDialog.setNeutralButton(resources.getString(R.string.reset)){_,_->
                number=0
                binding.tvText.setText("$number")
            }
            alertDialog.setNegativeButton(resources.getString(R.string.mul)){_,_->
                number*=5
                binding.tvText.setText("${number}")
            }
            alertDialog.setPositiveButton(resources.getString(R.string.add)){_,_->
                number=number+10
                binding.tvText.setText("${number}")
            }
            alertDialog.show()
        }
    }
}