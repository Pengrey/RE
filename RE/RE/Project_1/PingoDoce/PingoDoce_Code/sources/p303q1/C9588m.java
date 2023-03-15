package p303q1;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StaticLayoutFactory.kt */
/* renamed from: q1.m */
/* loaded from: classes.dex */
public final class C9588m implements InterfaceC9587l {

    /* renamed from: a */
    public static final C9589a f25222a = new C9589a(null);

    /* renamed from: b */
    private static boolean f25223b;

    /* renamed from: c */
    private static Constructor f25224c;

    /* compiled from: StaticLayoutFactory.kt */
    /* renamed from: q1.m$a */
    /* loaded from: classes.dex */
    public static final class C9589a {
        private C9589a() {
        }

        public /* synthetic */ C9589a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static final /* synthetic */ Constructor m10542a(C9589a c9589a) {
            return c9589a.m10541b();
        }

        /* renamed from: b */
        private final Constructor m10541b() {
            if (C9588m.m10545c()) {
                return C9588m.m10546b();
            }
            C9588m.m10544d(true);
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                C9588m.m10543e(StaticLayout.class.getConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls));
            } catch (NoSuchMethodException unused) {
                C9588m.m10543e(null);
                Log.e("StaticLayoutFactory", "unable to collect necessary constructor.");
            }
            return C9588m.m10546b();
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ Constructor m10546b() {
        return f25224c;
    }

    /* renamed from: c */
    public static final /* synthetic */ boolean m10545c() {
        return f25223b;
    }

    /* renamed from: d */
    public static final /* synthetic */ void m10544d(boolean z) {
        f25223b = z;
    }

    /* renamed from: e */
    public static final /* synthetic */ void m10543e(Constructor constructor) {
        f25224c = constructor;
    }

    /* renamed from: a */
    public StaticLayout mo10548a(C9590n c9590n) {
        Intrinsics.isThisObjectNull(c9590n, "params");
        Constructor m10542a = C9589a.m10542a(f25222a);
        StaticLayout staticLayout = null;
        if (m10542a != null) {
            try {
                staticLayout = (StaticLayout) m10542a.newInstance(c9590n.m10525p(), Integer.valueOf(c9590n.m10526o()), Integer.valueOf(c9590n.m10536e()), c9590n.m10528m(), Integer.valueOf(c9590n.m10522s()), c9590n.m10540a(), c9590n.m10524q(), Float.valueOf(c9590n.m10530k()), Float.valueOf(c9590n.m10531j()), Boolean.valueOf(c9590n.m10534g()), c9590n.m10538c(), Integer.valueOf(c9590n.m10537d()), Integer.valueOf(c9590n.m10529l()));
            } catch (IllegalAccessException unused) {
                f25224c = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InstantiationException unused2) {
                f25224c = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InvocationTargetException unused3) {
                f25224c = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            }
        }
        return staticLayout != null ? staticLayout : new StaticLayout(c9590n.m10525p(), c9590n.m10526o(), c9590n.m10536e(), c9590n.m10528m(), c9590n.m10522s(), c9590n.m10540a(), c9590n.m10530k(), c9590n.m10531j(), c9590n.m10534g(), c9590n.m10538c(), c9590n.m10537d());
    }
}
