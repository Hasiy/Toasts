package top.hasiy.spinkitdialog.dialog

import android.graphics.Typeface
import androidx.annotation.CheckResult

/**
 * @Author: zhuxiaoyao
 * @Date: 2019/6/13 - 17 : 37
 * @LastEditors: zhuxiaoyao
 * @LastEditTime: 2019/6/13 - 17 : 37
 * @Description: Toasts
 * @Email: zhuxs@venpoo.com
 */
class Config private constructor()// avoiding instantiation
{
    private var messageShow = Toasts.textSize
    private var spinKitColor = Toasts.currentTypeface
    private var spinKitStatus = Toasts.tintIcon

    @CheckResult
    fun setToastTypeface(typeface: Typeface): Config {
        this.typeface = typeface
        return this
    }

    @CheckResult
    fun setTextSize(sizeInSp: Int): Config {
        this.textSize = sizeInSp
        return this
    }

    @CheckResult
    fun tintIcon(tintIcon: Boolean): Config {
        this.tintIcon = tintIcon
        return this
    }

    @CheckResult
    fun allowQueue(allowQueue: Boolean): Config {
        this.allowQueue = allowQueue
        return this
    }

    fun apply() {
        Toasts.currentTypeface = typeface
        Toasts.textSize = textSize
        Toasts.tintIcon = tintIcon
        Toasts.allowQueue = allowQueue
    }

    companion object {
        val instance: Config
            @CheckResult
            get() = Config()

        fun reset() {
            Toasts.currentTypeface = LOADED_TOAST_TYPEFACE
            Toasts.textSize = 16
            Toasts.tintIcon = true
            Toasts.allowQueue = true
        }
    }
}
