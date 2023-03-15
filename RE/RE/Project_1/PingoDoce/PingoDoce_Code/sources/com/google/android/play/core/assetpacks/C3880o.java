package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.play.core.internal.InterfaceC3944m;
import com.google.android.play.core.tasks.C3963b;
import com.google.android.play.core.tasks.C3973l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p031b9.C1844a;
import p031b9.C1854k;
import p031b9.C1856m;
import p060d9.C4754a;
import p101f9.AbstractC5433d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.o */
/* loaded from: classes.dex */
public final class C3880o implements InterfaceC3833c3 {

    /* renamed from: f */
    private static final C1844a f11066f = new C1844a("AssetPackServiceImpl");

    /* renamed from: g */
    private static final Intent f11067g = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    private final String f11068a;

    /* renamed from: b */
    private final C3909v0 f11069b;

    /* renamed from: c */
    private C1854k<InterfaceC3944m> f11070c;

    /* renamed from: d */
    private C1854k<InterfaceC3944m> f11071d;

    /* renamed from: e */
    private final AtomicBoolean f11072e = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3880o(Context context, C3909v0 c3909v0) {
        this.f11068a = context.getPackageName();
        this.f11069b = c3909v0;
        if (C1856m.m35252a(context)) {
            Context m26695a = C4754a.m26695a(context);
            C1844a c1844a = f11066f;
            Intent intent = f11067g;
            this.f11070c = new C1854k<>(m26695a, c1844a, "AssetPackService", intent, C3838d3.f10920a);
            this.f11071d = new C1854k<>(C4754a.m26695a(context), c1844a, "AssetPackService-keepAlive", intent, C3843e3.f10935a);
        }
        f11066f.m35280c("AssetPackService initiated.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* synthetic */ ArrayList m28686d(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* synthetic */ List m28685e(C3880o c3880o, List list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AssetPackState next = AbstractC3824b.m28764b((Bundle) list.get(i), c3880o.f11069b).mo28748e().values().iterator().next();
            if (next == null) {
                f11066f.m35278e("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (C3902t1.m28635c(next.mo28751f())) {
                arrayList.add(next.mo28752e());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final void m28684f(int i, String str, int i2) {
        if (this.f11070c == null) {
            throw new C3893r0("The Play Store app is not installed or is an unofficial version.", i);
        }
        f11066f.m35277f("notifyModuleCompleted", new Object[0]);
        C3973l c3973l = new C3973l();
        this.f11070c.m35271c(new C3844f(this, c3973l, i, str, c3973l, i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static /* synthetic */ Bundle m28680j(Map map) {
        Bundle m28671t = m28671t();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        m28671t.putParcelableArrayList("installed_asset_module", arrayList);
        return m28671t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static Bundle m28677m(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static Bundle m28676n(int i, String str) {
        Bundle m28677m = m28677m(i);
        m28677m.putString("module_name", str);
        return m28677m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static /* synthetic */ Bundle m28675o(int i, String str, String str2, int i2) {
        Bundle m28676n = m28676n(i, str);
        m28676n.putString("slice_id", str2);
        m28676n.putInt("chunk_number", i2);
        return m28676n;
    }

    /* renamed from: s */
    private static <T> AbstractC5433d<T> m28672s() {
        f11066f.m35278e("onError(%d)", -11);
        return C3963b.m28516a(new AssetPackException(-11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static Bundle m28671t() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10800);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        bundle.putIntegerArrayList("supported_patch_formats", new ArrayList<>());
        return bundle;
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC3833c3
    /* renamed from: C */
    public final void mo28657C(int i) {
        if (this.f11070c == null) {
            throw new C3893r0("The Play Store app is not installed or is an unofficial version.", i);
        }
        f11066f.m35277f("notifySessionFailed", new Object[0]);
        C3973l c3973l = new C3973l();
        this.f11070c.m35271c(new C3848g(this, c3973l, i, c3973l));
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC3833c3
    /* renamed from: D */
    public final AbstractC5433d<List<String>> mo28656D(Map<String, Long> map) {
        if (this.f11070c == null) {
            return m28672s();
        }
        f11066f.m35277f("syncPacks", new Object[0]);
        C3973l c3973l = new C3973l();
        this.f11070c.m35271c(new C3834d(this, c3973l, map, c3973l));
        return c3973l.m28502a();
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC3833c3
    /* renamed from: E */
    public final AbstractC5433d<ParcelFileDescriptor> mo28655E(int i, String str, String str2, int i2) {
        if (this.f11070c == null) {
            return m28672s();
        }
        f11066f.m35277f("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i2), Integer.valueOf(i));
        C3973l c3973l = new C3973l();
        this.f11070c.m35271c(new C3852h(this, c3973l, i, str, str2, i2, c3973l));
        return c3973l.m28502a();
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC3833c3
    /* renamed from: F */
    public final void mo28654F(int i, String str, String str2, int i2) {
        if (this.f11070c == null) {
            throw new C3893r0("The Play Store app is not installed or is an unofficial version.", i);
        }
        f11066f.m35277f("notifyChunkTransferred", new Object[0]);
        C3973l c3973l = new C3973l();
        this.f11070c.m35271c(new C3839e(this, c3973l, i, str, str2, i2, c3973l));
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC3833c3
    /* renamed from: a */
    public final void mo28653a(int i, String str) {
        m28684f(i, str, 10);
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC3833c3
    /* renamed from: c */
    public final synchronized void mo28651c() {
        if (this.f11071d == null) {
            f11066f.m35276g("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        C1844a c1844a = f11066f;
        c1844a.m35277f("keepAlive", new Object[0]);
        if (!this.f11072e.compareAndSet(false, true)) {
            c1844a.m35277f("Service is already kept alive.", new Object[0]);
            return;
        }
        C3973l c3973l = new C3973l();
        this.f11071d.m35271c(new C3856i(this, c3973l, c3973l));
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC3833c3
    /* renamed from: r */
    public final void mo28645r(List<String> list) {
        if (this.f11070c == null) {
            return;
        }
        f11066f.m35277f("cancelDownloads(%s)", list);
        C3973l c3973l = new C3973l();
        this.f11070c.m35271c(new C3829c(this, c3973l, list, c3973l));
    }
}
