package gg;

import java.lang.reflect.Type;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p142hg.ValueLocalDataProvider;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;

/* renamed from: gg.o */
/* loaded from: classes2.dex */
public final class C5670o extends ValueLocalDataProvider<LoyaltyCard> {

    /* renamed from: g */
    private final long f15924g = 1576800000;

    /* compiled from: LoyaltyCardLocalDataProvider.kt */
    /* renamed from: gg.o$a */
    /* loaded from: classes2.dex */
    public static final class C5671a {
        private C5671a() {
        }

        public /* synthetic */ C5671a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5671a(null);
    }

    @Override // p142hg.ValueLocalDataProvider
    /* renamed from: p */
    public String mo23352p() {
        return "KEY_FOR_LOYALTY_CARD_v2";
    }

    @Override // p142hg.ValueLocalDataProvider
    /* renamed from: u */
    protected long mo23351u() {
        return this.f15924g;
    }

    @Override // p142hg.ValueLocalDataProvider
    /* renamed from: w */
    protected Type mo23350w() {
        return LoyaltyCard.class;
    }
}
