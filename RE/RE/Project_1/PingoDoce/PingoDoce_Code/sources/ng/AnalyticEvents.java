package ng;

import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: ng.a */
/* loaded from: classes2.dex */
public abstract class AnalyticEvents {

    /* renamed from: a */
    private final String f20333a;

    /* compiled from: AnalyticEvents.kt */
    /* renamed from: ng.a$a */
    /* loaded from: classes2.dex */
    public static final class C7708a extends AnalyticEvents {

        /* renamed from: b */
        private final int f20334b;

        /* renamed from: c */
        private final String f20335c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7708a(int i, String str) {
            super("ApiError", null);
            Intrinsics.isThisObjectNull(str, "path");
            this.f20334b = i;
            this.f20335c = str;
        }

        /* renamed from: b */
        public final int m17639b() {
            return this.f20334b;
        }

        /* renamed from: c */
        public final String m17638c() {
            return this.f20335c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C7708a) {
                C7708a c7708a = (C7708a) obj;
                return this.f20334b == c7708a.f20334b && Intrinsics.equals(this.f20335c, c7708a.f20335c);
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f20334b) * 31) + this.f20335c.hashCode();
        }

        public String toString() {
            int i = this.f20334b;
            String str = this.f20335c;
            return "ApiError(errorCode=" + i + ", path=" + str + ")";
        }
    }

    /* compiled from: AnalyticEvents.kt */
    /* renamed from: ng.a$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7709b extends AnalyticEvents {

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$b$a */
        /* loaded from: classes2.dex */
        public static final class C7710a extends AbstractC7709b {

            /* renamed from: b */
            public static final C7710a f20336b = new C7710a();

            private C7710a() {
                super("BabyClub_Add_Baby", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$b$a0 */
        /* loaded from: classes2.dex */
        public static final class C7711a0 extends AbstractC7709b {

            /* renamed from: b */
            public static final C7711a0 f20337b = new C7711a0();

            private C7711a0() {
                super("BabyClub_Visit_Website", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$b$b */
        /* loaded from: classes2.dex */
        public static final class C7712b extends AbstractC7709b {

            /* renamed from: b */
            public static final C7712b f20338b = new C7712b();

            private C7712b() {
                super("BabyClub_Add_Baby_Success_Access_Home", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$b$c */
        /* loaded from: classes2.dex */
        public static final class C7713c extends AbstractC7709b {

            /* renamed from: b */
            public static final C7713c f20339b = new C7713c();

            private C7713c() {
                super("BabyClub_Arguments_Back", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$b$d */
        /* loaded from: classes2.dex */
        public static final class C7714d extends AbstractC7709b {

            /* renamed from: b */
            public static final C7714d f20340b = new C7714d();

            private C7714d() {
                super("BabyClub_Arguments_Subscribe", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$b$e */
        /* loaded from: classes2.dex */
        public static final class C7715e extends AbstractC7709b {

            /* renamed from: b */
            public static final C7715e f20341b = new C7715e();

            private C7715e() {
                super("BabyClub_Arguments_Website", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$b$f */
        /* loaded from: classes2.dex */
        public static final class C7716f extends AbstractC7709b {

            /* renamed from: b */
            public static final C7716f f20342b = new C7716f();

            private C7716f() {
                super("BabyClub_BabyName", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$b$g */
        /* loaded from: classes2.dex */
        public static final class C7717g extends AbstractC7709b {

            /* renamed from: b */
            public static final C7717g f20343b = new C7717g();

            private C7717g() {
                super("BabyClub_BabyName_Back", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$b$h */
        /* loaded from: classes2.dex */
        public static final class C7718h extends AbstractC7709b {

            /* renamed from: b */
            public static final C7718h f20344b = new C7718h();

            private C7718h() {
                super("BabyClub_BabyName_Next", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$b$i */
        /* loaded from: classes2.dex */
        public static final class C7719i extends AbstractC7709b {

            /* renamed from: b */
            public static final C7719i f20345b = new C7719i();

            private C7719i() {
                super("BabyClub_Date_Birth", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$b$j */
        /* loaded from: classes2.dex */
        public static final class C7720j extends AbstractC7709b {

            /* renamed from: b */
            public static final C7720j f20346b = new C7720j();

            private C7720j() {
                super("BabyClub_Date_Birth_Back", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$b$k */
        /* loaded from: classes2.dex */
        public static final class C7721k extends AbstractC7709b {

            /* renamed from: b */
            public static final C7721k f20347b = new C7721k();

            private C7721k() {
                super("BabyClub_Date_Next", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$b$l */
        /* loaded from: classes2.dex */
        public static final class C7722l extends AbstractC7709b {

            /* renamed from: b */
            public static final C7722l f20348b = new C7722l();

            private C7722l() {
                super("BabyClub_ID", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$b$m */
        /* loaded from: classes2.dex */
        public static final class C7723m extends AbstractC7709b {

            /* renamed from: b */
            public static final C7723m f20349b = new C7723m();

            private C7723m() {
                super("BabyClub_ID_Back", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$b$n */
        /* loaded from: classes2.dex */
        public static final class C7724n extends AbstractC7709b {

            /* renamed from: b */
            public static final C7724n f20350b = new C7724n();

            private C7724n() {
                super("BabyClub_ID_Next", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$b$o */
        /* loaded from: classes2.dex */
        public static final class C7725o extends AbstractC7709b {

            /* renamed from: b */
            public static final C7725o f20351b = new C7725o();

            private C7725o() {
                super("BabyClub_ID_Select_Type", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$b$p */
        /* loaded from: classes2.dex */
        public static final class C7726p extends AbstractC7709b {

            /* renamed from: b */
            public static final C7726p f20352b = new C7726p();

            private C7726p() {
                super("BabyClub_MainPage_Arguments", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$b$q */
        /* loaded from: classes2.dex */
        public static final class C7727q extends AbstractC7709b {

            /* renamed from: b */
            public static final C7727q f20353b = new C7727q();

            private C7727q() {
                super("BabyClub_MainPage_Subscribed", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$b$r */
        /* loaded from: classes2.dex */
        public static final class C7728r extends AbstractC7709b {

            /* renamed from: b */
            public static final C7728r f20354b = new C7728r();

            private C7728r() {
                super("BabyClub_Subscribed_Name", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$b$s */
        /* loaded from: classes2.dex */
        public static final class C7729s extends AbstractC7709b {

            /* renamed from: b */
            public static final C7729s f20355b = new C7729s();

            private C7729s() {
                super("BabyClub_Subscription_Success", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$b$t */
        /* loaded from: classes2.dex */
        public static final class C7730t extends AbstractC7709b {

            /* renamed from: b */
            public static final C7730t f20356b = new C7730t();

            private C7730t() {
                super("BabyClub_Subscription_Success_Access_Home", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$b$u */
        /* loaded from: classes2.dex */
        public static final class C7731u extends AbstractC7709b {

            /* renamed from: b */
            public static final C7731u f20357b = new C7731u();

            private C7731u() {
                super("BabyClub_Subscription_Success_Add_Baby", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$b$v */
        /* loaded from: classes2.dex */
        public static final class C7732v extends AbstractC7709b {

            /* renamed from: b */
            public static final C7732v f20358b = new C7732v();

            private C7732v() {
                super("BabyClub_Terms_Accept", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$b$w */
        /* loaded from: classes2.dex */
        public static final class C7733w extends AbstractC7709b {

            /* renamed from: b */
            public static final C7733w f20359b = new C7733w();

            private C7733w() {
                super("BabyClub_Terms_Cancel", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$b$x */
        /* loaded from: classes2.dex */
        public static final class C7734x extends AbstractC7709b {

            /* renamed from: b */
            public static final C7734x f20360b = new C7734x();

            private C7734x() {
                super("BabyClub_UnSubscribe_Baby", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$b$y */
        /* loaded from: classes2.dex */
        public static final class C7735y extends AbstractC7709b {

            /* renamed from: b */
            public static final C7735y f20361b = new C7735y();

            private C7735y() {
                super("BabyClub_UnSubscribe_Cancel", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$b$z */
        /* loaded from: classes2.dex */
        public static final class C7736z extends AbstractC7709b {

            /* renamed from: b */
            public static final C7736z f20362b = new C7736z();

            private C7736z() {
                super("BabyClub_UnSubscribe_Confirm", null);
            }
        }

        private AbstractC7709b(String str) {
            super(str, null);
        }

        public /* synthetic */ AbstractC7709b(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    /* compiled from: AnalyticEvents.kt */
    /* renamed from: ng.a$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7737c extends AnalyticEvents {

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$c$a */
        /* loaded from: classes2.dex */
        public static final class C7738a extends AbstractC7737c {

            /* renamed from: b */
            public static final C7738a f20363b = new C7738a();

            private C7738a() {
                super("Club_List_BabyClub_Subscribe", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$c$b */
        /* loaded from: classes2.dex */
        public static final class C7739b extends AbstractC7737c {

            /* renamed from: b */
            public static final C7739b f20364b = new C7739b();

            private C7739b() {
                super("Club_List_BabyClub_View_Details", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$c$c */
        /* loaded from: classes2.dex */
        public static final class C7740c extends AbstractC7737c {

            /* renamed from: b */
            public static final C7740c f20365b = new C7740c();

            private C7740c() {
                super("Club_List_WineClub_Subscribe", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$c$d */
        /* loaded from: classes2.dex */
        public static final class C7741d extends AbstractC7737c {

            /* renamed from: b */
            public static final C7741d f20366b = new C7741d();

            private C7741d() {
                super("Club_List_WineClub_View_Details", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$c$e */
        /* loaded from: classes2.dex */
        public static final class C7742e extends AbstractC7737c {

            /* renamed from: b */
            public static final C7742e f20367b = new C7742e();

            private C7742e() {
                super("Club_list", null);
            }
        }

        private AbstractC7737c(String str) {
            super(str, null);
        }

        public /* synthetic */ AbstractC7737c(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    /* compiled from: AnalyticEvents.kt */
    /* renamed from: ng.a$d */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7743d extends AnalyticEvents {

        /* renamed from: b */
        private final String f20368b;

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$d$a */
        /* loaded from: classes2.dex */
        public static final class C7744a extends AbstractC7743d {

            /* renamed from: c */
            private final String f20369c;

            /* renamed from: d */
            private final String f20370d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7744a(String str, String str2) {
                super("BANNER_ACTION", null);
                Intrinsics.isThisObjectNull(str, "id");
                Intrinsics.isThisObjectNull(str2, "action");
                this.f20369c = str;
                this.f20370d = str2;
            }

            /* renamed from: b */
            public String m17636b() {
                return this.f20369c;
            }

            /* renamed from: c */
            public final String m17635c() {
                return this.f20370d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C7744a) {
                    C7744a c7744a = (C7744a) obj;
                    return Intrinsics.equals(m17636b(), c7744a.m17636b()) && Intrinsics.equals(this.f20370d, c7744a.f20370d);
                }
                return false;
            }

            public int hashCode() {
                return (m17636b().hashCode() * 31) + this.f20370d.hashCode();
            }

            public String toString() {
                String m17636b = m17636b();
                String str = this.f20370d;
                return "BANNER_ACTION(id=" + m17636b + ", action=" + str + ")";
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$d$b */
        /* loaded from: classes2.dex */
        public static final class C7745b extends AbstractC7743d {

            /* renamed from: c */
            private final String f20371c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7745b(String str) {
                super("BANNER_ID", null);
                Intrinsics.isThisObjectNull(str, "id");
                this.f20371c = str;
            }

            /* renamed from: b */
            public String m17634b() {
                return this.f20371c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C7745b) && Intrinsics.equals(m17634b(), ((C7745b) obj).m17634b());
            }

            public int hashCode() {
                return m17634b().hashCode();
            }

            public String toString() {
                String m17634b = m17634b();
                return "BANNER_ID(id=" + m17634b + ")";
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$d$c */
        /* loaded from: classes2.dex */
        public static final class C7746c extends AbstractC7743d {

            /* renamed from: c */
            private final String f20372c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7746c(String str) {
                super("FLYER_ID", null);
                Intrinsics.isThisObjectNull(str, "id");
                this.f20372c = str;
            }

            /* renamed from: b */
            public String m17633b() {
                return this.f20372c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C7746c) && Intrinsics.equals(m17633b(), ((C7746c) obj).m17633b());
            }

            public int hashCode() {
                return m17633b().hashCode();
            }

            public String toString() {
                String m17633b = m17633b();
                return "FLYER_ID(id=" + m17633b + ")";
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$d$d */
        /* loaded from: classes2.dex */
        public static final class C7747d extends AbstractC7743d {

            /* renamed from: c */
            private final String f20373c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7747d(String str) {
                super("FLYER_PRINT", null);
                Intrinsics.isThisObjectNull(str, "id");
                this.f20373c = str;
            }

            /* renamed from: b */
            public String m17632b() {
                return this.f20373c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C7747d) && Intrinsics.equals(m17632b(), ((C7747d) obj).m17632b());
            }

            public int hashCode() {
                return m17632b().hashCode();
            }

            public String toString() {
                String m17632b = m17632b();
                return "FLYER_PRINT(id=" + m17632b + ")";
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$d$e */
        /* loaded from: classes2.dex */
        public static final class C7748e extends AbstractC7743d {

            /* renamed from: c */
            public static final C7748e f20374c = new C7748e();

            private C7748e() {
                super("LOST_LOGIN_401", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$d$f */
        /* loaded from: classes2.dex */
        public static final class C7749f extends AbstractC7743d {

            /* renamed from: c */
            private final String f20375c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7749f(String str) {
                super("NOTIFICATION_ID", null);
                Intrinsics.isThisObjectNull(str, "id");
                this.f20375c = str;
            }

            /* renamed from: b */
            public String m17631b() {
                return this.f20375c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C7749f) && Intrinsics.equals(m17631b(), ((C7749f) obj).m17631b());
            }

            public int hashCode() {
                return m17631b().hashCode();
            }

            public String toString() {
                String m17631b = m17631b();
                return "NOTIFICATION_ID(id=" + m17631b + ")";
            }
        }

        private AbstractC7743d(String str) {
            super(str, null);
            this.f20368b = BuildConfig.VERSION_NAME;
        }

        public /* synthetic */ AbstractC7743d(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        /* renamed from: b */
        public String m17637b() {
            return this.f20368b;
        }
    }

    /* compiled from: AnalyticEvents.kt */
    /* renamed from: ng.a$e */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7750e extends AnalyticEvents {

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$e$a */
        /* loaded from: classes2.dex */
        public static final class C7751a extends AbstractC7750e {

            /* renamed from: b */
            public static final C7751a f20376b = new C7751a();

            private C7751a() {
                super("PM_Add_Card", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$e$a0 */
        /* loaded from: classes2.dex */
        public static final class C7752a0 extends AbstractC7750e {

            /* renamed from: b */
            public static final C7752a0 f20377b = new C7752a0();

            private C7752a0() {
                super("PM_Owner_Success", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$e$b */
        /* loaded from: classes2.dex */
        public static final class C7753b extends AbstractC7750e {

            /* renamed from: b */
            public static final C7753b f20378b = new C7753b();

            private C7753b() {
                super("PM_Add_Card_Back", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$e$b0 */
        /* loaded from: classes2.dex */
        public static final class C7754b0 extends AbstractC7750e {

            /* renamed from: b */
            public static final C7754b0 f20379b = new C7754b0();

            private C7754b0() {
                super("PM_Owner_Success_Back", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$e$c */
        /* loaded from: classes2.dex */
        public static final class C7755c extends AbstractC7750e {

            /* renamed from: b */
            public static final C7755c f20380b = new C7755c();

            private C7755c() {
                super("PM_Add_Card_Next", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$e$c0 */
        /* loaded from: classes2.dex */
        public static final class C7756c0 extends AbstractC7750e {

            /* renamed from: b */
            public static final C7756c0 f20381b = new C7756c0();

            private C7756c0() {
                super("PM_Owner_Success_Next", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$e$d */
        /* loaded from: classes2.dex */
        public static final class C7757d extends AbstractC7750e {

            /* renamed from: b */
            public static final C7757d f20382b = new C7757d();

            private C7757d() {
                super("PM_Add_Card_OCR", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$e$e */
        /* loaded from: classes2.dex */
        public static final class C7758e extends AbstractC7750e {

            /* renamed from: b */
            public static final C7758e f20383b = new C7758e();

            private C7758e() {
                super("PM_Card", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$e$f */
        /* loaded from: classes2.dex */
        public static final class C7759f extends AbstractC7750e {

            /* renamed from: b */
            public static final C7759f f20384b = new C7759f();

            private C7759f() {
                super("PM_Card_Back", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$e$g */
        /* loaded from: classes2.dex */
        public static final class C7760g extends AbstractC7750e {

            /* renamed from: b */
            public static final C7760g f20385b = new C7760g();

            private C7760g() {
                super("PM_Card_Edit", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$e$h */
        /* loaded from: classes2.dex */
        public static final class C7761h extends AbstractC7750e {

            /* renamed from: b */
            public static final C7761h f20386b = new C7761h();

            private C7761h() {
                super("PM_Card_Request_Sent", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$e$i */
        /* loaded from: classes2.dex */
        public static final class C7762i extends AbstractC7750e {

            /* renamed from: b */
            public static final C7762i f20387b = new C7762i();

            private C7762i() {
                super("PM_Card_Request_Sent_Back", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$e$j */
        /* loaded from: classes2.dex */
        public static final class C7763j extends AbstractC7750e {

            /* renamed from: b */
            public static final C7763j f20388b = new C7763j();

            private C7763j() {
                super("PM_Card_Request_Sent_Next", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$e$k */
        /* loaded from: classes2.dex */
        public static final class C7764k extends AbstractC7750e {

            /* renamed from: b */
            public static final C7764k f20389b = new C7764k();

            private C7764k() {
                super("PM_Card_Request_Sent_Success", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$e$l */
        /* loaded from: classes2.dex */
        public static final class C7765l extends AbstractC7750e {

            /* renamed from: b */
            public static final C7765l f20390b = new C7765l();

            private C7765l() {
                super("PM_Card_Request_Sent_Success_Next", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$e$m */
        /* loaded from: classes2.dex */
        public static final class C7766m extends AbstractC7750e {

            /* renamed from: b */
            public static final C7766m f20391b = new C7766m();

            private C7766m() {
                super("PM_Card_User_Not_Registered", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$e$n */
        /* loaded from: classes2.dex */
        public static final class C7767n extends AbstractC7750e {

            /* renamed from: b */
            public static final C7767n f20392b = new C7767n();

            private C7767n() {
                super("PM_Card_User_Not_Registered_Back", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$e$o */
        /* loaded from: classes2.dex */
        public static final class C7768o extends AbstractC7750e {

            /* renamed from: b */
            public static final C7768o f20393b = new C7768o();

            private C7768o() {
                super("PM_Card_User_Not_Registered_Next", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$e$p */
        /* loaded from: classes2.dex */
        public static final class C7769p extends AbstractC7750e {

            /* renamed from: b */
            public static final C7769p f20394b = new C7769p();

            private C7769p() {
                super("PM_Card_User_Not_Registered_Success_Back", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$e$q */
        /* loaded from: classes2.dex */
        public static final class C7770q extends AbstractC7750e {

            /* renamed from: b */
            public static final C7770q f20395b = new C7770q();

            private C7770q() {
                super("PM_Have_Card", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$e$r */
        /* loaded from: classes2.dex */
        public static final class C7771r extends AbstractC7750e {

            /* renamed from: b */
            public static final C7771r f20396b = new C7771r();

            private C7771r() {
                super("PM_Have_Card_Next", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$e$s */
        /* loaded from: classes2.dex */
        public static final class C7772s extends AbstractC7750e {

            /* renamed from: b */
            public static final C7772s f20397b = new C7772s();

            private C7772s() {
                super("PM_No_Card", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$e$t */
        /* loaded from: classes2.dex */
        public static final class C7773t extends AbstractC7750e {

            /* renamed from: b */
            public static final C7773t f20398b = new C7773t();

            private C7773t() {
                super("PM_No_Card_Add", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$e$u */
        /* loaded from: classes2.dex */
        public static final class C7774u extends AbstractC7750e {

            /* renamed from: b */
            public static final C7774u f20399b = new C7774u();

            private C7774u() {
                super("PM_No_Card_Back", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$e$v */
        /* loaded from: classes2.dex */
        public static final class C7775v extends AbstractC7750e {

            /* renamed from: b */
            public static final C7775v f20400b = new C7775v();

            private C7775v() {
                super("PM_Owner_Card", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$e$w */
        /* loaded from: classes2.dex */
        public static final class C7776w extends AbstractC7750e {

            /* renamed from: b */
            public static final C7776w f20401b = new C7776w();

            private C7776w() {
                super("PM_Owner_Card_Add", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$e$x */
        /* loaded from: classes2.dex */
        public static final class C7777x extends AbstractC7750e {

            /* renamed from: b */
            public static final C7777x f20402b = new C7777x();

            private C7777x() {
                super("PM_Owner_List", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$e$y */
        /* loaded from: classes2.dex */
        public static final class C7778y extends AbstractC7750e {

            /* renamed from: b */
            public static final C7778y f20403b = new C7778y();

            private C7778y() {
                super("PM_Owner_List_Add", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$e$z */
        /* loaded from: classes2.dex */
        public static final class C7779z extends AbstractC7750e {

            /* renamed from: b */
            public static final C7779z f20404b = new C7779z();

            private C7779z() {
                super("PM_Owner_List_Next", null);
            }
        }

        private AbstractC7750e(String str) {
            super(str, null);
        }

        public /* synthetic */ AbstractC7750e(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    /* compiled from: AnalyticEvents.kt */
    /* renamed from: ng.a$f */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7780f extends AnalyticEvents {

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$a */
        /* loaded from: classes2.dex */
        public static final class C7781a extends AbstractC7780f {

            /* renamed from: b */
            public static final C7781a f20405b = new C7781a();

            private C7781a() {
                super("Add_Card", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$a0 */
        /* loaded from: classes2.dex */
        public static final class C7782a0 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7782a0 f20406b = new C7782a0();

            private C7782a0() {
                super("NIF_Skip", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$a1 */
        /* loaded from: classes2.dex */
        public static final class C7783a1 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7783a1 f20407b = new C7783a1();

            private C7783a1() {
                super("PMCard_Selection_OneCard_Back", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$b */
        /* loaded from: classes2.dex */
        public static final class C7784b extends AbstractC7780f {

            /* renamed from: b */
            public static final C7784b f20408b = new C7784b();

            private C7784b() {
                super("Add_Card_Back", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$b0 */
        /* loaded from: classes2.dex */
        public static final class C7785b0 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7785b0 f20409b = new C7785b0();

            private C7785b0() {
                super("Name", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$b1 */
        /* loaded from: classes2.dex */
        public static final class C7786b1 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7786b1 f20410b = new C7786b1();

            private C7786b1() {
                super("PMCard_Selection_OneCard_Next", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$c */
        /* loaded from: classes2.dex */
        public static final class C7787c extends AbstractC7780f {

            /* renamed from: b */
            public static final C7787c f20411b = new C7787c();

            private C7787c() {
                super("Add_Card_Next", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$c0 */
        /* loaded from: classes2.dex */
        public static final class C7788c0 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7788c0 f20412b = new C7788c0();

            private C7788c0() {
                super("Name_Back", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$c1 */
        /* loaded from: classes2.dex */
        public static final class C7789c1 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7789c1 f20413b = new C7789c1();

            private C7789c1() {
                super("PMCard_Selection_OneCard_Skip", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$d */
        /* loaded from: classes2.dex */
        public static final class C7790d extends AbstractC7780f {

            /* renamed from: b */
            public static final C7790d f20414b = new C7790d();

            private C7790d() {
                super("Card_Request_Sent", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$d0 */
        /* loaded from: classes2.dex */
        public static final class C7791d0 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7791d0 f20415b = new C7791d0();

            private C7791d0() {
                super("Name_Field", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$d1 */
        /* loaded from: classes2.dex */
        public static final class C7792d1 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7792d1 f20416b = new C7792d1();

            private C7792d1() {
                super("PMCard_Selection_Several", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$e */
        /* loaded from: classes2.dex */
        public static final class C7793e extends AbstractC7780f {

            /* renamed from: b */
            public static final C7793e f20417b = new C7793e();

            private C7793e() {
                super("Card_Request_Sent_Back", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$e0 */
        /* loaded from: classes2.dex */
        public static final class C7794e0 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7794e0 f20418b = new C7794e0();

            private C7794e0() {
                super("Name_Next", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$e1 */
        /* loaded from: classes2.dex */
        public static final class C7795e1 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7795e1 f20419b = new C7795e1();

            private C7795e1() {
                super("PMCard_Selection_Several_Add", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$f */
        /* loaded from: classes2.dex */
        public static final class C7796f extends AbstractC7780f {

            /* renamed from: b */
            public static final C7796f f20420b = new C7796f();

            private C7796f() {
                super("Card_Request_Sent_Next", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$f0 */
        /* loaded from: classes2.dex */
        public static final class C7797f0 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7797f0 f20421b = new C7797f0();

            private C7797f0() {
                super("ONBD_S6_EMAIL", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$f1 */
        /* loaded from: classes2.dex */
        public static final class C7798f1 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7798f1 f20422b = new C7798f1();

            private C7798f1() {
                super("PMCard_Selection_Several_Back", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$g */
        /* loaded from: classes2.dex */
        public static final class C7799g extends AbstractC7780f {

            /* renamed from: b */
            public static final C7799g f20423b = new C7799g();

            private C7799g() {
                super("Card_Request_Sent_Success", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$g0 */
        /* loaded from: classes2.dex */
        public static final class C7800g0 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7800g0 f20424b = new C7800g0();

            private C7800g0() {
                super("ONBD_S7_PASSCODE", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$g1 */
        /* loaded from: classes2.dex */
        public static final class C7801g1 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7801g1 f20425b = new C7801g1();

            private C7801g1() {
                super("PMCard_Selection_Several_Next", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$h */
        /* loaded from: classes2.dex */
        public static final class C7802h extends AbstractC7780f {

            /* renamed from: b */
            public static final C7802h f20426b = new C7802h();

            private C7802h() {
                super("CommsConsentsRequest", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$h0 */
        /* loaded from: classes2.dex */
        public static final class C7803h0 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7803h0 f20427b = new C7803h0();

            private C7803h0() {
                super("ONBD_S8_REGISTRATION_COMPLETE", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$h1 */
        /* loaded from: classes2.dex */
        public static final class C7804h1 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7804h1 f20428b = new C7804h1();

            private C7804h1() {
                super("PMCard_Selection_Several_Skip", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$i */
        /* loaded from: classes2.dex */
        public static final class C7805i extends AbstractC7780f {

            /* renamed from: b */
            public static final C7805i f20429b = new C7805i();

            private C7805i() {
                super("CommsConsentsRequest_Accept", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$i0 */
        /* loaded from: classes2.dex */
        public static final class C7806i0 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7806i0 f20430b = new C7806i0();

            private C7806i0() {
                super("ONBD_S9_MARKETING_NOTIFICATIONS", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$i1 */
        /* loaded from: classes2.dex */
        public static final class C7807i1 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7807i1 f20431b = new C7807i1();

            private C7807i1() {
                super("PendingStatus", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$j */
        /* loaded from: classes2.dex */
        public static final class C7808j extends AbstractC7780f {

            /* renamed from: b */
            public static final C7808j f20432b = new C7808j();

            private C7808j() {
                super("CommsConsentsRequest_Reject", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$j0 */
        /* loaded from: classes2.dex */
        public static final class C7809j0 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7809j0 f20433b = new C7809j0();

            private C7809j0() {
                super("ONBD_SX_INSERT_VAT", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$j1 */
        /* loaded from: classes2.dex */
        public static final class C7810j1 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7810j1 f20434b = new C7810j1();

            private C7810j1() {
                super("PendingStatus_Edit", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$k */
        /* loaded from: classes2.dex */
        public static final class C7811k extends AbstractC7780f {

            /* renamed from: b */
            public static final C7811k f20435b = new C7811k();

            private C7811k() {
                super("Email", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$k0 */
        /* loaded from: classes2.dex */
        public static final class C7812k0 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7812k0 f20436b = new C7812k0();

            private C7812k0() {
                super("ORDR_S1_LANDING", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$k1 */
        /* loaded from: classes2.dex */
        public static final class C7813k1 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7813k1 f20437b = new C7813k1();

            private C7813k1() {
                super("PendingStatus_ResendEmail", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$l */
        /* loaded from: classes2.dex */
        public static final class C7814l extends AbstractC7780f {

            /* renamed from: b */
            public static final C7814l f20438b = new C7814l();

            private C7814l() {
                super("Email_Back", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$l0 */
        /* loaded from: classes2.dex */
        public static final class C7815l0 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7815l0 f20439b = new C7815l0();

            private C7815l0() {
                super("ORDR_S2_STORE", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$l1 */
        /* loaded from: classes2.dex */
        public static final class C7816l1 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7816l1 f20440b = new C7816l1();

            private C7816l1() {
                super("PendingStatus_VerifiedEmail", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$m */
        /* loaded from: classes2.dex */
        public static final class C7817m extends AbstractC7780f {

            /* renamed from: b */
            public static final C7817m f20441b = new C7817m();

            private C7817m() {
                super("Email_Error", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$m0 */
        /* loaded from: classes2.dex */
        public static final class C7818m0 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7818m0 f20442b = new C7818m0();

            private C7818m0() {
                super("ORDR_S3_DATE", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$m1 */
        /* loaded from: classes2.dex */
        public static final class C7819m1 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7819m1 f20443b = new C7819m1();

            private C7819m1() {
                super("PhoneNumber", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$n */
        /* loaded from: classes2.dex */
        public static final class C7820n extends AbstractC7780f {

            /* renamed from: b */
            public static final C7820n f20444b = new C7820n();

            private C7820n() {
                super("Email_Back", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$n0 */
        /* loaded from: classes2.dex */
        public static final class C7821n0 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7821n0 f20445b = new C7821n0();

            private C7821n0() {
                super("ORDR_S4_HOUR", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$n1 */
        /* loaded from: classes2.dex */
        public static final class C7822n1 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7822n1 f20446b = new C7822n1();

            private C7822n1() {
                super("PhoneNumber_Back", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$o */
        /* loaded from: classes2.dex */
        public static final class C7823o extends AbstractC7780f {

            /* renamed from: b */
            public static final C7823o f20447b = new C7823o();

            private C7823o() {
                super("Email_Sent", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$o0 */
        /* loaded from: classes2.dex */
        public static final class C7824o0 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7824o0 f20448b = new C7824o0();

            private C7824o0() {
                super("ORDR_S5_GET_PRODUCTS", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$o1 */
        /* loaded from: classes2.dex */
        public static final class C7825o1 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7825o1 f20449b = new C7825o1();

            private C7825o1() {
                super("PhoneNumber_Next", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$p */
        /* loaded from: classes2.dex */
        public static final class C7826p extends AbstractC7780f {

            /* renamed from: b */
            public static final C7826p f20450b = new C7826p();

            private C7826p() {
                super("Email_Sent_Back", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$p0 */
        /* loaded from: classes2.dex */
        public static final class C7827p0 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7827p0 f20451b = new C7827p0();

            private C7827p0() {
                super("ORDR_S6_CHECKOUT", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$p1 */
        /* loaded from: classes2.dex */
        public static final class C7828p1 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7828p1 f20452b = new C7828p1();

            private C7828p1() {
                super("Register_Success", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$q */
        /* loaded from: classes2.dex */
        public static final class C7829q extends AbstractC7780f {

            /* renamed from: b */
            public static final C7829q f20453b = new C7829q();

            private C7829q() {
                super("Email_Sent_Resent", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$q0 */
        /* loaded from: classes2.dex */
        public static final class C7830q0 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7830q0 f20454b = new C7830q0();

            private C7830q0() {
                super("ORDR_S7_CHECKOUT_SUCCESS", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$q1 */
        /* loaded from: classes2.dex */
        public static final class C7831q1 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7831q1 f20455b = new C7831q1();

            private C7831q1() {
                super("Register_Success_Next", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$r */
        /* loaded from: classes2.dex */
        public static final class C7832r extends AbstractC7780f {

            /* renamed from: b */
            public static final C7832r f20456b = new C7832r();

            private C7832r() {
                super("Email_Sent_Verified", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$r0 */
        /* loaded from: classes2.dex */
        public static final class C7833r0 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7833r0 f20457b = new C7833r0();

            private C7833r0() {
                super("PIN", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$r1 */
        /* loaded from: classes2.dex */
        public static final class C7834r1 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7834r1 f20458b = new C7834r1();

            private C7834r1() {
                super("SMSCode", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$s */
        /* loaded from: classes2.dex */
        public static final class C7835s extends AbstractC7780f {

            /* renamed from: b */
            public static final C7835s f20459b = new C7835s();

            private C7835s() {
                super("Login", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$s0 */
        /* loaded from: classes2.dex */
        public static final class C7836s0 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7836s0 f20460b = new C7836s0();

            private C7836s0() {
                super("PIN_Back", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$s1 */
        /* loaded from: classes2.dex */
        public static final class C7837s1 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7837s1 f20461b = new C7837s1();

            private C7837s1() {
                super("SMSCode_Back", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$t */
        /* loaded from: classes2.dex */
        public static final class C7838t extends AbstractC7780f {

            /* renamed from: b */
            public static final C7838t f20462b = new C7838t();

            private C7838t() {
                super("LoginRegister_PhoneNumber", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$t0 */
        /* loaded from: classes2.dex */
        public static final class C7839t0 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7839t0 f20463b = new C7839t0();

            private C7839t0() {
                super("PIN_Confirmation", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$t1 */
        /* loaded from: classes2.dex */
        public static final class C7840t1 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7840t1 f20464b = new C7840t1();

            private C7840t1() {
                super("SMSCode_Error", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$u */
        /* loaded from: classes2.dex */
        public static final class C7841u extends AbstractC7780f {

            /* renamed from: b */
            public static final C7841u f20465b = new C7841u();

            private C7841u() {
                super("Login_Anonymous", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$u0 */
        /* loaded from: classes2.dex */
        public static final class C7842u0 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7842u0 f20466b = new C7842u0();

            private C7842u0() {
                super("PIN_Confirmation_Accept_Biometric", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$u1 */
        /* loaded from: classes2.dex */
        public static final class C7843u1 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7843u1 f20467b = new C7843u1();

            private C7843u1() {
                super("SMSCode_Next", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$v */
        /* loaded from: classes2.dex */
        public static final class C7844v extends AbstractC7780f {

            /* renamed from: b */
            public static final C7844v f20468b = new C7844v();

            private C7844v() {
                super("Login_PhoneNumber", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$v0 */
        /* loaded from: classes2.dex */
        public static final class C7845v0 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7845v0 f20469b = new C7845v0();

            private C7845v0() {
                super("PIN_Confirmation_Back", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$v1 */
        /* loaded from: classes2.dex */
        public static final class C7846v1 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7846v1 f20470b = new C7846v1();

            private C7846v1() {
                super("SMSCode_Resend", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$w */
        /* loaded from: classes2.dex */
        public static final class C7847w extends AbstractC7780f {

            /* renamed from: b */
            public static final C7847w f20471b = new C7847w();

            private C7847w() {
                super("NIF", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$w0 */
        /* loaded from: classes2.dex */
        public static final class C7848w0 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7848w0 f20472b = new C7848w0();

            private C7848w0() {
                super("PIN_Confirmation_Error", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$w1 */
        /* loaded from: classes2.dex */
        public static final class C7849w1 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7849w1 f20473b = new C7849w1();

            private C7849w1() {
                super("Surname_Field", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$x */
        /* loaded from: classes2.dex */
        public static final class C7850x extends AbstractC7780f {

            /* renamed from: b */
            public static final C7850x f20474b = new C7850x();

            private C7850x() {
                super("NIF_Back", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$x0 */
        /* loaded from: classes2.dex */
        public static final class C7851x0 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7851x0 f20475b = new C7851x0();

            private C7851x0() {
                super("PIN_Confirmation_Reject_Biometric", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$x1 */
        /* loaded from: classes2.dex */
        public static final class C7852x1 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7852x1 f20476b = new C7852x1();

            private C7852x1() {
                super("TermsPolicy_OMPD", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$y */
        /* loaded from: classes2.dex */
        public static final class C7853y extends AbstractC7780f {

            /* renamed from: b */
            public static final C7853y f20477b = new C7853y();

            private C7853y() {
                super("NIF_Error", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$y0 */
        /* loaded from: classes2.dex */
        public static final class C7854y0 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7854y0 f20478b = new C7854y0();

            private C7854y0() {
                super("PMCard_Selection_OneCard", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$y1 */
        /* loaded from: classes2.dex */
        public static final class C7855y1 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7855y1 f20479b = new C7855y1();

            private C7855y1() {
                super("TermsPolicy_OMPD_Accept", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$z */
        /* loaded from: classes2.dex */
        public static final class C7856z extends AbstractC7780f {

            /* renamed from: b */
            public static final C7856z f20480b = new C7856z();

            private C7856z() {
                super("NIF_Next", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$z0 */
        /* loaded from: classes2.dex */
        public static final class C7857z0 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7857z0 f20481b = new C7857z0();

            private C7857z0() {
                super("PMCard_Selection_OneCard_Add", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$f$z1 */
        /* loaded from: classes2.dex */
        public static final class C7858z1 extends AbstractC7780f {

            /* renamed from: b */
            public static final C7858z1 f20482b = new C7858z1();

            private C7858z1() {
                super("TermsPolicy_OMPD_Cancel", null);
            }
        }

        private AbstractC7780f(String str) {
            super(str, null);
        }

        public /* synthetic */ AbstractC7780f(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    /* compiled from: AnalyticEvents.kt */
    /* renamed from: ng.a$g */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7859g extends AnalyticEvents {

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$g$a */
        /* loaded from: classes2.dex */
        public static final class C7860a extends AbstractC7859g {

            /* renamed from: b */
            public static final C7860a f20483b = new C7860a();

            private C7860a() {
                super("WineClub_Age_Confirm_Accept", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$g$b */
        /* loaded from: classes2.dex */
        public static final class C7861b extends AbstractC7859g {

            /* renamed from: b */
            public static final C7861b f20484b = new C7861b();

            private C7861b() {
                super("WineClub_Age_Confirm_Cancel", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$g$c */
        /* loaded from: classes2.dex */
        public static final class C7862c extends AbstractC7859g {

            /* renamed from: b */
            public static final C7862c f20485b = new C7862c();

            private C7862c() {
                super("WineClub_Arguments_Back", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$g$d */
        /* loaded from: classes2.dex */
        public static final class C7863d extends AbstractC7859g {

            /* renamed from: b */
            public static final C7863d f20486b = new C7863d();

            private C7863d() {
                super("WineClub_Arguments_Subscribe", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$g$e */
        /* loaded from: classes2.dex */
        public static final class C7864e extends AbstractC7859g {

            /* renamed from: b */
            public static final C7864e f20487b = new C7864e();

            private C7864e() {
                super("WineClub_Arguments_Website", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$g$f */
        /* loaded from: classes2.dex */
        public static final class C7865f extends AbstractC7859g {

            /* renamed from: b */
            public static final C7865f f20488b = new C7865f();

            private C7865f() {
                super("WineClub_Date_Birth", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$g$g */
        /* loaded from: classes2.dex */
        public static final class C7866g extends AbstractC7859g {

            /* renamed from: b */
            public static final C7866g f20489b = new C7866g();

            private C7866g() {
                super("WineClub_Date_Birth_Next", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$g$h */
        /* loaded from: classes2.dex */
        public static final class C7867h extends AbstractC7859g {

            /* renamed from: b */
            public static final C7867h f20490b = new C7867h();

            private C7867h() {
                super("WineClub_Date_Birth_Terms_Accept", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$g$i */
        /* loaded from: classes2.dex */
        public static final class C7868i extends AbstractC7859g {

            /* renamed from: b */
            public static final C7868i f20491b = new C7868i();

            private C7868i() {
                super("WineClub_Date_Birth_Terms_Cancel", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$g$j */
        /* loaded from: classes2.dex */
        public static final class C7869j extends AbstractC7859g {

            /* renamed from: b */
            public static final C7869j f20492b = new C7869j();

            private C7869j() {
                super("WineClub_MainPage_Arguments", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$g$k */
        /* loaded from: classes2.dex */
        public static final class C7870k extends AbstractC7859g {

            /* renamed from: b */
            public static final C7870k f20493b = new C7870k();

            private C7870k() {
                super("WineClub_MainPage_Subscribed", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$g$l */
        /* loaded from: classes2.dex */
        public static final class C7871l extends AbstractC7859g {

            /* renamed from: b */
            public static final C7871l f20494b = new C7871l();

            private C7871l() {
                super("WineClub_MainPage_Subscribed_Edit_Region", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$g$m */
        /* loaded from: classes2.dex */
        public static final class C7872m extends AbstractC7859g {

            /* renamed from: b */
            public static final C7872m f20495b = new C7872m();

            private C7872m() {
                super("WineClub_MainPage_Subscribed_Edit_Type", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$g$n */
        /* loaded from: classes2.dex */
        public static final class C7873n extends AbstractC7859g {

            /* renamed from: b */
            public static final C7873n f20496b = new C7873n();

            private C7873n() {
                super("WineClub_MainPage_Subscribed_Visit_Website", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$g$o */
        /* loaded from: classes2.dex */
        public static final class C7874o extends AbstractC7859g {

            /* renamed from: b */
            public static final C7874o f20497b = new C7874o();

            private C7874o() {
                super("WineClub_Region", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$g$p */
        /* loaded from: classes2.dex */
        public static final class C7875p extends AbstractC7859g {

            /* renamed from: b */
            public static final C7875p f20498b = new C7875p();

            private C7875p() {
                super("WineClub_Region_Back", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$g$q */
        /* loaded from: classes2.dex */
        public static final class C7876q extends AbstractC7859g {

            /* renamed from: b */
            public static final C7876q f20499b = new C7876q();

            private C7876q() {
                super("WineClub_Region_Next", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$g$r */
        /* loaded from: classes2.dex */
        public static final class C7877r extends AbstractC7859g {

            /* renamed from: b */
            public static final C7877r f20500b = new C7877r();

            private C7877r() {
                super("WineClub_Region_Skip", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$g$s */
        /* loaded from: classes2.dex */
        public static final class C7878s extends AbstractC7859g {

            /* renamed from: b */
            public static final C7878s f20501b = new C7878s();

            private C7878s() {
                super("WineClub_Subscription_Success", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$g$t */
        /* loaded from: classes2.dex */
        public static final class C7879t extends AbstractC7859g {

            /* renamed from: b */
            public static final C7879t f20502b = new C7879t();

            private C7879t() {
                super("WineClub_Subscription_Success_Home", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$g$u */
        /* loaded from: classes2.dex */
        public static final class C7880u extends AbstractC7859g {

            /* renamed from: b */
            public static final C7880u f20503b = new C7880u();

            private C7880u() {
                super("WineClub_Type", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$g$v */
        /* loaded from: classes2.dex */
        public static final class C7881v extends AbstractC7859g {

            /* renamed from: b */
            public static final C7881v f20504b = new C7881v();

            private C7881v() {
                super("WineClub_Type_Back", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$g$w */
        /* loaded from: classes2.dex */
        public static final class C7882w extends AbstractC7859g {

            /* renamed from: b */
            public static final C7882w f20505b = new C7882w();

            private C7882w() {
                super("WineClub_Type_Next", null);
            }
        }

        /* compiled from: AnalyticEvents.kt */
        /* renamed from: ng.a$g$x */
        /* loaded from: classes2.dex */
        public static final class C7883x extends AbstractC7859g {

            /* renamed from: b */
            public static final C7883x f20506b = new C7883x();

            private C7883x() {
                super("WineClub_Type_Skip", null);
            }
        }

        private AbstractC7859g(String str) {
            super(str, null);
        }

        public /* synthetic */ AbstractC7859g(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    private AnalyticEvents(String str) {
        this.f20333a = str;
    }

    public /* synthetic */ AnalyticEvents(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* renamed from: a */
    public final String m17640a() {
        return this.f20333a;
    }
}
