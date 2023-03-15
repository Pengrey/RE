package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import p009a8.C0076i;
import p133h7.BinderC5870d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.t1 */
/* loaded from: classes.dex */
public final class C2981t1 extends AbstractRunnableC2822j2 {

    /* renamed from: A */
    final /* synthetic */ String f7997A;

    /* renamed from: B */
    final /* synthetic */ String f7998B;

    /* renamed from: C */
    final /* synthetic */ Context f7999C;

    /* renamed from: D */
    final /* synthetic */ Bundle f8000D;

    /* renamed from: E */
    final /* synthetic */ C2997u2 f8001E;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2981t1(C2997u2 c2997u2, String str, String str2, Context context, Bundle bundle) {
        super(c2997u2, true);
        this.f8001E = c2997u2;
        this.f7997A = str;
        this.f7998B = str2;
        this.f7999C = context;
        this.f8000D = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2822j2
    /* renamed from: a */
    public final void mo31730a() {
        boolean m32028m;
        String str;
        String str2;
        String str3;
        InterfaceC2757f1 interfaceC2757f1;
        int m32981c;
        InterfaceC2757f1 interfaceC2757f12;
        String str4;
        String str5;
        try {
            C2997u2 c2997u2 = this.f8001E;
            m32028m = C2997u2.m32028m(this.f7997A, this.f7998B);
            if (m32028m) {
                String str6 = this.f7998B;
                String str7 = this.f7997A;
                str5 = this.f8001E.f8022a;
                str2 = str7;
                str3 = str6;
                str = str5;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            C2597i.m33076j(this.f7999C);
            C2997u2 c2997u22 = this.f8001E;
            c2997u22.f8029h = c2997u22.m32023r(this.f7999C, true);
            interfaceC2757f1 = this.f8001E.f8029h;
            if (interfaceC2757f1 == null) {
                str4 = this.f8001E.f8022a;
                Log.w(str4, "Failed to connect to measurement client.");
                return;
            }
            int m32983a = DynamiteModule.m32983a(this.f7999C, ModuleDescriptor.MODULE_ID);
            zzcl zzclVar = new zzcl(55005L, Math.max(m32983a, m32981c), DynamiteModule.m32981c(this.f7999C, ModuleDescriptor.MODULE_ID) < m32983a, str, str2, str3, this.f8000D, C0076i.m41978a(this.f7999C));
            interfaceC2757f12 = this.f8001E.f8029h;
            ((InterfaceC2757f1) C2597i.m33076j(interfaceC2757f12)).initialize(BinderC5870d.m22835S1(this.f7999C), zzclVar, this.f7796w);
        } catch (Exception e) {
            this.f8001E.m32031j(e, true, false);
        }
    }
}
