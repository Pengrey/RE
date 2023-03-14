# Intercept requests
## Set proxy on burpsuite
![[Pasted image 20230302184803.png]]

## Set proxy on Android VM
```powershell
PS adb shell settings put global http_proxy 192.168.0.16:8082
```

## Export Cert
1. Generate cert on Burp
2. Add cert through settings on VM

## Result (SSL Pinning is being used)
![[Pasted image 20230302184911.png]]

## Patching the SSL certificate with the help of Frida and Objection
### Install of frida with the help of python and PIP
```powershell
PS C:\Users\rodri> pip3 install frida
Collecting frida
  Downloading frida-16.0.10-cp37-abi3-win_amd64.whl (30.7 MB)
     ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━ 30.7/30.7 MB 23.4 MB/s eta 0:00:00
Collecting typing-extensions
  Downloading typing_extensions-4.5.0-py3-none-any.whl (27 kB)
Installing collected packages: typing-extensions, frida
Successfully installed frida-16.0.10 typing-extensions-4.5.0

[notice] A new release of pip available: 22.3.1 -> 23.0.1
[notice] To update, run: C:\Users\rodri\AppData\Local\Microsoft\WindowsApps\PythonSoftwareFoundation.Python.3.10_qbz5n2kfra8p0\python.exe -m pip install --upgrade pip
PS C:\Users\rodri>
```

### Install of objection with the help of python and PIP
```powershell
PS C:\Users\rodri> pip3 install objection
Collecting objection
  Downloading objection-1.11.0.tar.gz (327 kB)
     ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━ 327.2/327.2 kB 3.4 MB/s eta 0:00:00
<SNIP>
PS C:\Users\rodri>
```

### Patch the apk with the Frida gadget with the help of objection
```powershell
PS C:\Users\rodri\Desktop\APKFolder> objection patchapk --source .\ctt_pulled.apk
No architecture specified. Determining it using `adb`...
Detected target device architecture as: x86
Using latest Github gadget version: 16.0.10
Patcher will be using Gadget version: 16.0.10
Detected apktool version as: 2.7.0
Running apktool empty-framework-dir...
Press any key to continue . . .
Unpacking .\ctt_pulled.apk
App already has android.permission.INTERNET
Setting extractNativeLibs to true...
Target class not specified, searching for launchable activity instead...
Reading smali from: C:\Users\rodri\AppData\Local\Temp\tmpitsu385x.apktemp\smali\pt/ctt/outsystems/CTT/MainActivity.smali
Injecting loadLibrary call at line: 6
Attempting to fix the constructors .locals count
Current locals value is 0, updating to 1:
Writing patched smali back to: C:\Users\rodri\AppData\Local\Temp\tmpitsu385x.apktemp\smali\pt/ctt/outsystems/CTT/MainActivity.smali
Creating library path: C:\Users\rodri\AppData\Local\Temp\tmpitsu385x.apktemp\lib\x86
Copying Frida gadget to libs path...
Rebuilding the APK with the frida-gadget loaded...
Built new APK with injected loadLibrary and frida-gadget
Performing zipalign
Zipalign completed
Signing new APK.
Signed the new APK
Copying final apk from C:\Users\rodri\AppData\Local\Temp\tmpitsu385x.apktemp.aligned.objection.apk to .\ctt_pulled.objection.apk in current directory...
Cleaning up temp files...
PS C:\Users\rodri\Desktop\APKFolder>
```

### Patch result
![[Pasted image 20230307152918.png]]

## Manual patching the SSL certificate with the help of Frida
### Setup BurpSuite as MITM
I used the following [blogpost](https://portswigger.net/burp/documentation/desktop/mobile/config-android-device)

### Copy ssl cert to data directory
1. Export the Burp Suite cert
![[Pasted image 20230314154040.png]]

2. Copy the certificate to the device
```powershell
PS > mv .\burp .\burp.PEM
PS > adb push .\burp.PEM /sdcard/
.\burp.PEM: 1 file pushed, 0 skipped. 2.9 MB/s (939 bytes in 0.000s)
PS >
```

### Unpin the certificate with the help of frida
1. Run the frida-server on the target
```powershell
PS > tar -xvf .\frida-server-16.0.10-android-x86.xz 
PS > mv .\frida-server-16.0.10-android-x86 .\frida-server
PS > adb root
PS > adb push .\frida-server /data/local/tmp/
.\frida-server: 1 file pushed, 0 skipped. 86.1 MB/s (53608156 bytes in 0.594s)
PS > adb shell "chmod 755 /data/local/tmp/frida-server"
PS > adb shell "/data/local/tmp/frida-server &"
```

2. 
```powershell
PS > adb push .\frida_multiple_unpinning.js /data/local/tmp
PS > adb shell pm list packages | findstr ctt
package:pt.ctt.outsystems.CTT
PS > frida -U -l frida_multiple_unpinning.js -f pt.ctt.outsystems.CTT
     ____
    / _  |   Frida 16.0.10 - A world-class dynamic instrumentation toolkit
   | (_| |
    > _  |   Commands:
   /_/ |_|       help      -> Displays the help system
   . . . .       object?   -> Display information about 'object'
   . . . .       exit/quit -> Exit
   . . . .
   . . . .   More info at https://frida.re/docs/home/
   . . . .
   . . . .   Connected to Android Emulator 5554 (id=emulator-5554)
Spawned `pt.ctt.outsystems.CTT`. Resuming main thread!
[Android Emulator 5554::pt.ctt.outsystems.CTT ]->
======
[#] Android Bypass for various Certificate Pinning methods [#]
======
[-] OkHTTPv3 {2} pinner not found
[-] Trustkit {1} pinner not found
[-] Trustkit {2} pinner not found
[-] Trustkit {3} pinner not found
[-] Appcelerator PinningTrustManager pinner not found
[-] Fabric PinningTrustManager pinner not found
[-] OpenSSLSocketImpl Conscrypt {1} pinner not found
[-] OpenSSLSocketImpl Conscrypt {2} pinner not found
[-] OpenSSLEngineSocketImpl Conscrypt pinner not found
[-] OpenSSLSocketImpl Apache Harmony pinner not found
[-] PhoneGap sslCertificateChecker pinner not found
[-] IBM MobileFirst pinTrustedCertificatePublicKey {1} pinner not found
[-] IBM MobileFirst pinTrustedCertificatePublicKey {2} pinner not found
[-] IBM WorkLight HostNameVerifierWithCertificatePinning {1} pinner not found
[-] IBM WorkLight HostNameVerifierWithCertificatePinning {2} pinner not found
[-] IBM WorkLight HostNameVerifierWithCertificatePinning {3} pinner not found
[-] IBM WorkLight HostNameVerifierWithCertificatePinning {4} pinner not found
[-] Conscrypt CertPinManager (Legacy) pinner not found
[-] CWAC-Netsecurity CertPinManager pinner not found
[-] Worklight Androidgap WLCertificatePinningPlugin pinner not found
[-] Netty FingerprintTrustManagerFactory pinner not found
[-] Squareup CertificatePinner {1} pinner not found
[-] Squareup CertificatePinner {2} pinner not found
[-] Squareup OkHostnameVerifier check not found
[-] Squareup OkHostnameVerifier check not found
[-] Android WebViewClient {2} check not found
[-] Apache Cordova WebViewClient check not found
[-] Boye AbstractVerifier check not found
[-] Apache AbstractVerifier check not found
[-] Chromium Cronet pinner not found
[-] Flutter HttpCertificatePinning pinner not found
[-] Flutter SslPinningPlugin pinner not found
[+] Bypassing Trustmanager (Android < 7) pinner
[+] Bypassing Trustmanager (Android < 7) pinner
[+] Bypassing Trustmanager (Android < 7) pinner
[+] Bypassing Android WebViewClient check {4}
[+] Bypassing Trustmanager (Android < 7) pinner
[+] Bypassing TrustManagerImpl (Android > 7) checkTrustedRecursive check: appserver.ctt.pt
[+] Bypassing OkHTTPv3 {4}: appserver.ctt.pt
[+] Bypassing OkHTTPv3 {4}: appserver.ctt.pt
[+] Bypassing OkHTTPv3 {4}: appserver.ctt.pt
[+] Bypassing OkHTTPv3 {4}: appserver.ctt.pt
[+] Bypassing OkHTTPv3 {4}: appserver.ctt.pt
[+] Bypassing OkHTTPv3 {4}: appserver.ctt.pt
```

3. Intercept request
![[Pasted image 20230314161630.png]]

