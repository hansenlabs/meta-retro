SUMMARY = "RetroArch additional headers with info about libretro cores"

HOMEPAGE = "https://www.retroarch.com/"
BUGTRACKER = "https://github.com/libretro/libretro-super/issues"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=5400ab930bc7a77040ea8e75206294c4"

S = "${WORKDIR}/git"
SRC_URI = "gitsm://github.com/libretro/libretro-super.git;protocol=https"
SRCREV = "${AUTOREV}"

PV = "2020+git${SRCPV}"
PR = "r1"

inherit allarch retroarch-paths

do_configure[noexec] = "1"
do_compile[noexec] = "1"

FILES_${PN} += "${RETROARCH_LIBRETRO_CORES_INFO_DIR}"

do_install() {
  install -d ${D}${RETROARCH_LIBRETRO_CORES_INFO_DIR}
  cp -rf --preserve=mode ${S}/dist/info/* ${D}${RETROARCH_LIBRETRO_CORES_INFO_DIR}
}
