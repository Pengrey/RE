package p311q9;

import android.util.Base64;
import android.util.JsonReader;
import ca.C2102d;
import com.google.firebase.encoders.InterfaceC4246a;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import p294p9.AbstractC8472a0;
import p294p9.C8450a;
import p294p9.C8516b0;

/* renamed from: q9.g */
/* loaded from: classes.dex */
public class C9705g {

    /* renamed from: a */
    private static final InterfaceC4246a f25562a = new C2102d().m34681j(C8450a.f21851a).m34680k(true).m34682i();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CrashlyticsReportJsonTransform.java */
    /* renamed from: q9.g$a */
    /* loaded from: classes.dex */
    public interface InterfaceC9706a<T> {
        /* renamed from: a */
        T mo10155a(JsonReader jsonReader) throws IOException;
    }

    /* renamed from: A */
    private static AbstractC8472a0 m10186A(JsonReader jsonReader) throws IOException {
        AbstractC8472a0.AbstractC8475b m15364b = AbstractC8472a0.m15364b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c = 1;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 2;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m15364b.mo15321f(m10157y(jsonReader));
                    break;
                case 1:
                    m15364b.mo15319h(jsonReader.nextString());
                    break;
                case 2:
                    m15364b.mo15325b(jsonReader.nextString());
                    break;
                case 3:
                    m15364b.mo15323d(jsonReader.nextString());
                    break;
                case 4:
                    m15364b.mo15322e(jsonReader.nextString());
                    break;
                case 5:
                    m15364b.mo15320g(jsonReader.nextInt());
                    break;
                case 6:
                    m15364b.mo15324c(jsonReader.nextString());
                    break;
                case 7:
                    m15364b.mo15318i(m10185B(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m15364b.mo15326a();
    }

    /* renamed from: B */
    private static AbstractC8472a0.AbstractC8482e m10185B(JsonReader jsonReader) throws IOException {
        AbstractC8472a0.AbstractC8482e.AbstractC8486b m15356a = AbstractC8472a0.AbstractC8482e.m15356a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2128794476:
                    if (nextName.equals("startedAt")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1606742899:
                    if (nextName.equals("endedAt")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1291329255:
                    if (nextName.equals("events")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c = 5;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3599307:
                    if (nextName.equals("user")) {
                        c = 7;
                        break;
                    }
                    break;
                case 286956243:
                    if (nextName.equals("generator")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 1025385094:
                    if (nextName.equals("crashed")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 2047016109:
                    if (nextName.equals("generatorType")) {
                        c = '\n';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m15356a.mo15257l(jsonReader.nextLong());
                    break;
                case 1:
                    m15356a.m15351j(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 2:
                    m15356a.mo15263e(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 3:
                    m15356a.mo15264d(m10169m(jsonReader));
                    break;
                case 4:
                    m15356a.mo15262f(m10171k(jsonReader, C9699a.f25556a));
                    break;
                case 5:
                    m15356a.mo15258k(m10156z(jsonReader));
                    break;
                case 6:
                    m15356a.mo15266b(m10173i(jsonReader));
                    break;
                case 7:
                    m15356a.mo15256m(m10184C(jsonReader));
                    break;
                case '\b':
                    m15356a.mo15261g(jsonReader.nextString());
                    break;
                case '\t':
                    m15356a.mo15265c(jsonReader.nextBoolean());
                    break;
                case '\n':
                    m15356a.mo15260h(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m15356a.mo15267a();
    }

    /* renamed from: C */
    private static AbstractC8472a0.AbstractC8482e.AbstractC8511f m10184C(JsonReader jsonReader) throws IOException {
        AbstractC8472a0.AbstractC8482e.AbstractC8511f.AbstractC8512a m15336a = AbstractC8472a0.AbstractC8482e.AbstractC8511f.m15336a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("identifier")) {
                jsonReader.skipValue();
            } else {
                m15336a.mo15114b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return m15336a.mo15115a();
    }

    /* renamed from: i */
    private static AbstractC8472a0.AbstractC8482e.AbstractC8483a m10173i(JsonReader jsonReader) throws IOException {
        AbstractC8472a0.AbstractC8482e.AbstractC8483a.AbstractC8484a m15352a = AbstractC8472a0.AbstractC8482e.AbstractC8483a.m15352a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 0;
                        break;
                    }
                    break;
                case -519438642:
                    if (nextName.equals("developmentPlatform")) {
                        c = 1;
                        break;
                    }
                    break;
                case 213652010:
                    if (nextName.equals("developmentPlatformVersion")) {
                        c = 2;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m15352a.mo15244e(jsonReader.nextString());
                    break;
                case 1:
                    m15352a.mo15247b(jsonReader.nextString());
                    break;
                case 2:
                    m15352a.mo15246c(jsonReader.nextString());
                    break;
                case 3:
                    m15352a.mo15242g(jsonReader.nextString());
                    break;
                case 4:
                    m15352a.mo15243f(jsonReader.nextString());
                    break;
                case 5:
                    m15352a.mo15245d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m15352a.mo15248a();
    }

    /* renamed from: j */
    private static AbstractC8472a0.AbstractC8473a m10172j(JsonReader jsonReader) throws IOException {
        AbstractC8472a0.AbstractC8473a.AbstractC8474a m15360a = AbstractC8472a0.AbstractC8473a.m15360a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals("pid")) {
                        c = 0;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c = 1;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c = 2;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 3;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c = 4;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c = 5;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c = 6;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m15360a.mo15305c(jsonReader.nextInt());
                    break;
                case 1:
                    m15360a.mo15303e(jsonReader.nextLong());
                    break;
                case 2:
                    m15360a.mo15301g(jsonReader.nextLong());
                    break;
                case 3:
                    m15360a.mo15300h(jsonReader.nextLong());
                    break;
                case 4:
                    m15360a.mo15304d(jsonReader.nextString());
                    break;
                case 5:
                    m15360a.mo15302f(jsonReader.nextInt());
                    break;
                case 6:
                    m15360a.mo15299i(jsonReader.nextString());
                    break;
                case 7:
                    m15360a.mo15306b(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m15360a.mo15307a();
    }

    /* renamed from: k */
    private static <T> C8516b0<T> m10171k(JsonReader jsonReader, InterfaceC9706a<T> interfaceC9706a) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(interfaceC9706a.mo10155a(jsonReader));
        }
        jsonReader.endArray();
        return C8516b0.m15317b(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static AbstractC8472a0.AbstractC8476c m10170l(JsonReader jsonReader) throws IOException {
        AbstractC8472a0.AbstractC8476c.AbstractC8477a m15359a = AbstractC8472a0.AbstractC8476c.m15359a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("key")) {
                m15359a.mo15291b(jsonReader.nextString());
            } else if (!nextName.equals("value")) {
                jsonReader.skipValue();
            } else {
                m15359a.mo15290c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return m15359a.mo15292a();
    }

    /* renamed from: m */
    private static AbstractC8472a0.AbstractC8482e.AbstractC8487c m10169m(JsonReader jsonReader) throws IOException {
        AbstractC8472a0.AbstractC8482e.AbstractC8487c.AbstractC8488a m15350a = AbstractC8472a0.AbstractC8482e.AbstractC8487c.m15350a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1981332476:
                    if (nextName.equals("simulator")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1969347631:
                    if (nextName.equals("manufacturer")) {
                        c = 1;
                        break;
                    }
                    break;
                case 112670:
                    if (nextName.equals("ram")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c = 3;
                        break;
                    }
                    break;
                case 81784169:
                    if (nextName.equals("diskSpace")) {
                        c = 4;
                        break;
                    }
                    break;
                case 94848180:
                    if (nextName.equals("cores")) {
                        c = 5;
                        break;
                    }
                    break;
                case 104069929:
                    if (nextName.equals("model")) {
                        c = 6;
                        break;
                    }
                    break;
                case 109757585:
                    if (nextName.equals("state")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2078953423:
                    if (nextName.equals("modelClass")) {
                        c = '\b';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m15350a.mo15223i(jsonReader.nextBoolean());
                    break;
                case 1:
                    m15350a.mo15227e(jsonReader.nextString());
                    break;
                case 2:
                    m15350a.mo15224h(jsonReader.nextLong());
                    break;
                case 3:
                    m15350a.mo15230b(jsonReader.nextInt());
                    break;
                case 4:
                    m15350a.mo15228d(jsonReader.nextLong());
                    break;
                case 5:
                    m15350a.mo15229c(jsonReader.nextInt());
                    break;
                case 6:
                    m15350a.mo15226f(jsonReader.nextString());
                    break;
                case 7:
                    m15350a.mo15222j(jsonReader.nextInt());
                    break;
                case '\b':
                    m15350a.mo15225g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m15350a.mo15231a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static AbstractC8472a0.AbstractC8482e.AbstractC8489d m10168n(JsonReader jsonReader) throws IOException {
        AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8504b m15349a = AbstractC8472a0.AbstractC8482e.AbstractC8489d.m15349a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 0;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 1;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m15349a.mo15213c(m10165q(jsonReader));
                    break;
                case 1:
                    m15349a.mo15214b(m10167o(jsonReader));
                    break;
                case 2:
                    m15349a.mo15212d(m10161u(jsonReader));
                    break;
                case 3:
                    m15349a.mo15210f(jsonReader.nextString());
                    break;
                case 4:
                    m15349a.mo15211e(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m15349a.mo15215a();
    }

    /* renamed from: o */
    private static AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a m10167o(JsonReader jsonReader) throws IOException {
        AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8491a m15348a = AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.m15348a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1332194002:
                    if (nextName.equals("background")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1090974952:
                    if (nextName.equals("execution")) {
                        c = 1;
                        break;
                    }
                    break;
                case -80231855:
                    if (nextName.equals("internalKeys")) {
                        c = 2;
                        break;
                    }
                    break;
                case 555169704:
                    if (nextName.equals("customAttributes")) {
                        c = 3;
                        break;
                    }
                    break;
                case 928737948:
                    if (nextName.equals("uiOrientation")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m15348a.mo15202b(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case 1:
                    m15348a.mo15200d(m10164r(jsonReader));
                    break;
                case 2:
                    m15348a.mo15199e(m10171k(jsonReader, C9704f.f25561a));
                    break;
                case 3:
                    m15348a.mo15201c(m10171k(jsonReader, C9704f.f25561a));
                    break;
                case 4:
                    m15348a.mo15198f(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m15348a.mo15203a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a m10166p(JsonReader jsonReader) throws IOException {
        AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a.AbstractC8494a m15346a = AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a.m15346a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m15346a.mo15180c(jsonReader.nextString());
                    break;
                case 1:
                    m15346a.mo15179d(jsonReader.nextLong());
                    break;
                case 2:
                    m15346a.m15344f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    m15346a.mo15181b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m15346a.mo15182a();
    }

    /* renamed from: q */
    private static AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c m10165q(JsonReader jsonReader) throws IOException {
        AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c.AbstractC8506a m15339a = AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c.m15339a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1708606089:
                    if (nextName.equals("batteryLevel")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1455558134:
                    if (nextName.equals("batteryVelocity")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1439500848:
                    if (nextName.equals("orientation")) {
                        c = 2;
                        break;
                    }
                    break;
                case 279795450:
                    if (nextName.equals("diskUsed")) {
                        c = 3;
                        break;
                    }
                    break;
                case 976541947:
                    if (nextName.equals("ramUsed")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1516795582:
                    if (nextName.equals("proximityOn")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m15339a.mo15134b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case 1:
                    m15339a.mo15133c(jsonReader.nextInt());
                    break;
                case 2:
                    m15339a.mo15131e(jsonReader.nextInt());
                    break;
                case 3:
                    m15339a.mo15132d(jsonReader.nextLong());
                    break;
                case 4:
                    m15339a.mo15129g(jsonReader.nextLong());
                    break;
                case 5:
                    m15339a.mo15130f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m15339a.mo15135a();
    }

    /* renamed from: r */
    private static AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b m10164r(JsonReader jsonReader) throws IOException {
        AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8495b m15347a = AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.m15347a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1337936983:
                    if (nextName.equals("threads")) {
                        c = 1;
                        break;
                    }
                    break;
                case -902467928:
                    if (nextName.equals("signal")) {
                        c = 2;
                        break;
                    }
                    break;
                case 937615455:
                    if (nextName.equals("binaries")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1481625679:
                    if (nextName.equals("exception")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m15347a.mo15191b(m10172j(jsonReader));
                    break;
                case 1:
                    m15347a.mo15187f(m10171k(jsonReader, C9701c.f25558a));
                    break;
                case 2:
                    m15347a.mo15188e(m10160v(jsonReader));
                    break;
                case 3:
                    m15347a.mo15190c(m10171k(jsonReader, C9703e.f25560a));
                    break;
                case 4:
                    m15347a.mo15189d(m10163s(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m15347a.mo15192a();
    }

    /* renamed from: s */
    private static AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c m10163s(JsonReader jsonReader) throws IOException {
        AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c.AbstractC8497a m15343a = AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c.m15343a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m15343a.mo15170c(m10171k(jsonReader, C9700b.f25557a));
                    break;
                case 1:
                    m15343a.mo15168e(jsonReader.nextString());
                    break;
                case 2:
                    m15343a.mo15167f(jsonReader.nextString());
                    break;
                case 3:
                    m15343a.mo15171b(m10163s(jsonReader));
                    break;
                case 4:
                    m15343a.mo15169d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m15343a.mo15172a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b m10162t(JsonReader jsonReader) throws IOException {
        AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b.AbstractC8503a m15340a = AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b.m15340a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m15340a.mo15144d(jsonReader.nextLong());
                    break;
                case 1:
                    m15340a.mo15142f(jsonReader.nextString());
                    break;
                case 2:
                    m15340a.mo15143e(jsonReader.nextLong());
                    break;
                case 3:
                    m15340a.mo15146b(jsonReader.nextString());
                    break;
                case 4:
                    m15340a.mo15145c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m15340a.mo15147a();
    }

    /* renamed from: u */
    private static AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8507d m10161u(JsonReader jsonReader) throws IOException {
        AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8507d.AbstractC8508a m15338a = AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8507d.m15338a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("content")) {
                jsonReader.skipValue();
            } else {
                m15338a.mo15126b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return m15338a.mo15127a();
    }

    /* renamed from: v */
    private static AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8498d m10160v(JsonReader jsonReader) throws IOException {
        AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8498d.AbstractC8499a m15342a = AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8498d.m15342a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1147692044:
                    if (nextName.equals("address")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3059181:
                    if (nextName.equals("code")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m15342a.mo15162b(jsonReader.nextLong());
                    break;
                case 1:
                    m15342a.mo15161c(jsonReader.nextString());
                    break;
                case 2:
                    m15342a.mo15160d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m15342a.mo15163a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e m10159w(JsonReader jsonReader) throws IOException {
        AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8501a m15341a = AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.m15341a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m15341a.mo15155b(m10171k(jsonReader, C9700b.f25557a));
                    break;
                case 1:
                    m15341a.mo15153d(jsonReader.nextString());
                    break;
                case 2:
                    m15341a.mo15154c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m15341a.mo15156a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static AbstractC8472a0.AbstractC8478d.AbstractC8480b m10158x(JsonReader jsonReader) throws IOException {
        AbstractC8472a0.AbstractC8478d.AbstractC8480b.AbstractC8481a m15357a = AbstractC8472a0.AbstractC8478d.AbstractC8480b.m15357a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("filename")) {
                m15357a.mo15280c(jsonReader.nextString());
            } else if (!nextName.equals("contents")) {
                jsonReader.skipValue();
            } else {
                m15357a.mo15281b(Base64.decode(jsonReader.nextString(), 2));
            }
        }
        jsonReader.endObject();
        return m15357a.mo15282a();
    }

    /* renamed from: y */
    private static AbstractC8472a0.AbstractC8478d m10157y(JsonReader jsonReader) throws IOException {
        AbstractC8472a0.AbstractC8478d.AbstractC8479a m15358a = AbstractC8472a0.AbstractC8478d.m15358a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("files")) {
                m15358a.mo15286b(m10171k(jsonReader, C9702d.f25559a));
            } else if (!nextName.equals("orgId")) {
                jsonReader.skipValue();
            } else {
                m15358a.mo15285c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return m15358a.mo15287a();
    }

    /* renamed from: z */
    private static AbstractC8472a0.AbstractC8482e.AbstractC8509e m10156z(JsonReader jsonReader) throws IOException {
        AbstractC8472a0.AbstractC8482e.AbstractC8509e.AbstractC8510a m15337a = AbstractC8472a0.AbstractC8482e.AbstractC8509e.m15337a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 0;
                        break;
                    }
                    break;
                case -293026577:
                    if (nextName.equals("jailbroken")) {
                        c = 1;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m15337a.mo15120b(jsonReader.nextString());
                    break;
                case 1:
                    m15337a.mo15119c(jsonReader.nextBoolean());
                    break;
                case 2:
                    m15337a.mo15117e(jsonReader.nextString());
                    break;
                case 3:
                    m15337a.mo15118d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m15337a.mo15121a();
    }

    /* renamed from: D */
    public AbstractC8472a0 m10183D(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            AbstractC8472a0 m10186A = m10186A(jsonReader);
            jsonReader.close();
            return m10186A;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: E */
    public String m10182E(AbstractC8472a0 abstractC8472a0) {
        return f25562a.mo28186a(abstractC8472a0);
    }

    /* renamed from: g */
    public AbstractC8472a0.AbstractC8482e.AbstractC8489d m10175g(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            AbstractC8472a0.AbstractC8482e.AbstractC8489d m10168n = m10168n(jsonReader);
            jsonReader.close();
            return m10168n;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: h */
    public String m10174h(AbstractC8472a0.AbstractC8482e.AbstractC8489d abstractC8489d) {
        return f25562a.mo28186a(abstractC8489d);
    }
}
