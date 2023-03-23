The SSL Pinning can be bypass with the help of this frida [script](https://gist.githubusercontent.com/buffreak/1834f983dfaa846afd217a0301e32b18/raw/758daf8cce16fcbede6fab38f330b67706a1369e/frida.js) as follows:
```powershell
PS C:\Users\rodri\Desktop\ER\Frida> frida -U -l .\frida_multiple_unpinning.js -f pt.pingodoce
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
Spawned `pt.pingodoce`. Resuming main thread!
[Android Emulator 5554::pt.pingodoce ]->
======
[#] Android Bypass for various Certificate Pinning methods [#]
======
<SNIP>
[!] Unexpected SSLPeerUnverifiedException occurred, trying to patch it dynamically...
[!] Attempting to bypass uncommon SSL Pinning method on: ff.g.b
```