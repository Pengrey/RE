package p360t2;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

@Deprecated
/* renamed from: t2.a */
/* loaded from: classes.dex */
public abstract class AbstractC10376a extends BroadcastReceiver {

    /* renamed from: a */
    private static final SparseArray<PowerManager.WakeLock> f26985a = new SparseArray<>();

    /* renamed from: b */
    private static int f26986b = 1;

    /* renamed from: b */
    public static boolean m8093b(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = f26985a;
        synchronized (sparseArray) {
            PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray.remove(intExtra);
                return true;
            }
            Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            return true;
        }
    }

    /* renamed from: c */
    public static ComponentName m8092c(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = f26985a;
        synchronized (sparseArray) {
            int i = f26986b;
            int i2 = i + 1;
            f26986b = i2;
            if (i2 <= 0) {
                f26986b = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000L);
            sparseArray.put(i, newWakeLock);
            return startService;
        }
    }
}
