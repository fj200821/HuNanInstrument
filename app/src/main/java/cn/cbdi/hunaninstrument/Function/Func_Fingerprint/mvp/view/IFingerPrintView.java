package cn.cbdi.hunaninstrument.Function.Func_Fingerprint.mvp.view;

import android.graphics.Bitmap;


/**
 * Created by zbsz on 2017/6/9.
 */

public interface IFingerPrintView {
    void onSetImg(Bitmap bmp);

    void onText(String msg);

    void onFpSucc(String msg);
}
