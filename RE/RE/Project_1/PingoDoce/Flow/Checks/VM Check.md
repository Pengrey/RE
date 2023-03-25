![[Pasted image 20230323162532.png]]

The check is being called on the class `ai.m`:
```java
    @Override // ai.n
    public void a() {
        if (this.f323c.o()) {
			<SNIP>
        } else if (h()) {
            new b.a(this.f321a, 2131951632).p(R.string.alert_device_is_emulator_title).g(R.string.alert_device_is_emulator_message).i(g() ? R.string.alert_device_is_emulator_exit : R.string.alert_device_is_emulator_exit_alt, new DialogInterface.OnClickListener() { // from class: ai.k
                {
                    m.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    m.f(m.this, dialogInterface, i10);
                }
            }).d(false).a().show();
        }
    }
```

The Emulator check is the following:
```java
private final boolean h() {
	r10 = this;
	java.lang.String r0 = android.os.Build.FINGERPRINT
	java.lang.String r1 = "FINGERPRINT"
	jd.l.g(r0, r1)
	java.lang.String r2 = "google/sdk_gphone_"
	r3 = 0
	r4 = 2
	r5 = 0
	boolean r2 = sd.k.C(r0, r2, r3, r4, r5)
	java.lang.String r6 = "PRODUCT"
	java.lang.String r7 = "MODEL"
	if (r2 == 0) goto L4d
	jd.l.g(r0, r1)
	java.lang.String r2 = ":user/release-keys"
	boolean r2 = sd.k.p(r0, r2, r3, r4, r5)
	if (r2 == 0) goto L4d
	java.lang.String r2 = android.os.Build.MANUFACTURER
	java.lang.String r8 = "Google"
	boolean r2 = jd.l.c(r2, r8)
	if (r2 == 0) goto L4d
	java.lang.String r2 = android.os.Build.PRODUCT
	jd.l.g(r2, r6)
	java.lang.String r8 = "sdk_gphone_"
	boolean r2 = sd.k.C(r2, r8, r3, r4, r5)
	if (r2 == 0) goto L4d
	java.lang.String r2 = android.os.Build.BRAND
	java.lang.String r9 = "google"
	boolean r2 = jd.l.c(r2, r9)
	if (r2 == 0) goto L4d
	java.lang.String r2 = android.os.Build.MODEL
	jd.l.g(r2, r7)
	boolean r2 = sd.k.C(r2, r8, r3, r4, r5)
	if (r2 != 0) goto Lcd
L4d:
	jd.l.g(r0, r1)
	java.lang.String r2 = "generic"
	boolean r8 = sd.k.C(r0, r2, r3, r4, r5)
	if (r8 != 0) goto Lcd
	jd.l.g(r0, r1)
	java.lang.String r1 = "unknown"
	boolean r0 = sd.k.C(r0, r1, r3, r4, r5)
	if (r0 != 0) goto Lcd
	java.lang.String r0 = android.os.Build.MODEL
	jd.l.g(r0, r7)
	java.lang.String r1 = "google_sdk"
	boolean r8 = sd.k.H(r0, r1, r3, r4, r5)
	if (r8 != 0) goto Lcd
	jd.l.g(r0, r7)
	java.lang.String r8 = "Emulator"
	boolean r8 = sd.k.H(r0, r8, r3, r4, r5)
	if (r8 != 0) goto Lcd
	jd.l.g(r0, r7)
	java.lang.String r7 = "Android SDK built for x86"
	boolean r0 = sd.k.H(r0, r7, r3, r4, r5)
	if (r0 != 0) goto Lcd
	java.lang.String r0 = android.os.Build.MANUFACTURER
	java.lang.String r7 = "MANUFACTURER"
	jd.l.g(r0, r7)
	java.lang.String r8 = "VMware"
	boolean r8 = sd.k.H(r0, r8, r3, r4, r5)
	if (r8 != 0) goto Lcd
	jd.l.g(r0, r7)
	java.lang.String r7 = "Genymotion"
	boolean r0 = sd.k.H(r0, r7, r3, r4, r5)
	if (r0 != 0) goto Lcd
	java.lang.String r0 = android.os.Build.BRAND
	java.lang.String r7 = "BRAND"
	jd.l.g(r0, r7)
	boolean r0 = sd.k.C(r0, r2, r3, r4, r5)
	if (r0 == 0) goto Lba
	java.lang.String r0 = android.os.Build.DEVICE
	java.lang.String r7 = "DEVICE"
	jd.l.g(r0, r7)
	boolean r0 = sd.k.C(r0, r2, r3, r4, r5)
	if (r0 != 0) goto Lcd
Lba:
	java.lang.String r0 = android.os.Build.PRODUCT
	boolean r1 = jd.l.c(r0, r1)
	if (r1 != 0) goto Lcd
	jd.l.g(r0, r6)
	java.lang.String r1 = "vbox86p"
	boolean r0 = sd.k.H(r0, r1, r3, r4, r5)
	if (r0 == 0) goto Lce
Lcd:
	r3 = 1
Lce:
	return r3
throw new UnsupportedOperationException("Method not decompiled: ai.m.h():boolean");
    }
```