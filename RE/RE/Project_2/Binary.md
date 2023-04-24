# FIle probbing
## file command
```bash
$ file yt-dlp         
yt-dlp: ELF 64-bit LSB executable, x86-64, version 1 (SYSV), dynamically linked, interpreter /lib64/ld-linux-x86-64.so.2, BuildID[sha1]=54d348536553605e1ebca614e8b0144c5b3acf4d, for GNU/Linux 2.6.32, stripped
$
```

## objectdump command

(symbol and dynamic symbol table)
```bash
$ objdump -tT yt-dlp 

yt-dlp:     file format elf64-x86-64

SYMBOL TABLE:
no symbols


DYNAMIC SYMBOL TABLE:
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.3.4) __strcat_chk
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) getenv
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.3.4) __snprintf_chk
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) raise
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) free
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.3.4) __vfprintf_chk
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) __errno_location
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) unlink
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) strncpy
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) strncmp
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) strcpy
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) ftello
0000000000000000      DF *UND*  0000000000000000              inflate
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) mkdir
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) ferror
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) fread
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) mbstowcs
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) readlink
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) setenv
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) getpid
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) fclose
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) opendir
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) stpcpy
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) rmdir
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) strlen
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) __lxstat
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) setbuf
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) strchr
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) snprintf
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) dirname
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) strncat
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.4)  __realpath_chk
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) closedir
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) __strdup
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) __libc_start_main
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) memcmp
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) wcsncpy
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) calloc
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) strcmp
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) signal
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.3.4) __memcpy_chk
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) feof
0000000000000000  w   D  *UND*  0000000000000000              __gmon_start__
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) clearerr
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.3)  realpath
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.14) memcpy
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) prctl
0000000000000000      DF *UND*  0000000000000000              inflateEnd
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) kill
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) __xpg_basename
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) fileno
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) __xstat
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) readdir
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) dlopen
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) malloc
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) fflush
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) nl_langinfo
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.3.4) __vsnprintf_chk
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) dlclose
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) realloc
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.3.4) __strcpy_chk
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) mkdtemp
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) setlocale
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) fchmod
0000000000000000      DF *UND*  0000000000000000              inflateInit_
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.7)  __fread_chk
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) waitpid
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) fseeko
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) fopen
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) perror
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) strtok
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) unsetenv
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) execvp
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) strcat
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) fwrite
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.3.4) __fprintf_chk
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) strerror
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) dlsym
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) fork
0000000000000000      DF *UND*  0000000000000000 (GLIBC_2.2.5) dlerror
000000000040d2a0 g    DO .bss   0000000000000008 (GLIBC_2.2.5) stdout
000000000040d2a8 g    DO .bss   0000000000000008 (GLIBC_2.2.5) stdin
000000000040d2b0 g    DO .bss   0000000000000008 (GLIBC_2.2.5) stderr

$
```

## Extract python code
```bash
$ objcopy --dump-section pydata=pydata.dump yt-dlp
$ ls
pydata.dump  yt-dlp
$ python ./pyinstxtractor/pyinstxtractor.py pydata.dump 
[+] Processing pydata.dump
[+] Pyinstaller version: 2.1+
[+] Python version: 3.10
[+] Length of package: 18559923 bytes
[+] Found 115 files in CArchive
[+] Beginning extraction...please standby
[+] Possible entry point: pyiboot01_bootstrap.pyc
[+] Possible entry point: pyi_rth_inspect.pyc
[+] Possible entry point: pyi_rth_pkgutil.pyc
[+] Possible entry point: pyi_rth_multiprocessing.pyc
[+] Possible entry point: pyi_rth_setuptools.pyc
[+] Possible entry point: pyi_rth_pkgres.pyc
[+] Possible entry point: __main__.pyc
[!] Warning: This script is running in a different Python version than the one used to build the executable.
[!] Please run this script in Python 3.10 to prevent extraction errors during unmarshalling
[!] Skipping pyz extraction
[+] Successfully extracted pyinstaller archive: pydata.dump

You can now use a python decompiler on the pyc files within the extracted directory
$ pycdc __main__.pyc 
# Source Generated with Decompyle++
# File: __main__.pyc (Python 3.10)

import sys
if not __package__ is None and getattr(sys, 'frozen', False):
    import os.path as os
    path = os.path.realpath(os.path.abspath(__file__))
    sys.path.insert(0, os.path.dirname(os.path.dirname(path)))
import yt_dlp
if __name__ == '__main__':
    yt_dlp.main()
    return None

$
```


