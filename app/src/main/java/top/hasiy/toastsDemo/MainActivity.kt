package top.hasiy.toastsDemo

import android.graphics.Typeface
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import top.hasiy.toasts.Toasts
import kotlinx.android.synthetic.main.activity_main.*
import android.text.Spannable
import android.graphics.Typeface.BOLD_ITALIC
import android.os.Build
import android.text.style.StyleSpan
import android.text.SpannableStringBuilder
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import com.hasiy.toastsDemo.R

class MainActivity : AppCompatActivity() {

    private var toastLength = Toasts.LENGTH_SHORT
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            Toasts.error(this, R.string.error_message, toastLength, true).show()
        }
        button2.setOnClickListener {
            Toasts.success(this, R.string.success_message, toastLength, true).show()
        }
        button3.setOnClickListener {
            Toasts.info(this, R.string.info_message, toastLength, true).show()

        }
        button4.setOnClickListener {
            Toasts.warning(this, R.string.warning_message, toastLength, true).show()

        }
        button5.setOnClickListener {
            Toasts.normal(this, R.string.normal_message_without_icon).show()
        }
        button6.setOnClickListener {
            Toasts.normal(
                this,
                R.string.normal_message_with_icon,
                ContextCompat.getDrawable(this, R.mipmap.toast)
            ).show()

        }
        button7.setOnClickListener {
            Toasts.info(this, getFormattedMessage()).show()
        }

        Button8.setOnClickListener {
            Toasts.Config.getInstance()
                .setToastTypeface(Typeface.createFromAsset(this.assets, "PCap Terminal.otf"))
                .allowQueue(false)
                .apply()
            Toasts.custom(
                this, R.string.custom_message,
                ContextCompat.getDrawable(this, R.mipmap.toast),
                android.R.color.black, android.R.color.holo_green_light, toastLength, true, true
            ).show()
            Toasts.Config.reset()
        }

        switch1.setOnClickListener {
            //切换吐司时间长短
            toastLength = if (toastLength == Toasts.LENGTH_SHORT) {
                Toasts.normal(this, "长吐司").show()
                Toasts.LENGTH_LONG
            } else {
                Toasts.normal(this, "短吐司").show()
                Toast.LENGTH_SHORT
            }
        }
    }

    private fun getFormattedMessage(): CharSequence {
        val prefix = "Formatted "
        val highlight = "bold italic"
        val suffix = " text"
        val ssb = SpannableStringBuilder(prefix).append(highlight).append(suffix)
        val prefixLen = prefix.length
        ssb.setSpan(
            StyleSpan(BOLD_ITALIC),
            prefixLen, prefixLen + highlight.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        return ssb
    }

}
