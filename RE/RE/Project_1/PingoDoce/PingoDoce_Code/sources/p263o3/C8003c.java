package p263o3;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache;
import com.google.crypto.tink.shaded.protobuf.Reader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p095f3.InterfaceC5351c;
import p095f3.InterfaceC5359e;
import p129h3.C5828f;
import p129h3.EnumC5826d;
import p181jd.Intrinsics;
import p213l3.C6968a;
import p213l3.InterfaceC6978b;
import p297pd._Ranges;
import p305q3.C9629g;
import p305q3.C9635k;
import p305q3.C9640m;
import p305q3.C9641n;
import p327r3.AbstractC9797c;
import p327r3.C9796b;
import p327r3.C9805i;
import p327r3.EnumC9804h;
import p361t3.InterfaceC10379c;
import p396v3.C11089a;
import p396v3.C11096h;
import p396v3.C11098i;
import p396v3.InterfaceC11108q;
import p489zc.C13769l0;

/* renamed from: o3.c */
/* loaded from: classes.dex */
public final class C8003c {

    /* renamed from: a */
    private final InterfaceC5359e f20724a;

    /* renamed from: b */
    private final C9640m f20725b;

    /* renamed from: c */
    private final InterfaceC11108q f20726c;

    /* compiled from: MemoryCacheService.kt */
    /* renamed from: o3.c$a */
    /* loaded from: classes.dex */
    public static final class C8004a {
        private C8004a() {
        }

        public /* synthetic */ C8004a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C8004a(null);
    }

    public C8003c(InterfaceC5359e interfaceC5359e, C9640m c9640m, InterfaceC11108q interfaceC11108q) {
        this.f20724a = interfaceC5359e;
        this.f20725b = c9640m;
        this.f20726c = interfaceC11108q;
    }

    /* renamed from: b */
    private final String m17203b(MemoryCache.C2187b c2187b) {
        Object obj = c2187b.m34480b().get("coil#disk_cache_key");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* renamed from: d */
    private final boolean m17201d(MemoryCache.C2187b c2187b) {
        Object obj = c2187b.m34480b().get("coil#is_sampled");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: e */
    private final boolean m17200e(C9629g c9629g, MemoryCache.Key key, MemoryCache.C2187b c2187b, C9805i c9805i, EnumC9804h enumC9804h) {
        double m15002g;
        boolean m17201d = m17201d(c2187b);
        if (C9796b.m9946a(c9805i)) {
            if (m17201d) {
                InterfaceC11108q interfaceC11108q = this.f20726c;
                if (interfaceC11108q != null && interfaceC11108q.m6116a() <= 3) {
                    interfaceC11108q.m6115b("MemoryCacheService", 3, c9629g.m10367m() + ": Requested original size, but cached image is sampled.", null);
                }
                return false;
            }
            return true;
        }
        String str = (String) key.m34485c().get("coil#transformation_size");
        if (str != null) {
            return Intrinsics.equals(str, c9805i.toString());
        }
        int width = c2187b.m34481a().getWidth();
        int height = c2187b.m34481a().getHeight();
        AbstractC9797c m9942d = c9805i.m9942d();
        boolean z = m9942d instanceof AbstractC9797c.C9798a;
        int i = Reader.READ_DONE;
        int i2 = z ? ((AbstractC9797c.C9798a) m9942d).f25738a : Integer.MAX_VALUE;
        AbstractC9797c m9943c = c9805i.m9943c();
        if (m9943c instanceof AbstractC9797c.C9798a) {
            i = ((AbstractC9797c.C9798a) m9943c).f25738a;
        }
        double m22969c = C5828f.m22969c(width, height, i2, i, enumC9804h);
        boolean m6159a = C11096h.m6159a(c9629g);
        if (m6159a) {
            m15002g = _Ranges.m15002g(m22969c, 1.0d);
            if (Math.abs(i2 - (width * m15002g)) <= 1.0d || Math.abs(i - (m15002g * height)) <= 1.0d) {
                return true;
            }
        } else if ((C11098i.m6136t(i2) || Math.abs(i2 - width) <= 1) && (C11098i.m6136t(i) || Math.abs(i - height) <= 1)) {
            return true;
        }
        if (!(m22969c == 1.0d) && !m6159a) {
            InterfaceC11108q interfaceC11108q2 = this.f20726c;
            if (interfaceC11108q2 == null || interfaceC11108q2.m6116a() > 3) {
                return false;
            }
            interfaceC11108q2.m6115b("MemoryCacheService", 3, c9629g.m10367m() + ": Cached image's request size (" + width + ", " + height + ") does not exactly match the requested size (" + c9805i.m9942d() + ", " + c9805i.m9943c() + ", " + enumC9804h + ").", null);
            return false;
        } else if (m22969c <= 1.0d || !m17201d) {
            return true;
        } else {
            InterfaceC11108q interfaceC11108q3 = this.f20726c;
            if (interfaceC11108q3 == null || interfaceC11108q3.m6116a() > 3) {
                return false;
            }
            interfaceC11108q3.m6115b("MemoryCacheService", 3, c9629g.m10367m() + ": Cached image's request size (" + width + ", " + height + ") is smaller than the requested size (" + c9805i.m9942d() + ", " + c9805i.m9943c() + ", " + enumC9804h + ").", null);
            return false;
        }
    }

    /* renamed from: a */
    public final MemoryCache.C2187b m17204a(C9629g c9629g, MemoryCache.Key key, C9805i c9805i, EnumC9804h enumC9804h) {
        if (c9629g.m10395C().getReadEnabled()) {
            MemoryCache mo24490a = this.f20724a.mo24490a();
            MemoryCache.C2187b mo17196a = mo24490a != null ? mo24490a.mo17196a(key) : null;
            if (mo17196a == null || !m17202c(c9629g, key, mo17196a, c9805i, enumC9804h)) {
                return null;
            }
            return mo17196a;
        }
        return null;
    }

    /* renamed from: c */
    public final boolean m17202c(C9629g c9629g, MemoryCache.Key key, MemoryCache.C2187b c2187b, C9805i c9805i, EnumC9804h enumC9804h) {
        if (!this.f20725b.m10308c(c9629g, C11089a.m6174c(c2187b.m34481a()))) {
            InterfaceC11108q interfaceC11108q = this.f20726c;
            if (interfaceC11108q == null || interfaceC11108q.m6116a() > 3) {
                return false;
            }
            interfaceC11108q.m6115b("MemoryCacheService", 3, c9629g.m10367m() + ": Cached bitmap is hardware-backed, which is incompatible with the request.", null);
            return false;
        }
        return m17200e(c9629g, key, c2187b, c9805i, enumC9804h);
    }

    /* renamed from: f */
    public final MemoryCache.Key m17199f(C9629g c9629g, Object obj, C9635k c9635k, InterfaceC5351c interfaceC5351c) {
        Map m322q;
        MemoryCache.Key m10396B = c9629g.m10396B();
        if (m10396B != null) {
            return m10396B;
        }
        interfaceC5351c.mo24525e(c9629g, obj);
        String m24541f = this.f20724a.getComponents().m24541f(obj, c9635k);
        interfaceC5351c.mo24522h(c9629g, m24541f);
        if (m24541f == null) {
            return null;
        }
        List m10383O = c9629g.m10383O();
        Map m10314f = c9629g.m10393E().m10314f();
        if (m10383O.isEmpty() && m10314f.isEmpty()) {
            return new MemoryCache.Key(m24541f, null, 2, null);
        }
        m322q = C13769l0.m322q(m10314f);
        if (!m10383O.isEmpty()) {
            List m10383O2 = c9629g.m10383O();
            int size = m10383O2.size();
            for (int i = 0; i < size; i++) {
                m322q.put("coil#transformation_" + i, ((InterfaceC10379c) m10383O2.get(i)).mo8089b());
            }
            m322q.put("coil#transformation_size", c9635k.m10317n().toString());
        }
        return new MemoryCache.Key(m24541f, m322q);
    }

    /* renamed from: g */
    public final C9641n m17198g(InterfaceC6978b.InterfaceC6979a interfaceC6979a, C9629g c9629g, MemoryCache.Key key, MemoryCache.C2187b c2187b) {
        return new C9641n(new BitmapDrawable(c9629g.m10368l().getResources(), c2187b.m34481a()), c9629g, EnumC5826d.MEMORY_CACHE, key, m17203b(c2187b), m17201d(c2187b), C11098i.m6135u(interfaceC6979a));
    }

    /* renamed from: h */
    public final boolean m17197h(MemoryCache.Key key, C9629g c9629g, C6968a.C6970b c6970b) {
        MemoryCache mo24490a;
        Bitmap bitmap;
        if (c9629g.m10395C().getWriteEnabled() && (mo24490a = this.f20724a.mo24490a()) != null && key != null) {
            Drawable m19676e = c6970b.m19676e();
            BitmapDrawable bitmapDrawable = m19676e instanceof BitmapDrawable ? (BitmapDrawable) m19676e : null;
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("coil#is_sampled", Boolean.valueOf(c6970b.m19675f()));
                String m19677d = c6970b.m19677d();
                if (m19677d != null) {
                    linkedHashMap.put("coil#disk_cache_key", m19677d);
                }
                mo24490a.mo17194c(key, new MemoryCache.C2187b(bitmap, linkedHashMap));
                return true;
            }
        }
        return false;
    }
}
