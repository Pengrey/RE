package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.C0908j;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.app.l */
/* loaded from: classes.dex */
public class C0919l {

    /* renamed from: a */
    private static final Object f3169a = new Object();

    /* renamed from: b */
    private static Field f3170b;

    /* renamed from: c */
    private static boolean f3171c;

    /* renamed from: a */
    public static SparseArray<Bundle> m39151a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Bundle m39150b(C0908j.C0909a c0909a) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat m39209e = c0909a.m39209e();
        bundle2.putInt("icon", m39209e != null ? m39209e.m38900j() : 0);
        bundle2.putCharSequence("title", c0909a.m39205i());
        bundle2.putParcelable("actionIntent", c0909a.m39213a());
        if (c0909a.m39210d() != null) {
            bundle = new Bundle(c0909a.m39210d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", c0909a.m39212b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", m39147e(c0909a.m39208f()));
        bundle2.putBoolean("showsUserInterface", c0909a.m39206h());
        bundle2.putInt("semanticAction", c0909a.m39207g());
        return bundle2;
    }

    /* renamed from: c */
    public static Bundle m39149c(Notification notification) {
        synchronized (f3169a) {
            if (f3171c) {
                return null;
            }
            try {
                if (f3170b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f3171c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f3170b = declaredField;
                }
                Bundle bundle = (Bundle) f3170b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f3170b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e("NotificationCompat", "Unable to access notification extras", e);
                f3171c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                f3171c = true;
                return null;
            }
        }
    }

    /* renamed from: d */
    private static Bundle m39148d(C0923n c0923n) {
        new Bundle();
        throw null;
    }

    /* renamed from: e */
    private static Bundle[] m39147e(C0923n[] c0923nArr) {
        if (c0923nArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[c0923nArr.length];
        for (int i = 0; i < c0923nArr.length; i++) {
            bundleArr[i] = m39148d(c0923nArr[i]);
        }
        return bundleArr;
    }

    /* renamed from: f */
    public static Bundle m39146f(Notification.Builder builder, C0908j.C0909a c0909a) {
        IconCompat m39209e = c0909a.m39209e();
        builder.addAction(m39209e != null ? m39209e.m38900j() : 0, c0909a.m39205i(), c0909a.m39213a());
        Bundle bundle = new Bundle(c0909a.m39210d());
        if (c0909a.m39208f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", m39147e(c0909a.m39208f()));
        }
        if (c0909a.m39211c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m39147e(c0909a.m39211c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", c0909a.m39212b());
        return bundle;
    }
}
