package top.hasiy.spinkitdialog.dialog

import androidx.fragment.app.FragmentManager

/**
 * @Author: Hasiy
 * @Date: 2019/6/13 - 13 : 37
 * @LastEditors: Hasiy
 * @LastEditTime: 2019/6/13 - 13 : 37
 * @Description: SpinkitProgressBarDialogManager
 * @Email: Hasiy.jj@Gmail.com
 */
interface SpinkitProgressBarDialogManager {

    val spinkitProgressBarDialog: SpinkitProgressBarDialog
    var loadingIsShow: Boolean

    fun showLoading(supportFragmentManager: FragmentManager) {
        if (loadingIsShow) {
            dismissLoading()
        }
        loadingIsShow = true
        spinkitProgressBarDialog.show(supportFragmentManager, "showNoMessageLoading")
    }

    fun dismissLoading() {
        if (loadingIsShow) {
            loadingIsShow = false
            spinkitProgressBarDialog.dismiss()
        }
    }
}