package p040c4;

import com.airbnb.lottie.C2210f;
import p055d4.AbstractC4724a;
import p130h4.C5848d;
import p436x3.C12273l;
import p436x3.InterfaceC12264c;

/* renamed from: c4.h */
/* loaded from: classes.dex */
public class C2072h implements InterfaceC2065b {

    /* renamed from: a */
    private final String f6011a;

    /* renamed from: b */
    private final EnumC2073a f6012b;

    /* renamed from: c */
    private final boolean f6013c;

    /* compiled from: MergePaths.java */
    /* renamed from: c4.h$a */
    /* loaded from: classes.dex */
    public enum EnumC2073a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static EnumC2073a forId(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return MERGE;
                            }
                            return EXCLUDE_INTERSECTIONS;
                        }
                        return INTERSECT;
                    }
                    return SUBTRACT;
                }
                return ADD;
            }
            return MERGE;
        }
    }

    public C2072h(String str, EnumC2073a enumC2073a, boolean z) {
        this.f6011a = str;
        this.f6012b = enumC2073a;
        this.f6013c = z;
    }

    @Override // p040c4.InterfaceC2065b
    /* renamed from: a */
    public InterfaceC12264c mo34710a(C2210f c2210f, AbstractC4724a abstractC4724a) {
        if (!c2210f.m34327n()) {
            C5848d.m22929c("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new C12273l(this);
    }

    /* renamed from: b */
    public EnumC2073a m34759b() {
        return this.f6012b;
    }

    /* renamed from: c */
    public String m34758c() {
        return this.f6011a;
    }

    /* renamed from: d */
    public boolean m34757d() {
        return this.f6013c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f6012b + '}';
    }
}
