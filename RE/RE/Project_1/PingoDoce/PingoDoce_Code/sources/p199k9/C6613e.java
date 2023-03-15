package p199k9;

import android.os.Bundle;
import java.util.Locale;
import p157i9.InterfaceC6056a;
import p219l9.C7011f;
import p238m9.InterfaceC7147b;

/* renamed from: k9.e */
/* loaded from: classes.dex */
class C6613e implements InterfaceC6056a.InterfaceC6058b {

    /* renamed from: a */
    private InterfaceC7147b f17854a;

    /* renamed from: b */
    private InterfaceC7147b f17855b;

    /* renamed from: b */
    private static void m20487b(InterfaceC7147b interfaceC7147b, String str, Bundle bundle) {
        if (interfaceC7147b == null) {
            return;
        }
        interfaceC7147b.mo19087E(str, bundle);
    }

    /* renamed from: c */
    private void m20486c(String str, Bundle bundle) {
        InterfaceC7147b interfaceC7147b;
        if ("clx".equals(bundle.getString("_o"))) {
            interfaceC7147b = this.f17854a;
        } else {
            interfaceC7147b = this.f17855b;
        }
        m20487b(interfaceC7147b, str, bundle);
    }

    @Override // p157i9.InterfaceC6056a.InterfaceC6058b
    /* renamed from: a */
    public void mo20488a(int i, Bundle bundle) {
        String string;
        C7011f.m19611f().m19608i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        m20486c(string, bundle2);
    }

    /* renamed from: d */
    public void m20485d(InterfaceC7147b interfaceC7147b) {
        this.f17855b = interfaceC7147b;
    }

    /* renamed from: e */
    public void m20484e(InterfaceC7147b interfaceC7147b) {
        this.f17854a = interfaceC7147b;
    }
}
