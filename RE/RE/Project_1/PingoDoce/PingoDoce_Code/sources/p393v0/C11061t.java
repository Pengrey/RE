package p393v0;

import android.graphics.Shader;
import p181jd.Intrinsics;

/* compiled from: Brush.kt */
/* renamed from: v0.t */
/* loaded from: classes.dex */
public final class C11061t {

    /* compiled from: Brush.kt */
    /* renamed from: v0.t$a */
    /* loaded from: classes.dex */
    public static final class C11062a extends AbstractC11078z0 {

        /* renamed from: c */
        final /* synthetic */ Shader f28442c;

        C11062a(Shader shader) {
            this.f28442c = shader;
        }

        /* renamed from: b */
        public Shader m6280b(long j) {
            return this.f28442c;
        }
    }

    /* renamed from: a */
    public static final AbstractC11078z0 m6281a(Shader shader) {
        Intrinsics.isThisObjectNull(shader, "shader");
        return new C11062a(shader);
    }
}
