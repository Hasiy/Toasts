package top.hasiy.spinkitdialog.dialog

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import com.github.ybq.android.spinkit.SpinKitView
import com.github.ybq.android.spinkit.sprite.Sprite
import com.github.ybq.android.spinkit.style.*
import android.util.Log
import android.view.*
import androidx.annotation.ColorInt


/**
 * @Author: Hasiy
 * @Date: 2019/6/13 - 10 : 12
 * @LastEditors: Hasiy
 * @LastEditTime: 2019/6/13 - 10 : 12
 * @Description: SpinkitProgressBarDialog
 * @Email: Hasiy.jj@Gmail.com
 */

class SpinkitProgressBarDialog : DialogFragment() {

    private var messageShow: Boolean = false
    private lateinit var message: String
    private var spinKitColor: Int = 0  // 默认加载动画颜色为#438BF9
    private lateinit var spinKitStatus: String   // 默认加载动画是 FadingCircle 详情 https://github.com/ybq/Android-SpinKit
    private var spinKit: Sprite = FadingCircle()
    private lateinit var loadingMessage: TextView
    private lateinit var loadingBar: SpinKitView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        isCancelable = false
        setStyle(STYLE_NO_TITLE, top.hasiy.spinkitdialog.R.style.dialogStyles)
        val bundle = arguments
        this.messageShow = bundle!!.getBoolean("messageShow")
        this.message = bundle.getString("message") ?: "加载中..."
        this.spinKitColor = bundle.getInt("spinKitColor")
        this.spinKitStatus = bundle.getString("spinKitStatus") ?: "FadingCircle"
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        val rootView: View = inflater.inflate(top.hasiy.spinkitdialog.R.layout.spinkit_progressbar_dialog_layout, container, false)
        loadingMessage = rootView.findViewById(top.hasiy.spinkitdialog.R.id.loading_message) as TextView
        when (messageShow) {
            true -> loadingMessage.visibility = View.VISIBLE
            false -> loadingMessage.visibility = View.GONE
        }
        loadingBar = rootView.findViewById(top.hasiy.spinkitdialog.R.id.loadingBar) as SpinKitView
        spinKit = when (spinKitStatus) {
            "RotatingPlane" -> RotatingPlane()
            "DoubleBounce" -> DoubleBounce()
            "Wave" -> Wave()
            "WanderingCubes" -> WanderingCubes()
            "Pulse" -> Pulse()
            "ChasingDots" -> ChasingDots()
            "ThreeBounce" -> ThreeBounce()
            "Circle" -> Circle()
            "CubeGrid" -> CubeGrid()
            "FadingCircle" -> FadingCircle()
            "FoldingCube" -> FoldingCube()
            "RotatingCircle" -> RotatingCircle()
            else -> FadingCircle()
        }
        loadingBar.setIndeterminateDrawable(spinKit)
        loadingBar.setColor(spinKitColor)

        return rootView
    }

    override fun show(manager: FragmentManager?, tag: String?) {
        try {
            val transaction = manager!!.beginTransaction()
            transaction.add(this, tag)
            transaction.commitAllowingStateLoss()
        } catch (e: IllegalStateException) {
            e.printStackTrace()
        }
    }

    override fun dismiss() {
        try {
            super.dismiss()
        } catch (e: Exception) {
            e.printStackTrace()
            Log.e("SpinkitProgressBarError", e.toString())
        }
    }

    companion object {
        /**
         * @param messageShow 是否显示Loading文字
         * @param message  Loading文字内容
         * @param spinKitStatus  Loading 动画样式
         * @param spinKitColor  Loading 动画颜色
         */
        fun newInstance(messageShow: Boolean, message: String, spinKitStatus: String, @ColorInt spinKitColor: Int): SpinkitProgressBarDialog {
            val fragment = SpinkitProgressBarDialog()
            val bundle = Bundle()
            bundle.putBoolean("messageShow", messageShow)
            bundle.putString("message", message)
            bundle.putString("spinKitStatus", spinKitStatus)
            bundle.putInt("spinKitColor", spinKitColor)
            fragment.arguments = bundle
            return fragment
        }
    }
}


 