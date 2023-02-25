# Original archive
1. See the filetype with the command `file`:
```bash
$ file unknown 
unknown: Zip archive data, at least v2.0 to extract, compression method=deflate
$
```

2. Unzip the file with the command `unzip`:
```bash
$ unzip unknown  
Archive:  unknown
  inflating: 1                       
  inflating: 2                       
  inflating: 3                       
  inflating: 4                       
  inflating: 5                       
  inflating: 6                       
  inflating: 7                       
  inflating: 8.512                   
  inflating: 10                      
  inflating: 11                      
  inflating: 12                      
  inflating: 13                      
  inflating: 14                      
  inflating: 15.iq                   
  inflating: 16                      
  inflating: 17                      
  inflating: 18                      
  inflating: 19                      
  inflating: 20                      
$
```

# Archived files
## File 1
1. See the filetype with the command `file`:
```bash
$ file 1      
1: Matlab v4 mat-file (little endian) \377\342\001\324ICC_PROFILE, numeric, rows 1179258880, columns 16795209, imaginary
$
```

2. Use `matlab` to try to open it:
![[Pasted image 20230221114456.png]]

3. Use the command `strings` to see string contents:
```bash
$ strings 1             
JFIF
ICC_PROFILE
lcms
mntrRGB XYZ 
acspAPPL
-lcms
        desc
^wtpt
bkpt
rXYZ
gXYZ
bXYZ
rTRC
@gTRC
@bTRC
@desc
sRGB ImageOptim.com
<SNIP>
$
```

4. Go to ImageOptim.com found to see the reference:
![[Pasted image 20230221120940.png]]

5. Search for the magic numbers on the web:
 ![[Pasted image 20230221121231.png]]

6. Try to fix the magic numbers:
```bash
$ hexedit 1

$
```

6. See the filetype with the command `file`:
```bash
$ file 1
1: JPEG image data, JFIF standard 1.01, aspect ratio, density 1x1, segment length 16, progressive, precision 8, 630x354, components 3
$
```

7. Open file with the tool `ristretto`:
![[Pasted image 20230221122019.png]]

## File 2
1. See the filetype with the command `file`:
```bash
$ file 2
2: data
$ 
```

2. Check file entropy with the help of the project [cyberchef](https://gchq.github.io):
![[Pasted image 20230221130505.png]]

3. Try to use the command `binwalk` to extract all the files within it:
```bash
$ binwalk --dd='.*' 2

DECIMAL       HEXADECIMAL     DESCRIPTION
--------------------------------------------------------------------------------

$
```

4. Correlate the hex format with the JPEG format:
```bash
$ xxd 2 | head
00000000: 0000 0000 0043 0001 0101 0101 0101 0101  .....C..........
00000010: 0101 0101 0101 0202 0101 0101 0302 0202  ................
00000020: 0203 0304 0403 0303 0304 0406 0504 0405  ................
00000030: 0403 0305 0705 0506 0606 0606 0405 0707  ................
00000040: 0706 0706 0606 06ff db00 4301 0101 0101  ..........C.....
00000050: 0101 0302 0203 0604 0304 0606 0606 0606  ................
00000060: 0606 0606 0606 0606 0606 0606 0606 0606  ................
00000070: 0606 0606 0606 0606 0606 0606 0606 0606  ................
00000080: 0606 0606 0606 0606 0606 0606 ffc0 0011  ................
00000090: 0802 7303 e803 0121 0002 1101 0311 01ff  ..s....!........
$ 
```

![[Pasted image 20230221132503.png]]

4. Try to fix the magic numbers:
```bash
$ hexedit 2

$
```

5. See the filetype with the command `file`:
```bash
$ file 2
2: JPEG image data, baseline, precision 8, 1000x627, components 3
$
```

6. Open file with the tool `ristretto`:
![[Pasted image 20230221132906.png]]

## File 3
1. See the filetype with the command `file`:
```bash
$ file 3
3: data
$ 
```

2. See hex values with `xxd`:
```bash
$ xxd 3 | head
00000000: 0000 0304 1400 0600 0800 0000 2100 b1c1  ............!...
00000010: 3c9e ed01 0000 8008 0000 1300 0802 5b43  <.............[C
00000020: 6f6e 7465 6e74 5f54 7970 6573 5d2e 786d  ontent_Types].xm
00000030: 6c20 a204 0228 a000 0200 0000 0000 0000  l ...(..........
00000040: 0000 0000 0000 0000 0000 0000 0000 0000  ................
00000050: 0000 0000 0000 0000 0000 0000 0000 0000  ................
00000060: 0000 0000 0000 0000 0000 0000 0000 0000  ................
00000070: 0000 0000 0000 0000 0000 0000 0000 0000  ................
00000080: 0000 0000 0000 0000 0000 0000 0000 0000  ................
00000090: 0000 0000 0000 0000 0000 0000 0000 0000  ................
$
```

3. Correlate the hex format with the zip format:
![[Pasted image 20230221133527.png]]

4. Try to fix the magic numbers:
```bash
$ hexedit 3

$
```

5. See the filetype with the command `file`:
```bash
$ file 3
3: Microsoft Word 2007+
$
```

6. Open file with google Docs
![[Pasted image 20230221133859.png]]

## File 4
1. See the filetype with the command `file`:
```bash
$ file 4
4: data
$ 
```

2. Unzip the file with the command `unzip`:
```bash
$ unzip 4      
Archive:  4
  inflating: 0                       
error: invalid zip file with overlapped components (possible zip bomb)           
$
```

3. See the filetype of file 0 with the command `file`:
```bash
$ file 0
0: Zip archive data, at least v2.0 to extract, compression method=deflate
$
```

>[!DANGER]
>Due to the possability of a zip bomb a check will be done

3. Check the original file with VirusTotal:
![[Pasted image 20230221134517.png]]

## File 5
1. See the filetype with the command `file`:
```bash
$ file 5
5: DOS/MBR boot sector
$ 
```

2. See hex values with `xxd`:
```bash
$ xxd 5 | head
00000000: 25ff ffeb 570a 2550 4446 2d31 2e35 0a39  %...W.%PDF-1.5.9
00000010: 3939 3920 3020 6f62 6a0a 3c3c 3e3e 0a73  999 0 obj.<<>>.s
00000020: 7472 6561 6d0a 96c8 d283 b181 9ea6 aa8a  tream...........
00000030: cdcf b0c2 cacf aac5 df9b fec8 df9c a783  ................
00000040: 9ebb acd4 9e9b b6c8 9e89 b2c2 ce9f a783  ................
00000050: be00 dead beef 000b adc0 de00 31c0 8ed8  ............1...
00000060: 30d2 cd13 0f82 1d01 31c9 bb85 7c01 cb8b  0.......1...|...
00000070: 0730 c888 0783 c101 81fb fe7d 7eec eb05  .0.........}~...
00000080: babe cafe 00b8 e105 8dc4 34dd bf1f 0bbf  ..........4.....
00000090: 0bbd 0fb8 0fa2 11df 001b 97fe 17a1 4e66  ..............Nf
$
```

3. Open pdf with `Atril Document Viewr`:
![[Pasted image 20230221135147.png]]

## File 6
1. See the filetype with the command `file`:
```bash
$ file 6
6: data
$ 
```

2. See hex values with `xxd`:
```bash
$ xxd 6 | head
00000000: 0000 0000 0d0a 1a0a 0000 000d 4948 4452  ............IHDR
00000010: 0000 0182 0000 018b 0806 0000 00ca f595  ................
00000020: 4100 00a1 9a49 4441 5478 5eec dd67 4c54  A....IDATx^..gLT
00000030: 591f 06f0 c74f b605 c6ba 2151 c10e a288  Y....O....!Q....
00000040: 1535 8868 4462 68e3 0737 11d7 5e50 1305  .5.hDbh..7..^P..
00000050: 8d35 eec6 11c5 caf2 6234 2289 f082 d188  .5......b4".....
00000060: c986 d7be 71a3 2b25 b898 a8c1 8a62 5950  ....q.+%.....bYP
00000070: a258 3682 7dbf bd39 ff0c 198c ac77 ee34  .X6.}..9.....w.4
00000080: 6786 e797 9cdc f18b 4ee2 cc7d e6fc ffe7  g.......N..}....
00000090: 9c8b 5680 8888 8888 8888 8888 8888 8888  ..V.............
$
```

3. Correlate the hex format with the png format:
![[Pasted image 20230221135523.png]]

4. Try to fix the magic numbers:
```bash
$ hexedit 6

$
```

5. See the filetype with the command `file`:
```bash
$ file 6
6: PNG image data, 386 x 395, 8-bit/color RGBA, non-interlaced
$
```

6. Open file with the tool `ristretto`:
![[Pasted image 20230221135702.png]]

## File 7
1. See the filetype with the command `file`:
```bash
$ file 7
7: data
$ 
```

2. See hex values with `xxd`:
```bash
$ xxd 7 | head
00000000: 73ab e9c6 491d 8ded 2e28 32e4 d3c4 142e  s...I....(2.....
00000010: fa5c d00e 7686 09da eda5 54a2 05c1 b799  .\..v.....T.....
00000020: 37d4 8fd2 a266 14fe 1ab7 3274 00e6 751a  7....f....2t..u.
00000030: d3a5 5145 58fd b600 a7b3 0298 9a86 a09e  ..QEX...........
00000040: 5e01 6102 0483 353a d7d1 e761 8f31 dd59  ^.a...5:...a.1.Y
00000050: c13b 075a f104 97ee 8917 00be 3e39 d345  .;.Z........>9.E
00000060: b2b8 1652 bb3e 0666 30df 4aa5 36a5 266b  ...R.>.f0.J.6.&k
00000070: aa9b cf5b 4361 b1db fa4a dba6 3ff6 9d7a  ...[Ca...J..?..z
00000080: 7f45 4c46 0201 0100 0000 0000 0000 0000  .ELF............
00000090: 0300 3e00 0100 0000 8061 0000 0000 0000  ..>......a......
$
```

3. Check file entropy with the help of the project [cyberchef](https://gchq.github.io):
![[Pasted image 20230221140451.png]]

4. Use the command `strings` to see string contents:
```bash
$ strings 7
<SNIP>
# Configuration file for dircolors, a utility to help you set the
# LS_COLORS environment variable used by GNU ls with the --color option.
# Copyright (C) 1996-2020 Free Software Foundation, Inc.
# Copying and distribution of this file, with or without modification,
# are permitted provided the copyright notice and this notice are preserved.
# The keywords COLOR, OPTIONS, and EIGHTBIT (honored by the
# slackware version of dircolors) are recognized but ignored.
# Below are TERM entries, which can be a glob patterns, to match
# against the TERM environment variable to determine if it is colorizable.
TERM Eterm
TERM ansi
TERM *color*
TERM con[0-9]*x[0-9]*
TERM cons25
TERM console
TERM cygwin
TERM dtterm
TERM gnome
TERM hurd
TERM jfbterm
TERM konsole
TERM kterm
TERM linux
TERM linux-c
TERM mlterm
TERM putty
TERM rxvt*
TERM screen*
TERM st
TERM terminator
TERM tmux*
TERM vt100
TERM xterm*
# Below are the color init strings for the basic file types.
# One can use codes for 256 or more colors supported by modern terminals.
# The default color codes use the capabilities of an 8 color terminal
# with some additional attributes as per the following codes:
# Attribute codes:
# 00=none 01=bold 04=underscore 05=blink 07=reverse 08=concealed
# Text color codes:
# 30=black 31=red 32=green 33=yellow 34=blue 35=magenta 36=cyan 37=white
# Background color codes:
# 40=black 41=red 42=green 43=yellow 44=blue 45=magenta 46=cyan 47=white
#NORMAL 00 # no color code at all
#FILE 00 # regular file: use no color at all
RESET 0 # reset to "normal" color
DIR 01;34 # directory
LINK 01;36 # symbolic link. (If you set this to 'target' instead of a
 # numerical value, the color is as for the file pointed to.)
MULTIHARDLINK 00 # regular file with more than one link
FIFO 40;33 # pipe
SOCK 01;35 # socket
DOOR 01;35 # door
BLK 40;33;01 # block device driver
CHR 40;33;01 # character device driver
ORPHAN 40;31;01 # symlink to nonexistent file, or non-stat'able file ...
MISSING 00 # ... and the files they point to
SETUID 37;41 # file that is setuid (u+s)
SETGID 30;43 # file that is setgid (g+s)
CAPABILITY 30;41 # file with capability
STICKY_OTHER_WRITABLE 30;42 # dir that is sticky and other-writable (+t,o+w)
OTHER_WRITABLE 34;42 # dir that is other-writable (o+w) and not sticky
STICKY 37;44 # dir with the sticky bit set (+t) and not other-writable
# This is for files with execute permission:
EXEC 01;32
# List any file extensions like '.gz' or '.tar' that you would like ls
# to colorize below. Put the extension, a space, and the color init string.
# (and any comments you want to add after a '#')
# If you use DOS-style suffixes, you may want to uncomment the following:
#.cmd 01;32 # executables (bright green)
#.exe 01;32
#.com 01;32
#.btm 01;32
#.bat 01;32
# Or if you want to colorize scripts even if they do not have the
# executable bit actually set.
#.sh 01;32
#.csh 01;32
 # archives or compressed (bright red)
.tar 01;31
.tgz 01;31
.arc 01;31
.arj 01;31
.taz 01;31
.lha 01;31
.lz4 01;31
.lzh 01;31
.lzma 01;31
.tlz 01;31
.txz 01;31
.tzo 01;31
.t7z 01;31
.zip 01;31
.z 01;31
.dz 01;31
.gz 01;31
.lrz 01;31
.lz 01;31
.lzo 01;31
.xz 01;31
.zst 01;31
.tzst 01;31
.bz2 01;31
.bz 01;31
.tbz 01;31
.tbz2 01;31
.tz 01;31
.deb 01;31
.rpm 01;31
.jar 01;31
.war 01;31
.ear 01;31
.sar 01;31
.rar 01;31
.alz 01;31
.ace 01;31
.zoo 01;31
.cpio 01;31
.7z 01;31
.rz 01;31
.cab 01;31
.wim 01;31
.swm 01;31
.dwm 01;31
.esd 01;31
# image formats
.jpg 01;35
.jpeg 01;35
.mjpg 01;35
.mjpeg 01;35
.gif 01;35
.bmp 01;35
.pbm 01;35
.pgm 01;35
.ppm 01;35
.tga 01;35
.xbm 01;35
.xpm 01;35
.tif 01;35
.tiff 01;35
.png 01;35
.svg 01;35
.svgz 01;35
.mng 01;35
.pcx 01;35
.mov 01;35
.mpg 01;35
.mpeg 01;35
.m2v 01;35
.mkv 01;35
.webm 01;35
.webp 01;35
.ogm 01;35
.mp4 01;35
.m4v 01;35
.mp4v 01;35
.vob 01;35
.qt 01;35
.nuv 01;35
.wmv 01;35
.asf 01;35
.rm 01;35
.rmvb 01;35
.flc 01;35
.avi 01;35
.fli 01;35
.flv 01;35
.gl 01;35
.dl 01;35
.xcf 01;35
.xwd 01;35
.yuv 01;35
.cgm 01;35
.emf 01;35
# https://wiki.xiph.org/MIME_Types_and_File_Extensions
.ogv 01;35
.ogx 01;35
# audio formats
.aac 00;36
.au 00;36
.flac 00;36
.m4a 00;36
.mid 00;36
.midi 00;36
.mka 00;36
.mp3 00;36
.mpc 00;36
.ogg 00;36
.ra 00;36
.wav 00;36
# https://wiki.xiph.org/MIME_Types_and_File_Extensions
.oga 00;36
.opus 00;36
.spx 00;36
.xspf 00;36
%.*s%s%s
 %lu
%*lu 
%%%02x
]8;;file://%s%s%s
]8;;
src/ls.c
sort_type != sort_version
error canonicalizing %s
cannot access %s
cannot read symbolic link %s
unlabeled
%s %*s 
%*s, %*s 
 -> 
cannot open directory %s
reading directory %s
closing directory %s
total
vdir
test invocation
Multi-call invocation
sha224sum
sha2 utilities
sha256sum
sha384sum
sha512sum
%s online help: <%s>
GNU coreutils
Full documentation <%s%s>
full-iso
/usr/share/locale
QUOTING_STYLE
COLUMNS
TABSIZE
invalid line width
%s: %s
invalid tab size
--sort
--time
--format
--color
--hyperlink
--indicator-style
--quoting-style
David MacKenzie
Richard M. Stallman
LS_BLOCK_SIZE
*=>@|
TIME_STYLE
invalid time style format %s
time style
Valid arguments are:
  - [posix-]%s
%Y-%m-%d %H:%M:%S.%N %z
%Y-%m-%d %H:%M
%Y-%m-%d 
LS_COLORS
COLORTERM
TERM 
unrecognized prefix: %s
target
found
//DIRED//
//SUBDIRED//
force
never
none
auto
if-tty
atime
ctime
status
birth
creation
extension
verbose
long
commas
horizontal
across
vertical
single-column
directory
dired
full-time
group-directories-first
human-readable
inode
kibibytes
numeric-uid-gid
no-group
hide-control-chars
reverse
almost-all
ignore-backups
classify
file-type
dereference-command-line
hide
ignore
dereference
literal
quote-name
recursive
show-control-chars
tabsize
time-style
block-size
context
author
help
%b %e  %Y
%b %e %H:%M
01;34
01;36
01;35
01;33
01;32
37;41
30;43
37;44
34;42
30;42
30;41
slash
long-iso
cannot determine device and inode of %s
%s: not listing already-listed directory
Try '%s --help' for more information.
Usage: %s [OPTION]... [FILE]...
List information about the FILEs (the current directory by default).
Sort entries alphabetically if none of -cftuvSUX nor --sort is specified.
Mandatory arguments to long options are mandatory for short options too.
  -a, --all                  do not ignore entries starting with .
  -A, --almost-all           do not list implied . and ..
      --author               with -l, print the author of each file
  -b, --escape               print C-style escapes for nongraphic characters
      --block-size=SIZE      with -l, scale sizes by SIZE when printing them;
                               e.g., '--block-size=M'; see SIZE format below
  -B, --ignore-backups       do not list implied entries ending with ~
  -c                         with -lt: sort by, and show, ctime (time of last
                               modification of file status information);
                               with -l: show ctime and sort by name;
                               otherwise: sort by ctime, newest first
  -C                         list entries by columns
      --color[=WHEN]         colorize the output; WHEN can be 'always' (default
                               if omitted), 'auto', or 'never'; more info below
  -d, --directory            list directories themselves, not their contents
  -D, --dired                generate output designed for Emacs' dired mode
  -f                         do not sort, enable -aU, disable -ls --color
  -F, --classify             append indicator (one of */=>@|) to entries
      --file-type            likewise, except do not append '*'
      --format=WORD          across -x, commas -m, horizontal -x, long -l,
                               single-column -1, verbose -l, vertical -C
      --full-time            like -l --time-style=full-iso
  -g                         like -l, but do not list owner
      --group-directories-first
                             group directories before files;
                               can be augmented with a --sort option, but any
                               use of --sort=none (-U) disables grouping
  -G, --no-group             in a long listing, don't print group names
  -h, --human-readable       with -l and -s, print sizes like 1K 234M 2G etc.
      --si                   likewise, but use powers of 1000 not 1024
  -H, --dereference-command-line
                             follow symbolic links listed on the command line
      --dereference-command-line-symlink-to-dir
                             follow each command line symbolic link
                               that points to a directory
      --hide=PATTERN         do not list implied entries matching shell PATTERN
                               (overridden by -a or -A)
      --hyperlink[=WHEN]     hyperlink file names; WHEN can be 'always'
                               (default if omitted), 'auto', or 'never'
      --indicator-style=WORD  append indicator with style WORD to entry names:
                               none (default), slash (-p),
                               file-type (--file-type), classify (-F)
  -i, --inode                print the index number of each file
  -I, --ignore=PATTERN       do not list implied entries matching shell PATTERN
  -k, --kibibytes            default to 1024-byte blocks for disk usage;
                               used only with -s and per directory totals
  -l                         use a long listing format
  -L, --dereference          when showing file information for a symbolic
                               link, show information for the file the link
                               references rather than for the link itself
  -m                         fill width with a comma separated list of entries
  -n, --numeric-uid-gid      like -l, but list numeric user and group IDs
  -N, --literal              print entry names without quoting
  -o                         like -l, but do not list group information
  -p, --indicator-style=slash
                             append / indicator to directories
  -q, --hide-control-chars   print ? instead of nongraphic characters
      --show-control-chars   show nongraphic characters as-is (the default,
                               unless program is 'ls' and output is a terminal)
  -Q, --quote-name           enclose entry names in double quotes
      --quoting-style=WORD   use quoting style WORD for entry names:
                               literal, locale, shell, shell-always,
                               shell-escape, shell-escape-always, c, escape
                               (overrides QUOTING_STYLE environment variable)
  -r, --reverse              reverse order while sorting
  -R, --recursive            list subdirectories recursively
  -s, --size                 print the allocated size of each file, in blocks
  -S                         sort by file size, largest first
      --sort=WORD            sort by WORD instead of name: none (-U), size (-S),
                               time (-t), version (-v), extension (-X)
      --time=WORD            change the default of using modification times;
                               access time (-u): atime, access, use;
                               change time (-c): ctime, status;
                               birth time: birth, creation;
                             with -l, WORD determines which time to show;
                             with --sort=time, sort by WORD (newest first)
      --time-style=TIME_STYLE  time/date format with -l; see TIME_STYLE below
  -t                         sort by time, newest first; see --time
  -T, --tabsize=COLS         assume tab stops at each COLS instead of 8
  -u                         with -lt: sort by, and show, access time;
                               with -l: show access time and sort by name;
                               otherwise: sort by access time, newest first
  -U                         do not sort; list entries in directory order
  -v                         natural sort of (version) numbers within text
  -w, --width=COLS           set output width to COLS.  0 means no limit
  -x                         list entries by lines instead of by columns
  -X                         sort alphabetically by entry extension
  -Z, --context              print any security context of each file
  -1                         list one file per line.  Avoid '\n' with -q or -b
      --help     display this help and exit
      --version  output version information and exit
The SIZE argument is an integer and optional unit (example: 10K is 10*1024).
Units are K,M,G,T,P,E,Z,Y (powers of 1024) or KB,MB,... (powers of 1000).
Binary prefixes can be used, too: KiB=K, MiB=M, and so on.
The TIME_STYLE argument can be full-iso, long-iso, iso, locale, or +FORMAT.
FORMAT is interpreted like in date(1).  If FORMAT is FORMAT1<newline>FORMAT2,
then FORMAT1 applies to non-recent files and FORMAT2 to recent files.
TIME_STYLE prefixed with 'posix-' takes effect only outside the POSIX locale.
Also the TIME_STYLE environment variable sets the default style to use.
Using color to distinguish file types is disabled both by default and
with --color=never.  With --color=auto, ls emits color codes only when
standard output is connected to a terminal.  The LS_COLORS environment
variable can change the settings.  Use the dircolors command to set it.
Exit status:
 0  if OK,
 1  if minor problems (e.g., cannot access subdirectory),
 2  if serious trouble (e.g., cannot access command-line argument).
https://www.gnu.org/software/coreutils/
Report any translation bugs to <https://translationproject.org/team/>
or available locally via: info '(coreutils) %s%s'
ignoring invalid value of environment variable QUOTING_STYLE: %s
ignoring invalid width in environment variable COLUMNS: %s
ignoring invalid tab size in environment variable TABSIZE: %s
abcdfghiklmnopqrstuvw:xABCDFGHI:LNQRST:UXZ1
  - +FORMAT (e.g., +%H:%M) for a 'date'-style format
unparsable value for LS_COLORS environment variable
dev_ino_size <= obstack_object_size (&dev_ino_obstack)
//DIRED-OPTIONS// --quoting-style=%s
hash_get_n_entries (active_dir_set) == 0
dereference-command-line-symlink-to-dir
8.32
invalid argument %s for %s
ambiguous argument %s for %s
Valid arguments are:
  - %s
, %s
write error
system.posix_acl_access
system.posix_acl_default
POSIX
# entries:         %lu
# buckets:         %lu
max bucket length: %lu
# buckets used:    %lu (%.2f%%)
=fff?
Y@%.0Lf
%.1Lf
BLOCKSIZE
POSIXLY_CORRECT
eEgGkKmMpPtTyYzZ0
KMGTPEZY
%m/%d/%y
%Y-%m-%d
%H:%M:%S
A NULL argv[0] was passed through an exec system call.
/.libs/
shell
shell-always
shell-escape
shell-escape-always
c-maybe
clocale
%s (%s) %s
%s %s
Written by %s.
Written by %s and %s.
Written by %s, %s, and %s.
Report bugs to: %s
bug-coreutils@gnu.org
%s home page: <%s>
https://www.gnu.org/gethelp/
License GPLv3+: GNU GPL version 3 or later <%s>.
This is free software: you are free to change and redistribute it.
There is NO WARRANTY, to the extent permitted by law.
https://gnu.org/licenses/gpl.html
Written by %s, %s, %s,
and %s.
Written by %s, %s, %s,
%s, and %s.
Written by %s, %s, %s,
%s, %s, and %s.
Written by %s, %s, %s,
%s, %s, %s, and %s.
Written by %s, %s, %s,
%s, %s, %s, %s,
and %s.
Written by %s, %s, %s,
%s, %s, %s, %s,
%s, and %s.
Written by %s, %s, %s,
%s, %s, %s, %s,
%s, %s, and others.
General help using GNU software: <%s>
Copyright %s %d Free Software Foundation, Inc.
memory exhausted
invalid %s%s argument '%s'
%s%s argument '%s' too large
invalid suffix in %s%s argument '%s'
lib/xstrtol.c
0 <= strtol_base && strtol_base <= 36
xstrtoumax
ASCII
;*3$"
/usr/lib/debug/.dwz/x86_64-linux-gnu/coreutils.debug
3da6f0bc36b6398b8651bbc2e08831a21a90da.debug
.shstrtab
.interp
.note.gnu.build-id
.note.ABI-tag
.gnu.hash
.dynsym
.dynstr
.gnu.version
.gnu.version_r
.rela.dyn
.rela.plt
.init
.plt.got
.text
.fini
.rodata
.eh_frame_hdr
.eh_frame
.init_array
.fini_array
.data.rel.ro
.dynamic
.got.plt
.data
.bss
.gnu_debugaltlink
.gnu_debuglink
$ 
```

5. Try to fix the magic numbers:
```bash
$ hexedit 7

$
```

6. See the filetype with the command `file`:
```bash
$ file 7
7: ELF 32-bit LSB *unknown arch 0xed0*
$ 
```

7. Identify the ELF file:
```embed
title: 'coreutils/ls.c at master · coreutils/coreutils'
image: 'https://opengraph.githubassets.com/5c64bb1c25fd278c185db6876331cd98cd111c5bbeed20b1ba7c9126167ef744/coreutils/coreutils'
description: 'upstream mirror. Contribute to coreutils/coreutils development by creating an account on GitHub.'
url: 'https://github.com/coreutils/coreutils/blob/master/src/ls.c'
```

## File 8.512 
1. See the filetype with the command `file`:
```bash
$ file 8.512 
8.512: data
$ 
```

2. See hex values with `xxd`:
```bash
$ xxd 8.512 | head
00000000: 0000 0000 0101 0100 0202 0200 0303 0300  ................
00000010: 0404 0400 0505 0500 0606 0600 0707 0700  ................
00000020: 0808 0800 0909 0900 0a0a 0a00 0b0b 0b00  ................
00000030: 0c0c 0c00 0d0d 0d00 0e0e 0e00 0f0f 0f00  ................
00000040: 1010 1000 1111 1100 1212 1200 1313 1300  ................
00000050: 1414 1400 1515 1500 1616 1600 1717 1700  ................
00000060: 1818 1800 1919 1900 1a1a 1a00 1b1b 1b00  ................
00000070: 1c1c 1c00 1d1d 1d00 1e1e 1e00 1f1f 1f00  ................
00000080: 2020 2000 2121 2100 2222 2200 2323 2300     .!!!.""".###.
00000090: 2424 2400 2525 2500 2626 2600 2727 2700  $$$.%%%.&&&.'''.
$
```

3. Check file entropy with the help of the project [cyberchef](https://gchq.github.io):
![[Pasted image 20230221141806.png]]

## File 10
1. See the filetype with the command `file`:
```bash
$ file 10   
10: PE32+ executable (GUI) x86-64, for MS Windows
$ 
```


## File 11
1. See the filetype with the command `file`:
```bash
$ file 11
11: PNG image data, 600 x 327, 8-bit grayscale, non-interlaced
$ 
```

2. Open file with the tool `ristretto`:
![[Pasted image 20230221160859.png]]

## File 12
1. See the filetype with the command `file`:
```bash
$ file 12
12: u-boot legacy uImage, MIPS OpenWrt Linux-5.4.179, Linux/MIPS, OS Kernel Image (lzma), 4429767 bytes, Wed Feb 16 20:29:10 2022, Load Address: 0X80000000, Entry Point: 0X80000000, Header CRC: 0X45473495, Data CRC: 0XAB43CAE8
$
```

## File 13
1. See the filetype with the command `file`:
```bash
$ file 13
13: data
$
```

2. See hex values with `xxd`:
```bash
$ xxd 13 | head        
00000000: 0000 0000 0010 0000 0000 0001 0101 0048  ...............H
00000010: 0048 0000 fffe 0017 2550 4446 2d31 2e34  .H......%PDF-1.4
00000020: 0d25 6161 2035 2030 206f 626a 20ff db00  .%aa 5 0 obj ...
00000030: 4300 0806 0607 0605 0807 0707 0909 080a  C...............
00000040: 0c14 0d0c 0b0b 0c19 1213 0f14 1d1a 1f1e  ................
00000050: 1d1a 1c1c 2024 2e27 2022 2c23 1c1c 2837  .... $.' ",#..(7
00000060: 292c 3031 3434 341f 2739 3d38 323c 2e33  ),01444.'9=82<.3
00000070: 3432 ffdb 0043 0109 0909 0c0b 0c18 0d0d  42...C..........
00000080: 1832 211c 2132 3232 3232 3232 3232 3232  .2!.!22222222222
00000090: 3232 3232 3232 3232 3232 3232 3232 3232  2222222222222222
$ 
```

## File 14
1. See the filetype with the command `file`:
```bash
$ file 14
14: data
$
```

2. See hex values with `xxd`:
```bash
$ xxd 14 | head
00000000: 6c73 6d76 1a11 6761 6d62 6174 7465 5f73  lsmv..gambatte_s
00000010: 6762 5f6e 7473 6301 0570 6f72 7431 0a79  gb_ntsc..port1.y
00000020: 6761 6d65 7061 6431 3601 0570 6f72 7432  gamepad16..port2
00000030: 0a79 6761 6d65 7061 6431 3600 addb 2d86  .ygamepad16...-.
00000040: dead beef e2e8 b30e 2550 4446 2d31 2e35  ........%PDF-1.5
00000050: 0a25 d0d4 c5d8 0a37 2030 206f 626a 0a3c  .%.....7 0 obj.<
00000060: 3c0a 2f4c 656e 6774 6820 3131 3738 2020  <./Length 1178  
00000070: 2020 2020 0a2f 4669 6c74 6572 202f 466c      ./Filter /Fl
00000080: 6174 6544 6563 6f64 650a 3e3e 0a73 7472  ateDecode.>>.str
00000090: 6561 6d0a 78da 8d56 db72 e238 107d cf57  eam.x..V.r.8.}.W
$ 
```

3. Open pdf with `Atril Document Viewr`:
![[Pasted image 20230221162503.png]]

## File 15
1. See the filetype with the command `file`:
```bash
$ file 15.iq 
15.iq: data
$
```

2. See hex values with `xxd`:
```bash
$ xxd 15.iq | head 
00000000: d152 28be 38b0 d13e 6d4a 4e3e a3c5 d23e  .R(.8..>mJN>...>
00000010: 6671 813e 2708 6d3e e00e d8bd 7921 1ebd  fq.>'.m>....y!..
00000020: a77d b1be e547 54be ff21 37be 33ba f1bd  .}...GT..!7.3...
00000030: 6fc7 8a3d 41e6 e83d 7d93 ae3d 8a91 3e3e  o..=A..=}..=..>>
00000040: 7486 bc3c 176c a73c 5e2a 493d fde3 12be  t..<.l.<^*I=....
00000050: 6fc9 863c 4786 22be f9fb 18be f4af 38be  o..<G.".......8.
00000060: 4811 4abe b014 95be a3b1 333b b2eb 82be  H.J.......3;....
00000070: 53ab 273e 40c6 7c3d 8ce8 653d f7f3 a93e  S.'>@.|=..e=...>
00000080: 022e 9dbd e933 493e 0714 9a3d 2432 1abe  .....3I>...=$2..
00000090: 6b11 bb3e ac83 73be 7103 df3e 20c8 a2bc  k..>..s.q..> ...
$
```

3. Check file entropy with the help of the project [cyberchef](https://gchq.github.io):
![[Pasted image 20230221162742.png]]

## File 16
1. See the filetype with the command `file`:
```bash
$ file 16
16: PDF document, version 1.5
$
```

2. See hex values with `xxd`:
```bash
$ xxd 16 | head   
00000000: 2550 4446 2d31 2e35 0a25 d0d4 c5d8 0a33  %PDF-1.5.%.....3
00000010: 2030 206f 626a 0a3c 3c0a 2f4c 656e 6774   0 obj.<<./Lengt
00000020: 6820 3934 2020 2020 2020 2020 0a2f 4669  h 94        ./Fi
00000030: 6c74 6572 202f 466c 6174 6544 6563 6f64  lter /FlateDecod
00000040: 650a 3e3e 0a73 7472 6561 6d0a 78da 25ca  e.>>.stream.x.%.
00000050: 3b0a 8030 0c00 d0bd a788 5b3b 184d fa49  ;..0......[;.M.I
00000060: 5d05 459c b389 5b75 2a08 2e5e 5fc4 f9bd  ].E...[u*..^_...
00000070: 514d 3767 1870 489c 404f a090 5188 417a  QM7g.pH.@O..Q.Az
00000080: 41e2 085a 60b3 cb51 ebe5 5aef bd7d 1c8b  A..Z`..Q..Z..}..
00000090: bdee 5a1a b7eb 0a14 0306 2668 6312 ccf2  ..Z.......&hc...
$ 
```

## File 17
1. See the filetype with the command `file`:
```bash
$ file 17
17: data
$
```

2. See hex values with `xxd`:
```bash
$ xxd 17 | head
00000000: f3ed 7e5b c34f 0e00 f3ed 7e5b c3f5 1500  ..~[.O....~[....
00000010: f3ed 7e5b c310 0102 f3ed 7e5b c314 0102  ..~[......~[....
00000020: f3ed 7e5b c318 0102 f3ed 7e5b c31c 0102  ..~[......~[....
00000030: f3ed 7e5b c320 0102 08d9 dde5 fde5 fd21  ..~[. .........!
00000040: 8000 d0c3 5406 00e5 c5cd c606 00c1 e1c2  ....T...........
00000050: 0c14 00f1 c3a8 2002 ffff ffff ffff ffff  ...... .........
00000060: ffff ffff ffff f5ed 383d e603 ed39 3e28  ........8=...9>(
00000070: d6f1 c3f5 1500 ffff ffff ffff ffff ffff  ................
00000080: c33f 0e00 c34c 0e00 c34f 3700 c344 0e00  .?...L...O7..D..
00000090: c347 0e00 c370 2200 c3e9 2300 c38a 2200  .G...p"...#...".
$ 
```

## File 18
1. See the filetype with the command `file`:
```bash
$ file 18
18: ASCII text
$
```

2. See hex values with `xxd`:
```bash
$ xxd 18 | head
00000000: 2020 2020 0a20 2020 0920 0920 2020 200a      .   . .    .
00000010: 0909 2020 2020 090a 2020 2009 0920 0909  ..    ..   .. ..
00000020: 2020 0a09 0920 2020 2009 200a 2020 2009    ...    . .   .
00000030: 0920 2009 2009 0a09 0920 2020 2009 090a  .  . ....    ...
00000040: 2020 2009 0920 2020 2009 0a09 0920 2020     ..    ....   
00000050: 2009 2020 0a20 2020 0909 0920 2009 090a   .  .   ...  ...
00000060: 0909 2020 2020 0920 090a 2020 2009 0920  ..    . ..   .. 
00000070: 2009 2009 0a09 0920 2020 2009 0920 0a20   . ....    .. . 
00000080: 2020 0920 2020 2020 0a09 0920 2020 2009    .     ...    .
00000090: 0909 0a20 2020 0909 2020 0920 090a 0909  ...   ..  . ....
$
```

## File 19
1. See the filetype with the command `file`:
```bash
$ file 19
19: data
$
```

2. See hex values with `xxd`:
```bash
$ xxd 19 | head            
00000000: be99 bea1 4151 0b07 0807 4140 4040 4109  ....AQ....A@@@A.
00000010: 4109 4141 bebf 4101 0728 2d24 6132 2e34  A.AA..A..(-$a2.4
00000020: 3322 247b 6129 3535 3132 7b6e 6e22 2e2c  3"${a)5512{nn".,
00000030: 2c2e 2f32 6f36 282a 282c 2425 2820 6f2e  ,./2o6(*(,$%( o.
00000040: 3326 6e36 282a 286e 0728 2d24 7b02 2035  3&n6(*(n.(-${. 5
00000050: 7172 6f2b 3126 be9a 4102 4147 4544 4744  qro+1&..A.AGEDGD
00000060: 4547 4744 4746 4647 494b 514b 4b48 484b  EGGDGFFGIKQKKHHK
00000070: 554f 4e4d 5156 5559 5956 5557 575b 5c64  UONMQVUYYVUWW[\d
00000080: 5e5b 5a62 5d57 5761 6d61 6267 6668 6b68  ^[Zb]WWamabgfhkh
00000090: 585e 6c71 6c69 7164 6968 69be 9a41 0240  X^lqliqdihi..A.@
$ 
```

3. Check file entropy with the help of the project [cyberchef](https://gchq.github.io):
![[Pasted image 20230221164118.png]]

## File 20
1. See the filetype with the command `file`:
```bash
$ file 20
20: JPEG image data, JFIF standard 1.01, resolution (DPI), density 72x72, segment length 16, comment: "File source: https://commons.wikimedia.org/wiki/File:Cat03.jpg", baseline, precision 8, 481x480, components 3
$
```

2. Open file with the tool `ristretto`:
 ![[Pasted image 20230221163059.png]]
