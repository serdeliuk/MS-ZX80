SUMMARY = "MS-ZX80 Spectrum Emulator"
MAINTAINER = "Marc Serdeliuc"
HOMEPAGE = "https://github.com/serdeliuk/MS-ZX80"
SOURCE = "https://github.com/serdeliuk/MS-ZX80"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENCE.txt;md5=1ebbd3e34237af26da5dc08a4e440464"

PACKAGE_ARCH = "${DEFAULTTUNE}"

PV = "0.2"
PR = "r1"
PN = "enigma2-plugin-extensions-mszx80"

SRC_URI = "file://*"
S = "${WORKDIR}/"

FILES_${PN} += "/usr/lib/enigma2/python/Plugins/Extensions/MS-ZX80"

inherit autotools-brokensep

pkg_postrm_${PN}() {
rm -rf /usr/lib/enigma2/python/Plugins/Extensions/MS-ZX80
}
