package app.mita.chatamin.profile

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 名前のボタンがタップされた時に
        button1.setOnClickListener {
            // 画像をImageViewに反映する
            profileImage.setImageResource(R.drawable.randy_image)
            // ラベルをTextViewに反映する
            profileLabelText.text = "名前"
            // コメントをTextViewに反映する
            profileCommentText.text = "Androidメンターのランディだよ"

            // 押されたボタンの色を変える
            button1.backgroundTintList = ColorStateList.valueOf(Color.rgb(0,180,220))

            // 他のボタンの色を灰色に変える
            button2.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            button3.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            button4.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        }

        // スポーツのボタンがタップされたときに
        button2.setOnClickListener {
            // 画像をImageViewに反映する
            profileImage.setImageResource(R.drawable.baseball_image)
            // ラベルをTextViewに反映する
            profileLabelText.text = "スポーツ"
            // コメントをTextViewに反映する
            profileCommentText.text = "野球観戦が好きで、スタジアムに通っている"

            // 押されたボタンの色を変える
            button2.backgroundTintList = ColorStateList.valueOf(Color.rgb(220,0,100))

            // 他のボタンの色を灰色に変える
            button1.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            button3.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            button4.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        }

        // 好きな食べ物のボタンがタップされたときに
        button3.setOnClickListener {
            // 画像をImageViewに反映する
            profileImage.setImageResource(R.drawable.donut_image)
            // ラベルをTextViewに反映する
            profileLabelText.text = "好きな食べ物"
            // コメントをTextViewに反映する
            profileCommentText.text = "キャンディやドーナツが大好き"

            // 押されたボタンの色を変える
            button3.backgroundTintList = ColorStateList.valueOf(Color.rgb(0,180,120))

            // 他のボタンの色を灰色に変える
            button2.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            button1.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            button4.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        }

        // 趣味のボタンがタップされたときに
        button4.setOnClickListener {
            // 画像をImageViewに反映する
            profileImage.setImageResource(R.drawable.gadget_image)
            // ラベルをTextViewに反映する
            profileLabelText.text = "趣味"
            // コメントをTextViewに反映する
            profileCommentText.text = "ガジェットを集めて動かすこと"

            // 押されたボタンの色を変える
            button4.backgroundTintList = ColorStateList.valueOf(Color.rgb(220,100,0))

            // 他のボタンの色を灰色に変える
            button2.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            button3.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
            button1.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        }
    }
}