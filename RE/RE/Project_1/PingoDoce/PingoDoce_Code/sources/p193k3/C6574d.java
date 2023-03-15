package p193k3;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import bd.InterfaceC1886d;
import java.io.InputStream;
import java.util.List;
import p095f3.InterfaceC5359e;
import p129h3.C5825c;
import p129h3.C5842o;
import p129h3.EnumC5826d;
import p181jd.Intrinsics;
import p193k3.InterfaceC6580h;
import p305q3.C9635k;
import p327r3.AbstractC9797c;
import p356sf.C10200t;

/* renamed from: k3.d */
/* loaded from: classes.dex */
public final class C6574d implements InterfaceC6580h {

    /* renamed from: a */
    private final Uri f17808a;

    /* renamed from: b */
    private final C9635k f17809b;

    /* compiled from: ContentUriFetcher.kt */
    /* renamed from: k3.d$a */
    /* loaded from: classes.dex */
    public static final class C6575a implements InterfaceC6580h.InterfaceC6581a {
        /* renamed from: c */
        private final boolean m20553c(Uri uri) {
            return Intrinsics.equals(uri.getScheme(), "content");
        }

        /* renamed from: b */
        public InterfaceC6580h mo20560b(Uri uri, C9635k c9635k, InterfaceC5359e interfaceC5359e) {
            if (m20553c(uri)) {
                return new C6574d(uri, c9635k);
            }
            return null;
        }
    }

    public C6574d(Uri uri, C9635k c9635k) {
        this.f17808a = uri;
        this.f17809b = c9635k;
    }

    /* renamed from: d */
    private final Bundle m20555d() {
        AbstractC9797c m9942d = this.f17809b.m10317n().m9942d();
        AbstractC9797c.C9798a c9798a = m9942d instanceof AbstractC9797c.C9798a ? (AbstractC9797c.C9798a) m9942d : null;
        if (c9798a != null) {
            int i = c9798a.f25738a;
            AbstractC9797c m9943c = this.f17809b.m10317n().m9943c();
            AbstractC9797c.C9798a c9798a2 = m9943c instanceof AbstractC9797c.C9798a ? (AbstractC9797c.C9798a) m9943c : null;
            if (c9798a2 != null) {
                int i2 = c9798a2.f25738a;
                Bundle bundle = new Bundle(1);
                bundle.putParcelable("android.content.extra.SIZE", new Point(i, i2));
                return bundle;
            }
            return null;
        }
        return null;
    }

    /* renamed from: a */
    public Object mo20548a(InterfaceC1886d interfaceC1886d) {
        InputStream openInputStream;
        ContentResolver contentResolver = this.f17809b.m10324g().getContentResolver();
        if (m20557b(this.f17808a)) {
            AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(this.f17808a, "r");
            openInputStream = openAssetFileDescriptor != null ? openAssetFileDescriptor.createInputStream() : null;
            if (openInputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + this.f17808a + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT >= 29 && m20556c(this.f17808a)) {
            AssetFileDescriptor openTypedAssetFile = contentResolver.openTypedAssetFile(this.f17808a, "image/*", m20555d(), null);
            openInputStream = openTypedAssetFile != null ? openTypedAssetFile.createInputStream() : null;
            if (openInputStream == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + this.f17808a + "'.").toString());
            }
        } else {
            openInputStream = contentResolver.openInputStream(this.f17808a);
            if (openInputStream == null) {
                throw new IllegalStateException(("Unable to open '" + this.f17808a + "'.").toString());
            }
        }
        return new C6592l(C5842o.m22952b(C10200t.m8565c(C10200t.m8558j(openInputStream)), this.f17809b.m10324g(), new C5825c(this.f17808a)), contentResolver.getType(this.f17808a), EnumC5826d.DISK);
    }

    /* renamed from: b */
    public final boolean m20557b(Uri uri) {
        return Intrinsics.equals(uri.getAuthority(), "com.android.contacts") && Intrinsics.equals(uri.getLastPathSegment(), "display_photo");
    }

    /* renamed from: c */
    public final boolean m20556c(Uri uri) {
        List<String> pathSegments;
        int size;
        return Intrinsics.equals(uri.getAuthority(), "media") && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && Intrinsics.equals(pathSegments.get(size + (-3)), "audio") && Intrinsics.equals(pathSegments.get(size + (-2)), "albums");
    }
}
