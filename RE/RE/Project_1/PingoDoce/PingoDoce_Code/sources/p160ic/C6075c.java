package p160ic;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.joda.time.DateTimeConstants;
import p160ic.C6086i;

/* renamed from: ic.c */
/* loaded from: classes2.dex */
public final class C6075c {
    static {
        Pattern.compile(";");
    }

    @TargetApi(15)
    /* renamed from: a */
    private static List<Camera.Area> m22253a(int i) {
        int i2 = -i;
        return Collections.singletonList(new Camera.Area(new Rect(i2, i2, i, i), 1));
    }

    /* renamed from: b */
    private static String m22252b(String str, Collection<String> collection, String... strArr) {
        Log.i("CameraConfiguration", "Requesting " + str + " value from among: " + Arrays.toString(strArr));
        Log.i("CameraConfiguration", "Supported " + str + " values: " + collection);
        if (collection != null) {
            for (String str2 : strArr) {
                if (collection.contains(str2)) {
                    Log.i("CameraConfiguration", "Can set " + str + " to: " + str2);
                    return str2;
                }
            }
        }
        Log.i("CameraConfiguration", "No supported values match");
        return null;
    }

    /* renamed from: c */
    public static void m22251c(Camera.Parameters parameters) {
        if ("barcode".equals(parameters.getSceneMode())) {
            Log.i("CameraConfiguration", "Barcode scene mode already set");
            return;
        }
        String m22252b = m22252b("scene mode", parameters.getSupportedSceneModes(), "barcode");
        if (m22252b != null) {
            parameters.setSceneMode(m22252b);
        }
    }

    /* renamed from: d */
    public static void m22250d(Camera.Parameters parameters, boolean z) {
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        if (minExposureCompensation != 0 || maxExposureCompensation != 0) {
            if (exposureCompensationStep > 0.0f) {
                int round = Math.round((z ? 0.0f : 1.5f) / exposureCompensationStep);
                float f = exposureCompensationStep * round;
                int max = Math.max(Math.min(round, maxExposureCompensation), minExposureCompensation);
                if (parameters.getExposureCompensation() == max) {
                    Log.i("CameraConfiguration", "Exposure compensation already set to " + max + " / " + f);
                    return;
                }
                Log.i("CameraConfiguration", "Setting exposure compensation to " + max + " / " + f);
                parameters.setExposureCompensation(max);
                return;
            }
        }
        Log.i("CameraConfiguration", "Camera does not support exposure compensation");
    }

    /* renamed from: e */
    public static void m22249e(Camera.Parameters parameters) {
        m22248f(parameters, 10, 20);
    }

    /* renamed from: f */
    public static void m22248f(Camera.Parameters parameters, int i, int i2) {
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        Log.i("CameraConfiguration", "Supported FPS ranges: " + m22240n(supportedPreviewFpsRange));
        if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.isEmpty()) {
            return;
        }
        int[] iArr = null;
        Iterator<int[]> it = supportedPreviewFpsRange.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int[] next = it.next();
            int i3 = next[0];
            int i4 = next[1];
            if (i3 >= i * DateTimeConstants.MILLIS_PER_SECOND && i4 <= i2 * DateTimeConstants.MILLIS_PER_SECOND) {
                iArr = next;
                break;
            }
        }
        if (iArr == null) {
            Log.i("CameraConfiguration", "No suitable FPS range?");
            return;
        }
        int[] iArr2 = new int[2];
        parameters.getPreviewFpsRange(iArr2);
        if (Arrays.equals(iArr2, iArr)) {
            Log.i("CameraConfiguration", "FPS range already set to " + Arrays.toString(iArr));
            return;
        }
        Log.i("CameraConfiguration", "Setting FPS range to " + Arrays.toString(iArr));
        parameters.setPreviewFpsRange(iArr[0], iArr[1]);
    }

    /* renamed from: g */
    public static void m22247g(Camera.Parameters parameters, C6086i.EnumC6087a enumC6087a, boolean z) {
        String m22252b;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (!z && enumC6087a != C6086i.EnumC6087a.AUTO) {
            if (enumC6087a == C6086i.EnumC6087a.CONTINUOUS) {
                m22252b = m22252b("focus mode", supportedFocusModes, "continuous-picture", "continuous-video", "auto");
            } else if (enumC6087a == C6086i.EnumC6087a.INFINITY) {
                m22252b = m22252b("focus mode", supportedFocusModes, "infinity");
            } else {
                m22252b = enumC6087a == C6086i.EnumC6087a.MACRO ? m22252b("focus mode", supportedFocusModes, "macro") : null;
            }
        } else {
            m22252b = m22252b("focus mode", supportedFocusModes, "auto");
        }
        if (!z && m22252b == null) {
            m22252b = m22252b("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (m22252b != null) {
            if (m22252b.equals(parameters.getFocusMode())) {
                Log.i("CameraConfiguration", "Focus mode already set to " + m22252b);
                return;
            }
            parameters.setFocusMode(m22252b);
        }
    }

    @TargetApi(15)
    /* renamed from: h */
    public static void m22246h(Camera.Parameters parameters) {
        if (parameters.getMaxNumFocusAreas() > 0) {
            Log.i("CameraConfiguration", "Old focus areas: " + m22241m(parameters.getFocusAreas()));
            List<Camera.Area> m22253a = m22253a(400);
            Log.i("CameraConfiguration", "Setting focus area to : " + m22241m(m22253a));
            parameters.setFocusAreas(m22253a);
            return;
        }
        Log.i("CameraConfiguration", "Device does not support focus areas");
    }

    /* renamed from: i */
    public static void m22245i(Camera.Parameters parameters) {
        if ("negative".equals(parameters.getColorEffect())) {
            Log.i("CameraConfiguration", "Negative effect already set");
            return;
        }
        String m22252b = m22252b("color effect", parameters.getSupportedColorEffects(), "negative");
        if (m22252b != null) {
            parameters.setColorEffect(m22252b);
        }
    }

    @TargetApi(15)
    /* renamed from: j */
    public static void m22244j(Camera.Parameters parameters) {
        if (parameters.getMaxNumMeteringAreas() > 0) {
            Log.i("CameraConfiguration", "Old metering areas: " + parameters.getMeteringAreas());
            List<Camera.Area> m22253a = m22253a(400);
            Log.i("CameraConfiguration", "Setting metering area to : " + m22241m(m22253a));
            parameters.setMeteringAreas(m22253a);
            return;
        }
        Log.i("CameraConfiguration", "Device does not support metering areas");
    }

    /* renamed from: k */
    public static void m22243k(Camera.Parameters parameters, boolean z) {
        String m22252b;
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (z) {
            m22252b = m22252b("flash mode", supportedFlashModes, "torch", "on");
        } else {
            m22252b = m22252b("flash mode", supportedFlashModes, "off");
        }
        if (m22252b != null) {
            if (m22252b.equals(parameters.getFlashMode())) {
                Log.i("CameraConfiguration", "Flash mode already set to " + m22252b);
                return;
            }
            Log.i("CameraConfiguration", "Setting flash mode to " + m22252b);
            parameters.setFlashMode(m22252b);
        }
    }

    @TargetApi(15)
    /* renamed from: l */
    public static void m22242l(Camera.Parameters parameters) {
        if (parameters.isVideoStabilizationSupported()) {
            if (parameters.getVideoStabilization()) {
                Log.i("CameraConfiguration", "Video stabilization already enabled");
                return;
            }
            Log.i("CameraConfiguration", "Enabling video stabilization...");
            parameters.setVideoStabilization(true);
            return;
        }
        Log.i("CameraConfiguration", "This device does not support video stabilization");
    }

    @TargetApi(15)
    /* renamed from: m */
    private static String m22241m(Iterable<Camera.Area> iterable) {
        if (iterable == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (Camera.Area area : iterable) {
            sb2.append(area.rect);
            sb2.append(':');
            sb2.append(area.weight);
            sb2.append(' ');
        }
        return sb2.toString();
    }

    /* renamed from: n */
    private static String m22240n(Collection<int[]> collection) {
        if (collection == null || collection.isEmpty()) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        Iterator<int[]> it = collection.iterator();
        while (it.hasNext()) {
            sb2.append(Arrays.toString(it.next()));
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
        return sb2.toString();
    }
}
