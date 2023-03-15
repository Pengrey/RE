package gg;

import com.squareup.moshi.C4516s;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p142hg.ValueLocalDataProvider;
import p181jd.Intrinsics;

/* renamed from: gg.e */
/* loaded from: classes2.dex */
public final class C5655e extends ValueLocalDataProvider {

    /* compiled from: ClubsCodesLocalDataProvider.kt */
    /* renamed from: gg.e$a */
    /* loaded from: classes2.dex */
    public static final class C5656a {
        private C5656a() {
        }

        public /* synthetic */ C5656a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5656a(null);
    }

    /* renamed from: p */
    public String mo23352p() {
        return "KEY_FOR_CLUB_CODES";
    }

    /* renamed from: u */
    protected long mo23351u() {
        return 604800L;
    }

    /* renamed from: w */
    protected Type mo23350w() {
        ParameterizedType m27327j = C4516s.m27327j(List.class, String.class);
        Intrinsics.checkIfNull(m27327j, "newParameterizedType(\n  …ing::class.java\n        )");
        return m27327j;
    }
}
