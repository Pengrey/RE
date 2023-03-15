package p193k3;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import bd.InterfaceC1886d;
import java.util.List;
import p095f3.InterfaceC5359e;
import p129h3.C5818a;
import p129h3.C5842o;
import p129h3.EnumC5826d;
import p193k3.InterfaceC6580h;
import p305q3.C9635k;
import p356sf.C10200t;
import p396v3.C11098i;
import p489zc._Collections;

/* renamed from: k3.a */
/* loaded from: classes.dex */
public final class C6568a implements InterfaceC6580h {

    /* renamed from: a */
    private final Uri f17802a;

    /* renamed from: b */
    private final C9635k f17803b;

    /* compiled from: AssetUriFetcher.kt */
    /* renamed from: k3.a$a */
    /* loaded from: classes.dex */
    public static final class C6569a implements InterfaceC6580h.InterfaceC6581a<Uri> {
        @Override // p193k3.InterfaceC6580h.InterfaceC6581a
        /* renamed from: b */
        public InterfaceC6580h mo20560b(Uri uri, C9635k c9635k, InterfaceC5359e interfaceC5359e) {
            if (C11098i.m6138r(uri)) {
                return new C6568a(uri, c9635k);
            }
            return null;
        }
    }

    public C6568a(Uri uri, C9635k c9635k) {
        this.f17802a = uri;
        this.f17803b = c9635k;
    }

    @Override // p193k3.InterfaceC6580h
    /* renamed from: a */
    public Object mo20548a(InterfaceC1886d<? super AbstractC6579g> interfaceC1886d) {
        List m488G;
        String m474U;
        m488G = _Collections.m488G(this.f17802a.getPathSegments(), 1);
        m474U = _Collections.m474U(m488G, "/", null, null, 0, null, null, 62, null);
        return new C6592l(C5842o.m22952b(C10200t.m8565c(C10200t.m8558j(this.f17803b.m10324g().getAssets().open(m474U))), this.f17803b.m10324g(), new C5818a(m474U)), C11098i.m6145k(MimeTypeMap.getSingleton(), m474U), EnumC5826d.DISK);
    }
}
