package top.hasiy.toastsDemo

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import top.hasiy.spinkitdialog.dialog.SpankProgressBarMold.spinkitProgressBarDialogRotatingPlaneNoMessage
import top.hasiy.spinkitdialog.dialog.SpinkitProgressBarDialogManager

/**
 * @Author: Hasiy
 * @Date: 2019/6/13 - 14 : 03
 * @LastEditors: Hasiy
 * @LastEditTime: 2019/6/13 - 14 : 03
 * @Description: BaseActivity
 * @Email: Hasiy.jj@Gmail.com
 */
@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity(), SpinkitProgressBarDialogManager {

    override var loadingIsShow: Boolean = false
    override var spinkitProgressBarDialog = spinkitProgressBarDialogRotatingPlaneNoMessage(Color.parseColor("#ABCFF7"))

}