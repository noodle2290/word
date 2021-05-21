package app.murakami.takuro.word

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fruit = arrayOf(Word(R.drawable.apple_icon,"りんご","apple"),
                            Word(R.drawable.banana_icon,"バナナ","banana"),
                            Word(R.drawable.orange_icon,"オレンジ","orange"),
                            Word(R.drawable.strawberry_icon,"いちご","strawberry")
        )

        for (i in 0..3)
        addWord(fruit[i])
    }

    private fun addWord(word:Word){
        val nameTextView = TextView(this)
        nameTextView.text = word.name

        val nameTextView2 = TextView(this)
        nameTextView2.text = word.english

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.HORIZONTAL

        val imageView = ImageView(this)
        imageView.setImageResource(word.resId)
        imageView.layoutParams = ViewGroup.LayoutParams(500,450)

        layout.addView(imageView)
        layout.addView(nameTextView)
        layout.addView(nameTextView2)

        container.addView(layout)
    }
}