The root, vm check and SSL Pinning can all be bypass with the help of this frida [[script]] as follows:
```powershell
PS C:\Users\rodri\Desktop\ER\Frida> frida -U -l .\bypass.js -f pt.pingodoce
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
Spawning `pt.pingodoce`...
Spawned `pt.pingodoce`. Resuming main thread!

[Android Emulator 5554::pt.pingodoce ]->
======
[#] Android Bypass for various Certificate Pinning methods [#]
======
[-] OkHTTPv3 {1} pinner not found
[-] OkHTTPv3 {2} pinner not found
<SNIP>
[-] Apache AbstractVerifier check not found
[-] Chromium Cronet pinner not found
[-] Flutter HttpCertificatePinning pinner not found
[-] Flutter SslPinningPlugin pinner not found

======
[#] Root Beer Check Bypass [#]
======
[+] Loaded 9137 classes!
[+] loaded: -1
[+] ProcessManager hook not loaded
[+] KeyInfo hook not loaded

======
[#] VM Check Bypass [#]
======
[+] Bypass return value for binary: Superuser.apk
[+] Bypass return value for binary: Superuser.apk
[+] Bypass return value for binary: Superuser.apk
[+] Bypass return value for binary: Superuser.apk
<SNIP>
[!] Unexpected SSLPeerUnverifiedException occurred, trying to patch it dynamically...
[!] Attempting to bypass uncommon SSL Pinning method on: ff.g.b
```