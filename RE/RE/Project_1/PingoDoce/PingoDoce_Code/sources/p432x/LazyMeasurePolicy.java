package p432x;

import java.util.HashMap;
import java.util.List;
import p127h1.InterfaceC5795l0;
import p127h1.InterfaceC5803r;
import p181jd.Intrinsics;

/* renamed from: x.k */
/* loaded from: classes.dex */
public final class LazyMeasurePolicy {

    /* renamed from: a */
    private final InterfaceC12217f f32237a;

    /* renamed from: b */
    private final LazyLayoutItemContentFactory f32238b;

    /* renamed from: c */
    private final InterfaceC5795l0 f32239c;

    /* renamed from: d */
    private final HashMap f32240d;

    public LazyMeasurePolicy(InterfaceC12217f interfaceC12217f, LazyLayoutItemContentFactory lazyLayoutItemContentFactory, InterfaceC5795l0 interfaceC5795l0) {
        Intrinsics.isThisObjectNull(interfaceC12217f, "itemsProvider");
        Intrinsics.isThisObjectNull(lazyLayoutItemContentFactory, "itemContentFactory");
        Intrinsics.isThisObjectNull(interfaceC5795l0, "subcomposeMeasureScope");
        this.f32237a = interfaceC12217f;
        this.f32238b = lazyLayoutItemContentFactory;
        this.f32239c = interfaceC5795l0;
        this.f32240d = new HashMap();
    }

    /* renamed from: a */
    public final LazyLayoutPlaceable[] m3364a(int i, long j) {
        LazyLayoutPlaceable[] lazyLayoutPlaceableArr = (LazyLayoutPlaceable[]) this.f32240d.get(Integer.valueOf(i));
        if (lazyLayoutPlaceableArr != null) {
            return lazyLayoutPlaceableArr;
        }
        Object key = this.f32237a.getKey(i);
        List m23027f0 = this.f32239c.m23027f0(key, this.f32238b.m3385d(i, key));
        int size = m23027f0.size();
        LazyLayoutPlaceable[] lazyLayoutPlaceableArr2 = new LazyLayoutPlaceable[size];
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC5803r interfaceC5803r = (InterfaceC5803r) m23027f0.get(i2);
            lazyLayoutPlaceableArr2[i2] = new LazyLayoutPlaceable(interfaceC5803r.mo23007n(j), interfaceC5803r.mo23120x());
        }
        this.f32240d.put(Integer.valueOf(i), lazyLayoutPlaceableArr2);
        return lazyLayoutPlaceableArr2;
    }
}
