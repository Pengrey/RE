package pt.pingodoce.app.presentation.account.loggedAccount.profile;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.constraintlayout.widget.C0868i;
import androidx.fragment.app.ActivityC1354d;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1465n0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import be.OperatorExtensions;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.List;
import java.util.Objects;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.C7405s1;
import mg.LoyaltyCardManager;
import module.network.data.remote.models.user.User;
import p070e.C4906j;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p195k5.C6599b;
import p221le.UiEventsLiveData;
import p221le.UiWidgets;
import p234m5.SuspendExtensions;
import p249n5.PermissionsBuilder;
import p259o.InterfaceC7946a;
import p265o5.InterfaceC8020b;
import p361t3.C10377a;
import p378u5.ResourcesProvider;
import p468yc.C13182l;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import p494zh.C13831f0;
import p494zh.C13894r;
import p494zh.C13912v1;
import p494zh.C13917w2;
import p494zh.C13922y;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;
import pt.pingodoce.app.presentation.account.loggedAccount.profile.ProfileViewModel;
import td.InterfaceC10524i0;

/* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.profile.a */
/* loaded from: classes2.dex */
public final class ProfileViewModel extends BaseViewModel {

    /* renamed from: m */
    private final C7405s1 f23407m;

    /* renamed from: n */
    private final LoyaltyCardManager f23408n;

    /* renamed from: o */
    private final InterfaceC6108l f23409o;

    /* renamed from: p */
    private final LiveData f23410p;

    /* renamed from: q */
    private final LiveData f23411q;

    /* renamed from: r */
    private final LiveData f23412r;

    /* renamed from: s */
    private final LiveData f23413s;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ProfileViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.profile.a$a */
    /* loaded from: classes2.dex */
    public enum EnumC8849a {
        PICTURE,
        NAME,
        PHONE,
        EMAIL,
        NIF,
        BIRTH_DATE
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.profile.a$b */
    /* loaded from: classes2.dex */
    public static final class C8850b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: x */
        final /* synthetic */ ResourcesProvider f23415x;

        /* compiled from: ProfileViewModel.kt */
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.profile.a$b$a */
        /* loaded from: classes2.dex */
        public static final class C8851a implements UiWidgets.InterfaceC7048e {

            /* renamed from: a */
            final /* synthetic */ ProfileViewModel f23416a;

            /* renamed from: b */
            final /* synthetic */ ResourcesProvider f23417b;

            /* compiled from: ProfileViewModel.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.profile.ProfileViewModel$clickThrottle$1$1$onResult$1", m20196f = "ProfileViewModel.kt", m20195l = {55}, m20194m = "invokeSuspend")
            /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.profile.a$b$a$a */
            /* loaded from: classes2.dex */
            static final class C8852a extends AbstractC6764l implements InterfaceC6112p {

                /* renamed from: x */
                int f23418x;

                /* renamed from: y */
                final /* synthetic */ ProfileViewModel f23419y;

                /* renamed from: z */
                final /* synthetic */ Bitmap f23420z;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: ProfileViewModel.kt */
                @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.profile.ProfileViewModel$clickThrottle$1$1$onResult$1$1", m20196f = "ProfileViewModel.kt", m20195l = {56}, m20194m = "invokeSuspend")
                /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.profile.a$b$a$a$a */
                /* loaded from: classes2.dex */
                public static final class C8853a extends AbstractC6764l implements InterfaceC6108l {

                    /* renamed from: x */
                    int f23421x;

                    /* renamed from: y */
                    final /* synthetic */ ProfileViewModel f23422y;

                    /* renamed from: z */
                    final /* synthetic */ Bitmap f23423z;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C8853a(ProfileViewModel profileViewModel, Bitmap bitmap, InterfaceC1886d interfaceC1886d) {
                        super(1, interfaceC1886d);
                        this.f23422y = profileViewModel;
                        this.f23423z = bitmap;
                    }

                    public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                        return new C8853a(this.f23422y, this.f23423z, interfaceC1886d);
                    }

                    /* renamed from: d */
                    public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                        return ((C8853a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object m34636d;
                        m34636d = C2116d.m34636d();
                        int i = this.f23421x;
                        if (i == 0) {
                            C13186n.m1453b(obj);
                            C7405s1 m13431S = ProfileViewModel.m13431S(this.f23422y);
                            Bitmap bitmap = this.f23423z;
                            this.f23421x = 1;
                            obj = m13431S.m18510A(bitmap, this);
                            if (obj == m34636d) {
                                return m34636d;
                            }
                        } else if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            C13186n.m1453b(obj);
                        }
                        return obj;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C8852a(ProfileViewModel profileViewModel, Bitmap bitmap, InterfaceC1886d interfaceC1886d) {
                    super(2, interfaceC1886d);
                    this.f23419y = profileViewModel;
                    this.f23420z = bitmap;
                }

                public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                    return new C8852a(this.f23419y, this.f23420z, interfaceC1886d);
                }

                /* renamed from: d */
                public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                    return ((C8852a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object m34636d;
                    m34636d = C2116d.m34636d();
                    int i = this.f23418x;
                    if (i == 0) {
                        C13186n.m1453b(obj);
                        ProfileViewModel profileViewModel = this.f23419y;
                        C8853a c8853a = new C8853a(profileViewModel, this.f23420z, null);
                        this.f23418x = 1;
                        if (ProfileViewModel.m13430T(profileViewModel, true, c8853a, this) == m34636d) {
                            return m34636d;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        C13186n.m1453b(obj);
                    }
                    return C13195u.f34156a;
                }
            }

            C8851a(ProfileViewModel profileViewModel, ResourcesProvider resourcesProvider) {
                this.f23416a = profileViewModel;
                this.f23417b = resourcesProvider;
            }

            /* renamed from: a */
            public void m13406a(Bitmap bitmap) {
                if (bitmap != null) {
                    C6772d.m20158d(C1473p0.m36987a(this.f23416a), null, null, new C8852a(this.f23416a, bitmap, null), 3, null);
                    return;
                }
                UiEventsLiveData uiEventsLiveData = UiEventsLiveData.f18671a;
                String string = this.f23417b.m6899a().getString(C2336R.string.error_profile_media);
                Intrinsics.checkIfNull(string, "ctx.getString(id)");
                uiEventsLiveData.m19510t(string);
            }
        }

        /* compiled from: ProfileViewModel.kt */
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.profile.a$b$b */
        /* loaded from: classes2.dex */
        public static final class C8854b implements UiWidgets.InterfaceC7044a {

            /* renamed from: a */
            final /* synthetic */ ProfileViewModel f23424a;

            C8854b(ProfileViewModel profileViewModel) {
                this.f23424a = profileViewModel;
            }

            /* renamed from: a */
            public void m13403a(boolean z) {
                if (z) {
                    BaseViewModel.m119C(this.f23424a, C13922y.f35043a, null, 2, null);
                }
            }
        }

        /* compiled from: ProfileViewModel.kt */
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.profile.a$b$c */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C8855c {

            /* renamed from: a */
            public static final /* synthetic */ int[] f23425a;

            static {
                int[] iArr = new int[EnumC8849a.values().length];
                iArr[EnumC8849a.PICTURE.ordinal()] = 1;
                iArr[EnumC8849a.NAME.ordinal()] = 2;
                iArr[EnumC8849a.PHONE.ordinal()] = 3;
                iArr[EnumC8849a.EMAIL.ordinal()] = 4;
                iArr[EnumC8849a.BIRTH_DATE.ordinal()] = 5;
                iArr[EnumC8849a.NIF.ordinal()] = 6;
                f23425a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8850b(ResourcesProvider resourcesProvider) {
            super(1);
            this.f23415x = resourcesProvider;
        }

        /* renamed from: a */
        public final void m13407a(EnumC8849a enumC8849a) {
            Intrinsics.isThisObjectNull(enumC8849a, "action");
            switch (C8855c.f23425a[enumC8849a.ordinal()]) {
                case 1:
                    UiEventsLiveData.f18671a.m19511s(new C8851a(ProfileViewModel.this, this.f23415x));
                    return;
                case 2:
                    ProfileViewModel profileViewModel = ProfileViewModel.this;
                    C13917w2 c13917w2 = C13917w2.f35038a;
                    User user = (User) profileViewModel.m13423a0().mo172f();
                    profileViewModel.m120B(c13917w2, user != null ? new C13182l(user.m18184i(), user.m18181m()) : null);
                    return;
                case 3:
                    UiEventsLiveData uiEventsLiveData = UiEventsLiveData.f18671a;
                    String string = this.f23415x.m6899a().getString(C2336R.string.dialog_caution_title);
                    Intrinsics.checkIfNull(string, "ctx.getString(id)");
                    String string2 = this.f23415x.m6899a().getString(C2336R.string.dialog_profile_change_number);
                    Intrinsics.checkIfNull(string2, "ctx.getString(id)");
                    UiEventsLiveData.m19519k(uiEventsLiveData, string, string2, null, null, new C8854b(ProfileViewModel.this), 12, null);
                    return;
                case 4:
                    ProfileViewModel profileViewModel2 = ProfileViewModel.this;
                    C13831f0 c13831f0 = C13831f0.f34939a;
                    Object mo172f = profileViewModel2.m13423a0().mo172f();
                    Intrinsics.ifNullDoSomething(mo172f);
                    profileViewModel2.m120B(c13831f0, ((User) mo172f).m18186f());
                    return;
                case 5:
                    ProfileViewModel profileViewModel3 = ProfileViewModel.this;
                    C13894r c13894r = C13894r.f35015a;
                    Object mo172f2 = profileViewModel3.m13423a0().mo172f();
                    Intrinsics.ifNullDoSomething(mo172f2);
                    profileViewModel3.m120B(c13894r, ((User) mo172f2).m18188d());
                    return;
                case 6:
                    ProfileViewModel profileViewModel4 = ProfileViewModel.this;
                    C13912v1 c13912v1 = C13912v1.f35033a;
                    Object mo172f3 = profileViewModel4.m13423a0().mo172f();
                    Intrinsics.ifNullDoSomething(mo172f3);
                    profileViewModel4.m120B(c13912v1, ((User) mo172f3).m18179r());
                    return;
                default:
                    return;
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m13407a((EnumC8849a) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.profile.ProfileViewModel$deletePicture$1", m20196f = "ProfileViewModel.kt", m20195l = {114}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.profile.a$c */
    /* loaded from: classes2.dex */
    public static final class C8856c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23426x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.profile.ProfileViewModel$deletePicture$1$1", m20196f = "ProfileViewModel.kt", m20195l = {115}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.profile.a$c$a */
        /* loaded from: classes2.dex */
        public static final class C8857a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f23428x;

            /* renamed from: y */
            final /* synthetic */ ProfileViewModel f23429y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8857a(ProfileViewModel profileViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f23429y = profileViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C8857a(this.f23429y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C8857a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f23428x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C7405s1 m13431S = ProfileViewModel.m13431S(this.f23429y);
                    this.f23428x = 1;
                    obj = m13431S.m18506d(this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                return obj;
            }
        }

        C8856c(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C8856c(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C8856c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f23426x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ProfileViewModel profileViewModel = ProfileViewModel.this;
                C8857a c8857a = new C8857a(profileViewModel, null);
                this.f23426x = 1;
                if (ProfileViewModel.m13430T(profileViewModel, true, c8857a, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.profile.ProfileViewModel$pictureClick$1$1", m20196f = "ProfileViewModel.kt", m20195l = {C0868i.f2983w0}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.profile.a$d */
    /* loaded from: classes2.dex */
    public static final class C8858d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23430x;

        /* renamed from: y */
        final /* synthetic */ View f23431y;

        /* renamed from: z */
        final /* synthetic */ ProfileViewModel f23432z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8858d(View view, ProfileViewModel profileViewModel, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f23431y = view;
            this.f23432z = profileViewModel;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C8858d(this.f23431y, this.f23432z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C8858d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f23430x;
            if (i == 0) {
                C13186n.m1453b(obj);
                Context context = this.f23431y.getContext();
                Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                InterfaceC8020b build = PermissionsBuilder.m17728b((ActivityC1354d) context, "android.permission.CAMERA", new String[0]).build();
                this.f23430x = 1;
                obj = SuspendExtensions.m19106a(build, this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            if (C6599b.m20515a((List) obj)) {
                ProfileViewModel.m13432R(this.f23432z).mo9587d(EnumC8849a.PICTURE);
            }
            return C13195u.f34156a;
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.profile.a$e */
    /* loaded from: classes2.dex */
    public static final class C8859e<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            return ((User) obj).m18175w();
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.profile.a$f */
    /* loaded from: classes2.dex */
    public static final class C8860f<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            return Boolean.valueOf(((LoyaltyCard) obj).m13811S());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.profile.ProfileViewModel$updateBirthDate$1", m20196f = "ProfileViewModel.kt", m20195l = {147}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.profile.a$g */
    /* loaded from: classes2.dex */
    public static final class C8861g extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23433x;

        /* renamed from: z */
        final /* synthetic */ String f23435z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.profile.ProfileViewModel$updateBirthDate$1$1", m20196f = "ProfileViewModel.kt", m20195l = {148}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.profile.a$g$a */
        /* loaded from: classes2.dex */
        public static final class C8862a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f23436x;

            /* renamed from: y */
            final /* synthetic */ ProfileViewModel f23437y;

            /* renamed from: z */
            final /* synthetic */ String f23438z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8862a(ProfileViewModel profileViewModel, String str, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f23437y = profileViewModel;
                this.f23438z = str;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C8862a(this.f23437y, this.f23438z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C8862a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f23436x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C7405s1 m13431S = ProfileViewModel.m13431S(this.f23437y);
                    String str = this.f23438z;
                    this.f23436x = 1;
                    obj = m13431S.m18488v(str, this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8861g(String str, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f23435z = str;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C8861g(this.f23435z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C8861g) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f23433x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ProfileViewModel profileViewModel = ProfileViewModel.this;
                C8862a c8862a = new C8862a(profileViewModel, this.f23435z, null);
                this.f23433x = 1;
                if (ProfileViewModel.m13430T(profileViewModel, true, c8862a, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.profile.ProfileViewModel$updateEmail$1", m20196f = "ProfileViewModel.kt", m20195l = {131}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.profile.a$h */
    /* loaded from: classes2.dex */
    public static final class C8863h extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23439x;

        /* renamed from: z */
        final /* synthetic */ String f23441z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.profile.ProfileViewModel$updateEmail$1$1", m20196f = "ProfileViewModel.kt", m20195l = {132}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.profile.a$h$a */
        /* loaded from: classes2.dex */
        public static final class C8864a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f23442x;

            /* renamed from: y */
            final /* synthetic */ ProfileViewModel f23443y;

            /* renamed from: z */
            final /* synthetic */ String f23444z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8864a(ProfileViewModel profileViewModel, String str, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f23443y = profileViewModel;
                this.f23444z = str;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C8864a(this.f23443y, this.f23444z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C8864a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f23442x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C7405s1 m13431S = ProfileViewModel.m13431S(this.f23443y);
                    String str = this.f23444z;
                    this.f23442x = 1;
                    obj = m13431S.m18487w(str, this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8863h(String str, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f23441z = str;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C8863h(this.f23441z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C8863h) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f23439x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ProfileViewModel profileViewModel = ProfileViewModel.this;
                C8864a c8864a = new C8864a(profileViewModel, this.f23441z, null);
                this.f23439x = 1;
                if (ProfileViewModel.m13430T(profileViewModel, true, c8864a, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.profile.ProfileViewModel$updateNif$1", m20196f = "ProfileViewModel.kt", m20195l = {139}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.profile.a$i */
    /* loaded from: classes2.dex */
    public static final class C8865i extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23445x;

        /* renamed from: z */
        final /* synthetic */ String f23447z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.profile.ProfileViewModel$updateNif$1$1", m20196f = "ProfileViewModel.kt", m20195l = {140}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.profile.a$i$a */
        /* loaded from: classes2.dex */
        public static final class C8866a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f23448x;

            /* renamed from: y */
            final /* synthetic */ ProfileViewModel f23449y;

            /* renamed from: z */
            final /* synthetic */ String f23450z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8866a(ProfileViewModel profileViewModel, String str, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f23449y = profileViewModel;
                this.f23450z = str;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C8866a(this.f23449y, this.f23450z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C8866a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f23448x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C7405s1 m13431S = ProfileViewModel.m13431S(this.f23449y);
                    String str = this.f23450z;
                    this.f23448x = 1;
                    obj = m13431S.m18484z(str, this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8865i(String str, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f23447z = str;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C8865i(this.f23447z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C8865i) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f23445x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ProfileViewModel profileViewModel = ProfileViewModel.this;
                C8866a c8866a = new C8866a(profileViewModel, this.f23447z, null);
                this.f23445x = 1;
                if (ProfileViewModel.m13430T(profileViewModel, true, c8866a, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.profile.ProfileViewModel$updateUserName$1", m20196f = "ProfileViewModel.kt", m20195l = {C4906j.f13405F0}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.profile.a$j */
    /* loaded from: classes2.dex */
    public static final class C8867j extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ String f23451A;

        /* renamed from: x */
        int f23452x;

        /* renamed from: z */
        final /* synthetic */ String f23454z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.profile.ProfileViewModel$updateUserName$1$1", m20196f = "ProfileViewModel.kt", m20195l = {C4906j.f13410G0}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.profile.a$j$a */
        /* loaded from: classes2.dex */
        public static final class C8868a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: A */
            final /* synthetic */ String f23455A;

            /* renamed from: x */
            int f23456x;

            /* renamed from: y */
            final /* synthetic */ ProfileViewModel f23457y;

            /* renamed from: z */
            final /* synthetic */ String f23458z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8868a(ProfileViewModel profileViewModel, String str, String str2, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f23457y = profileViewModel;
                this.f23458z = str;
                this.f23455A = str2;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C8868a(this.f23457y, this.f23458z, this.f23455A, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C8868a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f23456x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C7405s1 m13431S = ProfileViewModel.m13431S(this.f23457y);
                    String str = this.f23458z;
                    String str2 = this.f23455A;
                    this.f23456x = 1;
                    obj = m13431S.m18485y(str, str2, this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8867j(String str, String str2, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f23454z = str;
            this.f23451A = str2;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C8867j(this.f23454z, this.f23451A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C8867j) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f23452x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ProfileViewModel profileViewModel = ProfileViewModel.this;
                C8868a c8868a = new C8868a(profileViewModel, this.f23454z, this.f23451A, null);
                this.f23452x = 1;
                if (ProfileViewModel.m13430T(profileViewModel, true, c8868a, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7405s1 c7405s1, LoyaltyCardManager loyaltyCardManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(c7405s1, "userManager");
        Intrinsics.isThisObjectNull(loyaltyCardManager, "loyaltyCardManager");
        this.f23407m = c7405s1;
        this.f23408n = loyaltyCardManager;
        this.f23409o = OperatorExtensions.m35176e(0L, null, new C8850b(resourcesProvider), 3, null);
        LiveData m106t = m106t(c7405s1.m18500j());
        this.f23410p = m106t;
        LiveData m36993a = C1465n0.m36993a(m106t, new C8859e());
        Intrinsics.checkIfNull(m36993a, "Transformations.map(this) { transform(it) }");
        this.f23411q = m36993a;
        this.f23412r = new C1436e0(new C10377a());
        LiveData m36993a2 = C1465n0.m36993a(m106t(loyaltyCardManager.m18930p()), new C8860f());
        Intrinsics.checkIfNull(m36993a2, "Transformations.map(this) { transform(it) }");
        this.f23413s = m36993a2;
    }

    /* renamed from: L */
    public static /* synthetic */ void m13438L(ProfileViewModel profileViewModel, View view) {
        m13425Y(profileViewModel, view);
    }

    /* renamed from: M */
    public static /* synthetic */ void m13437M(ProfileViewModel profileViewModel, View view) {
        m13428V(profileViewModel, view);
    }

    /* renamed from: N */
    public static /* synthetic */ void m13436N(ProfileViewModel profileViewModel, View view) {
        m13414j0(profileViewModel, view);
    }

    /* renamed from: O */
    public static /* synthetic */ void m13435O(ProfileViewModel profileViewModel, View view) {
        m13416h0(profileViewModel, view);
    }

    /* renamed from: P */
    public static /* synthetic */ void m13434P(ProfileViewModel profileViewModel, View view) {
        m13412l0(profileViewModel, view);
    }

    /* renamed from: Q */
    public static /* synthetic */ void m13433Q(ProfileViewModel profileViewModel, View view) {
        m13418f0(profileViewModel, view);
    }

    /* renamed from: R */
    public static final /* synthetic */ InterfaceC6108l m13432R(ProfileViewModel profileViewModel) {
        return profileViewModel.f23409o;
    }

    /* renamed from: S */
    public static final /* synthetic */ C7405s1 m13431S(ProfileViewModel profileViewModel) {
        return profileViewModel.f23407m;
    }

    /* renamed from: T */
    public static final /* synthetic */ Object m13430T(ProfileViewModel profileViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return profileViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public static final void m13428V(ProfileViewModel profileViewModel, View view) {
        Intrinsics.isThisObjectNull(profileViewModel, "this$0");
        profileViewModel.f23409o.mo9587d(EnumC8849a.BIRTH_DATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public static final void m13425Y(ProfileViewModel profileViewModel, View view) {
        Intrinsics.isThisObjectNull(profileViewModel, "this$0");
        profileViewModel.f23409o.mo9587d(EnumC8849a.EMAIL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public static final void m13418f0(ProfileViewModel profileViewModel, View view) {
        Intrinsics.isThisObjectNull(profileViewModel, "this$0");
        profileViewModel.f23409o.mo9587d(EnumC8849a.NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public static final void m13416h0(ProfileViewModel profileViewModel, View view) {
        Intrinsics.isThisObjectNull(profileViewModel, "this$0");
        profileViewModel.f23409o.mo9587d(EnumC8849a.NIF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public static final void m13414j0(ProfileViewModel profileViewModel, View view) {
        Intrinsics.isThisObjectNull(profileViewModel, "this$0");
        profileViewModel.f23409o.mo9587d(EnumC8849a.PHONE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public static final void m13412l0(ProfileViewModel profileViewModel, View view) {
        Intrinsics.isThisObjectNull(profileViewModel, "this$0");
        C6772d.m20158d(C1473p0.m36987a(profileViewModel), null, null, new C8858d(view, profileViewModel, null), 3, null);
    }

    /* renamed from: U */
    public final View.OnClickListener m13429U() {
        return new View.OnClickListener() { // from class: jh.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileViewModel.m13428V(ProfileViewModel.this, view);
            }
        };
    }

    /* renamed from: W */
    public final void m13427W() {
        if (m13421c0()) {
            C6772d.m20158d(C1473p0.m36987a(this), null, null, new C8856c(null), 3, null);
        }
    }

    /* renamed from: X */
    public final View.OnClickListener m13426X() {
        return new View.OnClickListener() { // from class: jh.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileViewModel.m13425Y(ProfileViewModel.this, view);
            }
        };
    }

    /* renamed from: Z */
    public final LiveData m13424Z() {
        return this.f23411q;
    }

    /* renamed from: a0 */
    public final LiveData m13423a0() {
        return this.f23410p;
    }

    /* renamed from: b0 */
    public final LiveData m13422b0() {
        return this.f23412r;
    }

    /* renamed from: c0 */
    public final boolean m13421c0() {
        Object mo172f = this.f23410p.mo172f();
        Intrinsics.ifNullDoSomething(mo172f);
        return ((User) mo172f).m18200E();
    }

    /* renamed from: d0 */
    public final LiveData m13420d0() {
        return this.f23413s;
    }

    /* renamed from: e0 */
    public final View.OnClickListener m13419e0() {
        return new View.OnClickListener() { // from class: jh.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileViewModel.m13418f0(ProfileViewModel.this, view);
            }
        };
    }

    /* renamed from: g0 */
    public final View.OnClickListener m13417g0() {
        return new View.OnClickListener() { // from class: jh.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileViewModel.m13416h0(ProfileViewModel.this, view);
            }
        };
    }

    /* renamed from: i0 */
    public final View.OnClickListener m13415i0() {
        return new View.OnClickListener() { // from class: jh.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileViewModel.m13414j0(ProfileViewModel.this, view);
            }
        };
    }

    /* renamed from: k0 */
    public final View.OnClickListener m13413k0() {
        return new View.OnClickListener() { // from class: jh.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileViewModel.m13412l0(ProfileViewModel.this, view);
            }
        };
    }

    /* renamed from: m0 */
    public final void m13411m0(String str) {
        Intrinsics.isThisObjectNull(str, "birthdate");
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C8861g(str, null), 3, null);
    }

    /* renamed from: n0 */
    public final void m13410n0(String str) {
        Intrinsics.isThisObjectNull(str, "email");
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C8863h(str, null), 3, null);
    }

    /* renamed from: o0 */
    public final void m13409o0(String str) {
        Intrinsics.isThisObjectNull(str, "nif");
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C8865i(str, null), 3, null);
    }

    /* renamed from: p0 */
    public final void m13408p0(String str, String str2) {
        Intrinsics.isThisObjectNull(str, "firstName");
        Intrinsics.isThisObjectNull(str2, "lastName");
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C8867j(str, str2, null), 3, null);
    }
}
