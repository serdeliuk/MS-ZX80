SUMMARY = "libspectrum - support library for Fuse - the Free Unix Spectrum Emulator"
HOMEPAGE = "http://fuse-emulator.sourceforge.net/libspectrum.php"

MAINTAINER = "Marc Serdeliuc <serdeliuk@yahoo.com>"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

SRC_URI = " \
    git://git.code.sf.net/p/fuse-emulator/libspectrum;protocol=https \
    file://libspectrum.configure.ac.patch \
    file://libspectrum.remove.test.Makefile.am.patch \
"

SRCREV = "master"
PV = "1.4.4"
PR = "r0"

PROVIDES += "libspectrum"


DEPENDS = "\
    zlib \
    bzip2 \
    libgcrypt \
    audiofile \
"

PACKAGE_ARCH = "${MACHINE_ARCH}"

S = "${WORKDIR}/git"


EXTRA_OECONF += " --disable-audiofiletest --with-fake-glib --prefix=/usr"

# INSANE_SKIP = "configure-unsafe"

inherit autotools pkgconfig

