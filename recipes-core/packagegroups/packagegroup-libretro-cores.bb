DESCRIPTION = "Libretro cores package group"

inherit retro-packagegroup

PACKAGECONFIG ??= " \
    arcade \
    atari \
    dreamcast \
    extra \
    gba \
    gbc \
    n64 \
    nds \
    nes \
    pc \
    psx \
    saturn \
    sms \
    snes \
"

PACKAGECONFIG[arcade] = ",,,,packagegroup-libretro-arcade"
PACKAGECONFIG[atari] = ",,,,packagegroup-libretro-atari"
PACKAGECONFIG[dreamcast] = ",,,,packagegroup-libretro-dreamcast"
PACKAGECONFIG[extra] = ",,,,packagegroup-libretro-extra"
PACKAGECONFIG[gba] = ",,,,packagegroup-libretro-gba"
PACKAGECONFIG[gbc] = ",,,,packagegroup-libretro-gbc"
PACKAGECONFIG[n64] = ",,,,packagegroup-libretro-n64"
PACKAGECONFIG[nds] = ",,,,packagegroup-libretro-nds"
PACKAGECONFIG[nes] = ",,,,packagegroup-libretro-nes"
PACKAGECONFIG[ngc] = ",,,,packagegroup-libretro-ngc"
PACKAGECONFIG[pc] = ",,,,packagegroup-libretro-pc"
PACKAGECONFIG[psx] = ",,,,packagegroup-libretro-psx"
PACKAGECONFIG[saturn] = ",,,,packagegroup-libretro-saturn"
PACKAGECONFIG[snes] = ",,,,packagegroup-libretro-sms"
PACKAGECONFIG[snes] = ",,,,packagegroup-libretro-snes"
PACKAGECONFIG[wii] = ",,,,packagegroup-libretro-wii"

LIBRETRO_CORE_PACKAGES ?= " \
  81-libretro \
  beetle-ngp-libretro \
  beetle-pce-fast-libretro \
  beetle-pcfx-libretro \
  beetle-supergrafx-libretro \
  beetle-vb-libretro \
  beetle-wswan-libretro \
  caprice32-libretro \
  freechaf-libretro \
  freeintv-libretro \
  fuse-libretro \
  genesis-plus-gx-libretro \
  gw-libretro \
  neocd-libretro \
  np2kai-libretro \
  nxengine-libretro \
  o2em-libretro \
  opera-libretro \
  pokemini-libretro \
  ppsspp-libretro \
  px68k-libretro \
  vecx-libretro \
"

RRECOMMENDS_${PN}_append = " ${LIBRETRO_CORE_PACKAGES}"
