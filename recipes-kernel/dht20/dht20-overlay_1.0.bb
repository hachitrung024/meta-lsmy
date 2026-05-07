SUMMARY = "DHT20 Device Tree Overlay"
AUTHOR = "Trung Ha <hachitrung024@gmail.com>"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

inherit devicetree
COMPATIBLE_MACHINE = "raspberrypi.*"

SRC_URI = "git://github.com/hachitrung024/kernel-drivers.git;protocol=https;branch=main"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git/iio/humidity"
