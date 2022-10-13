package ru.ndrmlv.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ru.ndrmlv.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> = listOf(
            binding.boxOneText,
            binding.boxTwoText,
            binding.boxThreeText,
            binding.boxFourText,
            binding.boxFiveText,
            binding.root,
            binding.redButton,
            binding.yellowButton,
            binding.greenButton
        )
        for (view in clickableViews) {
            view.setOnClickListener { changeColor(it) }
        }
    }

    private fun changeColor(view: View) {
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.CYAN)
            R.id.box_two_text -> view.setBackgroundColor(Color.CYAN)
            R.id.box_three_text -> view.setBackgroundColor(Color.CYAN)
            R.id.box_four_text -> view.setBackgroundColor(Color.CYAN)
            R.id.box_five_text -> view.setBackgroundColor(Color.CYAN)
            R.id.red_button -> binding.boxThreeText.setBackgroundColor(Color.RED)
            R.id.yellow_button -> binding.boxFourText.setBackgroundColor(Color.YELLOW)
            R.id.green_button -> binding.boxFiveText.setBackgroundColor(Color.GREEN)
            else -> view.setBackgroundColor(Color.MAGENTA)
        }
    }
}