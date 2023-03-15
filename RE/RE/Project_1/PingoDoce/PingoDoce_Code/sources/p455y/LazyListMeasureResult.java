package p455y;

import androidx.compose.foundation.lazy.InterfaceC0633d;
import androidx.compose.foundation.lazy.InterfaceC0634e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p127h1.InterfaceC5805t;
import p181jd.Intrinsics;
import p432x.InterfaceC12216e;
import p432x.InterfaceC12220h;

/* renamed from: y.p */
/* loaded from: classes.dex */
public final class LazyListMeasureResult implements InterfaceC0634e, InterfaceC5805t {

    /* renamed from: a */
    private final C13043u f33862a;

    /* renamed from: b */
    private final int f33863b;

    /* renamed from: c */
    private final boolean f33864c;

    /* renamed from: d */
    private final float f33865d;

    /* renamed from: e */
    private final InterfaceC5805t f33866e;

    /* renamed from: f */
    private final List f33867f;

    /* renamed from: g */
    private final int f33868g;

    /* compiled from: LazyListMeasureResult.kt */
    /* renamed from: y.p$a */
    /* loaded from: classes.dex */
    public static final class C13036a implements InterfaceC12220h, InterfaceC5805t {

        /* renamed from: a */
        private final /* synthetic */ InterfaceC5805t f33869a;

        /* compiled from: LazyListMeasureResult.kt */
        /* renamed from: y.p$a$a */
        /* loaded from: classes.dex */
        public static final class C13037a implements InterfaceC12216e {

            /* renamed from: a */
            final /* synthetic */ InterfaceC0633d f33871a;

            C13037a(InterfaceC0633d interfaceC0633d) {
                this.f33871a = interfaceC0633d;
            }

            public int getIndex() {
                return this.f33871a.getIndex();
            }
        }

        C13036a() {
            this.f33869a = LazyListMeasureResult.this.m1844l();
        }

        /* renamed from: a */
        public int mo23005a() {
            return this.f33869a.mo23005a();
        }

        /* renamed from: b */
        public int mo23004b() {
            return this.f33869a.mo23004b();
        }

        /* renamed from: c */
        public List mo3368c() {
            List mo40035c = LazyListMeasureResult.this.mo40035c();
            ArrayList arrayList = new ArrayList(mo40035c.size());
            int size = mo40035c.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new C13037a((InterfaceC0633d) mo40035c.get(i)));
            }
            return arrayList;
        }

        /* renamed from: d */
        public void mo23003d() {
            this.f33869a.mo23003d();
        }

        /* renamed from: e */
        public Map mo23002e() {
            return this.f33869a.mo23002e();
        }
    }

    public LazyListMeasureResult(C13043u c13043u, int i, boolean z, float f, InterfaceC5805t interfaceC5805t, List list, int i2, int i3, int i4) {
        Intrinsics.isThisObjectNull(interfaceC5805t, "measureResult");
        Intrinsics.isThisObjectNull(list, "visibleItemsInfo");
        this.f33862a = c13043u;
        this.f33863b = i;
        this.f33864c = z;
        this.f33865d = f;
        this.f33866e = interfaceC5805t;
        this.f33867f = list;
        this.f33868g = i4;
    }

    /* renamed from: a */
    public int mo23005a() {
        return this.f33866e.mo23005a();
    }

    /* renamed from: b */
    public int mo23004b() {
        return this.f33866e.mo23004b();
    }

    /* renamed from: c */
    public List mo40035c() {
        return this.f33867f;
    }

    /* renamed from: d */
    public void mo23003d() {
        this.f33866e.mo23003d();
    }

    /* renamed from: e */
    public Map mo23002e() {
        return this.f33866e.mo23002e();
    }

    /* renamed from: f */
    public int mo40034f() {
        return this.f33868g;
    }

    /* renamed from: g */
    public final boolean m1849g() {
        return this.f33864c;
    }

    /* renamed from: h */
    public final float m1848h() {
        return this.f33865d;
    }

    /* renamed from: i */
    public final C13043u m1847i() {
        return this.f33862a;
    }

    /* renamed from: j */
    public final int m1846j() {
        return this.f33863b;
    }

    /* renamed from: k */
    public final InterfaceC12220h m1845k() {
        return new C13036a();
    }

    /* renamed from: l */
    public final InterfaceC5805t m1844l() {
        return this.f33866e;
    }
}
