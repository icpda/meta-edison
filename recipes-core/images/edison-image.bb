DESCRIPTION = "Full functional image for Intel Edison Module"

LICENSE = "MIT"

IMAGE_INSTALL = "packagegroup-core-boot ${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL}"

inherit core-image

IMAGE_FSTYPES = "ext4"

NOHDD = "0"

AUTO_SYSLINUXCFG = "1"
SYSLINUX_ROOT = ""
SYSLINUX_TIMEOUT ?= "10"
SYSLINUX_LABELS ?= "boot install"
LABELS_append = "${SYSLINUX_LABELS}"

inherit bootimg
