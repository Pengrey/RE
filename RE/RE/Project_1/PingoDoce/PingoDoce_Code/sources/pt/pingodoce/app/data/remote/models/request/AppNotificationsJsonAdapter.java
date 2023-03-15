package pt.pingodoce.app.data.remote.models.request;

import com.squareup.moshi.AbstractC4470f;
import com.squareup.moshi.AbstractC4476h;
import com.squareup.moshi.AbstractC4483m;
import com.squareup.moshi.C4496p;
import com.squareup.moshi.JsonDataException;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Set;
import p181jd.Intrinsics;
import p313qc.C9712b;
import p489zc.C13778q0;

/* compiled from: AppNotificationsJsonAdapter.kt */
/* loaded from: classes2.dex */
public final class AppNotificationsJsonAdapter extends AbstractC4470f {

    /* renamed from: a */
    private final AbstractC4476h.C4477a f22825a;

    /* renamed from: b */
    private final AbstractC4470f f22826b;

    public AppNotificationsJsonAdapter(C4496p c4496p) {
        Set<? extends Annotation> m208b;
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        AbstractC4476h.C4477a m27461a = AbstractC4476h.C4477a.m27461a("personalized", "pubOnline", "flyers", "clubs", "shoppingList", "takeaway", "sms", "email");
        Intrinsics.checkIfNull(m27461a, "of(\"personalized\", \"pubO…akeaway\", \"sms\", \"email\")");
        this.f22825a = m27461a;
        Class cls = Boolean.TYPE;
        m208b = C13778q0.m208b();
        AbstractC4470f m27366f = c4496p.m27366f(cls, m208b, "personalized");
        Intrinsics.checkIfNull(m27366f, "moshi.adapter(Boolean::c…(),\n      \"personalized\")");
        this.f22826b = m27366f;
    }

    /* renamed from: k */
    public AppNotifications mo10144b(AbstractC4476h abstractC4476h) {
        Intrinsics.isThisObjectNull(abstractC4476h, "reader");
        abstractC4476h.mo27437c();
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        Boolean bool8 = null;
        while (true) {
            Boolean bool9 = bool8;
            Boolean bool10 = bool7;
            Boolean bool11 = bool6;
            Boolean bool12 = bool5;
            Boolean bool13 = bool4;
            if (abstractC4476h.mo27427y()) {
                switch (abstractC4476h.mo27436d0(this.f22825a)) {
                    case -1:
                        abstractC4476h.mo27432l0();
                        abstractC4476h.mo27431o0();
                        bool8 = bool9;
                        bool7 = bool10;
                        bool6 = bool11;
                        bool5 = bool12;
                        break;
                    case 0:
                        bool = (Boolean) this.f22826b.mo10144b(abstractC4476h);
                        if (bool == null) {
                            JsonDataException m10121v = C9712b.m10121v("personalized", "personalized", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v, "unexpectedNull(\"personal…, \"personalized\", reader)");
                            throw m10121v;
                        }
                        bool8 = bool9;
                        bool7 = bool10;
                        bool6 = bool11;
                        bool5 = bool12;
                        break;
                    case 1:
                        bool2 = (Boolean) this.f22826b.mo10144b(abstractC4476h);
                        if (bool2 == null) {
                            JsonDataException m10121v2 = C9712b.m10121v("onlinePublicity", "pubOnline", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v2, "unexpectedNull(\"onlinePu…ty\", \"pubOnline\", reader)");
                            throw m10121v2;
                        }
                        bool8 = bool9;
                        bool7 = bool10;
                        bool6 = bool11;
                        bool5 = bool12;
                        break;
                    case 2:
                        bool3 = (Boolean) this.f22826b.mo10144b(abstractC4476h);
                        if (bool3 == null) {
                            JsonDataException m10121v3 = C9712b.m10121v("flyers", "flyers", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v3, "unexpectedNull(\"flyers\",…        \"flyers\", reader)");
                            throw m10121v3;
                        }
                        bool8 = bool9;
                        bool7 = bool10;
                        bool6 = bool11;
                        bool5 = bool12;
                        break;
                    case 3:
                        bool4 = (Boolean) this.f22826b.mo10144b(abstractC4476h);
                        if (bool4 == null) {
                            JsonDataException m10121v4 = C9712b.m10121v("clubs", "clubs", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v4, "unexpectedNull(\"clubs\", …ubs\",\n            reader)");
                            throw m10121v4;
                        }
                        bool8 = bool9;
                        bool7 = bool10;
                        bool6 = bool11;
                        bool5 = bool12;
                        continue;
                    case 4:
                        bool5 = (Boolean) this.f22826b.mo10144b(abstractC4476h);
                        if (bool5 == null) {
                            JsonDataException m10121v5 = C9712b.m10121v("shoppingList", "shoppingList", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v5, "unexpectedNull(\"shopping…, \"shoppingList\", reader)");
                            throw m10121v5;
                        }
                        bool8 = bool9;
                        bool7 = bool10;
                        bool6 = bool11;
                        break;
                    case 5:
                        bool6 = (Boolean) this.f22826b.mo10144b(abstractC4476h);
                        if (bool6 == null) {
                            JsonDataException m10121v6 = C9712b.m10121v("orders", "takeaway", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v6, "unexpectedNull(\"orders\",…      \"takeaway\", reader)");
                            throw m10121v6;
                        }
                        bool8 = bool9;
                        bool7 = bool10;
                        bool5 = bool12;
                        break;
                    case 6:
                        bool7 = (Boolean) this.f22826b.mo10144b(abstractC4476h);
                        if (bool7 == null) {
                            JsonDataException m10121v7 = C9712b.m10121v("sms", "sms", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v7, "unexpectedNull(\"sms\", \"sms\",\n            reader)");
                            throw m10121v7;
                        }
                        bool8 = bool9;
                        bool6 = bool11;
                        bool5 = bool12;
                        break;
                    case 7:
                        bool8 = (Boolean) this.f22826b.mo10144b(abstractC4476h);
                        if (bool8 == null) {
                            JsonDataException m10121v8 = C9712b.m10121v("email", "email", abstractC4476h);
                            Intrinsics.checkIfNull(m10121v8, "unexpectedNull(\"email\", …ail\",\n            reader)");
                            throw m10121v8;
                        }
                        bool7 = bool10;
                        bool6 = bool11;
                        bool5 = bool12;
                        break;
                    default:
                        bool8 = bool9;
                        bool7 = bool10;
                        bool6 = bool11;
                        bool5 = bool12;
                        break;
                }
                bool4 = bool13;
            } else {
                abstractC4476h.mo27433h();
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    if (bool2 != null) {
                        boolean booleanValue2 = bool2.booleanValue();
                        if (bool3 != null) {
                            boolean booleanValue3 = bool3.booleanValue();
                            if (bool13 != null) {
                                boolean booleanValue4 = bool13.booleanValue();
                                if (bool12 != null) {
                                    boolean booleanValue5 = bool12.booleanValue();
                                    if (bool11 != null) {
                                        boolean booleanValue6 = bool11.booleanValue();
                                        if (bool10 != null) {
                                            boolean booleanValue7 = bool10.booleanValue();
                                            if (bool9 != null) {
                                                return new AppNotifications(booleanValue, booleanValue2, booleanValue3, booleanValue4, booleanValue5, booleanValue6, booleanValue7, bool9.booleanValue());
                                            }
                                            JsonDataException m10129n = C9712b.m10129n("email", "email", abstractC4476h);
                                            Intrinsics.checkIfNull(m10129n, "missingProperty(\"email\", \"email\", reader)");
                                            throw m10129n;
                                        }
                                        JsonDataException m10129n2 = C9712b.m10129n("sms", "sms", abstractC4476h);
                                        Intrinsics.checkIfNull(m10129n2, "missingProperty(\"sms\", \"sms\", reader)");
                                        throw m10129n2;
                                    }
                                    JsonDataException m10129n3 = C9712b.m10129n("orders", "takeaway", abstractC4476h);
                                    Intrinsics.checkIfNull(m10129n3, "missingProperty(\"orders\", \"takeaway\", reader)");
                                    throw m10129n3;
                                }
                                JsonDataException m10129n4 = C9712b.m10129n("shoppingList", "shoppingList", abstractC4476h);
                                Intrinsics.checkIfNull(m10129n4, "missingProperty(\"shoppin…ist\",\n            reader)");
                                throw m10129n4;
                            }
                            JsonDataException m10129n5 = C9712b.m10129n("clubs", "clubs", abstractC4476h);
                            Intrinsics.checkIfNull(m10129n5, "missingProperty(\"clubs\", \"clubs\", reader)");
                            throw m10129n5;
                        }
                        JsonDataException m10129n6 = C9712b.m10129n("flyers", "flyers", abstractC4476h);
                        Intrinsics.checkIfNull(m10129n6, "missingProperty(\"flyers\", \"flyers\", reader)");
                        throw m10129n6;
                    }
                    JsonDataException m10129n7 = C9712b.m10129n("onlinePublicity", "pubOnline", abstractC4476h);
                    Intrinsics.checkIfNull(m10129n7, "missingProperty(\"onlineP…     \"pubOnline\", reader)");
                    throw m10129n7;
                }
                JsonDataException m10129n8 = C9712b.m10129n("personalized", "personalized", abstractC4476h);
                Intrinsics.checkIfNull(m10129n8, "missingProperty(\"persona…zed\",\n            reader)");
                throw m10129n8;
            }
        }
    }

    /* renamed from: l */
    public void mo10143i(AbstractC4483m abstractC4483m, AppNotifications appNotifications) {
        Intrinsics.isThisObjectNull(abstractC4483m, "writer");
        Objects.requireNonNull(appNotifications, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        abstractC4483m.mo27406c();
        abstractC4483m.mo27417F("personalized");
        this.f22826b.mo10143i(abstractC4483m, Boolean.valueOf(appNotifications.m14215f()));
        abstractC4483m.mo27417F("pubOnline");
        this.f22826b.mo10143i(abstractC4483m, Boolean.valueOf(appNotifications.m14217d()));
        abstractC4483m.mo27417F("flyers");
        this.f22826b.mo10143i(abstractC4483m, Boolean.valueOf(appNotifications.m14218c()));
        abstractC4483m.mo27417F("clubs");
        this.f22826b.mo10143i(abstractC4483m, Boolean.valueOf(appNotifications.m14220a()));
        abstractC4483m.mo27417F("shoppingList");
        this.f22826b.mo10143i(abstractC4483m, Boolean.valueOf(appNotifications.m14214h()));
        abstractC4483m.mo27417F("takeaway");
        this.f22826b.mo10143i(abstractC4483m, Boolean.valueOf(appNotifications.m14216e()));
        abstractC4483m.mo27417F("sms");
        this.f22826b.mo10143i(abstractC4483m, Boolean.valueOf(appNotifications.m14213i()));
        abstractC4483m.mo27417F("email");
        this.f22826b.mo10143i(abstractC4483m, Boolean.valueOf(appNotifications.m14219b()));
        abstractC4483m.mo27399t();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("AppNotifications");
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
