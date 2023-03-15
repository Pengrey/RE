package p263o3;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.util.Map;
import p396v3.C11089a;

/* renamed from: o3.a */
/* loaded from: classes.dex */
public final class C8001a implements InterfaceC8012g {

    /* renamed from: a */
    private final InterfaceC8013h f20723a;

    public C8001a(InterfaceC8013h interfaceC8013h) {
        this.f20723a = interfaceC8013h;
    }

    @Override // p263o3.InterfaceC8012g
    /* renamed from: a */
    public MemoryCache.C2187b mo17178a(MemoryCache.Key key) {
        return null;
    }

    @Override // p263o3.InterfaceC8012g
    /* renamed from: b */
    public void mo17177b(int i) {
    }

    @Override // p263o3.InterfaceC8012g
    /* renamed from: c */
    public void mo17176c(MemoryCache.Key key, Bitmap bitmap, Map<String, ? extends Object> map) {
        this.f20723a.mo17173c(key, bitmap, map, C11089a.m6176a(bitmap));
    }
}
