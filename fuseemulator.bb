SUMMARY = "Fuse 1.5.7 SDL2 - the Free Unix Spectrum Emulator"
HOMEPAGE = "http://fuse-emulator.sourceforge.net/"

MAINTAINER = "Marc Serdeliuc <serdeliuk@yahoo.com>"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

SRC_URI = "git://git.code.sf.net/p/fuse-emulator/fuse;protocol=https;tag=fuse-1.5.7 \
    file://diff.sdl2_10.2_fuse-1.5.7.patch \
    file://vu.configure.ac.patch \
    file://vu.fix.paths.in.Makefile.am.patch \
    file://vu.keysyms.pl.patch \
    file://vu.ui.sdl.sdl2display.c.fullscreen.patch \
    file://vu.ui.widget.widget.c.patch \
"

SRCREV = "fuse-1.5.7"
PV = "1.5.7-sdl2"
PR = "r0"

PROVIDES += "fuseemulator"

DEPENDS = " \
    libsdl2 \
    libspectrum \
"

PACKAGE_ARCH = "${MACHINE_ARCH}"

S = "${WORKDIR}/git"

EXTRA_OECONF += " --with-sdl --prefix=/usr"

# INSANE_SKIP = "configure-unsafe"

inherit autotools pkgconfig

FILES_${PN} += " /usr/bin /usr/share/fuse/"