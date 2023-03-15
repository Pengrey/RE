package p263o3;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p489zc.C13777q;

/* renamed from: o3.f */
/* loaded from: classes.dex */
public final class C8009f implements InterfaceC8013h {

    /* renamed from: a */
    private final LinkedHashMap<MemoryCache.Key, ArrayList<C8011b>> f20735a = new LinkedHashMap<>();

    /* renamed from: b */
    private int f20736b;

    /* compiled from: WeakMemoryCache.kt */
    /* renamed from: o3.f$a */
    /* loaded from: classes.dex */
    public static final class C8010a {
        private C8010a() {
        }

        public /* synthetic */ C8010a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: WeakMemoryCache.kt */
    /* renamed from: o3.f$b */
    /* loaded from: classes.dex */
    public static final class C8011b {

        /* renamed from: a */
        private final int f20737a;

        /* renamed from: b */
        private final WeakReference<Bitmap> f20738b;

        /* renamed from: c */
        private final Map<String, Object> f20739c;

        /* renamed from: d */
        private final int f20740d;

        public C8011b(int i, WeakReference<Bitmap> weakReference, Map<String, ? extends Object> map, int i2) {
            this.f20737a = i;
            this.f20738b = weakReference;
            this.f20739c = map;
            this.f20740d = i2;
        }

        /* renamed from: a */
        public final WeakReference<Bitmap> m17182a() {
            return this.f20738b;
        }

        /* renamed from: b */
        public final Map<String, Object> m17181b() {
            return this.f20739c;
        }

        /* renamed from: c */
        public final int m17180c() {
            return this.f20737a;
        }

        /* renamed from: d */
        public final int m17179d() {
            return this.f20740d;
        }
    }

    static {
        new C8010a(null);
    }

    /* renamed from: e */
    private final void m17183e() {
        int i = this.f20736b;
        this.f20736b = i + 1;
        if (i >= 10) {
            m17184d();
        }
    }

    @Override // p263o3.InterfaceC8013h
    /* renamed from: a */
    public synchronized MemoryCache.C2187b mo17175a(MemoryCache.Key key) {
        ArrayList<C8011b> arrayList = this.f20735a.get(key);
        MemoryCache.C2187b c2187b = null;
        if (arrayList == null) {
            return null;
        }
        int i = 0;
        int size = arrayList.size();
        while (true) {
            if (i >= size) {
                break;
            }
            C8011b c8011b = arrayList.get(i);
            Bitmap bitmap = c8011b.m17182a().get();
            MemoryCache.C2187b c2187b2 = bitmap != null ? new MemoryCache.C2187b(bitmap, c8011b.m17181b()) : null;
            if (c2187b2 != null) {
                c2187b = c2187b2;
                break;
            }
            i++;
        }
        m17183e();
        return c2187b;
    }

    @Override // p263o3.InterfaceC8013h
    /* renamed from: b */
    public synchronized void mo17174b(int i) {
        if (i >= 10 && i != 20) {
            m17184d();
        }
    }

    @Override // p263o3.InterfaceC8013h
    /* renamed from: c */
    public synchronized void mo17173c(MemoryCache.Key key, Bitmap bitmap, Map<String, ? extends Object> map, int i) {
        LinkedHashMap<MemoryCache.Key, ArrayList<C8011b>> linkedHashMap = this.f20735a;
        ArrayList<C8011b> arrayList = linkedHashMap.get(key);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            linkedHashMap.put(key, arrayList);
        }
        ArrayList<C8011b> arrayList2 = arrayList;
        int identityHashCode = System.identityHashCode(bitmap);
        C8011b c8011b = new C8011b(identityHashCode, new WeakReference(bitmap), map, i);
        int i2 = 0;
        int size = arrayList2.size();
        while (true) {
            if (i2 < size) {
                C8011b c8011b2 = arrayList2.get(i2);
                if (i < c8011b2.m17179d()) {
                    i2++;
                } else if (c8011b2.m17180c() == identityHashCode && c8011b2.m17182a().get() == bitmap) {
                    arrayList2.set(i2, c8011b);
                } else {
                    arrayList2.add(i2, c8011b);
                }
            } else {
                arrayList2.add(c8011b);
                break;
            }
        }
        m17183e();
    }

    /* renamed from: d */
    public final void m17184d() {
        WeakReference<Bitmap> m17182a;
        this.f20736b = 0;
        Iterator<ArrayList<C8011b>> it = this.f20735a.values().iterator();
        while (it.hasNext()) {
            ArrayList<C8011b> next = it.next();
            if (next.size() <= 1) {
                C8011b c8011b = (C8011b) C13777q.m254N(next);
                if (((c8011b == null || (m17182a = c8011b.m17182a()) == null) ? null : m17182a.get()) == null) {
                    it.remove();
                }
            } else {
                int size = next.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (next.get(i3).m17182a().get() == null) {
                        next.remove(i3);
                        i++;
                    }
                }
                if (next.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
