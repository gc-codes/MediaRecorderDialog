package net.alhazmy13.mediarecorderdialog;

import android.content.Context;
import android.media.MediaRecorder;

/**
 * Created by Alhazmy13 on 12/24/15.
 */
class GenralAtteribute {
    protected static Context context;
    protected static String title="";
    protected static String message="";
    protected static int outPutFormat;
    protected static int audioEncoder;
    protected static OnSaveButtonClickListener onSaveButtonClickListener;
    public static int length = -1;
}
