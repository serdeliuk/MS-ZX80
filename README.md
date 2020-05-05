# MS-ZX80 [![download](https://img.shields.io/github/downloads/serdeliuk/MS-ZX80/total)](https://github.com/serdeliuk/MS-ZX80/releases/download/1/mszx80-ipk-packages.tar.gz)

### Fuse Emulator 1.5.7 SDL2 ported to Vu+ Solo4K


#### This source code is licensed under [GNU GPLv3](https://www.gnu.org/licenses/gpl-3.0.html#preamble)
#### Please read LICENSE.txt for more details

#### This repository contain openembedded bitbake recipes for Fuse emulator, libspectrum and MS-ZX80 Enigma2 plugin
- Fuse emulator 1.5.7
- Libspectrum 1.4.4
- MS-ZX80 emigma2 plugin

## Usage
### The provided prebuilt fuse emulator have only those Remote Control keys implemented at this time
- Number keys
- GREEN mapped to `o`
- YELLOW mapped to `p`
- RED mapped to `q`
- BLUE mapped to `a`
- Help button to open fuse menu
- Radio mapped to F5 used to reset the emulator
- Exit mapped to ESC key
- OK mapped to enter/return
- VolumeUP mapped to TAB
- Previous `<` mapped to BACKSPACE
- ChannelDOWN mapped to space
- VolumeDOWN mapped to RCTRL
- Info/EPG mapped to RSHIFT
- TV mapped to F11 used to switch between full screen and windowed mode, currently does not work

### Install
- This version of emulator is built around SDL2 library and because the SDL library does not have remote control keys you should use the provided library or if you build yourself the SDL library you need to patch yourself the library, [OpenPli](https://github.com/OpenPLi/openpli-oe-core/tree/develop/meta-openpli/recipes-graphics/libsdl2) developemnt branch have my patch to add all known remote control keys to SDL2 library
- The package archive contain all libraries and apps you need to install and run the emulator on your Vu+ Solo4K all tested and build under OpenPli 7.2
- It is included a setup.sh script to install the packages in the right order.
- If you need games you should download them from [WorldOfSpectrum](https://www.worldofspectrum.org/games/a.html) website


Enjoy!!!<br>


[![Donate](https://img.shields.io/badge/Donate-PayPal-green.svg)](https://paypal.me/serdeliuk) any donation is highly appreciated!
