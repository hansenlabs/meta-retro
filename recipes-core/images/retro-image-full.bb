DESCRIPTION = "RetroArch full image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit retro-core-image

IMAGE_INSTALL_append = " \
  packagegroup-standalone-emulators \
  retroarch-assets-xmb-monochrome \
  retroarch-assets-xmb-pixel \
  retroarch-assets-xmb-systematic \
  retroarch-autoconfig \
  retroarch-database-cheats \
  retroarch-database-cursors \
  retroarch-database-titles \
  retroarch-libretro-info \
  retroarch-overlays \
  retroarch-shaders \
"
