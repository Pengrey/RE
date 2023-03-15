package p193k3;

import android.webkit.MimeTypeMap;
import bd.InterfaceC1886d;
import gd.C5641b;
import java.io.File;
import p095f3.InterfaceC5359e;
import p129h3.C5842o;
import p129h3.EnumC5826d;
import p193k3.InterfaceC6580h;
import p305q3.C9635k;
import p356sf.Path;

/* renamed from: k3.i */
/* loaded from: classes.dex */
public final class C6582i implements InterfaceC6580h {

    /* renamed from: a */
    private final File f17815a;

    /* compiled from: FileFetcher.kt */
    /* renamed from: k3.i$a */
    /* loaded from: classes.dex */
    public static final class C6583a implements InterfaceC6580h.InterfaceC6581a<File> {
        @Override // p193k3.InterfaceC6580h.InterfaceC6581a
        /* renamed from: b */
        public InterfaceC6580h mo20560b(File file, C9635k c9635k, InterfaceC5359e interfaceC5359e) {
            return new C6582i(file);
        }
    }

    public C6582i(File file) {
        this.f17815a = file;
    }

    @Override // p193k3.InterfaceC6580h
    /* renamed from: a */
    public Object mo20548a(InterfaceC1886d<? super AbstractC6579g> interfaceC1886d) {
        return new C6592l(C5842o.m22950d(Path.C10205a.m8514d(Path.f26595x, this.f17815a, false, 1, null), null, null, null, 14, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(C5641b.m23455c(this.f17815a)), EnumC5826d.DISK);
    }
}
