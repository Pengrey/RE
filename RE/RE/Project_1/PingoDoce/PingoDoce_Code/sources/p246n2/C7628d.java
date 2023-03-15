package p246n2;

import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: n2.d */
/* loaded from: classes.dex */
public class C7628d {

    /* renamed from: a */
    private static final SparseArray<WeakHashMap<View, WeakReference<?>>> f20189a = new SparseArray<>();

    /* renamed from: a */
    public static <T> T m17892a(View view, T t, int i) {
        WeakReference<?> put;
        if (Build.VERSION.SDK_INT >= 14) {
            T t2 = (T) view.getTag(i);
            view.setTag(i, t);
            return t2;
        }
        SparseArray<WeakHashMap<View, WeakReference<?>>> sparseArray = f20189a;
        synchronized (sparseArray) {
            WeakHashMap<View, WeakReference<?>> weakHashMap = sparseArray.get(i);
            if (weakHashMap == null) {
                weakHashMap = new WeakHashMap<>();
                sparseArray.put(i, weakHashMap);
            }
            if (t == null) {
                put = weakHashMap.remove(view);
            } else {
                put = weakHashMap.put(view, new WeakReference<>(t));
            }
            if (put == null) {
                return null;
            }
            return (T) put.get();
        }
    }
}
