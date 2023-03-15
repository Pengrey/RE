package lb;

import android.hardware.Camera;
import android.util.Log;

/* renamed from: lb.a */
/* loaded from: classes2.dex */
public final class C7027a {

    /* renamed from: a */
    private static final String f18657a = "lb.a";

    /* renamed from: a */
    public static int m19553a(int i) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            Log.w(f18657a, "No cameras!");
            return -1;
        }
        boolean z = i >= 0;
        if (!z) {
            i = 0;
            while (i < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i++;
            }
        }
        return i < numberOfCameras ? i : z ? -1 : 0;
    }

    /* renamed from: b */
    public static Camera m19552b(int i) {
        int m19553a = m19553a(i);
        if (m19553a == -1) {
            return null;
        }
        return Camera.open(m19553a);
    }
}
