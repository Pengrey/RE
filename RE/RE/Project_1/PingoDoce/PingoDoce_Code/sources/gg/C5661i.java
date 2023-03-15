package gg;

import com.squareup.moshi.C4516s;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p142hg.ValueLocalDataProvider;
import p181jd.Intrinsics;

/* renamed from: gg.i */
/* loaded from: classes2.dex */
public final class C5661i extends ValueLocalDataProvider {

    /* renamed from: g */
    private final long f15914g = 1576800000;

    /* renamed from: h */
    private final long f15915h = 1576800000;

    /* compiled from: CoachMarksLocalDataProvider.kt */
    /* renamed from: gg.i$a */
    /* loaded from: classes2.dex */
    public static final class C5662a {
        private C5662a() {
        }

        public /* synthetic */ C5662a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5662a(null);
    }

    /* renamed from: p */
    public String mo23352p() {
        return "KEY_FOR_COACHMARKS";
    }

    /* renamed from: u */
    protected long mo23351u() {
        return this.f15915h;
    }

    /* renamed from: v */
    protected long m23378v() {
        return this.f15914g;
    }

    /* renamed from: w */
    protected Type mo23350w() {
        ParameterizedType m27327j = C4516s.m27327j(Set.class, String.class);
        Intrinsics.checkIfNull(m27327j, "newParameterizedType(\n  …ing::class.java\n        )");
        return m27327j;
    }
}
