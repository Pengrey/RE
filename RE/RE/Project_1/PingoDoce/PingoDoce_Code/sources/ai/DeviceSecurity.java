package ai;

import android.content.DialogInterface;
import androidx.appcompat.app.ActivityC0325c;
import androidx.appcompat.app.DialogC0323b;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import nc.C7696b;
import p181jd.Intrinsics;

/* renamed from: ai.m */
/* loaded from: classes2.dex */
public final class DeviceSecurity implements InterfaceC0161n {

    /* renamed from: a */
    private final ActivityC0325c f341a;

    /* renamed from: b */
    private final InterfaceC6097a f342b;

    /* renamed from: c */
    private final C7696b f343c;

    /* renamed from: d */
    private final boolean f344d;

    public DeviceSecurity(ActivityC0325c activityC0325c, InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(activityC0325c, "activity");
        this.f341a = activityC0325c;
        this.f342b = interfaceC6097a;
        C7696b c7696b = new C7696b(activityC0325c);
        this.f343c = c7696b;
        c7696b.m17679r(false);
    }

    /* renamed from: c */
    public static /* synthetic */ void m41745c(DeviceSecurity deviceSecurity, DialogInterface dialogInterface, int i) {
        m41742f(deviceSecurity, dialogInterface, i);
    }

    /* renamed from: d */
    public static /* synthetic */ void m41744d(DeviceSecurity deviceSecurity, DialogInterface dialogInterface, int i) {
        m41743e(deviceSecurity, dialogInterface, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m41743e(DeviceSecurity deviceSecurity, DialogInterface dialogInterface, int i) {
        Intrinsics.isThisObjectNull(deviceSecurity, "this$0");
        InterfaceC6097a interfaceC6097a = deviceSecurity.f342b;
        if (interfaceC6097a != null) {
            interfaceC6097a.mo42214q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m41742f(DeviceSecurity deviceSecurity, DialogInterface dialogInterface, int i) {
        Intrinsics.isThisObjectNull(deviceSecurity, "this$0");
        InterfaceC6097a interfaceC6097a = deviceSecurity.f342b;
        if (interfaceC6097a != null) {
            interfaceC6097a.mo42214q();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
        if (r2 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
        if (r0 == false) goto L33;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m41740h() {
        /*
            r10 = this;
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "FINGERPRINT"
            p181jd.Intrinsics.checkIfNull(r0, r1)
            java.lang.String r2 = "google/sdk_gphone_"
            r3 = 0
            r4 = 2
            r5 = 0
            boolean r2 = sd.C10163k.m9008C(r0, r2, r3, r4, r5)
            java.lang.String r6 = "PRODUCT"
            java.lang.String r7 = "MODEL"
            if (r2 == 0) goto L4d
            p181jd.Intrinsics.checkIfNull(r0, r1)
            java.lang.String r2 = ":user/release-keys"
            boolean r2 = sd.C10163k.m8975p(r0, r2, r3, r4, r5)
            if (r2 == 0) goto L4d
            java.lang.String r2 = android.os.Build.MANUFACTURER
            java.lang.String r8 = "Google"
            boolean r2 = p181jd.Intrinsics.equals(r2, r8)
            if (r2 == 0) goto L4d
            java.lang.String r2 = android.os.Build.PRODUCT
            p181jd.Intrinsics.checkIfNull(r2, r6)
            java.lang.String r8 = "sdk_gphone_"
            boolean r2 = sd.C10163k.m9008C(r2, r8, r3, r4, r5)
            if (r2 == 0) goto L4d
            java.lang.String r2 = android.os.Build.BRAND
            java.lang.String r9 = "google"
            boolean r2 = p181jd.Intrinsics.equals(r2, r9)
            if (r2 == 0) goto L4d
            java.lang.String r2 = android.os.Build.MODEL
            p181jd.Intrinsics.checkIfNull(r2, r7)
            boolean r2 = sd.C10163k.m9008C(r2, r8, r3, r4, r5)
            if (r2 != 0) goto Lcd
        L4d:
            p181jd.Intrinsics.checkIfNull(r0, r1)
            java.lang.String r2 = "generic"
            boolean r8 = sd.C10163k.m9008C(r0, r2, r3, r4, r5)
            if (r8 != 0) goto Lcd
            p181jd.Intrinsics.checkIfNull(r0, r1)
            java.lang.String r1 = "unknown"
            boolean r0 = sd.C10163k.m9008C(r0, r1, r3, r4, r5)
            if (r0 != 0) goto Lcd
            java.lang.String r0 = android.os.Build.MODEL
            p181jd.Intrinsics.checkIfNull(r0, r7)
            java.lang.String r1 = "google_sdk"
            boolean r8 = sd.C10163k.m9002H(r0, r1, r3, r4, r5)
            if (r8 != 0) goto Lcd
            p181jd.Intrinsics.checkIfNull(r0, r7)
            java.lang.String r8 = "Emulator"
            boolean r8 = sd.C10163k.m9002H(r0, r8, r3, r4, r5)
            if (r8 != 0) goto Lcd
            p181jd.Intrinsics.checkIfNull(r0, r7)
            java.lang.String r7 = "Android SDK built for x86"
            boolean r0 = sd.C10163k.m9002H(r0, r7, r3, r4, r5)
            if (r0 != 0) goto Lcd
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r7 = "MANUFACTURER"
            p181jd.Intrinsics.checkIfNull(r0, r7)
            java.lang.String r8 = "VMware"
            boolean r8 = sd.C10163k.m9002H(r0, r8, r3, r4, r5)
            if (r8 != 0) goto Lcd
            p181jd.Intrinsics.checkIfNull(r0, r7)
            java.lang.String r7 = "Genymotion"
            boolean r0 = sd.C10163k.m9002H(r0, r7, r3, r4, r5)
            if (r0 != 0) goto Lcd
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r7 = "BRAND"
            p181jd.Intrinsics.checkIfNull(r0, r7)
            boolean r0 = sd.C10163k.m9008C(r0, r2, r3, r4, r5)
            if (r0 == 0) goto Lba
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r7 = "DEVICE"
            p181jd.Intrinsics.checkIfNull(r0, r7)
            boolean r0 = sd.C10163k.m9008C(r0, r2, r3, r4, r5)
            if (r0 != 0) goto Lcd
        Lba:
            java.lang.String r0 = android.os.Build.PRODUCT
            boolean r1 = p181jd.Intrinsics.equals(r0, r1)
            if (r1 != 0) goto Lcd
            p181jd.Intrinsics.checkIfNull(r0, r6)
            java.lang.String r1 = "vbox86p"
            boolean r0 = sd.C10163k.m9002H(r0, r1, r3, r4, r5)
            if (r0 == 0) goto Lce
        Lcd:
            r3 = 1
        Lce:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.DeviceSecurity.m41740h():boolean");
    }

    /* renamed from: a */
    public void mo41739a() {
        if (this.f343c.m17682o()) {
            new DialogC0323b.C0324a(this.f341a, 2131951632).m41264p(C2336R.string.alert_device_has_root_title).m41273g(C2336R.string.alert_device_has_root_message).m41271i(m41741g() ? C2336R.string.alert_device_has_root_exit : C2336R.string.alert_device_has_root_exit_alt, new DialogInterface.OnClickListener() { // from class: ai.l
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    DeviceSecurity.m41743e(DeviceSecurity.this, dialogInterface, i);
                }
            }).m41276d(false).m41279a().show();
        } else if (m41740h()) {
            new DialogC0323b.C0324a(this.f341a, 2131951632).m41264p(C2336R.string.alert_device_is_emulator_title).m41273g(C2336R.string.alert_device_is_emulator_message).m41271i(m41741g() ? C2336R.string.alert_device_is_emulator_exit : C2336R.string.alert_device_is_emulator_exit_alt, new DialogInterface.OnClickListener() { // from class: ai.k
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    DeviceSecurity.m41742f(DeviceSecurity.this, dialogInterface, i);
                }
            }).m41276d(false).m41279a().show();
        }
    }

    /* renamed from: b */
    public boolean mo41738b() {
        return (m41740h() || this.f343c.m17682o()) ? false : true;
    }

    /* renamed from: g */
    public boolean m41741g() {
        return this.f344d;
    }
}
