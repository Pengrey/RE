# Intercept requests
## Set proxy on burpsuite
![[Pasted image 20230302184803.png]]

## Set proxy on Android VM
```powershell
PS adb shell settings put global http_proxy 192.168.0.16:8082
```

## Export Cert
1. generate cert on Burp
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
