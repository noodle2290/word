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

        val apple = Word(R.drawable.apple_icon,"りんご")
        val banana = Word(R.drawable.banana_icon,"バナナ")
        val orange = Word(R.drawable.orange_icon,"オレンジ")
        val strawberry = Word(R.drawable.strawberry_icon,"いちご")

        addWord(apple)
        addWord(banana)
        addWord(orange)
        addWord(strawberry)
    }

    private fun addWord(word:Word){
        val nameTextView = TextView(this)
        nameTextView.text = word.name

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.HORIZONTAL

        val imageView = ImageView(this)
        imageView.setImageResource(word.resId)
        imageView.layoutParams = ViewGroup.LayoutParams(500,450)

        layout.addView(imageView)
        layout.addView(nameTextView)

        container.addView(layout)
    }
}