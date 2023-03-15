package gg;

import java.lang.reflect.Type;
import kotlin.jvm.internal.DefaultConstructorMarker;
import module.network.data.remote.models.user.User;
import p142hg.ValueLocalDataProvider;

/* renamed from: gg.w */
/* loaded from: classes2.dex */
public final class C5682w extends ValueLocalDataProvider<User> {

    /* renamed from: g */
    private final boolean f15931g = true;

    /* compiled from: UserProfileLocalDataProvider.kt */
    /* renamed from: gg.w$a */
    /* loaded from: classes2.dex */
    public static final class C5683a {
        private C5683a() {
        }

        public /* synthetic */ C5683a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5683a(null);
    }

    @Override // p142hg.ValueLocalDataProvider
    /* renamed from: p */
    public String mo23352p() {
        return "KEY_FOR_USER";
    }

    @Override // p142hg.ValueLocalDataProvider
    /* renamed from: u */
    protected long mo23351u() {
        return 1576800000L;
    }

    @Override // p142hg.ValueLocalDataProvider
    /* renamed from: w */
    protected Type mo23350w() {
        return User.class;
    }

    @Override // p142hg.ValueLocalDataProvider
    /* renamed from: x */
    public boolean mo23349x() {
        return this.f15931g;
    }
}
