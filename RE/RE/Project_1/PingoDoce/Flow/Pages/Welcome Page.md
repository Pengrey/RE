![[Pasted image 20230323171404.png]]

This page corresponds to `IntroActivity`.

When clicking the 'ou entrar sem conta' in the emulator an error is thrown:
![[Pasted image 20230325161438.png]]

This message can be traced back to the string resource `err_api_generic` which is then used to throw an [[API Error]]. However, no indication as to what went wrong is given with this approach.

However, this doesn't happen when working in a real phone.
In that case, we're greeted with this:
![[promo_dialog.png]]

By clicking either option, we're then directed to the [[Main Page]]