package top.hasiy.spinkitdialog.dialog

import androidx.annotation.ColorInt

/**
 * @Author: Hasiy
 * @Date: 2019/6/13 - 16 : 15
 * @LastEditors: Hasiy
 * @LastEditTime: 2019/6/13 - 16 : 15
 * @Description: Toasts
 * @Email: Hasiy.jj@Gmail.com
 */
object SpankProgressBarMold {

    fun spinkitProgressBarDialogRotatingPlaneNoMessage(spinKitColor: Int): SpinkitProgressBarDialog {
        return SpinkitProgressBarDialog.newInstance(false, "", "RotatingPlane", spinKitColor)
    }

    fun spinkitProgressBarDialogRotatingPlaneMessage(message: String,spinKitColor: Int): SpinkitProgressBarDialog {
        return SpinkitProgressBarDialog.newInstance(true, message, "RotatingPlane", spinKitColor)
    }

    fun spinkitProgressBarDialogDoubleBounce(messageShow: Boolean, message: String,spinKitColor: Int): SpinkitProgressBarDialog {
        return SpinkitProgressBarDialog.newInstance(messageShow, message, "DoubleBounce", spinKitColor)
    }

    fun spinkitProgressBarDialogWave(messageShow: Boolean, message: String,spinKitColor: Int): SpinkitProgressBarDialog {
        return SpinkitProgressBarDialog.newInstance(messageShow, message, "Wave", spinKitColor)
    }

    fun spinkitProgressBarDialogWanderingCubes(messageShow: Boolean, message: String,spinKitColor: Int): SpinkitProgressBarDialog {
        return SpinkitProgressBarDialog.newInstance(messageShow, message, "WanderingCubes", spinKitColor)
    }


    fun spinkitProgressBarDialogPulse(messageShow: Boolean, message: String,spinKitColor: Int): SpinkitProgressBarDialog {
        return SpinkitProgressBarDialog.newInstance(messageShow, message, "Pulse", spinKitColor)
    }


    fun spinkitProgressBarDialogChasingDots(messageShow: Boolean, message: String,spinKitColor: Int): SpinkitProgressBarDialog {
        return SpinkitProgressBarDialog.newInstance(messageShow, message, "ChasingDots", spinKitColor)
    }


    fun spinkitProgressBarDialogThreeBounce(messageShow: Boolean, message: String,spinKitColor: Int): SpinkitProgressBarDialog {
        return SpinkitProgressBarDialog.newInstance(messageShow, message, "ThreeBounce", spinKitColor)
    }

    fun spinkitProgressBarDialogCircle(messageShow: Boolean, message: String,spinKitColor: Int): SpinkitProgressBarDialog {
        return SpinkitProgressBarDialog.newInstance(messageShow, message, "Circle", spinKitColor)
    }


    fun spinkitProgressBarDialogCubeGrid(messageShow: Boolean, message: String,spinKitColor: Int): SpinkitProgressBarDialog {
        return SpinkitProgressBarDialog.newInstance(messageShow, message, "CubeGrid", spinKitColor)
    }

    fun spinkitProgressBarDialogFadingCircle(messageShow: Boolean, message: String,spinKitColor: Int): SpinkitProgressBarDialog {
        return SpinkitProgressBarDialog.newInstance(messageShow, message, "FadingCircle", spinKitColor)
    }


    fun spinkitProgressBarDialogFoldingCube(messageShow: Boolean, message: String,spinKitColor: Int): SpinkitProgressBarDialog {
        return SpinkitProgressBarDialog.newInstance(messageShow, message, "FoldingCube", spinKitColor)
    }


    fun spinkitProgressBarDialogRotatingCircle(messageShow: Boolean, message: String,spinKitColor: Int): SpinkitProgressBarDialog {
        return SpinkitProgressBarDialog.newInstance(messageShow, message, "RotatingCircle", spinKitColor)
    }


}