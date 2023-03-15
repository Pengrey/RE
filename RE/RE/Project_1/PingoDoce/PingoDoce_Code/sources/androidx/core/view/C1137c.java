package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.core.util.C1076h;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Objects;

/* renamed from: androidx.core.view.c */
/* loaded from: classes.dex */
public final class C1137c {

    /* renamed from: a */
    private final InterfaceC1143f f3474a;

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: androidx.core.view.c$a */
    /* loaded from: classes.dex */
    public static final class C1138a {

        /* renamed from: a */
        private final InterfaceC1140c f3475a;

        public C1138a(ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f3475a = new C1139b(clipData, i);
            } else {
                this.f3475a = new C1141d(clipData, i);
            }
        }

        /* renamed from: a */
        public C1137c m38241a() {
            return this.f3475a.build();
        }

        /* renamed from: b */
        public C1138a m38240b(Bundle bundle) {
            this.f3475a.mo38237a(bundle);
            return this;
        }

        /* renamed from: c */
        public C1138a m38239c(int i) {
            this.f3475a.mo38235c(i);
            return this;
        }

        /* renamed from: d */
        public C1138a m38238d(Uri uri) {
            this.f3475a.mo38236b(uri);
            return this;
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: androidx.core.view.c$b */
    /* loaded from: classes.dex */
    private static final class C1139b implements InterfaceC1140c {

        /* renamed from: a */
        private final ContentInfo.Builder f3476a;

        C1139b(ClipData clipData, int i) {
            this.f3476a = new ContentInfo.Builder(clipData, i);
        }

        @Override // androidx.core.view.C1137c.InterfaceC1140c
        /* renamed from: a */
        public void mo38237a(Bundle bundle) {
            this.f3476a.setExtras(bundle);
        }

        @Override // androidx.core.view.C1137c.InterfaceC1140c
        /* renamed from: b */
        public void mo38236b(Uri uri) {
            this.f3476a.setLinkUri(uri);
        }

        @Override // androidx.core.view.C1137c.InterfaceC1140c
        public C1137c build() {
            return new C1137c(new C1142e(this.f3476a.build()));
        }

        @Override // androidx.core.view.C1137c.InterfaceC1140c
        /* renamed from: c */
        public void mo38235c(int i) {
            this.f3476a.setFlags(i);
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: androidx.core.view.c$c */
    /* loaded from: classes.dex */
    private interface InterfaceC1140c {
        /* renamed from: a */
        void mo38237a(Bundle bundle);

        /* renamed from: b */
        void mo38236b(Uri uri);

        C1137c build();

        /* renamed from: c */
        void mo38235c(int i);
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: androidx.core.view.c$d */
    /* loaded from: classes.dex */
    private static final class C1141d implements InterfaceC1140c {

        /* renamed from: a */
        ClipData f3477a;

        /* renamed from: b */
        int f3478b;

        /* renamed from: c */
        int f3479c;

        /* renamed from: d */
        Uri f3480d;

        /* renamed from: e */
        Bundle f3481e;

        C1141d(ClipData clipData, int i) {
            this.f3477a = clipData;
            this.f3478b = i;
        }

        @Override // androidx.core.view.C1137c.InterfaceC1140c
        /* renamed from: a */
        public void mo38237a(Bundle bundle) {
            this.f3481e = bundle;
        }

        @Override // androidx.core.view.C1137c.InterfaceC1140c
        /* renamed from: b */
        public void mo38236b(Uri uri) {
            this.f3480d = uri;
        }

        @Override // androidx.core.view.C1137c.InterfaceC1140c
        public C1137c build() {
            return new C1137c(new C1144g(this));
        }

        @Override // androidx.core.view.C1137c.InterfaceC1140c
        /* renamed from: c */
        public void mo38235c(int i) {
            this.f3479c = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ContentInfoCompat.java */
    /* renamed from: androidx.core.view.c$e */
    /* loaded from: classes.dex */
    public static final class C1142e implements InterfaceC1143f {

        /* renamed from: a */
        private final ContentInfo f3482a;

        C1142e(ContentInfo contentInfo) {
            this.f3482a = (ContentInfo) C1076h.m38619f(contentInfo);
        }

        @Override // androidx.core.view.C1137c.InterfaceC1143f
        /* renamed from: a */
        public ClipData mo38234a() {
            return this.f3482a.getClip();
        }

        @Override // androidx.core.view.C1137c.InterfaceC1143f
        /* renamed from: b */
        public int mo38233b() {
            return this.f3482a.getFlags();
        }

        @Override // androidx.core.view.C1137c.InterfaceC1143f
        /* renamed from: c */
        public ContentInfo mo38232c() {
            return this.f3482a;
        }

        @Override // androidx.core.view.C1137c.InterfaceC1143f
        /* renamed from: d */
        public int mo38231d() {
            return this.f3482a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f3482a + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ContentInfoCompat.java */
    /* renamed from: androidx.core.view.c$f */
    /* loaded from: classes.dex */
    public interface InterfaceC1143f {
        /* renamed from: a */
        ClipData mo38234a();

        /* renamed from: b */
        int mo38233b();

        /* renamed from: c */
        ContentInfo mo38232c();

        /* renamed from: d */
        int mo38231d();
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: androidx.core.view.c$g */
    /* loaded from: classes.dex */
    private static final class C1144g implements InterfaceC1143f {

        /* renamed from: a */
        private final ClipData f3483a;

        /* renamed from: b */
        private final int f3484b;

        /* renamed from: c */
        private final int f3485c;

        /* renamed from: d */
        private final Uri f3486d;

        /* renamed from: e */
        private final Bundle f3487e;

        C1144g(C1141d c1141d) {
            this.f3483a = (ClipData) C1076h.m38619f(c1141d.f3477a);
            this.f3484b = C1076h.m38622c(c1141d.f3478b, 0, 5, "source");
            this.f3485c = C1076h.m38620e(c1141d.f3479c, 1);
            this.f3486d = c1141d.f3480d;
            this.f3487e = c1141d.f3481e;
        }

        @Override // androidx.core.view.C1137c.InterfaceC1143f
        /* renamed from: a */
        public ClipData mo38234a() {
            return this.f3483a;
        }

        @Override // androidx.core.view.C1137c.InterfaceC1143f
        /* renamed from: b */
        public int mo38233b() {
            return this.f3485c;
        }

        @Override // androidx.core.view.C1137c.InterfaceC1143f
        /* renamed from: c */
        public ContentInfo mo38232c() {
            return null;
        }

        @Override // androidx.core.view.C1137c.InterfaceC1143f
        /* renamed from: d */
        public int mo38231d() {
            return this.f3484b;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f3483a.getDescription());
            sb2.append(", source=");
            sb2.append(C1137c.m38244e(this.f3484b));
            sb2.append(", flags=");
            sb2.append(C1137c.m38248a(this.f3485c));
            Uri uri = this.f3486d;
            String str2 = BuildConfig.VERSION_NAME;
            if (uri == null) {
                str = BuildConfig.VERSION_NAME;
            } else {
                str = ", hasLinkUri(" + this.f3486d.toString().length() + ")";
            }
            sb2.append(str);
            if (this.f3487e != null) {
                str2 = ", hasExtras";
            }
            sb2.append(str2);
            sb2.append("}");
            return sb2.toString();
        }
    }

    C1137c(InterfaceC1143f interfaceC1143f) {
        this.f3474a = interfaceC1143f;
    }

    /* renamed from: a */
    static String m38248a(int i) {
        return (i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i);
    }

    /* renamed from: e */
    static String m38244e(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    /* renamed from: g */
    public static C1137c m38242g(ContentInfo contentInfo) {
        return new C1137c(new C1142e(contentInfo));
    }

    /* renamed from: b */
    public ClipData m38247b() {
        return this.f3474a.mo38234a();
    }

    /* renamed from: c */
    public int m38246c() {
        return this.f3474a.mo38233b();
    }

    /* renamed from: d */
    public int m38245d() {
        return this.f3474a.mo38231d();
    }

    /* renamed from: f */
    public ContentInfo m38243f() {
        ContentInfo mo38232c = this.f3474a.mo38232c();
        Objects.requireNonNull(mo38232c);
        return mo38232c;
    }

    public String toString() {
        return this.f3474a.toString();
    }
}
