package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractBinderC3945n;
import com.google.android.play.core.tasks.C3973l;
import java.util.List;
import p031b9.C1844a;
import p031b9.C1854k;

/* renamed from: com.google.android.play.core.assetpacks.j */
/* loaded from: classes.dex */
class BinderC3860j<T> extends AbstractBinderC3945n {

    /* renamed from: a */
    final C3973l<T> f10995a;

    /* renamed from: b */
    final /* synthetic */ C3880o f10996b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC3860j(C3880o c3880o, C3973l<T> c3973l) {
        this.f10996b = c3880o;
        this.f10995a = c3973l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC3860j(C3880o c3880o, C3973l c3973l, byte[] bArr) {
        this(c3880o, c3973l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC3860j(C3880o c3880o, C3973l c3973l, char[] cArr) {
        this(c3880o, c3973l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC3860j(C3880o c3880o, C3973l c3973l, int[] iArr) {
        this(c3880o, c3973l);
    }

    @Override // com.google.android.play.core.internal.InterfaceC3946o
    /* renamed from: C */
    public final void mo28549C(int i) {
        C1854k c1854k;
        C1844a c1844a;
        c1854k = this.f10996b.f11070c;
        c1854k.m35272b();
        c1844a = C3880o.f11066f;
        c1844a.m35277f("onCancelDownload(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.internal.InterfaceC3946o
    /* renamed from: D */
    public void mo28548D(Bundle bundle) {
        C1854k c1854k;
        C1844a c1844a;
        c1854k = this.f10996b.f11070c;
        c1854k.m35272b();
        c1844a = C3880o.f11066f;
        c1844a.m35277f("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // com.google.android.play.core.internal.InterfaceC3946o
    /* renamed from: D1 */
    public void mo28547D1(Bundle bundle, Bundle bundle2) throws RemoteException {
        C1854k c1854k;
        C1844a c1844a;
        c1854k = this.f10996b.f11070c;
        c1854k.m35272b();
        c1844a = C3880o.f11066f;
        c1844a.m35277f("onGetChunkFileDescriptor", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.InterfaceC3946o
    /* renamed from: F0 */
    public void mo28546F0(int i, Bundle bundle) {
        C1854k c1854k;
        C1844a c1844a;
        c1854k = this.f10996b.f11070c;
        c1854k.m35272b();
        c1844a = C3880o.f11066f;
        c1844a.m35277f("onStartDownload(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.internal.InterfaceC3946o
    /* renamed from: H0 */
    public void mo28545H0(Bundle bundle) {
        C1854k c1854k;
        C1844a c1844a;
        c1854k = this.f10996b.f11070c;
        c1854k.m35272b();
        c1844a = C3880o.f11066f;
        c1844a.m35277f("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // com.google.android.play.core.internal.InterfaceC3946o
    /* renamed from: S */
    public final void mo28544S(int i) {
        C1854k c1854k;
        C1844a c1844a;
        c1854k = this.f10996b.f11070c;
        c1854k.m35272b();
        c1844a = C3880o.f11066f;
        c1844a.m35277f("onGetSession(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.internal.InterfaceC3946o
    /* renamed from: V */
    public void mo28543V(Bundle bundle, Bundle bundle2) {
        C1854k c1854k;
        C1844a c1844a;
        c1854k = this.f10996b.f11070c;
        c1854k.m35272b();
        c1844a = C3880o.f11066f;
        c1844a.m35277f("onRequestDownloadInfo()", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.InterfaceC3946o
    /* renamed from: b1 */
    public void mo28542b1(Bundle bundle) {
        C1854k c1854k;
        C1844a c1844a;
        c1854k = this.f10996b.f11070c;
        c1854k.m35272b();
        c1844a = C3880o.f11066f;
        c1844a.m35277f("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // com.google.android.play.core.internal.InterfaceC3946o
    /* renamed from: c */
    public void mo28541c() {
        C1854k c1854k;
        C1844a c1844a;
        c1854k = this.f10996b.f11070c;
        c1854k.m35272b();
        c1844a = C3880o.f11066f;
        c1844a.m35277f("onCancelDownloads()", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.InterfaceC3946o
    /* renamed from: i */
    public void mo28540i(Bundle bundle) {
        C1854k c1854k;
        C1844a c1844a;
        c1854k = this.f10996b.f11070c;
        c1854k.m35272b();
        int i = bundle.getInt("error_code");
        c1844a = C3880o.f11066f;
        c1844a.m35278e("onError(%d)", Integer.valueOf(i));
        this.f10995a.m28499d(new AssetPackException(i));
    }

    @Override // com.google.android.play.core.internal.InterfaceC3946o
    /* renamed from: r */
    public void mo28539r(List<Bundle> list) {
        C1854k c1854k;
        C1844a c1844a;
        c1854k = this.f10996b.f11070c;
        c1854k.m35272b();
        c1844a = C3880o.f11066f;
        c1844a.m35277f("onGetSessionStates", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.InterfaceC3946o
    /* renamed from: s0 */
    public void mo28538s0() {
        C1854k c1854k;
        C1844a c1844a;
        c1854k = this.f10996b.f11070c;
        c1854k.m35272b();
        c1844a = C3880o.f11066f;
        c1844a.m35277f("onRemoveModule()", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.InterfaceC3946o
    /* renamed from: z */
    public void mo28537z(Bundle bundle, Bundle bundle2) {
        C1854k c1854k;
        C1844a c1844a;
        c1854k = this.f10996b.f11071d;
        c1854k.m35272b();
        c1844a = C3880o.f11066f;
        c1844a.m35277f("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }
}
