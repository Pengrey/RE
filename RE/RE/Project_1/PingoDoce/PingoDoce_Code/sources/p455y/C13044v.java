package p455y;

import com.google.crypto.tink.shaded.protobuf.Reader;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p432x.LazyMeasurePolicy;
import p479z1.C13599b;
import p479z1.C13601c;

/* renamed from: y.v */
/* loaded from: classes.dex */
public final class C13044v {

    /* renamed from: a */
    private final InterfaceC13023k f33917a;

    /* renamed from: b */
    private final LazyMeasurePolicy f33918b;

    /* renamed from: c */
    private final InterfaceC13054x f33919c;

    /* renamed from: d */
    private final long f33920d;

    private C13044v(long j, boolean z, InterfaceC13023k interfaceC13023k, LazyMeasurePolicy lazyMeasurePolicy, InterfaceC13054x interfaceC13054x) {
        this.f33917a = interfaceC13023k;
        this.f33918b = lazyMeasurePolicy;
        this.f33919c = interfaceC13054x;
        this.f33920d = C13601c.m906b(0, z ? C13599b.m916n(j) : Integer.MAX_VALUE, 0, z ? Reader.READ_DONE : C13599b.m917m(j), 5, null);
    }

    public /* synthetic */ C13044v(long j, boolean z, InterfaceC13023k interfaceC13023k, LazyMeasurePolicy lazyMeasurePolicy, InterfaceC13054x interfaceC13054x, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, z, interfaceC13023k, lazyMeasurePolicy, interfaceC13054x);
    }

    /* renamed from: a */
    public final C13043u m1800a(int i) {
        return this.f33919c.mo1784a(i, this.f33917a.getKey(i), this.f33918b.m3364a(i, m1799b()));
    }

    /* renamed from: b */
    public final long m1799b() {
        return this.f33920d;
    }

    /* renamed from: c */
    public final Map<Object, Integer> m1798c() {
        return this.f33917a.mo3323a();
    }
}
