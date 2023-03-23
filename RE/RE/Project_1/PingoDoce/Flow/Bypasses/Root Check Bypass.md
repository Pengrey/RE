The root check can be bypass with the help of this frida [script](https://gist.githubusercontent.com/pich4ya/0b2a8592d3c8d5df9c34b8d185d2ea35/raw/db83ed8d4d3dfc29687724e4393e173362b1d7a9/root_bypass.js) as follows:
```powershell
PS C:\Users\rodri\Desktop\ER\Frida> frida -U -l .\RootCheckBypass.js -f pt.pingodoce
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
<SNIP>
[Android Emulator 5554::pt.pingodoce ]->
```